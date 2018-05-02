package com.f22pkj31.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnUtil {

	public static Map<String, Object> successReturn() {
		Map<String, Object> map = new HashMap<>(); 
		map.put("returnCode", "0001");	
		map.put("errorCode", "");	
		map.put("errorMsg", "");
		return map;
		
	}
	public static Map<String, Object> successReturn(Integer flag) {
		Map<String, Object> map = successReturn();
		List<Integer> list2 = new ArrayList<>();
		list2.add(flag);
		map.put("data", list2);
		return map;
		
	}
	public static Map<String, Object> successReturn(Object data) {
		Map<String, Object> map = new HashMap<>(); 
		map.put("returnCode", "0001");	
		map.put("errorCode", "");	
		map.put("errorMsg", "");
		map.put("data",data);
		return map;
	}
	public static Map<String, Object> successReturn(Object data,String sessionId) {
		Map<String, Object> map = new HashMap<>();
		map.put("returnCode", "0001");
		map.put("errorCode", "");
		map.put("errorMsg", "");
		map.put("sessionId", sessionId);
		map.put("data",data);
		return map;
	}
	public static Map<String, Object> failReturn(String errorCode,String errorMsg) {
		Map<String, Object> map = new HashMap<>();
		map.put("returnCode", "0000");
		map.put("errorCode", errorCode);
		map.put("errorMsg", errorMsg);
		System.out.println(errorCode+errorMsg);
		return map;
		
	}
}
