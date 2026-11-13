package com.sist.list;

import java.util.*;


public class ArrayList_1 {
	public static void arrayListPrint(ArrayList<Integer> list) {
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("갯수:"+list.size());
		arrayListPrint(list);
		
		System.out.println("======== 추가 ========");
		list.add(4);
		list.add(2, 5);
		arrayListPrint(list);
		
		System.out.println("======== 삭제 ========");
		list.remove(0);
		arrayListPrint(list);
		
		System.out.println("======== 수정 ========");
		list.set(0, 100);
		arrayListPrint(list);
		
		System.out.println("======== 전체 삭제 ========");
		list.clear();
		System.out.println("갯수:"+list.size());
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}
		else {
			System.out.println("데이터가 있습니다.");
		}
	}
}
