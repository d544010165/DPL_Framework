package com.system.controller.login;

import javax.servlet.http.HttpServletRequest;

import com.system.bean.project.PUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.system.bean.project.PRole;
import com.system.exception.custom.UsernamePasswordException;
import com.system.util.common.TextValidator;
import com.system.util.encryption.MD5Util;
import com.system.util.result.Result;
import com.system.util.result.ResultUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags="登录")
@Controller
public class NewLoginController {
	
	/*//登录跳转
    @RequestMapping(value = "/logout", method = {RequestMethod.GET,RequestMethod.POST})
    public String  logout(HttpServletRequest request, ServletResponse response) throws Exception {
    	System.err.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++准备退出shiro");
    	Subject subject = SecurityUtils.getSubject();
        subject.logout();
        SysLog syslog = new SysLog();
        syslog.setfDescription("退出登录");
        sysLogService.addSysLog(IPInfoUtil.SetSysLogIPInfoSysLog(syslog,request));
        return "/logout";
    }*/

	/**
	 * @description 登录表单处理 (使用中)
	 * @author dengpeilin
	 */
	@ApiOperation(value = "用户登录",httpMethod="POST",response=Result.class,notes="登录及注册",produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiImplicitParams({
			@ApiImplicitParam(name="fAccount",value="用户账号",dataType="String",paramType="query",required=true),
			@ApiImplicitParam(name="fPassword",value="用户密码",dataType="String",paramType="query",required=true)
			})
    @RequestMapping(value = "/newLogin")
    @ResponseBody
    public Result login(HttpServletRequest request, PUser user) throws Exception {
    	System.out.println("登录账号:"+user.getfAccount());
    	System.out.println("登录密码:"+user.getfPassword());
    	System.out.println("登录加密后: "+MD5Util.encode( user.getfPassword()) 
    			+ (user.getfSalt()==null?"":user.getfSalt()));
    	
    	//检查用户名和密码是否为空
    	if(TextValidator.checkUserNameIsEmpty(
    			user.getfAccount(), user.getfPassword())){ 
    		throw new UsernamePasswordException("用户名或密码不能为空,请重新输入!");
    	}
    	//正则验证数据格式,如果不符合,则直接响应
    	if(!TextValidator.checkUserName(user.getfAccount())){
    		throw new UsernamePasswordException("请输入正确的用户名格式: 支持中英文（包括全角字符）、数字、下划线和减号 （全角及汉字算两位）,长度为4-20位 ");
    	}
    	//正则验证数据格式,如果不符合,则直接响应
    	if(!TextValidator.checkPassword(user.getfPassword())){
    		throw new UsernamePasswordException("请输入正确的长度 3-16 之间的密码!");
    	}
    	
    	//Shiro实现登录
        UsernamePasswordToken token = new UsernamePasswordToken(user.getfAccount(),
        		MD5Util.encode( user.getfPassword()) );
        
        Subject subject = SecurityUtils.getSubject(); 
        
        //如果获取不到用户名就是登录失败，但登录失败的话，会直接抛出异常
        subject.login(token);
        String str = null;
        if (subject.hasRole("admin")) {
        	str = request.getContextPath()+"/admin/showAdmin";
        	return ResultUtil.result(Result.STATUS_SUCCEED,"当前用户角色: " + PRole.ADMIN_ROLENAME,str);
//            return "redirect:/admin/showAdmin";
        } else if (subject.hasRole("public")) {
        	str = request.getContextPath()+"/public/showPublic";
        	return ResultUtil.result(Result.STATUS_SUCCEED,"当前用户角色: " + PRole.PUBLIC_ROLENAME,str);
//            return "redirect:/public/showPublic";
        } 

        str = request.getContextPath()+"/login";
        return ResultUtil.result(Result.STATUS_FAILED,"登录失败- 未知的错误请联系管理员!",str);
    }
    
    

}
