/*
 * 변환
 * toUpperCase() - 대문자 변환
 * toLowerCase() - 소문자 변환
 * replace() - 문자 / 문자열 변경 (일반)
 * replaceAll() - 문자 / 문자열 변경 (정규식)
 *  - 한글 전체[가-힣], 알파벳 전체[A-Za-z], 숫자 전체[0-9]
 * 
 * 입력 "ABCD EFG"
 * nextLine() - ABCD EFG (공백 포함)
 * next() - ABCD (공백 구분)
*/

import java.util.Scanner;
public class 문자열_3 {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.print("알파벳 입력: ");
//		String alpha=scan.nextLine();
//		
//		System.out.println(alpha.toUpperCase());
//		System.out.println(alpha.toLowerCase());
//		System.out.println(alpha);
		
		System.out.println("========= replace ===========");
		String msg="Hello Java!";
		System.out.println(msg.replace('a', 'b'));//a를 b로
		System.out.println(msg);//Hello Jbvb!
		System.out.println(msg.replace("Java", "Oracle"));
		System.out.println(msg);//Hello Ocracle!
		
		System.out.println("========= replaceAll ===========");
		String s="ABCD가나다라12345";
		System.out.println(s.replaceAll("[가-힣]", ""));
		System.out.println(s.replaceAll("[A-Z]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println(s.replaceAll("[^가-힣]", ""));//한글을 제외하고 바꾸기
	}
}
