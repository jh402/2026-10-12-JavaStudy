package com.sist.commons;

//내부 프로토콜 - 서버와 클라이언트의 약속
public class Function {
	public static final int LOGIN=100;//접속자 처리
	public static final int MYLOG=110;//본인 처리
	public static final int CHAT=200;
	public static final int EXIT=300;//남아있는 사람 처리
	public static final int MYEXIT=310;//나가는 사람 처리
	public static final int UPDATE=400;
}

/*
 * 자바 네트워크
 * 서로 다른 컴퓨터에서 실행되는 프로그램-네트워크를 통해서 데이터를 주고 받는 기술
 *
 * 클라이언트 역할
 *   -서버에 서비스 요청
 *   -서버에 접속 요청
 *   -서버에 데이터 전송
 *   -서버로부터 데이터 수신
 *   -받은 데이터 화면에 출력
 * 서버 역할
 *   -클라이언트 요청 기다리기 - 서비스 제공
 *   -클라이언트 접속 대기/허용
 *   -클라이언트 데이터 받기->처리 결과 보내기
 *   -저장/찾기/송신/수신/요청 처리
 * 쓰레드 역할
 *   -클라이언트가 독립적으로 통신이 가능하게 만든다
 * 
 * 
 * 1. 서버 구동
 * 2. 클라이언트 접속 - connection
 * 3. 클라이언트 요청(이벤트) - actionPerformed
 * 4. 서버에서 수신 - run()
 * 5. 서버 처리 - run()
 * 6. 응답 - run()
 * 7. 클라이언트 출력 - run()
 * 
 */