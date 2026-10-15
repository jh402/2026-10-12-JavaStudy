/*
 * 제어문
 * 	사용 목적
 * 	  조건에 따라 코드를 다르게 실행이 가능
 * 	  같은 작업을 반복, 반복 실행을 중단
 * 	  해당 조건 처리
 * 	  1) 조건에 따라 실행 -> if / switch
 * 	  2) 같은 작업 반복 -> for(반복횟수 지정) / while() / do~while
 * 	  3) 반복 수행 중단 -> break(종료) , continue
 * 
 * 
 * 조건문
 * 	단일 조건문 - 독립적 -> 속도가 늦다
 * 		if(조건문){
 * 			조건문이 true면 수행
 * 		}
 * 	선택 조건문
 * 	다중 조건문
 * 
 * 
*/

import java.util.Scanner;

public class 제어문종류 {

	public static void main(String[] args) {
		//홀짝 구분
		Scanner scan=new Scanner(System.in);
		/*
		 * Scanner로 입력된 값 받기
		 * 정수 : nextInt()
		 * 실수 : nextDouble()
		 * 논리 : nextBoolean()
		 * 문자열 : next() / nextLine()
		*/
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		//모든 제어문은 {}이 없는 경우 바로 밑에 있는 하나의 문장만 제어
		if(num%2==0) {
			System.out.println("num값은 "+num);
			System.out.println(num+"은(는) 짝수입니다.");
		}
		if(num%2!=0) {
			System.out.println("num값은 "+num);
			System.out.println(num+"은(는) 홀수입니다.");
		}
	}
}
