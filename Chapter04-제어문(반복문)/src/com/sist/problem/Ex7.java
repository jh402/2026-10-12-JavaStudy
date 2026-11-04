package com.sist.problem;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		/// while문과 Scanner의 nextLine() 메소드를 이용해서
		/// 다음 실행 결과와 같이 키보드로부터 입력된 데이터로
		/// 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
		
		Scanner scan=new Scanner(System.in);
		int type=0;
		
		while(type!=4) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");
			type=scan.nextInt();
			
			
			switch(type) {
			case 1->{
				System.out.println("예금액>");
				scan.nextInt();
			}
			
			}
		}
	}
}
