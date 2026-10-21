/*
 * 중요!
 * trim() - 좌우 공백 제거 함수(String 리턴, 인수x)
 *   -검색어, 사용자입력(ID, pw)
 * valueOf() - 모든 데이터형을 문자열로 변경(String 리턴, 인수 다양함-오버로딩)
 *  10.5->"10.5"
 * split() - 단어(토큰) 별로 나눠서 배열에 저장
 * 
 * 
 * join() - 문자를 묶어서 한 개의 문자열 저장
 * format() - 문자열 변환(가변형 매개변수
 * 
 * 
 * 라이브러리 - 자바에서 만든 클래스
 * 메소드: 특정 기능을 수행하는 명령문의 집합
 * 메소드의 구성 요소
 * 리턴형 메소드명(매개변수){
 *   기능 수행
 *   return 값;
 * }
 * 
 * 1. 어떤 클래스인지
 * 2. 어떤 기능이 필요한지
 * 3. 매개변수 값
 * 4. 리턴형
 * 5. 어떻게 호출할건지
 * 
 * 결과값이 없는 경우 - void형
 * 
*/
public class 문자열_5 {
	public static void main(String[] args) {
		String msg=" Hello Java ";
		System.out.println("문자 갯수:"+msg.length());
		System.out.println("msg="+msg);
		msg=msg.trim();
		System.out.println("문자 갯수:"+msg.length());
		System.out.println("msg="+msg);
		
		int a=100, b=200;
		System.out.println(a+b);//300
		System.out.println(String.valueOf(a)+b);//100200
		
		String s=String.join("/", "2026", "10", "21");
		System.out.println(s);
		
		s=String.format("%d %d %d %d %.2f", 90, 90, 80, 260, 260/3.0);//브라우저에 사용
		System.out.println(s);
	}
}
