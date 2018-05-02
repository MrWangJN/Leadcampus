package com.f22pkj31.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

public class AuthenticationUtil {

	public static void getAuthenticationCode(String phonenum,String code) {
		String host = "https://fesms.market.alicloudapi.com";
		String path = "/sms/";
		String method = "GET";
		System.out.println("请先替换成自己的AppCode");
		String appcode = "fa49313707324f1997b3d3dfbf751619"; // !!! 替换这里填写你自己的AppCode 请在买家中心查看
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "APPCODE " + appcode); // 格式为:Authorization:APPCODE
															// 83359fd73fe11248385f570e3c139xxx
		Map<String, String> querys = new HashMap<String, String>();
		querys.put("code", code);// !!! 请求参数
		querys.put("phone", phonenum);// !!! 请求参数
		querys.put("skin", "1");// !!! 请求参数
		try {
			HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
			// System.out.println(response.toString()); //输出头部
			System.out.println(EntityUtils.toString(response.getEntity())); // 输出json
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
