package com.sist.map;

import java.util.*;
/*
 * Map 특징
 * key: 중복 없는 값-주로 구분자로 사용
 * value: 중복 가능 
*/
public class Map_1 {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("age", "30");
		map.put("sex", "남자");
		map.put("id", "hong");//덮어쓰기
		
		System.out.println("ID:"+map.get("id"));
		System.out.println("Password:"+map.get("password"));
		System.out.println("Name:"+map.get("name"));
		System.out.println("Age:"+map.get("age"));
		System.out.println("Sex:"+map.get("sex"));
		
		System.out.println("======= 키만 가지고 오기 =======");
		Set<String> set=map.keySet();
		System.out.println(set);
		
		for(String key:set) {
			System.out.println(key+":"+map.get(key));
		}
		
		for(String s:map.values()) {
			System.out.print(s+" ");
		}
	}
}
