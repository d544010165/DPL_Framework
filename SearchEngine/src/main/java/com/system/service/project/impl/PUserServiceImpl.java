package com.system.service.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.system.bean.project.PRole;
import com.system.bean.project.PUser;
import com.system.bean.project.PUserrole;
import com.system.bean.sys.SysUser;
import com.system.dao.sourceCms.project.PRoleMapper;
import com.system.dao.sourceCms.project.PUserMapper;
import com.system.dao.sourceCms.project.PUserroleMapper;
import com.system.exception.CustomException;
import com.system.service.project.PUserService;
import com.system.util.common.PubUtil;
import com.system.util.distributedUUID.Sid;
import com.system.util.encryption.MD5Util;
import com.system.util.fileUpload.HeadIconUpload;
import com.system.util.result.Result;
import com.system.util.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PUserServiceImpl implements PUserService{
	@Autowired
	PUserMapper pUserMapper;
	@Autowired
	PRoleMapper pRoleMapper;
	@Autowired
	PUserroleMapper pUserroleMapper;
	@Resource
	Sid sid;

	/**
	 * 通过用户名查询所有用户信息
	 */
	@Override
	public Object queryAll(Integer pageNum, Integer pageSize, String fRealname) {
		PageHelper.startPage(pageNum, pageSize, true);
		Example example = new Example(SysUser.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("fDeletemark", 0);
		criteria.andEqualTo("fEnabledmark", 1);
		if (fRealname!=null&&!"".equals(fRealname)) {
			criteria.andLike("fRealname", "%" + fRealname + "%");
		}
		List<PUser> list = pUserMapper.selectByExample(example);
		PageInfo<PUser> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}
	
	//注册用户信息
	@Override
	public int registerUser(PUser user) {
		try {
			Date date = new Date();
			//生成随机id
			user.setfId(sid.nextShort());
			//生成随机盐,拼接 md5加密的密码
	    	String salt = Sid.next();
	    	user.setfSalt(salt);
	    	user.setfPassword( MD5Util.encode(user.getfPassword()) + salt);
	    	user.setfEnabledmark(1);
	    	user.setfDeletemark(0);
	    	user.setfCreatortime(date);
	    	
	    	System.out.println("注册时加密后: " + user.getfPassword());
	    	
	    	//新注册账号角色默认设为public公共角色
	    	PUserrole ur = new PUserrole();
	    	ur.setfId(sid.nextShort());
	    	ur.setfUserid(user.getfId());
	    	ur.setfRoleid(pRoleMapper.selectRoleByRoleName(PRole.PUBLIC_ROLENAME).getfId());
	    	ur.setfSortcode(1);
	    	ur.setfCreatortime(date);
	    	ur.setfDeletemark(0);
	    	pUserroleMapper.insert(ur);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
		return pUserMapper.insert(user);
	}

	//通过用户名查找权限
	@Override
	public PRole selectRoleByName(String f_account) {
		return pRoleMapper.selectRoleByName(f_account);
	}
	
	//通过用户名查找 用户
	@Override
	public PUser findByName(String f_account) {
		
		Example example = new Example(SysUser.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("fDeletemark", 0);
		criteria.andEqualTo("fEnabledmark", 1);
		criteria.andEqualTo("fAccount", f_account);
		PUser user= pUserMapper.selectOneByExample(example);
		return user;
	 
	}

	
	//用户信息修改
	@Override
	public int updatePUser(PUser pUser) throws CustomException {
		pUser.setfLastmodifytime(PubUtil.getNowTime());
		pUser.setfLastmodifyuserid(  ((PUser)PubUtil.getUser()).getfId() );
		int rows = pUserMapper.updateByPrimaryKeySelective(pUser);
		return rows;
	}

	//通过主键查询指定用户
	@Override
	public Object queryOnePUserKey(PUser pUser) {
		return pUserMapper.selectByPrimaryKey(pUser);
	}

	//上传和更新头像
	@Override
	public Result updateHeadIcon(HttpServletRequest request, CommonsMultipartFile file) throws Exception {
		// 上传头像
		// 返回的map中可以得到当前登录用户id 和 上传头像保存的路径
		Map<String,String> map = HeadIconUpload.headIconUpload(request,file);
		String id = map.get("id");
		String avatar = map.get("avatar");

		// 将用户的头像数据更新到数据表
		pUserMapper.updateHeadIcon(id,avatar);

		// 返回用户头像保存地址
		return ResultUtil.result(Result.STATUS_SUCCEED,"上传头像成功",avatar);
	}
	
	
}
