package com.sist.format;

import java.text.NumberFormat;

public class Format_4 {
	public static void main(String[] args) {
		double num=1234567.89;
		
		//new를 사용하지 않는 경우 => 인터페이스 / 추상클래스
        //미완성 클래스 -> new을 사용해서 메모리 할당이 안된다
		
		//숫자 세 자리마다 ','문자 삽입
        NumberFormat nf=NumberFormat.getInstance();
        System.out.println(nf.format(num));
        
        //₩기호, 숫자 세 자리마다 ','문자 삽입, 소수점 반올림
        nf=NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(num));
        
        //퍼센트
        nf=NumberFormat.getPercentInstance();
        System.out.println(nf.format(0.25));
	}
}
