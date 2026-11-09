package com.sist.lang;

//toString()
class Member{
	private String name;
	private String sex;
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
	//변수의 값
	@Override
	public String toString() {
		return "이름:"+name+", 성별:"+sex;
	}
}
public class Object_2 {
	public static void main(String[] args) {
		Member m1=new Member();
		m1.setName("홍길동");
		m1.setSex("남자");
		
		System.out.println("m1 주소:"+m1);
		System.out.println("m1 주소:"+m1.toString());//toString 생략 가능
	}
}
