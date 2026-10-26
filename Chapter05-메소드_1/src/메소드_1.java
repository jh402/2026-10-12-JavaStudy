/*
 * 객체 지향 프로그램의 구조
 * class ClassName{
 *   변수
 *   생성자
 *   메소드
 * }
 * 
 * 메소드
 * - 클래스 영역에 설정
 * - 메소드 안에 메소드는 들어갈 수 없다
 * - 한 가지 기능을 수행할 수 있게 명령문을 사용
 * - 재사용 목적
 * - 유지보수 편리
 * - 구조적인 프로그램-문단을 나눠서 서술
 * - 가독성이 좋음
 * - 에러처리 편리
 * - 반복 제거
 * 
 * 1. 메소드 제작
 *   -메소드 선언부 - 리턴형 / 메소드명 / 매개변수
 *   -메소드 구현부 - 값을 보내주는 방법(return)
 * 2. 호출 순서 / 호출 방법
 * 3. 다른 클래스에서 메소드 사용법
 * 4. 어디까지가 한 개의 기능인지 확인 - 그래야 재사용이 가능
 * 5. main에서는 변수 / 연산자 / 제어문 - 사용하지 않는다
 *   -무조건 메소드 호출
 *   
 * 메소드
 * - 인스턴스 : new를 이용해서 메소드 저장
 *     객체명.메소드()
 * - 정적(static) : 컴파일 시 자동으로 저장
 *     클래스명.메소드()
 *     
 * 메소드 제작
 * 리턴형|매개변수|
 *  O  |  O   |String substring(int start, int end)
 *  O  |  X   |double random()
 *  X  |  O   |void println(String s)
 *  X  |  X   |void println()
 * 
 * 리턴형 : 사용자 요청 처리
 * 매개변수 : 사용자가 보내준 값
 * 메소드명 : 변수 식별자와 동일(소문자로 시작)
 * 
 * 형식
 * -선언부
 * 리턴형 메소드명(매개변수, ...)
 * -구현부
 * {
 * ... 요청처리
 * return 값
 * }
 * 
 * 값과 리턴형의 데이터형 동일
*/

import java.util.*;

//사용자로부터 값을 입력받아 구구단을 출력
public class 메소드_1 {
	static void gugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+i*dan);
		}
		return;//void일 경우에는 생략 가능
		//생략일 경우 컴파일 시 자동으로 return 추가
	}
	static void process() {
		Scanner scan=new Scanner(System.in);
		System.out.print("2~9까지 사이의 단 입력:");
		int dan=scan.nextInt();
		gugudan(dan);
		return;
	}
	public static void main(String[] args) {
		process();
	}

}
