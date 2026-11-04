package com.sist.exception;

/*
 * 다중 catch
 * - 의심되는 에러가 여러 개 존재
 */
/* 
 * 1. 배열 생성
 * 2. 문자열-정수 변환-배열에 저장
 * 3. 나누기
*/

import java.util.*;
public class 예외처리_다중처리 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 문자 입력:");
		String first=scan.next();
		System.out.print("두 번째 문자 입력:");
		String second=scan.next();
		
		int[] arr=new int[2];
		try {
		arr[0]=Integer.parseInt(first);
		arr[1]=Integer.parseInt(second);
		System.out.println(arr[0]/arr[1]);//0으로 나눌 경우 의심
		}catch(NumberFormatException e) {//정수로 변환이 안될 때
			System.out.println("정수 변환에 실패하였습니다");
		}catch(ArrayIndexOutOfBoundsException e) {//배열 범위를 초과
			System.out.println("배열 범위 초과");
		}catch(Exception e) {//기타 등등(상위 클래스는 마지막에 사용할 것)
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
}
