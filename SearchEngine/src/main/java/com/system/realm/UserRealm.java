package com.system.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.system.bean.project.PUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.system.bean.project.PRole;
import com.system.bean.sys.SysPermission;
import com.system.bean.sys.SysRole;
import com.system.service.project.PUserService;

/**
 * 
 * @title UserRealm.java
 * @author dengpeilin
 * @description 用户授权信息域
 * @version V1.0
 */
@Component
public class UserRealm extends AuthorizingRealm {
	
	@Autowired
    private PUserService pUserService;
//	@Autowired
//	SysUserService sysUserService ;


	protected final Map<String, SimpleAuthorizationInfo> roles = new ConcurrentHashMap<String, SimpleAuthorizationInfo>();
	
	/**
     * 获取身份信息，我们可以在这个方法中，从数据库获取该用户的权限和角色信息
     *     当调用权限验证时，就会调用此方法
     */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		System.out.println(">>>>>>>>>>>>>  doGetAuthorizationInfo ");

//		String account = (String) principals.getPrimaryPrincipal();
		String username = (String) getAvailablePrincipal(principalCollection);

        
        List<SysRole> list_r=null;
        List<SysPermission> list_permission=null;
        PRole role = null;
        try {
        	
        	role = pUserService.selectRoleByName(username);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //通过用户名从数据库获取权限/角色信息
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> r = new HashSet<String>();
        System.out.println("role.getfFullname(): "+role.getfFullname());
        r.add(role.getfFullname());

        info.setRoles(r);


/*        //查询所有角色的所有权限 ( 暂未使用权限等级制度 )
        //写入用户权限info.setStringPermissions();
        Set<String> perms = new HashSet<String>();
        if (list_permission.size()>0&&list_permission!=null) {
			for (SysPermission sysPermission : list_permission) {
				perms.add(sysPermission.getfEncode());
			}
		}
        //t.add("student:query");
        info.setStringPermissions(perms);
        */
        return info;
	}
	
	
	 /**
     * 在这个方法中，进行身份验证
     *         login时调用
     */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) {
		System.out.println(">>>>>>>>>>>>>  doGetAuthenticationInfo");
		 //用户名
        String username = (String) token.getPrincipal();
        //密码
        String password = new String((char[])token.getCredentials());
        
        System.out.println("username: "+username);
        System.out.println("password: "+password);

//        SysUser sysUser =null;
        PUser user = null;
        try {
//        	sysUser = sysUserService.findByName(username);
        	user = pUserService.findByName(username);
//        	System.out.println(user.getfAccount() + " , "+user.getfPassword() + " , " + user.getfSalt());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (user == null) {
            //没有该用户名
            throw new UnknownAccountException();
        } else if (! user.getfPassword().equals((password+(user.getfSalt()==null?"":user.getfSalt()))) ){
            //密码错误
            throw new IncorrectCredentialsException();
        }

        //身份验证通过,返回一个身份信息
        AuthenticationInfo aInfo = new SimpleAuthenticationInfo(username,password,getName());
        //在封装用户进session之前,将盐清空
        user.setfSalt("");
        SecurityUtils.getSubject().getSession().setAttribute("sysUser", user);
        return aInfo;
	}
	

}
