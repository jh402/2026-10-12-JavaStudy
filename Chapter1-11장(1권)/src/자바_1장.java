/*
 * 1권 
 * 1장 : 자바 실행 과정 
 *      자바 코딩의 구성 
 *   package : 자신의 저장위치
 *   import : 다른 클래스를 사용하기 위해서 불러온다
 *            여러개 올 수 있다 
 * public class ClassName {
 *   변수 
 *   static 또는 instance 
 *   생성자
 *   메소드
 *   main() => 프로그램의 시작점
 * }
 * 
 * 한개의 파일에 여러개 클래스 사용이 가능
 * public 클래스는 한개만 사용이 가능
 * 자바파일명 == 클래스명
 * 
 * 실행 
 * A.java ---javac(컴파일)---> A.class ---java(인터프리터)---> JVM ---> 실행
 * 주의점 
 * 1) 필요시에는 반드시 주석 : 번역할때 인식이 안되는 코드
 *    / * * / => Ctrl+Shift+/
 *    // => Ctrl+/
 * 2) 명령문이 종료하면 ;
 *    제어문에 ;을 사용하면 안된다
 * 3) 변수와 메소드는 소문자가 관례
 *    클래스 / 인터페이스 / 추상 클래스 / 나열형 (enum) => 첫글자 대문자 
 *    상수 : 모든 문자를 대문자
 *    카멜 표기법 : fileName
 *    스네이크 표기법 : file_name
 * 4) 들여쓰기 
 * 5) jdk.java.net -> 21
 *    eclipse.org -> J2EE - 오라클 / Vscode
 * 
 * 
 * 2장 : 데이터형 (기본형) / 변수
 * 변수 : 한개의 데이터를 저장하는 메모리 공간의 이름 
 * 메모리 크기-데이터형, 자료형
 * 
 * 데이터형
 * 정수 : byte / int / long
 * 실수 : float / double
 * 문자 : char
 * 논리 : boolean
 * 
 * 1) 크기
 * byte < char <int < long < double 
 * -필요시에는 형변경해서 사용이 가능 
 * 
 * 2) 변수 잡는 방법
 * int jumsu=90
 * jumsu=90
 * jumsu=80
 * 
 * 3장 : 연산자
 * 단일연산자
 * 이항연산자
 * 삼항연산자
 * 
 * 4장 : 제어문
 * if문 - 조건식 사용
 * switch문 - 데이터값 사용
 * 
 * 반복횟수가 정해진 경우 : for
 * 반복횟수가 정해지지 않은 경우 : while
 * 
 * 
 * 5장 : 참조타입 - 배열
 * 배열
 * -크기 고정(유동-컬렉션)
 * -같은 데이터형
 * -배열 갯수: 배열명.length()
 * -인덱스는 0번부터
 * 
 * 초기화
 * int[] arr=new int[5];
 * 
 * for-each
 * for(데이터형 변수명:배열){}
 * -배열값 변경 불가능-배열에 있는 데이터 출력용도
 * 
 * 
 * 6장 : 클래스 - 객체지향
 * 객체지향프로그램-클래스와 클래스의 연관관계
 * ex) 사람-컴퓨터 / 사람-자판기
 * 항상 액터(행위자) 존재
 * 
 * 접근지정어 : private, default, protected, public
 * 
 * 클래스 구정요소
 * class ClassName{
 *   필드-멤버변수-static 변수, instance 변수
 *   생성자-클래스 생성할 때 호출
 *   메소드-기능처리, 요청 처리
 * }
 * 
 * this() - 자신의 생성자 호출
 * this - 자신의 멤버변수 호출
 * super() - 상속내린 클래스의 생성자 호출
 * super - 상속내린 클래스의 멤버변수 호출
 * 
 * 메소드
 * public static - 객체마다 공통으로 사용된 메소드
 * public final - 종단 메소드, 오버라이딩 불가능
 * public abstract - 선언만된 메소드, 기능은 동일하지만 구현하는 내용이 다른경우 사용
 * 
 * 7장 : 상속, 추상클래스
 * 상속 is-a : 실제 상속받은 기능을 변경
 * 포함 has-a : 있는 그대로 사용
 * 
 * 수정/추가: 확장
 * 수정-오버라이딩
 * 추가-오버로딩
 * 
 * 추상클래스 / 인터페이스 - 추상화
 * 
 * 상속의 특징
 * -재사용 가능
 * -반복 제거
 * -기존의 클래스를 확장해서 새로운 클래스 제작
 * -유지보수
 * -단일 상속만 가능
 * 
 * 
 * 8장 : 인터페이스 
 * 인터페이스 / 추상클래스 차이점
 * -추상클래스는 상속받아서 확장하는 목적
 * -인터페이스는 관련된 여러 개의 클래스를 묶어서 관리하는 목적
 * 
 * 공통점
 * 자신이 메모리할당을 할 수 없음-미완성된 클래스
 * 상속을 내려서 완성 후에 사용
 * 
 * 인터페이스 구성요소
 * -상수 (public static final)
 * -미완성된 메소드
 * -완성된 메소드 
 * 
 * 9장 : import/ package
 * package
 * -관련된 클래스를 모아서 관리-관리가 쉽다
 * import
 * -다른 클래스를 읽어올 때 사용
 * 
 * 10장 : 중첩 클래스
 * 공통으로 사용되는 변수나 메소드를 객체 생성없이 사용이 가능
 * 멤버 클래스
 * class A{
 *   //A 클래스의 변수
 *   //A 클래스의 메소드
 *   class B{
 *     //A의 모든 것을 사용 가능
 *   }
 * }
 * 자주 사용되는 곳
 * 윈도우 - 쓰레드
 * 네트워크 서버-통신쓰레드
 * 
 * 익명의 클래스-상속 없이 오버라이딩 가능
 * class A{
 *   B b=new B(){
 *     public void display(){} //일회성 : A클래스 안에서만 사용이 가능
 *   };
 * }
 * class B{
 *   public void display(){}
 * }
 * 
 * 
 * 11장 : 예외처리
 * 오류가 발생하면 프로그램 종료
 * 따라서 사전에 에러 차단
 * 
 * 종류
 * 직접처리: try~catch~finally
 * 간접처리(예외회피): throws
 * -JVM에 알려줌->에러가 발생할 수 있다 다음에 처리하겠다(에러 떠맡기기)-컴파일 시 에러를 피해서 수행
 * 임의발생: throw
 * 사용자 정의
 * class MyException extends Exception{
 *   //소스
 * }
 * 
 * 2권 
 * 자바 라이브러리
 * java.lang / java.util / java.io
 * java.net / java.sql 
 * java.text / java.lang.reflect
 * java.util.regex 
 * 
 * 1. 컬렉션
 * 2. 람다식
 * 3. 입출력
 * 4. SQL
 * 
 */

import java.util.*;
//import java.lang.*; 생략됨-컴파일 때 자동 첨부

//static으로 클래스명 생략
import static java.lang.Math.random;

public class 자바_1장 {
	public static void main(String[] args) {
		int rand1=(int)(Math.random()*100);
		System.out.println(rand1);
		
		int rand2=(int)(random()*100);
		System.out.println(rand2);
	}
}