package com.sist.collection;

import java.util.*;
/*
 * UNION
 * INTERSECT
 * MINUS
 * UNION ALL - addAll()
 * 부분적 복사 - subList()
*/

public class Collection_2 {
	
	public static void listPrint(ArrayList list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//Object - 모든 데이터형 저장 가능
		ArrayList list1=new ArrayList();
		
		//1~9
		for(int i=1;i<10;i++) {
			list1.add(i);
		}
		Collections.shuffle(list1);
		
		System.out.println("======= list1 =======");
		listPrint(list1);
		
		System.out.println("======= 일부 추출(list2) =======");
		ArrayList list2=new ArrayList(list1.subList(1, 4));//3개
		list2.add(10);list2.add(11);list2.add(12);
		listPrint(list2);
		
		System.out.println("======= list1 sort =======");
		Collections.sort(list1);
		listPrint(list1);
		
		//교집합
		System.out.println("======= 같은 데이터 추출(list1) =======");
		list1.retainAll(list2);
		listPrint(list1);
		
		//UNION ALL
		System.out.println("======= 전체 복사(list3) =======");
		ArrayList list3=new ArrayList();
		list3.addAll(list2);
		listPrint(list3);

		System.out.println("======= containsAll =======");
		//list1의 요소가 list3의 요소에 포함되어 있는가
		System.out.println(list3.containsAll(list1));
		System.out.println(list2.containsAll(list1));
		listPrint(list1);
	}
}
