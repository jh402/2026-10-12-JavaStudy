package com.sist.string;

/*
 * java.lang
 * -String-문자열을 저장할 때 사용되는 데이터형
 * -StringBuffer / StringBuilder
 * 
 * java.util
 * -StringTokenizer-문자를 토큰별로 나눌 때 사용
 *   메소드
 *   counterTokens() / hasMoreTokens()
 *   nexToken()
*/
public class 문자열_1 {
	public static void main(String[] args) {
		Object[] arr= {10, 'A', 10.5, "홍길동", 10L, 10.5f};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getClass());
		}
	}
}
