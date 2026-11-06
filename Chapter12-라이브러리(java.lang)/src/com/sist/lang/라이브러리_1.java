package com.sist.lang;

/*
 * 라이브버리(J2SE-기본 라이브러리)
 * java.lang: 프로그램에서 사용되는 기본 패키지
 * -Object: 모든 클래스가 상속을 받는 클래스
 * -String: 문자열 수정 / 변경
 * -StringBuilder / StringBuffer: 문자열을 빠르게
 * -Wrapper: 기본형 데이터형을 클래스화 시킨 클래스의 집합
 * -Math: 수학과 관련된 클래스
 * -System: 화면 출력 / 키보드 읽기 / 동작 시간 / 가비지 컬렉션
 * 
 * java.util
 * java.text
 * java.util.reflect
 * java.io
 * java.net
 * java.sql
 * 
 * J2EE-웹 사이트 라이브러리
 * Spring 라이브러리
 * 
 * 
 * 라이브러리 - 표준화
 * 1. 패키지
 * 2. 클래스명은 뭐하는 역할인지
 * 3. 메소드명은 어떤 기능인지
 * 4. 리턴형은 결과값
 * 5. 매개변수에 어떤 값을 주는지
 * 6. 예외처리 존재여부
 * 
 * Object클래스
 * Object가 가지고 있는 모든 기능을 사용할 수 있게 만든다
 * extends Object가 생략되어 있음
 * 주요 메소드
 * -finalize()
 *   -소멸자 : 객체 메모리 해제
 * -clone()
 *   -객체 복제 기능: 같은 값을 갖고 있는 객체 메모리를 복사하여 새로운 메모리 생성(깊은 복사)
 * -toString()
 *   -객체를 문자열화
 *   -오버라이딩 중에 가장 많이 사용(생략이 가능)
 * -getClass(): 객체를 얻어오는 메소드 (객체 정보)
 * -equals(): 객체 비교
 * -hashCode(): 객체 구분자
*/


class A{
	String name;
	public A(String name) {
		this.name=name;
	}
	//toString 오버라이딩
	/*@Override
	public String toString() {
		return "Hello";
	}*/
}
public class 라이브러리_1 {
	
	public static void main(String[] args) {
		A a=new A("홍길동");
		A b=new A("홍길동");
		System.out.println("a="+a);//toString 생략, 호출됨
		
		System.out.println(a.hashCode()+", "+a);
		System.out.println(b.hashCode()+", "+b);
		if(a.equals(b))
			System.out.println("같다");
		else
			System.out.println("다르다");	
	}
}
