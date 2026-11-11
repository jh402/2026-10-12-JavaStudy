package com.sist.wrapper;
/*
 * Wrapper 클래스
 * - 포장 클래스 
 * - 기본 데이터형을 객체로 사용이 가능하게 만든 클래스  
 * - 제네릭(데이터형 통일) 사용이 가능하게 
 * 
 * <클래스만> -> <int>(X) 
 *          -> <Integer>
 * 
 * 8개의 기본을 클래스 
 * byte - Byte 
 * short - Short
 * int - Integer
 * long - Long
 * float - Float
 * double - Double
 * char - Character
 * boolean - Boolean
 * 
 * - 일부 기능을 직접 사용이 가능 만들었다 
 *        
 * 호환
 * Boxing
 * int num=100;
 * Integer i=100; // 클래스에는 값이 아니라 주소 
 * 
 * UnBoxing
 * Integer i=100;
 * int ii=i;
 * 
 */
public class Wrapper_1 {

	public static void main(String[] args) {
        int a=10;
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(a));// 2진법
        System.out.println(Integer.toHexString(a)); // 16진법
        System.out.println(Integer.toOctalString(a));// 8진법
        
        //문자열을 int형으로 변경
        String s="100";
        System.out.println(Integer.parseInt(s));
        
        //i와 j에는 주소값이 저장되지만 연산은 int와 동일
        Integer i=100;
        Integer j=200;
        System.out.println(i+j);
	}
}
/*
 * parseInt() 
 * valueOf()
 * toString() 
 * compare()
 * max/min
 *  
 */