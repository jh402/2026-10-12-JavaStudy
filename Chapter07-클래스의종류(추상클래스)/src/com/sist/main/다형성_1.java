package com.sist.main;

/*
 * 다형성
 * -오버로딩: 같은 메소드를 이용해서 새로운 기능 생성
 * -오버라이딩: 기존의 메소드를 재정의
 * 
 * 자바 재사용 기법
 * -변경 없이 재사용(has-a): 포함 클래스(웹)
 * -변경 후에 재사용(is-a): 상속
 * 
 * 클래스 블록 안에서 구현
 * -명시적 초기화가 안됨: 파일 읽기, 웹 연결, 윈도우 UI, 제어문, 연산자
 * 
*/

class A{
	public A() {
		System.out.println("A() Call...");
	}
}
class B extends A{
	public B() {
		System.out.println("B() Call...");
	}
}
public class 다형성_1 {

	public static void main(String[] args) {
		B b=new B();
		A a=b;
	}

}
