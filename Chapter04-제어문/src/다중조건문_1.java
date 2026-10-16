/*
 * 여러 개의 경우의 수(조건) 
 * 형식
 * if(조건){
 * 		조건 true면 실행 문장 수행
 * 		false면 다음 조건
 * }
 * else if(조건){
 * 		조건 true면 실행 문장 수행
 * 		false면 다음 조건
 * }
 * else if(조건){
 * 		조건 true면 실행 문장 수행
 * 		false면 다음 조건
 * }
 * ...
 * else{
 * 		해당 조건이 없는 경우 처리 문장
 * }
 *
*/

import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {
		//사칙연산
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /): ");
		char op=scan.next().charAt(0);
		
		if(op=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		else if(op=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		else if(op=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		else if(op=='/') {
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다!!");
			else
				System.out.printf("%d%c%d=%.2f\n",num1,op,num2,num1/(double)num2);
		}
		else {
			System.out.println("연산자가 아닙니다!!");
		}
	}

}
