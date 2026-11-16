package com.sist.set;

import java.util.*;

public class Set_6 {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		Random r=new Random();
		
		for(int i=0;i<10;i++) {
			//nextInt 함수에 인수값 없으면 범위는 int 전체
			set.add(r.nextInt(100));
		}
		
		//자동 정렬, 검색이 빠름
		TreeSet<Integer> tSet=new TreeSet<Integer>();
		tSet.addAll(set);
		
		System.out.println("======= 전체 데이터 =======");
		for(int i:tSet) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("======= 50이상 =======");
		System.out.println(tSet.tailSet(50));
		System.out.println("======= 50이하 =======");
		System.out.println(tSet.headSet(50));
		
		System.out.println("30바로 윗값: "+tSet.higher(30));
		System.out.println("30바로 아랫값: "+tSet.lower(30));
		
		System.out.println("50과 같거나 큰 값: "+tSet.ceiling(50));
		System.out.println("50과 같거나 큰 값: "+tSet.floor(50));
		
		System.out.println("first: "+tSet.first());
		System.out.println("last: "+tSet.last());
	}
}
