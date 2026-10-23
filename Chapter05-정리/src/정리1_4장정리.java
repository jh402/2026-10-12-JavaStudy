/*
 * 1. 변수: 프로그램 필요한 데이터 저장
 * 2. 변수 처리-연산자, 제어문
 * 3. 필요한 데이터를 묶어서 사용-배열, 클래스
 * 4. 관련된 명령어 묶기-메소드
 * 
 * 모든 프로그램: 변수 / 연산자 / 제어문
 * 
 * 5. 비정상 종료 방지 / 사전에 에러 방지 - 예외처리
 * 6. 라이브러리 (검색) - 웹관련 라이브러리 - 컬렉션 / 데이터베이스 연동
 * 
 * 오라클: DB - 영구적 저장
 * 화면UI: HTML/CSS(정적) - 동적 JavaScript
 * 
 * HTML, 오라클 연동x
 * 자바로 연동
 * 
 * 형식을 통일화(표준화)-Spring
 * JavaScript까지 통일화 - Jquery->Vue->React
 * DB까지 통일화-MyBatis / JPA
 * 
 * 지능형 웹: Sprint AI
 * 
 * 배포:DevOps->CI/CD->AWS
 * 
 * 
*/
public class 정리1_4장정리 {

	public static void main(String[] args) {
		char c='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
	}

}
