package com.sist.main;

/*
 * 생성자
 * -역할
 *   -멤버변수 초기화
 *   -시작과 동시에 처리
 *   -객체 생성 시 마다 다른 데이터 초기화
 *   -생성자는 필요 시에만 사용
 *   -생성자가 없는 경우-자동으로 생성자 한개 추가(디폴트 생성자)
 * -특징
 *   -클래스명과 동일
 *   -리턴형 없는 특별 메소드
 *   -리턴형이 존재하는 일반 인스턴스 메소드로 인식
 *   -여러 개 만들 때: 오버로딩-같은 메소드명을 이용해서 새로운 기능을 만드는 것
 *   
 * -여러 개 만들 때 사용 규칙
 *   -오버로딩
 * 
 * -생성자 호출 방식
 *   -new 생성자();
 * 
 * 오버로딩 조건
 * 1. 메소드명 동일
 * 2. 같은 클래스 내에서 만든다
 * 3. 매개변수 or 데이터형이 다를 것
 * 4. 리턴형은 관계x
 * 
*/


class Sawon{
	private int sabun;
	private String name;
	private String dept;
	
	//생성자 오버로딩
	public Sawon() {
		sabun=1;
		name="홍길동";
		dept="개발부";
	}
	public Sawon(int sabun, String name) {
		this.sabun=sabun;
		this.name=name;
	}
	public Sawon(String name, String dept) {
		this(); //생성자 호출 - 반드시 생성자에서 사용, 반드시 첫줄에서 사용
		this.name=name;
		this.dept=dept;
	}
	public Sawon(int sabun, String name, String dept) {
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	//메소드
	public void display() {
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
}

public class 생성자_오버로딩 {
	
	public static void main(String[] args) {
		Sawon s1=new Sawon();
		s1.display();
		
		Sawon s2=new Sawon(2, "심청이");
		s2.display();
		
		Sawon s3=new Sawon("박문수", "영업부");
		s3.display();
	}
}
