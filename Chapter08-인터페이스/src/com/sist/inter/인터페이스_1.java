package com.sist.inter;

/*
 * 인터페이스 : 연결(리모콘)
 * - 추상클래스의 일종
 * - 클래스와 동일하게 취급
 * - 상속 내리면 상위 클래스
 * - 클래스 여러 개를 묶어서 한 개의 이름으로 관리
 * - 다중 상속 가능
 * - public만 가능(1.9버전부터는 private 메소드 사용 가능) 따라서 메소드 구현할 때도 public
 * - 결합성이 낮은 프로그램-유지보수에 좋음
 * - 오버라이딩을 사용
 * - 인터페이스에서 인터페이스로 상속을 내릴 때 extends 사용
 * - 인터페이스에서 클래스로 상속을 내릴 때 implements 사용
 * 
 * 형태
 * interface 인터페이스명{
 *   //상수만 사용 가능
 *   int MAX=100; //== public static final int MAX=100;
 *   //추상 메소드
 *   void display1(); //== public abstract void display1();
 *   
 *   //default 메소드
 *   default display2(){//== public default display2(){}
 *     //구현
 *   }
 *   //static 메소드, private 메소드 가능
 * }
 * - public은 자동 추가
 * - 상수만 사용 가능
 * - 상수 선언에서 public static final은 자동 추가
 * - 추상메소드는 abstract 생략 가능
 * 
 * 
 * interface A
 * interface B
 * interface C extends A, B //가능
 * 
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class 인터페이스_1 extends JFrame implements MouseListener {

	public static void main(String[] args) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}