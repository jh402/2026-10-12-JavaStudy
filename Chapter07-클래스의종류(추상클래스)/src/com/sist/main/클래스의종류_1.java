package com.sist.main;

/*
 * 자바에서 지원하는 클래스 종류
 * -추상 클래스(abstract)
 *   -미완성 클래스
 *   -new로 메모리 할동 불가능-상속을 내려서 상속받은 클래스가 메소드를 구현해서 사용
 *   -많이 사용x-확장(인터페이스가 많이 사용됨)
 *   -공통점을 모아서 관리
 *   -관련된 클래스를 모아서 한 개로 관리가 가능
 *   -요구사항 분석
 *   -단일 상속-프로그램 제약이 많이 존재
 *   -결합성이 낮아짐
 * -인터페이스(interface)
 * -내부 클래스: class 안에 class
 * 
*/

//추상클래스
abstract class 도형{
	String color="검정색";
	abstract void setColor(String color);
	abstract void draw();
	//추상클래스에서 직접 구현도 가능
	void tick() {
		System.out.println("두께: 5mm");
	}
}
class 선 extends 도형{
	@Override
	void setColor(String color) {
		super.color=color;
	}
	@Override
	void draw() {
		System.out.println("선을 그린다: 색상은 "+super.color);
	}
}
class 네모 extends 도형{
	@Override
	void setColor(String color) {
		super.color=color;
	}
	@Override
	void draw() {
		System.out.println("사각형을 그린다: 색상은 "+super.color);
	}
}
class 세모 extends 도형{
	@Override
	void setColor(String color) {
		super.color=color;
	}
	@Override
	void draw() {
		System.out.println("삼각형을 그린다: 색상은 "+super.color);
	}
}
class 원 extends 도형{
	@Override
	void setColor(String color) {
		super.color=color;
	}
	@Override
	void draw() {
		System.out.println("원을 그린다: 색상은 "+super.color);
	}
}
public class 클래스의종류_1 {
	public static void main(String[] args) {
//		선 line=new 선();
//		네모 rect=new 네모();
//		세모 tri=new 세모();
//		원 cir=new 원();
		
//		line.draw();
//		rect.draw();
//		tri.draw();
//		cir.draw();
		
		도형 diagram=new 선();
		diagram.draw();
		
		diagram=new 네모();
		diagram.draw();
		
		diagram=new 세모();
		diagram.draw();
		
		diagram=new 원();
		diagram.draw();
	}
}
