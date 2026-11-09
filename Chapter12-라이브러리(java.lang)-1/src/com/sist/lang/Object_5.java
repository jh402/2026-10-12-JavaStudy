package com.sist.lang;

//getClass() - 데이터형을 가져올 때 사용(클래스명 출력)
class Food{
	private int fno;
	private String name;
	
	
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Object_5 {
	public static void main(String[] args) {
		Food f=new Food();
		System.out.println(f.getClass());
		
		String s="";
		System.out.println(s.getClass());
	}
}

/*
 * java.lang의 클래스
 * -Object
 * -String
 *   toUpperCase()-대문자변환
 *   toLowerCase()-소문자 변환
 *   replace() / replaceAll()-문자 변경, 문자열 변경
 *   valueOf()-모든 데이터형을 문자열 변환(static 메소드)
 *   
 *   substring(int start), substring(int start, int end)
 *   split(String regex)-정규식 포함
 *   indexOf()-앞부터 찾기
 *   lastIndexOf()-뒤부터 찾기
 *   
 *   equals()-같은 문자열
 *   compare()-크기 비교(같은값 이면 0, 왼쪽이 크면 양수, 오른쪽이 크면 음수)-정렬에 사용
 *   startsWith()-시작 문자열이 같을 때
 *   endsWith()-끝 문자열이 같을 때
 *   contains()-포함
 *   
 *   length()-문자 갯수
 *   concat()-문자열 결함-> +
 *   trim()-공백문자 제거
 *   
 * -StringBuffer / StringBuilder
 *   append()-문자열 결합
 *   
 * -Math 수학
 *   ceil()-올림
 *   random()-난수(0.0~0.99)
 *   
 * -System
 *   gc()-가비지컬렉션 호출
 *   in.read()
 *   out.println()-출력
 *   currentTimeMillis()-시간
 * 
 * -Wrapper 기본형을 클래스화-제네릭에서 주로 사용
 * int -> Integer
 * byte -> Byte
 * short -> Short
 * long -> Long
 * float -> Float
 * double -> Double
 * boolean -> Boolean
 * char -> Character
 * parseInt() / parseDouble() / parseBoolean()
 * 
 * 오토박싱: 클래스 안에 실제값 저장
 * Integer i=100; //클래스안에 실제값 저장
 * 언박싱: 기본형 안에 클래스값 저장
 * int ii=i;
 * 
 * -Thread
 * 
 * java.util-컬렉션
 * java.text-DecimalFormat
 * java.io-파일 관련
 * java.net-URL-Socket
 * java.sql-Connection / Statement / ResultSet
 * 
 */