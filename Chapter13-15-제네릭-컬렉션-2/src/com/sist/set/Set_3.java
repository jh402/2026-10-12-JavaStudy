package com.sist.set;

import java.util.*;

public class Set_3 {
	
	public static void randPrint(Collection<Integer> rand) {
		for(int i:rand) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		
		Random rand=new Random();
		
		for(int i=0;i<10;i++) {
			int r=rand.nextInt(10)+1;//1~100
			set.add(r);
			list.add(r);
		}
		System.out.println("set에 저장된 갯수:"+set.size());
		System.out.println("list에 저장된 갯수:"+list.size());
		System.out.println("======= set에 저장된 데이터 출력 =======");
		randPrint(set);
		
		System.out.println("======= list에 저장된 데이터 출력 =======");
		randPrint(list);
		
		System.out.println("======= set 검색 =======");
		for(int i:set) {
			if(i<5) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i:set) {
			if(i>5) {
				System.out.print(i+" ");
			}
		}
	}
}
