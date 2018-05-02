package com.f22pkj31.test;


import com.f22pkj31.utils.AuthenticationUtil;
import com.f22pkj31.utils.RandomStrUtil;

public class AuthenticationTest {

	public static void main(String[] args) {
		String randomStr = RandomStrUtil.getRandomStr(6);
		AuthenticationUtil.getAuthenticationCode("15242181696",randomStr);
	}
}
