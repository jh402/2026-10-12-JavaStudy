/*
 * 사용자 입력값 1~3의 정수
 * 1 - google
 * 2 - naver
 * 3 - daum
 * 
*/
import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) throws Exception{//예외처리
		//System.in - 키보드 입력값
		Scanner scan=new Scanner(System.in);
		System.out.print("1~3 정수 입력: ");
		int num=scan.nextInt();
		
		if(num==1)
			//예외처리된 클래스
			Runtime.getRuntime().exec(new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "http://www.google.co.kr"});
		if(num==2)
			Runtime.getRuntime().exec(new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "http://www.naver.com"});
		if(num==3)
			Runtime.getRuntime().exec(new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "http://www.daum.net"});
		
	}
}
