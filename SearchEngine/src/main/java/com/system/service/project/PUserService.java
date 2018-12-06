package com.system.service.project;

import com.system.bean.project.PRole;
import com.system.bean.project.PUser;
import com.system.exception.CustomException;
import com.system.util.result.Result;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface PUserService {

	//注册用户
	int registerUser(PUser user);
	
/*	//通过用户名查找 用户的角色 ( return PRole )
	PRole selectRoleByName(String f_account);*/

	//通过用户名查找 用户的角色 2 ( return Puser )
	PUser selectRoleByName(String f_account);
	
	//通过用户名查找 用户
	PUser findByName(String name);

	//分页查询全部数据, 可根据真实姓名模糊查询
	Object queryAll(Integer pageNum, Integer pageSize, String fRealname);

	//用户信息修改
	int updatePUser(PUser pUser) throws CustomException;

	//通过主键查询指定用户
	Object queryOnePUserKey(PUser pUser);

	Result updateHeadIcon(HttpServletRequest request, CommonsMultipartFile file)  throws Exception ;
	
}
