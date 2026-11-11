package com.sist.wrapper;
/*
 * int Integer / double Double / boolean Boolean 
 * char[] -> String 
 *   
 * Wrapper는 기본형 / 클래스 
 */
public class Wrapper_2 {

	public static void main(String[] args) {
        double d=10.5;
        //Wrapper클래스의 형변환은 기본형으로 사용
        Integer i=(int)d;
        System.out.println(i);
        /*
         * 형변환 -> 기본형으로 형변환 
         * 정수변환 : Integer.parseInt("10")
         * 실수변환 : Double.parseDouble("10.5")
         * 논리변환 : Boolean.parseBoolean("true")
         */
        String[] s={"100", "20", "1", "5", null};
        for(String ss:s) {
        	if(ss!=null) {
        	  Integer a=Integer.parseInt(ss);
        	  System.out.println(a);
        	}
        }
        
	}
}