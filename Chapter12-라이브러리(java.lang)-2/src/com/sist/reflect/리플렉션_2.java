package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * 리플렉션은 실행 시점에 클래스의 모든 정보를 읽어서 조작이 가능(동적) 
 * 
 * 주요클래스 / 메소드
 * Class : 클래스의 모든 정보읽기 
 * 변수 : Field
 * 생성자 : Constructor
 * 메소드 : Method
 * 
 * 
 * Class 객체 얻기
 * Class cls=String.class;
 * String str="";
 * Class cls=str.getClass();
 * Class cls=Class.forName("클래스명");
 * 
 * 
 * 장점
 * - 모든 프레임워크 개발시 주로 사용
 * - 코드 재사용 / 유지보수
 * 단점
 * - 직접 호출보다는 속도가 늦다 (성능 저하)
 * - 보안 문제 => private에 접근이 가능
 * - 코드 가독성이 떨어진다
 * 
 */
class Member{
	//필드
	private int mno=1;
	private String name="홍길동";
	private String address="서울";
	private static String school="SIST";
	
	//생성자
	public Member() {
		System.out.println("Member() Call...");
	}
	public Member(int mno, String name, String address) {
		this.mno = mno;
		this.name = name;
		this.address = address;
		System.out.println("Member(int mno, String name, String address) Call...");
	}
	
	//메소드
	public void insert() {
		System.out.println("insert...");
	}
	public void update() {
		System.out.println("update...");
	}
	public void delete() {
		System.out.println("delete...");
	}
	public void select() {
		System.out.println("select...");
	}
}
public class 리플렉션_2 {

	public static void main(String[] args) {
		// 객체 생성 
		// 클래스 정보를 읽어 온다 
        try{
        	Class cls=Class.forName("com.sist.reflect.Member");
        	
        	
        	System.out.println("========= Method ======");
        	Method[] methods=cls.getDeclaredMethods();
        	for(Method m:methods) {
        		System.out.println(m.getName());
        	}
        	
        	
        	System.out.println("========= 변수(멤버) =======");
        	Field[] fields=cls.getDeclaredFields();
        	for(Field f:fields) {
        		//static포함
        		System.out.println(f.getName());
        	}
        	
        	
        	System.out.println("======= 생성자 ======");
        	Constructor[] con=cls.getDeclaredConstructors();
        	for(Constructor c:con) {
        		System.out.println(c.getName());
        	}
        	
        	
        	System.out.println("====== 객체 메모리 할당(생성자 호출) ======");
        	
        	Object obj=cls.getDeclaredConstructor(int.class, String.class, String.class).newInstance(2,"박문수","부산");
        	System.out.println("객체 주소:"+obj);
        	//Member mm=new Member();
        	//System.out.println("객체 주소:"+mm);
        	
        	
        	System.out.println("======== 변수 제어 ========");
        	Field f=cls.getDeclaredField("address");
        	f.setAccessible(true);//private 변수 접근 가능
        	f.set(obj, "제주");
        	System.out.println(f.get(obj));
        	
        	f=cls.getDeclaredField("name");
        	f.setAccessible(true);
        	f.set(obj, "심청이");
        	System.out.println(f.get(obj));
        	
        	f=cls.getDeclaredField("mno");
        	f.setAccessible(true);
        	f.set(obj, 3);
        	System.out.println(f.get(obj));
        	
        	
        	System.out.println("======= 메소드 제어 ======");
        	Scanner scan=new Scanner(System.in);
        	System.out.print("검색어 입력:");
        	String fd=scan.next();
        	for(Method m:methods) {
        		if(fd.equals(m.getName())) {
        			m.invoke(obj, null);
        		}
        	}
        	
        }catch(Exception ex) {}
	}

}


