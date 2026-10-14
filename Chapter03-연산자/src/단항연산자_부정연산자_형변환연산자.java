/*
 * 부정연산자(!) : 조건문에서 많이 사용
 * 	결과값 : true / false
 * 
 * 형변환 연산자
 * 	1. 기본형(byte < char, short < int  < long < float < double
 * 	2. 자동형변환 : 작은 데이터형 -> 큰 데이터형
 * 	3. 강제형변환 : 큰 데이터형-> 작은 데이터형
 * 
 * 산술규칙
 * 	1. 같은 데이터형 끼리 계산
 * 	2. int 이하 데이터형은 결과값이 int
 * 		ex)char + char = int
 * 참조형
 * 
*/
public class 단항연산자_부정연산자_형변환연산자 {

	public static void main(String[] args) {
		boolean bCheck=false;
		bCheck=!bCheck;//부정연산자
		System.out.println("bCheck="+bCheck);
		
		byte b1=127, b2=100, b3;
		b3=(byte) (b1+b2);//강제형변환
		System.out.println(b3);//원치 않는 값
	}
}