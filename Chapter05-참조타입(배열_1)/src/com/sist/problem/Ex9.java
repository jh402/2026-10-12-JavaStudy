package com.sist.problem;

import java.util.Scanner;

public class Ex9 {
	/// 학생들의 점수를 분석하는 프로그램
	/// 키보드로부터 학생 수와 각 학생들의 점수를 입력받고
	/// while문과 Scanner의 nextLine() 메소드를 이용해서
	/// 최고 점수 및 평균 점수를 출력
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int type;
		int students=0, max=0;
		double avg;
		int[] scores=new int[0];
		while(true){
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			type=scan.nextInt();
			
			//학생수
			if(type==1){
				System.out.print("학생수> ");
				students=scan.nextInt();
				scores=new int[students];
			}
			//점수입력
			else if(type==2){
				for(int i=0;i<scores.length;i++) {
					System.out.print("score["+i+"]: ");
					scores[i]=scan.nextInt();
				}
			}
			//점수리스트
			else if(type==3){
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			}
			//분석
			else if(type==4){
				avg=0;
				for(int i=0;i<scores.length;i++) {
					if(max<scores[i])
						max=scores[i];
					avg+=scores[i];
				}
				avg/=(double)scores.length;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			}
			//종료
			else if(type==5){
				System.out.println("프로그램 종료");
				break;
			}
			else{
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
