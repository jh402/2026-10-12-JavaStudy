package com.sist.exception;
/*
 * 예외처리: 소스상에서 처리할 수 있는 가벼운 에러
 * 정의: 프로그램 실행 시 발생할 수 있는 에러를 대비
 * 목적: 비정상 종료를 방지
 * 
 * 에러 종류
 * 에러
 * -심각한 에러
 * -메모리 부족, 윈도우 종료
 * 예외
 * -가벼운 에러
 * -URL주소, 파일명, 경로, IP/PORT
 * 
 * 예외처리를 하면 에러를 자동으로 수정되는 것이 아님
 * 에러를 건너뛴다
 * 
 * 
 * 컴파일 시 에러(CheckedException)
 * -반드시 예외처리
 * -컴파일 시에 예외처리가 되었는지 확인
 *   -파일 읽기(java.io)-파일 경로/파일명
 *   -크롤링-URL주소
 *   -오라클 연동(java.sql)-IP/PORT
 *   -서버/네트워크(java.net)-IP/PORT
 *   -웹-URL주소
 *   -쓰레드-충돌방지
 * 실행 시 에러(UnCheckedException)
 * -필요시에만 예외처리
 * -예외처리 여부를 묻지 않음
 *   -자주 에러나는 부분
 *   -사용자 입력
 * 
 * 처리 방법
 * -예외 복구(try~catch~finally)
 * try{
 *   //정상 수행문장
 *   //에러 발생 시 catch로 이동
 * }catch(){
 *   //예외 발생시 처리
 *   printStackTrace()//에러 위치 확인
 *   getMessage()//에러문장 출력
 * }finally{
 *   //자원관리(파일닫기, 서버연결 해제 등)(생략 가능)
 * }
 * 
 * -예외 회피(throws)
 *   -시스템에 의해 처리
 * 메소드() throws 예외처리클래스
 * 
 * -예외 발생(throw)
 *   -테스트/사용자정의일 경우 임의로 발생
 * throw new 예외클래스()
 *   -throw로 호출
 * 
 * -사용자 정의
 * class 클래스명 extends Exception
 * 
 * JavaScript, Vue, React, Next, 오라클에도 예외처리 있음
 * 
 * 
 * 예외처리 계층구조
 *                Object
 *                  |
 *             Throwable:예외처리의 최상위 클래스
 *      ┌───────────┴───────────┐
 *    Error                 Exception
 *                ┌─────────────┴──────────────┐ 
 *           CheckedException          UnCheckedException
 *                |                            |
 *          IOException 등등             RuntimeException:필요에 의해서만 예외처리
 *                                             |
 *                                ArrayIndexOutOfBoundsException 등등
 * CheckedException 하위 클래스
 * -IOException: 입출력 관련
 *   - 메모리 입출력(System.in/System.out)
 *   - 파일 입출력(FileReader/FileWriter/FileInputStream/FileOutputStream)
 *   - 네트워크 입출력(BufferedReader/OutputStream)
 * -InterruptedException:쓰레드 충돌 방지(비동기)
 * -MalformedURLException
 *   - URL-크롤링
 * -ClassNotFoundException
 *   - 리플렉션(클래스명을 이용해서 제어)-Spring-new없이 메모리 할당 가능, 변수값 설정/메소드 찾기
 * -SQLException
 *   - DB연동
 * -----------------------------------------
 * RuntimeException 하위 클래스
 * -ArrayIndexOutOfBoundsException:배열 범위 초과
 * -NumberFormatException:문자열을 숫자 변경이 안되는 경우
 * -ClassCastException:클래스 형 변환
 * -NullPointerException:메모리 할당없이 사용
 * -ArithmeticException:0으로 나눈 경우
 * 
*/

public class 예외처리_개념 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			try {
				int a=(int)(Math.random()*3);//0~2
				int val=i/a;
				System.out.println(i+":"+val);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}