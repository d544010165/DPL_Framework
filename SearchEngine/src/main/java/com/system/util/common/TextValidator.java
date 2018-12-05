package com.system.util.common;

import com.system.util.result.ResultUtil;

/**
 * 文本验证工具类
 */
public final class TextValidator {
	
	/**
	 * 私有化构造方法，不希望被创建对象
	 */
	private TextValidator() {
		super();
	}
	
	/**
	 * 验证用户名的正则表达式
	 * 支持中英文（包括全角字符）、数字、下划线和减号 （全角及汉字算两位）,长度为4-20位
	 */
	private static final String REGEX_USERNAME 
		= "^[\\w\\-－＿[０-９]\u4e00-\u9fa5\uFF21-\uFF3A\uFF41-\uFF5A]+$";
	
	/**
	 * 验证密码的正则表达式
	 */
	private static final String REGEX_PASSWORD 
		= "/^[a-zA-Z0-9_-]{4,16}$/";
	
	
	/**
	 * 验证手机号码的正则表达式
	 */
	private static final String REGEX_PHONE 
		= "[0-9]{11}";
	/**
	 * 验证电子邮箱的正则表达式
	 */
	private static final String REGEX_EMAIL 
		= "[@]{1}[a-zA-Z0-9]+[.]+[a-z]+";

	
	/**
	 * 验证 用户名和密码 是否为空
	 * @param userName
	 * @param password
	 * @return 为空返回true, 非空返回false
	 */
	public static boolean checkUserNameIsEmpty(String userName,String password) {
		if(userName==null || "".equals(userName) 
    			|| password==null || "".equals(password)){ 
    		return true;
    	}
		return false;
	}
	/**
	 * 验证用户名格式
	 * @param username 用户名
	 * @return 返回true时表示符合格式要求，返回false时表示不符合格式要求
	 */
	public static boolean checkUserName(String username) {
		if (username == null) {
			return false;
		}
		if(username.length() < 4){
			return  false;
		}
		return username.matches(REGEX_USERNAME);
	}
	
	/**
	 * 验证密码格式
	 * @param password 密码
	 * @return 返回true时表示符合格式要求，返回false时表示不符合格式要求
	 */
	public static boolean checkPassword(String password) {
		if (password == null) {
			return false;
		}
		return password.length() >= 3 
				&& password.length() <= 16;
	}
	
	/**
	 * 验证手机号码格式
	 * @param phone 手机号码
	 * @return 返回true时表示符合格式要求，返回false时表示不符合格式要求
	 */
	public static boolean checkPhone(String phone) {
		if (phone == null) {
			return false;
		}
		return phone.matches(REGEX_PHONE);
	}
	
	/**
	 * 验证电子邮箱格式
	 * @param email 电子邮箱
	 * @return 返回true时表示符合格式要求，返回false时表示不符合格式要求
	 */
	public boolean checkEmail(String email) {
		if (email == null) {
			return false;
		}
		return email.matches(REGEX_EMAIL);
	}
	
}
