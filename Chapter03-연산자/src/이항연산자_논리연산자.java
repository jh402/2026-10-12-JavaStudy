/*
 * 논리연산자
 * && - 직렬연산자
 * ex) (조건) && (조건)
 * 	true && true -> true
 * 	true && false -> false
 * 	false && true -> false
 * 	false && false -> false
 * &&연산자는 어떠한 값 범위 안에 포함된 경우 많이 사용
 * 
 * 
 * || - 병렬연산자
 * ex) (조건) || (조건)
 * 	true || true -> true
 * 	true || false -> true
 * 	false || true -> true
 * 	false || false -> false
 * ||연산자는 어떠한 값 범위 밖에 있는 경우 많이 사용
 * 
 * 조건문에는 비교연산자 or 부정연산자 사용
 * 
*/

import java.util.Scanner;
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		char c=scan.next().charAt(0);
		
		System.out.println("c값이 대문자인가?"+(c>='A'&&c<='Z'));
		System.out.println("c값이 소문자인가?"+(c>='a'&&c>='z'));
		System.out.println("알파벳아 아닌가?"+!((c>='A'&&c<'Z')||(c>='a'&&c<='z')));
	}
}
