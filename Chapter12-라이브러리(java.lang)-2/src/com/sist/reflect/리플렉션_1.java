package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 리플렉션 - 동적 제어(현재 실행중인 프로그램을 제어) 
 * 
 * 클래스이름으로 제어 -> 패키지명부터 설정 
 * Class.forName("");//등록 
 *   
 * 메소드 호출 / 변수값 변경
 * - private 접근이 가능 (보안)
 *   
 * 객체 생성 : new를 사용하지 않고 생성이 가능
 *   
 * 
 * 클래스 정보 얻기 
 * 객체생성 / 멤버변수 / 메소드 호출 -> 자동화 처리
 * 
 * 리플렉션을 사용자 정의로 만드는 경우(극히 드물다) 
 */
class Sawon{
	private String name;
	public Sawon() {}
	public Sawon(String name) {
		this.name=name;
	}
	public void info() {
		System.out.println("Sawon:info() Call.."+name);
	}
	public void info1() {
		System.out.println("Sawon:info1() Call.."+name);
	}
	public void info2() {
		System.out.println("Sawon:info2() Call.."+name);
	}
	public void info3() {
		System.out.println("Sawon:info3() Call.."+name);
	}
	public void info4() {
		System.out.println("Sawon:info4() Call.."+name);
	}
}
public class 리플렉션_1 {

	public static void main(String[] args) {
        try {
        	// 객체 생성 
        	Class clsName=Class.forName("com.sist.reflect.Sawon");
        	// 생성자 
        	Constructor con=clsName.getConstructor();
        	// 메모리 할당 
        	Object obj=con.newInstance();
        	// 메소드 정보 
        	//Method m=clsName.getMethod("info");
        	Method[] methods=clsName.getDeclaredMethods();//순서가 무작위로 저장
        	
        	// Field 읽기
        	Field f=clsName.getDeclaredField("name");
        	f.setAccessible(true); // private 변수에 접근 가능
        	f.set(obj, "홍길동");
        	// 메소드 호출
        	//methods[0].invoke(obj);
        	
        	//메소드 순서가 무작위이기 때문에 if문으로 원하는 메소드 호출
        	for(Method m1:methods){
        		if(m1.getName().equals("info1"))
        		System.out.println(m1.getName());
        	}
        	
        }catch(Exception ex) {}
	}

}