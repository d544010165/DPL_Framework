package com.system.controller.project;

import com.system.bean.project.PUser;
import com.system.service.project.PUserService;
import com.system.util.result.Result;
import com.system.util.result.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;

@Api(tags="用户模块")
@Controller
@RequestMapping("/public/user")
public class PuserController {
	@Autowired
	private PUserService pUserService;

	/**
	 * @description 分页查询数据
	 * @author dengpeilin
	 */
	@ApiOperation(value = "用户列表查询", notes = "用户管理", httpMethod = "POST", response = Result.class, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "pageNum", value = "页号", dataType = "Integer", paramType = "query", required = true),
			@ApiImplicitParam(name = "pageSize", value = "每页显示条数", dataType = "Integer", paramType = "query", required = true),
			@ApiImplicitParam(name = "fRealname", value = "真实姓名", dataType = "String", paramType = "query")
	})
	@RequestMapping(value = "/queryAll")
	@ResponseBody
	public Object queryAll(HttpServletRequest request,
						   Integer pageNum, Integer pageSize, String fRealname) {
		request.setAttribute("fRealname", "fRealname:" + fRealname);//关键数据
		return ResultUtil.result(200, "查询用户信息", pUserService.queryAll(pageNum, pageSize, fRealname));
	}

	/**
	 * @description 查询指定用户信息 主键
	 * @author dengpeilin
	 */
	@ApiOperation(value = "根据用户ID查询", notes = "用户管理", httpMethod = "POST", response = Result.class, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "fId", value = "用户主键Id", dataType = "String", paramType = "query", required = true)
	})
	@RequestMapping(value = "/queryOnePUserKey")
	@ResponseBody
	public Object queryOneSysUserKey(HttpServletRequest request, PUser pUser) {
		request.setAttribute("fId", "fId:" + pUser.getfId());//关键数据
		return ResultUtil.result(200, "查询指定用户信息", pUserService.queryOnePUserKey(pUser));
	}

	/**
	 * @description 用户修改
	 * @author dengpeilin
	 */
	@ApiOperation(value = "用户修改", notes = "用户管理", httpMethod = "POST", response = Result.class, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiImplicitParams({
//			@ApiImplicitParam(name = "fId", value = "修改用户主键Id", dataType = "String", paramType = "query", required = true),
			@ApiImplicitParam(name = "fRealname", value = "真实姓名", dataType = "String", paramType = "query", required = true),
			@ApiImplicitParam(name = "fNickname", value = "昵称", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fHeadicon", value = "头像", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fGender", value = "性别", dataType = "Integer", paramType = "query", required = true),
			@ApiImplicitParam(name = "fBirthday", value = "生日", dataType = "Date", paramType = "query", required = true),
			@ApiImplicitParam(name = "fMobilephone", value = "手机号码", dataType = "String", paramType = "query", required = true),
			@ApiImplicitParam(name = "fEmail", value = "邮箱", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fWechat", value = "微信", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fSignature", value = "个性签名", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fOrganizeid", value = "组织主键", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fDepartmentid", value = "部门主键", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fDutyid", value = "岗位主键", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fJobnumber", value = "工作编号", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "fIsadministrator", value = "是否管理员(0:false / 1:true)", dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "fSortcode", value = "排序码", dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "fDescription", value = "描述", dataType = "String", paramType = "query")
	})
	@RequestMapping(value = "/updatePUser")
	@ResponseBody
	public Object updateSysUser(HttpServletRequest request, PUser pUser) throws Exception {
		request.setAttribute("fId", "fId:" + pUser.getfId());//关键数据
		if (pUserService.updatePUser(pUser) > 0) {
			return ResultUtil.result(200, "修改用户信息成功", "");
		}
		return ResultUtil.result(500, "修改用户信息失败", "");
	}

/*
	@RequestMapping(value = "/uploadHeadIcon",method = RequestMethod.POST)
	public void uploadHeadIcon(@RequestParam("myfiles") MultipartFile[] files, HttpServletRequest request) throws Exception {
		System.out.println("public/user/uploadHeadIcon");
		pUserService.uploadHeadIcon(request,files);
	}
*/

	/**
	 * @description 用户头像上传
	 * @author dengpeilin
	 */
	@ApiOperation(value = "用户头像上传", notes = "用户管理", httpMethod = "POST", response = Result.class, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/upload")
	@ResponseBody
	public Result handleUpload(HttpServletRequest request,
				@RequestParam("file") CommonsMultipartFile file) throws Exception {
		return pUserService.updateHeadIcon(request,file);
	}

	/**
	 * @description 测试用通过用户名获取用户和角色信息
	 * @author dengpeilin
	 */
	@ApiOperation(value = "测试用通过用户名获取用户和角色信息", notes = "测试", httpMethod = "GET", response = Result.class, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/selectRoleByName")
	@ResponseBody
	public Result selectRoleByName(HttpServletRequest request,String f_account) {
		return ResultUtil.result(Result.STATUS_SUCCEED,"查询成功!",pUserService.selectRoleByName(f_account));
	}


}