package com.sist.set;

import java.util.*;

public class Set_5 {
	public static void namesPrint(Collection<String> names) {
		for(String name:names) {
			System.out.print(name+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String[] names= {"홍길동", "심청이", "춘향이", "박문수", "강감찬",
				"이순신", "김두한", "홍길동", "박문수", "심청이"};
		//배열->List
		List<String> list=Arrays.asList(names);
		
		System.out.println("======= 전체 회원 목록 =======");
		namesPrint(list);
		
		System.out.println("======= 중복 제거 =======");
		Set<String> set=new HashSet<String>();
		set.addAll(list);
		namesPrint(set);
		
		//index로 제어하기 위해 List사용
		System.out.println("======= list2 =======");
		List<String> list2=new ArrayList<String>();
		list2.addAll(set);
		namesPrint(list2);
		
	}
}
