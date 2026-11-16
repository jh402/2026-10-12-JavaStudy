package com.sist.etc;

import java.util.*;

/*
 * Collections 클래스: Collection을 제어하는 클래스
 * Arrays 클래스: 배열을 제어하는 클래스
 * 
 * 모아서 출력
 * Iterator
 * ListIterator
 * 자바 컬렉션에 저장된 데이터를 하나씩 꺼내서 사용하는 방법
 * 
 * hasNext()-확인
 * next()-실제 데이터 읽기
 * remove()-현재 데이터 삭제
 * 
 * ListIterator-List에서 사용 가능
 * 
 */
public class Iterator_1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*10)+1);
		}
		System.out.println("======= 목록 출력 =======");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("======= 정렬 후 =======");
		System.out.println(list);
		//sort
		List<String> list2=new ArrayList<String>();
		list2.add("홍길동");
		list2.add("박문수");
		list2.add("심청이");
		list2.add("강감찬");
		list2.add("이순신");
		
		Collections.sort(list2);
		System.out.println(list2);
		
		//Iterator
		List<String> list3=new ArrayList<String>();
		list3.add("사과");
		list3.add("배");
		list3.add("참외");
		list3.add("수박");
		list3.add("바나나");
		
		System.out.println("======= list3 =======");
		Iterator<String> it=list3.iterator();
		while(it.hasNext()) {
			String f=it.next();
			if(f.equals("참외")) {
				it.remove();
			}
			System.out.print(f+" ");
		}
		System.out.println();
	}
}