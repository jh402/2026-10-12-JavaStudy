package com.sist.inter2;

/*
 * 추상클래스
 * 구현이 안된 메소드를 가지고 있다
 * 객체 생성이 불가능(간접적으로 생성은 가능)
 * 상속을 받은 클래스를 이용하여 메모리 할당이 가능
 * 사용 시에 상속을 받은 후 하위 클래스에서 확장, 구현하여 사용
 * 상속을 통해서 코드를 재사용 강제로 메소드 구현을 하는 역할
 * 관련 있는 클래스 여러 개 모아서 관리
 * 형식
 * public abstract class ClassName{
 *   변수(인스턴스 변수/ 정적 변수
 *   생성자
 *   메소드
 *   추상메소드(상속을 내려서 사용)
 * }
 * 
 * 인터페이스
 * 추상 클래스의 단점(변수, 단일 상속)을 보완
 * 주로 기능 설계(메소드)에 사용
 * 코드의 표준화
 * 다른 클래스와 연결이 편리
 * 결합성이 낮다
 * 다중 상속이 가능
 * 독립적으로 사용이 가능
 * 유지보수가 편리
 * 소스를 통일화 시키므로 분석이 쉽다
 * 형식(Only public)
 * public interface 인터페이스명{
 *   상수(public static final 생략 가능)
 *   추상메소드(public abstract 생략 가능)
 *   default 메소드(public 생략 가능)
 *   static 메소드(public 생략 가능)
 *   private 메소드
 * }
 * 
 * 다중 상속은 콤마(,)로 구분
 * interface에서 interface로 상속을 할 때 extends 사용
 * interface에서 class로 상속을 할 때 implements 사용
 * 
*/

import java.util.Scanner;
public class 인터페이스_추상클래스_비교 {
	
	private static void abst() {
		System.out.println("추상클래스");
		System.out.println("구현이 안된 메소드를 가짐");
		System.out.println("객체 생성이 불가능(간접적으로 생성은 가능)");
		System.out.println("상속을 받은 클래스를 이용하여 메모리 할당이 가능");
		System.out.println("사용 시에 상속을 받은 후 하위 클래스에서 확장, 구현하여 사용");
		System.out.println("상속을 통해서 코드를 재사용-강제로 메소드 구현");
		System.out.println("관련 있는 클래스 여러 개 모아서 관리");
		System.out.println("----------------------------------------------------");
		System.out.println("형식");
		System.out.println("public abstract class ClassName{\n"
				+ "\t변수(인스턴스 변수 정적 변수\n"
				+ "\t생성자\n"
				+ "\t메소드\n"
				+ "\t추상메소드\n}");
	}
	private static void inter() {
		System.out.println("인터페이스");
		System.out.println("추상 클래스의 단점(변수, 단일 상속)을 보완");
		System.out.println("주로 기능 설계(메소드)에 사용");
		System.out.println("코드의 표준화");
		System.out.println("다른 클래스와 연결이 편리");
		System.out.println("결합성이 낮다");
		System.out.println("다중 상속이 가능");
		System.out.println("독립적으로 사용이 가능");
		System.out.println("유지보수가 편리");
		System.out.println("소스를 통일화 시키므로 분석이 쉽다");
		System.out.println("----------------------------------------------------");
		System.out.println("형식");
		System.out.println("public interface 인터페이스명{\n"
				+ "\t상수(public static final 생략 가능)\n"
				+ "\t추상메소드(public abstract 생략 가능)\n"
				+ "\tdefault 메소드(public 생략 가능)\n"
				+ "\tstatic 메소드(public 생략 가능)\n"
				+ "\tprivate 메소드\n}");
		System.out.println("다중 상속은 콤마(,)로 구분");
		System.out.println("interface에서 interface로 상속을 할 때 extends 사용");
		System.out.println("interface에서 class로 상속을 할 때 implements 사용");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("=====================================");
			System.out.print("추상클래스(1) 인터페이스(2):");
			String type=scan.next();
			if(type.equals("1")||type.equals("추상클래스")) {
				인터페이스_추상클래스_비교.abst();
			}
			else if(type.equals("2")||type.equals("인터페이스")) {
				인터페이스_추상클래스_비교.inter();
			}
			else {
				break;
			}
			System.out.println("=====================================");
		}
	}
}