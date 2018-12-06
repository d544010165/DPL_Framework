/**
 * 
 */
package com.system.controller.base;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.system.util.common.PubUtil;
import com.system.util.result.Result;
import com.system.util.result.ResultUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * @title AdminController.java
 * @author dengpeilin
 * @time 2018年7月16日 下午2:53:01
 * @description TODO
 * @version V1.0
 */
@Api(tags="角色主页")
@Controller
public class AdminController {
	
	/**
	  * 密码
	  * @author dengpeilin
	  */
	@ApiOperation(value = "公共角色主页",httpMethod="GET")
	@RequestMapping("/public/showPublic")
	public String showPublic(){
   	
       return "public/showPublic";
	}
	
	 /**
	  * 管理员页面显示
	  * @author dengpeilin
	  */
	@ApiOperation(value = "管理员角色主页",httpMethod="GET")
    @RequestMapping("/admin/showAdmin")
    public String showAdmin(){
    	
        return "admin/showAdmin";
    }
    
}
