/*
 * 삼항연산자 : 소스를 간결하게 만드는 경우
 * 
 * 형식
 * 조건?값1:값2
 * 조건이 true면 값1, false면 값2
 * 
 * 조건 - 부정연산자, 논리연산자, 비교연산자 - 결과값이 true or false
 * 
 * 
 * <%
 * 	if(num%2==0){
 * %>
 * 		짝수
 * <%
 * }
 * 	else{
 * %>
 * 		홀수
 * <%
 * }
 * %>
 * 
 * 위 코드를 아래 코드로 줄일 수 있음
 * <%num%2==0?"짝수":"홀수"%>
 * 
*/

import java.util.Scanner;
public class 삼항연산자 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		
		System.out.println(num%2==0?"짝수":"홀수");
	}
}
