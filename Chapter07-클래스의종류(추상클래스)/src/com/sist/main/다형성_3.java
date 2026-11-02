package com.sist.main;
/*
 * 객체 지향의 4대 특성
 * 1. 캡슐화: 데이터 보호
 * 2. 상속: 서로 다른 클래스를 한 개의 클래스로 묶어서 관리
 *         기존의 클래스의 내용(변수, 메소드)를 가지로 온다
 * 3. 다형성: 오버로딩, 오버라이딩
 * 4. 추상화: 공통적인 클래스를 묶어서 관리-인터페이스
*/

import java.util.*;

class 동물{
	int a=100;
	public void run(){
		System.out.println("달린다");
	}
}
class 개 extends 동물{
	int a=200;
	public void run() {
		System.out.println("개가 달린다");
	}
}
class 소 extends 동물{
	int a=300;
	public void run() {
		System.out.println("소가 달린다");
	}
}
class 말 extends 동물{
	int a=400;
	public void run() {
		System.out.println("말이 달린다");
	}
}


public class 다형성_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("동물 이름:");
		String ani=scan.next();
		
		동물 animal=null;
		
		switch(ani) {
		case "개"->animal=new 개();//동적바인딩 - 실행 시 마다 주소값을 변경
		case "말"->animal=new 말();
		case "소"->animal=new 소();
		}
		animal.run();
		//상위 클래스 이용 시
		//변수호출(클래스 타입) / 메소드 호출(생성자 타입)
		System.out.println(animal.a);
	}
}
