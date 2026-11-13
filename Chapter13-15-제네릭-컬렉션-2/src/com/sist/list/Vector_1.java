package com.sist.list;

import java.util.*;

/*
 * Vector
 * -배열 기반
 * -메소드가 동기화
 * -ArrayList 보다 성능에 부담
 * -예전에 개발된 프로그램에서만 사용
 * -최근에는 ArrayList로 변경
 * -동시성 제어
 * 
 * 일반 메소드
 * add()
 * set()
 * remove()
 * get()
 * size()
 * 
 * 동기화 메소드로 추측
 * addElements()-추가
 * set()-수정
 * removeElement-삭제
 * elementAt()-읽기
 * size()-갯수
*/


public class Vector_1 {
	
	public static void vectorPrint(Vector<String> vector) {
		for(String s:vector) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		Vector<String> names=new Vector<String>();
		names.addElement("홍길동");
		names.addElement("심청이");
		names.addElement("박문수");
		
		System.out.println("인원:"+names.size());
		vectorPrint(names);
		
		System.out.println("======== 삭제 ========");
		names.removeElementAt(0);
		vectorPrint(names);
		
		System.out.println("======== 수정 ========");
		names.setElementAt("춘향이", 0);
		vectorPrint(names);
		
		System.out.println("======== 전체 삭제 ========");
		names.removeAllElements();
		System.out.println("인원:"+names.size());
		
		System.out.println("======== 존재 여부 ========");
		if(names.isEmpty()) {
			System.out.println("인원이 없다");
		}
		else {
			System.out.println("인원이 있다");
		}
	}
}
