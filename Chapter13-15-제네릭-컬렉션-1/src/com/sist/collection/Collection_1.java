package com.sist.collection;

import java.util.*;
/*
 * 컬렉션
 * -데이터를 담아두는 상자(메모리)의 모음
 * 
 * 
 * 컬렉션 프레임워크-통일화(표준화)
 * 
 * 컬렉션 사용 이유
 * -크키 조절이 자유로움(가변적)
 * -정렬, 검색 기능 제공
 * -모든 개발자가 동일하게 사용(표준화)
 * 
 * 컬렉션 종류
 * Collection-인터페이스
 * - List-인터페이스 - 순서 존재(인덱스로 접근), 데이터 중복 허용
 *   - ArrayList - DB에서 많이 사용(비동기), Vector 보완
 *   - LinkedList - 추가, 삭제가 빠르므로 이것이 빈번할 때 사용
 *     - Queue
 *   - Vector - 동기화-네트워크의 접속자 정보 저장
 * - Set-인터페이스 - 순서없음, 데이터중복x
 *   - HashSet - 비동기, 중복 없어야 할 때 사용
 *   - TreeSet
 * - Map-인터페이스 - 키, 값을 동시 저장, 클래스 관리나 SQL에서 사용
 *   - HashMap
 *   - Hashtable - HashSet보완(동기화)
 * 
 * Map
 * request-사용자 요청
 * response-결과값 전송
 * cookie-쿠키 저장
 * session-세션 저장
 * 
*/

/*
 * ArrayList 메소드
 * add(), add(int index) - 추가
 * remove(int index) - 삭제
 * clear() - 전체 삭제
 * set(int index, 데이터) - 수정
 * get(int index) - 읽기
 * size() - 리스트 크기
 * isEmpty() - 데이터 존재여부 확인
*/
import java.util.*;

public class Collection_1 {
	
	public static void listPrint(ArrayList<String> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
	}
	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> list=new ArrayList<String>();//<>를 안쓰면 모든 데이터가 Object
		//LinkedList<String> list=new LinkedList<String>();//ArrayList와 구조만 다르고 기능은 같음
		//Vector list=new Vector();//ArrayList와 동일하지만 동기화
		
		list.add("홍길동");
		list.add("심청이");
		list.add("이순신");
		list.add("강감찬");
		list.add("박문수");
		
		listPrint(list);
		
		System.out.println("======= 추가 =======");
		list.add("춘향이");
		listPrint(list);
		
		System.out.println("======= 지정된 위치에 추가 =======");
		list.add(2, "을지문덕");//인덱스로 추가하면 속도가 느림
		listPrint(list);
		
		System.out.println("======= 삭제 =======");
		list.remove(1);//심청이
		listPrint(list);
		
		System.out.println("======= 현재 인원 =======");
		System.out.println("현재 인원:"+list.size());
		
		System.out.println("======= 수정 =======");
		list.set(1, "춘향이");
		listPrint(list);
		
		System.out.println("======= 전체 삭제 =======");
		list.clear();
		System.out.println("현재 인원:"+list.size());
		
		System.out.println("======= 데이터 존재 여부 =======");
		if(list.isEmpty()) {
			System.out.println("현재 인원 없음");
		}
		else {
			System.out.println("현재 인원 있음");
		}
	}
}
