package com.sist.set;

import java.util.*;

public class Set_1 {
	
	public static void setPrint(HashSet<String> set) {
		System.out.println("과일 갯수:"+set.size());
		for(String f:set) {
			System.out.print(f+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("참외");
		set.add("귤");
		//중복값 제외
		set.add("사과");
		set.add("참외");
		
		setPrint(set);
		
		System.out.println("======= 삭제 =======");
		set.remove("배");
		setPrint(set);
		
		System.out.println("======= 전체 삭제 =======");
		set.clear();
		setPrint(set);
		
		System.out.println("======= 존재 여부 확인 =======");
		if(set.isEmpty()) {
			System.out.println("과일이 없다");
		}
		else {
			System.out.println("과일이 있다");
		}
	}
}
