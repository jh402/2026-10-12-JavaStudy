package com.sist.lang;

/*
 * 1. 클래스명 확인-역할 확인
 * 2. 메소드명 확인-매개변수, 리턴형 확인
 * 3. static / instance 확인
 * 
 * 라이브러리는 제공-변경 / 추가하는 기능이 없다
 * java.lang->final
 * 사용처를 확인할 것
*/

//print
//println
//read
public class System_2 {
	public static void main(String[] args) {
		try {//read 메소드 사용-예외처리
			System.out.print("정수 입력:");
			
			//char형으로 가져옴 따라서 한 문자만 받음
			int num1=System.in.read();
			num1-='0';
			System.out.println("num1="+num1);
			
			System.in.read();//enter(13)값이 들어감
			
			System.out.print("정수 입력:");
			int num2=System.in.read();//char형으로 가져옴
			num1-='0';
			System.out.println("num2="+num2);
			
		}catch(Exception ex) {
			
		}
	}
}
