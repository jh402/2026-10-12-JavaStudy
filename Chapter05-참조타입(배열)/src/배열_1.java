/*
 * 배열: 같은 유형의 데이터를 여러 개 모아서 관리
 *  - 크기 고정
 * 
 * 컬렉션(가변)
 * ArrayList / LinkedList / Vector / Map / Set
 * 
 * 배열 특징
 * 연속적인 메모리 할당-인덱스를 이용한 접근이 가능
 * 배열 크기는 선언시에 정해짐
 * 한번 선언-변경 불가능
 * 
 * 장점
 * 빠른 접근 속도-인덱스 번호 이용
 * CPU를 자주 사용시에 데이터를 cache에 저장 가능
 * 간단한 구현
 * 고정된 크기-메모리 관리 쉬움
 * 
 * 단점
 * 고정된 크기-추가, 삭제시에 어려움
 * 메모리 낭비-크게 만들면 사용이 안되는 메모리 존재
 * 
 * 배열 선언
 * 데이터형[] 배열명; <--권장
 * 데이터형 배열명[];
 * 
 * 초기화
 * 1. 선언과 동시에 초기화
 * 데이터형[] 배열명={값1, 값2, ...}; - 명시적 초기화
 * 2. default 생성 - 가장 많이 사용
 * 데이터형[] 배열명=new 데이터형[생성갯수];
 *   int는 0, long은 0L, double은 0.0, char은 '\0', boolean은 false, String은 null으로 초기화
 *   null: 메모리 주소가 없음
 * 3. 선언 후 나중에 초기화
 * 데이터형[] 배열명;
 * 배열명=new 데이터형[] {값1, 값2, ...}
 * 
 * for-each문 - 실제 배열에 저장된 실제 데이터를 읽음
 * int[] arr={10,20,30,40,50};
 * for(int a:arr){} //a의 데이터형은 arr의 데이터형과 같을 것
 * 
 * 메모리 구조
 * int[] arr={10, 20, 30};
 * stack에 주소값 저장, heap에 주소값에 위치한 10, 20, 30값 저장
 * 
 * 
 * 배열명.length - 배열 갯수
 * 
*/

import java.util.Scanner;

public class 배열_1 {

	public static void main(String[] args) {
		//배열의 필요성
		Scanner scan=new Scanner(System.in);
		//3명의 학생 -> 국어 / 영어 / 수학 -> 총점, 평균, 학점
		
		/*
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int math1, math2, math3;
		int total1, total2, total3;
		double avg1, avg2, avg3;
		char score1, score2, score3;
		
		//첫 번째 학생
		System.out.print("첫 번째 학생 국어 점수: ");
		kor1=scan.nextInt();
		System.out.print("첫 번째 학생 영어 점수: ");
		eng1=scan.nextInt();
		System.out.print("첫 번째 학생 수학 점수: ");
		math1=scan.nextInt();
		
		total1=kor1+eng1+math1;
		avg1=total1/3.0;
		
		switch(total1/30) {
		case 10, 9->score1='A';
		case 8->score1='B';
		case 7->score1='C';
		case 6->score1='D';
		default->score1='F';
		}
		
		
		//두 번째 학생
		System.out.print("두 번째 학생 국어 점수: ");
		kor2=scan.nextInt();
		System.out.print("두 번째 학생 영어 점수: ");
		eng2=scan.nextInt();
		System.out.print("두 번째 학생 수학 점수: ");
		math2=scan.nextInt();
				
		total2=kor2+eng2+math2;
		avg2=total2/3.0;
				
		switch(total2/30) {
		case 10, 9->score2='A';
		case 8->score2='B';
		case 7->score2='C';
		case 6->score2='D';
		default->score2='F';
		}
		
		
		//세 번째 학생
		System.out.print("세 번째 학생 국어 점수: ");
		kor3=scan.nextInt();
		System.out.print("세 번째 학생 영어 점수: ");
		eng3=scan.nextInt();
		System.out.print("세 번째 학생 수학 점수: ");
		math3=scan.nextInt();
				
		total3=kor3+eng3+math3;
		avg3=total3/3.0;
				
		switch(total3/30) {
		case 10, 9->score3='A';
		case 8->score3='B';
		case 7->score3='C';
		case 6->score3='D';
		default->score3='F';
		}
		
		System.out.println("============결과값==============");
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f%-5c\n", kor1, eng1, math1, total1, avg1, score1);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f%-5c\n", kor2, eng2, math2, total2, avg2, score2);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f%-5c\n", kor3, eng3, math3, total3, avg3, score3);*/
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		
		//점수 입력
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"번째 학생 국어 점수 입력: ");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 학생 영어 점수 입력: ");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 학생 수학 점수 입력: ");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			switch(total[i]/30) {
			case 10, 9->score[i]='A';
			case 8->score[i]='B';
			case 7->score[i]='C';
			case 6->score[i]='D';
			default->score[i]='F';
			}
		}
		
		System.out.println("============결과값==============");
		for(int i=0;i<3;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-5.2f%-5c\n", kor[i], eng[i], math[i], total[i], avg[i], score[i]);
		}
			
	}
}
