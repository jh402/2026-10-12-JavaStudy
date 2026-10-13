/*
 * 실행 방법
 * 	컴파일 javac
 * 	인터프리터 java
 * 
 * 자바 특징
 * 	이식성이 좋다(모든 운영체제에서 실행 가능)
 * 	자동 메모리 해제(가비지 컬렉션 - 필요시 직접 호출 가능(System.gc())
 *  객체 지향 프로그램 : 조립식 (메인보드) (Spring - CBD 프로그램)
 * 
 * 설치	
 * 	자바 JDK, 편집기
 * 	jdk.java.net - jdk21 (자바 개발 툴)
 * 	eclipse.org - J2EE (Java, Web) (편집기)
 * 	path : c:\\jdk-21\bin
 * 	classpath : .;c:\\jdk-21\lib	
 * 		명령어
 * 		java -version
 * 		java
 * 		javac
 * 
 * 주의점
 *	main필요
 *	프로그램은 컴퓨터에 명령 수행하게 만든다
 *	클래스명과 파일명 동일
 *	가급적이면 한글명x
 *
 * 주석
 *  ctrl + shift + / 여러줄 주석
 *  ctrl + shift + \ 여러줄 주석 해제
 *  ctrl + / 주석 한줄 or 해제
 * 
 * 파일명 : A.java
 * A.java------------> A.class--------------->실행
 *         javac(컴파일)         java(인터프리터)
 * 
 * 재사용, 가독성, 확장성 - 유지보수성
 * 
 * 데이터 저장 방법
 * 	한 개 저장(변수, 상수)
 * 	저장 크기: 데이터형
 * 
 * 연산처리 (단항, 이항, 삼항)
 * 
 * 프로그램 제어 (제어문)
 * 
*/
public class 자바동작과정 {

	public static void main(String[] args) {
		System.out.println("Hello java");
	}
}
