package com.sist.lang;
//equals() - 메모리 주소값 비교

class Human{
	private String name, sex;
	//생성자
	Human(String n, String s){
		name=n;
		sex=s;
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//instanceof : 객체 비교 연산자
		if(obj instanceof Human) {
			Human s=(Human)obj;
			//String에서 재정의한 equals메소드 호출
			return name.equals(s.name)&&sex.equals(s.sex);
		}
		return false;
	}
	//String은 주소비교x, 실제 문자열 비교
}
public class Object_3 {
	
	public static void main(String[] args) {
		Human h1=new Human("홍길동", "남자");
		Human h2=new Human("홍길동", "남자");
		
		System.out.println("h1:"+h1);
		System.out.println("h2:"+h2);
		
		if(h1.equals(h2)) {
			System.out.println(h1+"=="+h2);
		}
		else {
			System.out.println(h1+"!="+h2);
		}
	}
}