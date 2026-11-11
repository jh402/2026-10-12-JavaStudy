package com.sist.regex;

public class Regex_3 {
	public static void main(String[] args) {
		System.out.println("hkkllo".matches("h..llo"));
		System.out.println("안녕하세요".matches("....."));
		System.out.println("안녕하세요".matches(".{5}"));
		
		//홍으로 시작
		System.out.println("홍길동".matches("^홍"));//false
		//홍으로 시작하고 뒤에 한글이 여러개 있는가
		System.out.println("홍길동".matches("^홍[가-힣]+"));
		System.out.println("Hello".matches("H[A-Za-z]*llo"));
		System.out.println("sdflajsdlfjk".matches("s.*k$"));
		System.out.println("dasoivnelkqw".matches(".*"));
	}
}