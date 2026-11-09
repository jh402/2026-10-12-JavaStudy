package com.sist.lang;

/*
 * System 클래스의 메소드
 * System.exit(int code)-프로그램 종료
 * 1. code==0 정상 종료
 * 2. code!=0 비정상 종료
 * 3. 윈도우 종료
 * 
 * 표준입출력
 * System.in
 * InputStream()-읽어오기
 * System.int.read()-키보드 입력값
 * System.out
 * OutputStream()-화면 출력
 * System.out.print()-출력
 * System.out.println()-'\n' 포함
 * System.out.printf()-출력 형식 만들어서 출력
 * 
 * System.gc-가비지컬렉션
 * System.currentTimeMillis()-웹-로그파일
 * 
*/

//exit()-프로그램 종료
public class System_1 {
	public static void main(String[] args) {
		int a=5;
		
		for(int i=1;i<=10;i++) {
			if(i==a) {
				System.out.println("프로그램 종료");
				System.exit(0);//윈도우 창 종료할 때 사용
				//break;
			}
			System.out.println("i="+i);
		}
		System.out.println("시작");
		System.out.println("GO");
	}
}
