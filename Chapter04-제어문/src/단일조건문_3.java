/*
 * 사칙연산 (+, -, *, /)
 * 
 * 사용자 입력
 * 숫자 연산자 숫자
 * 
*/

import java.util.Scanner;
public class 단일조건문_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /, %): ");
		//Scanner는 char를 받을 수 없다
		//next() - 문자열로 받기
		//charAt(0) - 문자열 0번째 문자 하나 가져옴
		char op=scan.next().charAt(0);
		
		if(op=='+')
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		if(op=='-')
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		if(op=='*')
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		//중첩조건문
		if(op=='/') {
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			if(num2!=0)
				System.out.printf("%d/%d=%.2f\n", num1, num2, num1/(double)num2);
		}
		if(op=='%')
			System.out.printf("%d%%%d=%d\n", num1, num2, num1%num2);
	}
}
