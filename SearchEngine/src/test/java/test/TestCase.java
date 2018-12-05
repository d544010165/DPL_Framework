package test;

import org.junit.Test;

import com.system.util.encryption.MD5Util;

public class TestCase {

	@Test
	public void t1(){
		
		System.out.println(MD5Util.encode("123456"));
		
	}
}
