package com.sist.list;

import java.util.*;


public class LinkedList_1 {
	public static void linkedListPrint(LinkedList<Integer> list) {
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("갯수:"+list.size());
		linkedListPrint(list);
		
		System.out.println("======== 추가 ========");
		list.add(4);
		list.add(2, 5);
		linkedListPrint(list);
		
		System.out.println("======== 삭제 ========");
		list.remove(0);
		linkedListPrint(list);
		
		System.out.println("======== 수정 ========");
		list.set(0, 100);
		linkedListPrint(list);
		
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
