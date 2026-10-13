/*
 * 변수-한 개의 데이터를 저장하는 메모리 공간
 * RAM에 저장
 * 
 * 
 * 데이터형
 * 기본형
 * 	정수-byte(1byte), short(2byte), int(4byte)-프로그램에서 숫자는 기본적으로 int로 인식, long(8byte)
 * 	실수-float(4byte, 소수점 6자리까지), double(8byte, 소수점 15자리까지)-프로그램에서 실수는 기본적으로 double로 인식
 * 	논리-boolean(1byte) - true, false
 * 	문자-char(2byte - UTF-8) - 문자 1개 '', String - 여러 개 ""
 * 
 * 참조형(사용자 정의) - 배열, 클래스
 * 
 * 
 * 변수 설정
 * 데이터형 변수명=초기값;
 * ex) int a=10;
 * 
 * 상수 (변하지 않는 값)
 * ex) final int a=10;
 * 
 * 
 * 변수 명칭법
 * 1. 알파벳으로 시작
 * 2. 숫자 사용가능(단 앞에 사용x)
 * 3. 특수문자 사용가능 _ or $
 * 		임시 변수 : _변수명
 * 		단어 2개 이상(스네이크 표기법) : file_name
 * 4. 공백 사용x
 * 5. 키워드 사용x
 *  
 * 약속사항
 * -변수는 소문자 시작
 * -상수는 모두 대문자
 * 
 * 캐멀스타일
 * 
 * (헝가리안 표기법) : 첫 단어 소문자 다음 단어 첫글자 대문자 
 * ex)firstName
 * 
 * 
 * 0b10 2진법
 * 07-8진법
 * 0xFF-16진법
 * 
 * 데이터형의 크기
 * byte < short, char < int < long < float < double
 * 업캐스팅 : 데이터 형을 크게
 * 다운캐스팅 : 데이터 형을 작게
 * 
*/
public class 변수 {
	public static void main(String[] args) {
		byte byteValue=127;
		int intValue=10;
		long longValue=10L;
		float floatValue=10.5f;
		double doubleValue=10.5;
		boolean booleanValue=true;
		char charValue='A';
		
		System.out.println("byteValue="+byteValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		System.out.println("floatValue="+floatValue);
		System.out.println("doubleValue="+doubleValue);
		System.out.println("booleanValue="+booleanValue);
		System.out.println("charValue="+charValue);
		
		double d=100;//자동형변환
		System.out.println("\nd="+d);
		int a=97;//강제형변환
		System.out.println("a="+(char)a);
	}
}