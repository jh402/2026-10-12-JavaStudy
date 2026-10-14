/*
 * 문법
 * 1. 데이터형
 * 2. 변수 선언=초기화
 * 3. 연산처리
 * 4. 제어문
 * 5. 데이터를 모아서 관리 : 배열 / 클래스(사용자 정의)
 * 6. 명령문을 모아서 관리 : 메소드
 * 7. 객체지향프로그램 : 체계적으로 모아서 관리 - 재사용
 * 8. 프로그램이 비정상 종료 없이 사용 : 예외처리
 * 9. 자바에서 제공하는 라이브러리
 * 	  외부에서 제공하는 라이브러리 : Jsoup / JSON (jackson) / lombok
 * 
 * 데이터 영구적 저장 : 오라클
 * 브라우저에서 실행 : HTML / CSS / Javascript(Jquery, Vue3, React)
 * Web 관련 : JSP
 * 
 * 실무
 * 1. Spring Boot
 * 2. Spring Security - JWT
 * 3. Kafka
 * 4. WebSocket - Stomp - Redis
 * 5. Spring AI
 * 6. CI/CD
 * 		- 우분투 / Docker / Docker-compose
 * 		  쿠바네티스 / Jenkins
 * 7. AWS - EC2 / S3 / CloudWatch
 * 
 * 개인프로젝트 : NextJS / NodeJS / TypeScript
 * 	- 포트폴리오 / 이력서(자소서)
 * 
 * 
 * 프로그램 - 메모리에 저장 -> 프로그램 종료 -> 영구정 저장x 
 * 데이터 저장 -> 데이터 가공 -> 결과값 출력
 * 데이터 저장
 * 	-한개 저장
 *	-여러 개 저장(같은 데이터형) : 배열
 *	-여러 개 저장(다른 데이터형) : 클래스
 * 
 * 영구적 저장 - 파일, RDBMS(오라클)
 * 
 * 데이터 가공 - 연산자, 제어문	+메소드
 * 결과값 출력 - 윈도우, 도스 - 애플리케이션
 * 			- 브라우저 - 웹애플리케이션
 * 			- 폰 - 앱
 */
 /* 
 * 데이터형
 * 	-기본형 - 자바에서 제공하는 데이터형
 * 	-참조형 - 사용자 정의
 * 
 * 변수 선언
 * 멤버변수 : 자동 초기화
 * 지역변수 : 메소드 안에 선언, 자동 초기화x, 초기화 후에 사용
 * 		   명시적 초기화, 사용자 입력값, 난수
 * 초기화 방법
 * 1. 선언 + 초기화
 * 	ex)int age=20;
 * 2. 선언 후 초기화
 * 	ex)int age;
 * 	   age=20;
 * 3. 여러 개 변수 설정
 * 	ex)int a, b, c;
 * 	   a=b=c=10;
 * 4. 초기값을 다른 변수에 대입
 * 	ex)int a=10;
 * 	   int b=a;
 * 5. 값 교체
 * 	ex)int a=10, b=20, temp;
 * 	   temp=a; a=b; b=temp;
 * 6. 각 데이터형별 초기화
 * 	ex)int 20
 * long 20L
 * float 20.0f
 * double 20.0
 * char 'A' (특수문자 '\n', '\t', \\, \")
 * boolean true / false
 * 
 * 
 * 연산처리
 * 	피연산자
 * 	 연산 대상
 * 	  1개 : 단항연산자 - 증감연산자(++값, 값++, --값, 값--), 부정연산자(!값), 형변환 연산자((데이터형)값)
 * 	  2개 : 이항연산자 - 산술연산자(+, -, *, /, %), 비교연산자(==, >, <, <=, >=, !=)-결과값 true / false,
 * 					  논리연산자(&&, ||), 대입연산자(=), 복합대입연산자(+=, -=, *=, /=, %=)
 * 	  3개 : 삼항연산자(조건?값1:값2)-true면 값1, false면 값2
 * 							  -소스가 길거나 언어 여러 개가 섞여있는 경우
 * 
*/
public class 연산자종류 {
	
	public static void main(String[] args) {
		System.out.println("\"홍길동\"");
		System.out.println("c:\\javaDev\\javaStudy");//'\'문자 출력
		
		int age=20;
		age=21;
		System.out.println("age="+age);
		
		final int a=20;//상수
		
		//나머지 연산자는 앞 숫자의 부호를 따라감(/ 연산자도 동일)
		System.out.println("5%2="+(5%2));
		System.out.println("5%-2="+(5%-2));
		System.out.println("-5%2="+(-5%2));
		System.out.println("-5%-2="+(-5%-2));
	}
}
