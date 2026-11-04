package com.sist.exception;
/*
 * 예외처리
 * CheckedException
 * -컴파일러가 예외처리 코드 있는지 확인
 * -반드시 예외처리
 * try~catch
 * - 직접 처리
 * - 예외 복구
 * throws
 * - 간접처리
 * - 예외 회피
 * 
 * UnCehckedException
 * -반드시 예외처리를 안해도 됨
 * -유효성 검사
 * -if -> try~catch
 * 
*/

class A{
	
}
class B extends A{
	
}
public class 예외처리종류 {
	public static void aaa(int a, int b) {
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ex) {//산술 에러
			//System.out.println(ex.getMessage());// /by zero
			ex.printStackTrace();
			System.out.println();
		}
	}
	public static void bbb(String data) {
		try {
			System.out.println(data.length());
		}catch(NullPointerException ex) {//참조 변수가 null인 값을 사용할 때
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println();
		}
	}
	public static void ccc(String num) {
		try {
			System.out.println(Integer.parseInt(num));//Integer.parseInt() 자주쓰는 함수
		}catch(NumberFormatException ex) {//문자열 정수로 변환할 때 
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println();
		}
	}
	public static void ddd() {
		try {
			int[] arr=new int[2];
			arr[0]=100;arr[2]=200;
			System.out.println(arr[1]);
		}catch(ArrayIndexOutOfBoundsException ex) {//배열의 인덱스 범위 벗어남
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println();
		}
	}
	public static void eee() {
		try {
			A a=new A();
			B b=(B)a;
			//정상 실행
			/*
			 * A a=new B();
			 * B b=(B)a;
			 */
		}catch(ClassCastException ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println();
		}
	}
	//그냥 호출하면 에러 꼭 예외처리 하기
	public static void fff() throws Exception{
		
	}
	//예외처리 하거나 말거나
	public static void ggg() throws RuntimeException{
		
	}
	// RuntimeException 위 에러들을 한번에 잡음 또는 Exception 사용
	public static void main(String[] args) {
		aaa(10,0);
		bbb(null);
		ccc(" 20");
		ddd();
		eee();
		//fff(); //예외처리해야 사용 가능
		ggg();
	}
}
