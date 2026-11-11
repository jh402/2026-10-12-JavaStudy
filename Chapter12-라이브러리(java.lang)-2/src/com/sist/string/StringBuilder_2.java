package com.sist.string;
/*
 * String
 * - 문자열 변경이 불가능 => 변경시에 새로운 메모리가 생성 
 * 
 * StringBuffer
 * - 가변 문자열 (메모리 공간 1개) + 동기화
 * - 크롤링시에 나눠서 작업(쓰레드 -> 안정) 
 *  
 * StringBuilder
 * - 가변 문자열 + 비동기화 -> 속도 빠름
 * 
 * append() : 추가 
 * insert() : 삽입 
 * delete() : 삭제 
 * replace() : 변경 
 * reverse() : 뒤집기
 * toString() : String 변경 
 */
public class StringBuilder_2 {

	public static void main(String[] args) {
        //StringBuilder sb=new StringBuilder("Java");
		StringBuffer sb=new StringBuffer("Java");
        // 문자열 추가 
        sb.append(" Hello");
        System.out.println(sb);
        
        // 특정위치에 추가 
        sb.insert(4, "Language");
        System.out.println(sb);
        
        // 삭제 
        sb.delete(0, 4);// end-1
        System.out.println(sb);
        
        // 교체
        sb.replace(0, 8, "Spring");
        System.out.println(sb);
        
        // 거꾸로
        sb.reverse();
        System.out.println(sb);
        
        String s=sb.toString();
	}

}