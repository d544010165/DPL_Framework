package com.system.util.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;

import com.system.exception.CustomException;

public class PubUtil {
	/**
	 * 
	 * @author liyuanguo
	 * @description list转ids
	 */
	public static String  listToIds(List<String> list) {
		String ids="";
		if (list.size()>0) {
			for (String a : list) {
				ids+=","+a;
			}
		}
		ids=ids.substring(1);
		return ids;
		
	}
	/**
	 * 
	 * @author liyuanguo
	 * @description string转LIST
	 */
	public static List<String>  stringToList(String id) {
		
		String[] aStrings=id.split(",");
		List<String> list=new ArrayList<>();
		for (String string : aStrings) {
			list.add(string);
		}
		
		return list;
		
	}
	/**
	 * 
	 * @author dengpeilin
	 * @throws CustomException 
	 * @description 获取当前登录user
	 */
	public static Object getUser(){
		Object su = SecurityUtils.getSubject().getSession().getAttribute("sysUser");
//		if(su == null){
//			throw new UserLoginException("用户未登录!");
//		}
//		PUser sysUser=(PUser) su;
//		return sysUser;
		return su;
		
	}
	public static Date getNowTime() {
		Date date=new Date();
		return date;
	}

}
