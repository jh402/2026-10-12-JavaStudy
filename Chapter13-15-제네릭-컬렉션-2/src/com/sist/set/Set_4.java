package com.sist.set;

import java.util.*;

//TreeSet:검색/통계
public class Set_4 {
	public static void setPrint(Set<Integer> set) {
		for(int i:set) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		TreeSet<Integer> tSet=new TreeSet<Integer>();
		HashSet<Integer> hSet=new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			int r=(int)(Math.random()*100)+1;
			tSet.add(r);
			hSet.add(r);
		}
		System.out.println("======= HashSet에 저장된 데이터 =======");
		setPrint(hSet);
		System.out.println("======= TreeSet에 저장된 데이터 =======");
		setPrint(tSet);//TreeSet은 정렬됨
		
		System.out.println("======= TreeSet 검색 =======");
		System.out.println("50보다 작은 수:"+tSet.headSet(50));
		System.out.println("50보다 큰 수:"+tSet.tailSet(50));
	}
}
