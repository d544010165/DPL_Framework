package com.system.controller.login;

import com.system.bean.project.PUser;
import com.system.exception.custom.UsernamePasswordException;
import com.system.service.project.PUserService;
import com.system.util.common.TextValidator;
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
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags="注册")
@Controller
public class RegisterController {
	
	@Autowired
	PUserService pUserService;

//	@ApiOperation(value = "前往注册页面",httpMethod="GET",notes="登录及注册")
//	@RequestMapping("/toRegister")
//	public String toRegister() {
//    	return "redorect:/register";
//    }
	
	/**
	 * @description 注册表单处理
	 * @author dengpeilin
	 */
	@ApiOperation(value = "用户注册",httpMethod="POST",response=Result.class,notes="登录及注册",produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiImplicitParams({
		@ApiImplicitParam(name="fAccount",value="用户账号",dataType="String",paramType="query",required=true),
		@ApiImplicitParam(name="fPassword",value="用户密码",dataType="String",paramType="query",required=true),
		@ApiImplicitParam(name="rePassword",value="确认密码",dataType="String",paramType="query",required=true)
		})
    @RequestMapping(value = "/handleRegister")
    @ResponseBody
    public Object register(PUser user, String rePassword) throws Exception {
    	System.out.println("注册账号:"+user.getfAccount()+ " , 注册密码:"+user.getfPassword() + " , 确认密码:"+rePassword);
    	System.out.println();
    	
    	//检查用户名和密码是否为空
    	if(TextValidator.checkUserNameIsEmpty(
    			user.getfAccount(), user.getfPassword())){ 
    		throw new UsernamePasswordException("用户名或密码不能为空,请重新输入!");
    	}

    	//验证该用户是否存在
		System.out.println(pUserService.findByName(user.getfAccount()));
    	if(pUserService.findByName(user.getfAccount())!=null){
			throw new UsernamePasswordException("用户名已被占用,请重新输入!");
		}

    	//正则验证数据格式,如果不符合,则直接响应
    	if(!TextValidator.checkUserName(user.getfAccount())){
    		throw new UsernamePasswordException("请输入符合规则的用户名: 支持中英文（包括全角字符）、数字、下划线和减号 （全角及汉字算两位）,长度为4-20位");
    	}
    	
    	if(!user.getfPassword().equals(rePassword)){
    		throw new UsernamePasswordException("两次密码输入不一致,请重新输入!");
    	}
    	
    	//注册业务
    	if(pUserService.registerUser(user) > 0){
    		return ResultUtil.result(Result.STATUS_SUCCEED, "注册成功!","");
    	}else{
    		return ResultUtil.result(Result.STATUS_FAILED, "网络异常, 请重试!","");
    	}
    	
    	
    }
    
    

}
