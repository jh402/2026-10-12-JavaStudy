package com.sist.exception;

import java.awt.DisplayMode;

/*
 * 변수
 * 데이터형-기본형, 참조형
 * 연산자
 * 제어문
 * 
 * 메소드=기능 하나
 * 클래스=메소드+변수
 * 패키지=클래스 여러 개 
 */

public class 예외처리_1 {
	public static void display(int... num) {
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		display(10);
		display(10, 20);
		display(10, 20, 30);
		System.out.printf("%d %d %d", 10, 20, 30);
	}
}