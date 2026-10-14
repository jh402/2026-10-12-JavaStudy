/*
 * 이항연산자 : 피연산자가 2개인 경우
 * (+, -, *, /, %)
 * 
 * +연산자
 * 1. 산술기능
 * 2. 문자열 결홥
 * 
 * /연산자
 * 1. 정수/정수=정수 (소수점 사라짐)
 * 2. 0으로 나눌 수 없음
 * 
 * %연산자
 * 1. 부호 앞에 있는 부호가 된다
 * 2. 윤년, 숫자자르기, 배수
 * 
 * 사용자 입력(키보드)
 * 	nextInt() - 정수
 * 	nextDouble() - 실수
 * 	next() - 문자열
 * 	nextBoolean() - 논리
 * 
*/

//Scanner 가져오기
import java.util.Scanner;

public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		//Scanner는 클래스
		Scanner scan=new Scanner(System.in);
//		//정수 2개 받기 - enter / space
//		System.out.print("정수 두 개 입력: ");
//		int input1=scan.nextInt();
//		int input2=scan.nextInt();
//		
//		System.out.println("input1="+input1);
//		System.out.println("input2="+input2);
//		
//		System.out.println("====== +결과 =======");
//		System.out.println(input1+input2);
//		System.out.println("====== -결과 =======");
//		System.out.println(input1-input2);
//		System.out.println("====== *결과 =======");
//		System.out.println(input1*input2);
		
		int val1=10, val2=3;
		//소수점이 여러개 출력됨
		System.out.println(val1+" / "+val2+" = "+val1/(double)val2);
		//%d 정수, %f 실수, %c 문자, %s 문자열
		//%.2f 는 소수점 2자리까지 출력
		System.out.printf("%d / %d = %.2f\n", val1, val2, val1/(double)val2);
		
		System.out.print("국어 점수 입력: ");
		int kor=scan.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng=scan.nextInt();
		System.out.print("수학 점수 입력: ");
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.printf("총합: "+total+"\n평균: %.2f", avg);
	}
}