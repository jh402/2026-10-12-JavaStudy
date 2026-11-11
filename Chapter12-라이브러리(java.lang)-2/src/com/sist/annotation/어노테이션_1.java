package com.sist.annotation;

import java.util.*;//Date 클래스 있음
import java.sql.*;//Date 클래스 있음

/*
 * 어노테이션
 * - 기능 없음
 * - 구분자 역할(클래스 / 변수 / 메소드 / 생성자 / 매개변수)
 * - if를 대체
 * - 인덱스 -> 표시하는 기능
 * 
 * 유지 정책 : Retention
 * - SOURCE : 소스 코드에만 존재(컴파일 시 사라짐)
 * - CLASS : 클래스 파일까지 유지 - 실행 중인 리플렉션으로 읽을 수 없음
 * - RUNTIME : 프로그램 종료까지 유지 - 리플렉션으로 읽을 수 있음
 * 따라서 RUNTIME을 많이 사용
 * 
 * 구분자
 * class -> TYPE
 * method -> METHOD
 * constructor -> CONSTRUCTOR
 * field -> FIELD
 * parameter -> PARAMETER
 * 
 * 제어 위치
 * 메소드, 생성자, 클래스, 매개변수의 위
*/

public class 어노테이션_1 {
	public static void main(String[] args) {
		System.out.println(String.class);
		String s="Hello";
		System.out.println(s.getClass());
		System.out.println(int.class);
		//Date 클래스가 충돌되었으므로 패키지 명시
		java.util.Date date=new java.util.Date();
	}
}
/*
 * 어노테이션은 인터페이스이므로 Object가 상속되어 있지 않음
 * Object 상속되어 있다면 .getClass() 사용 가능
 * .class와 .getClass()는 데이터 타입을 확인할 때 사용
 */