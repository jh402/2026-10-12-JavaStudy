package com.sist.manager;

/*
 * 자바 프로그램의 구조
 * 1. package : 폴더 구조
 * -관련된 클래스를 쉽게 찾기 위해 저장
 * -다른 패키지에서 사용- 접근지정어
 * 
 * 접근지정어
 * -클래스: 모든 패키지에서 사용이 기본 - public
 * -메소드: 모든 패키지에서 사용이 기본 - public
 * -생성자: 모든 패키지에서 사용이 기본 - public
 * -변수: 은닉화 - private
 * 
 * 2. import : 라이브버리 / 사용자 정의 클래스(패키지가 다를 때)
 * - 여러 번 import 사용 가능
 * - 여러 클래스를 가져올 때 * 사용
 * 
 * 3. 클래스 구조
 * -필드-인스턴스 변수, 정적 변수
 * -생성자
 *   -오버로딩 가능
 *   -없으면 디폴드 생성자
 * -메소드
 *   -독립적인 기능 - static
 *   -객체 관련 기능
 * 
 * 4. 프로그램에서는 변수, 메소드, 클래스 무조건 메모리에 저장 후에 사용
 * -메소드는 여러 개 저장 후에 제어
 * -클래스는 new를 사용해야 메모리에 저장
 * -static은 자동 저장
 * 
 * 5. 가급적이면 변수 은닉화
 * 6. 공통 사용 기능 - 모아서 재사용
 * -반복 제거
 * -확장
 * -유지보수가 쉬움
 * -가독성이 좋다
 * -상속 / 포함
 * 
 * 7. 필요시에는 기능을 변경 / 추가
 * - 다형성
 * 
 * 8. 관련된 클래스는 한 개로 묶어서 제어
 * - 추상화 - 인터페이스 / 추상 클래스
 * - 클래스가 공동으로 사용하는 변수 / 메소드가 있는 경우 - 내부 클래스
 * 
 * 내부클래스
 * Class A{
 *   접속자 명단
 *   class B{ 접속자 명단 사용 가능 }
 * }
 * 
 * 9. 종료하지 않는 프로그램 : 예외처리
*/

/*
 * 상속
 * -자바의 상속은 단일 상속만 가능
 * -상속이 안되는 것
 *   -static : 사용은 가능하지만 상속은 안됨
 *   -생성자
 *   -초기화 블록
 * -private은 상속은 되지만 사용이 안됨 - 따라서 protected 사용
 * -공통으로 사용되는 변수 / 메소드를 모아서 재사용을 할 수 있게 만든다
 * -부모클래스 메모리할당->자식클래스 메모리 할당
 * 
 * 형태
 * class 자식클래스 extends 부모클래스{}
 * 
 * 단점
 * -제약조건
 * -메모리가 비대해짐
 * -실행속도 느려짐 -> 우리나라는 상속을 가급적 자제
*/

class Animal{
	int age=10;
	public void eat() {
		System.out.println("먹는다");
	}
	public void run() {
		System.out.println("달린다");
	}
}
/*
 * 오버라이딩의 조건
 * 1. 상속을 받은 클래스
 * 2. 메소드명 동일
 * 3. 매개변수 동일
 * 4. 리턴형 동일
 * 5. 확장 가능, 축소 불가능-접근지정어
 */
class Pig extends Animal{
	//재정의-오버라이딩
	int age;
	public Pig(){
		age=5;
	}
	public void eat() {
		System.out.println("돼지처럼 먹는다");
	}
	public void run() {
		System.out.println("돼지처럼 달린다");
	}
}
class Dog extends Animal{
	int age;
	public Dog() {
		age=3;
	}
	public void eat() {
		System.out.println("개처럼 먹는다");
	}
	public void run() {
		System.out.println("개처럼 달린다");
	}
}
class Horse extends Animal{
	int age;
	public Horse() {
		age=7;
	}
	public void eat() {
		System.out.println("말처럼 먹는다");
	}
	public void run() {
		System.out.println("말처럼 달린다");
	}
}

public class 상속_1 {
	
	public static void main(String[] args) {
		//변수는 클래스형(Animal), 메소드는 생성자타입(Pig)
		Animal pig=new Pig();
		System.out.println("나이:"+pig.age);
		pig.eat();
		pig.run();
		
		Animal dog=new Dog();
		System.out.println("나이:"+dog.age);
		dog.eat();
		dog.run();
		
		Animal horse=new Horse();
		System.out.println("나이:"+horse.age);
		horse.eat();
		horse.run();
		
	}

}