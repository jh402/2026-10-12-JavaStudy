package com.sist.constructor;


class Human{
	protected String name;
	protected String sex;
	protected String address;
	protected String phone;
	public Human(String name, String sex, String address, String phone) {
		this.name=name;
		this.sex=sex;
		this.address=address;
		this.phone=phone;
	}
}
//매개변수가 없는 생성자는 자동 호출
//매개변수가 있는 생성자는 직접 호출-super(매개변수...)
class Student extends Human{
	int hakbun;
	String subject;
	
	public Student(String name, String sex, String address, String phone) {
		super(name, sex, address, phone);
	}
}
class Sawon extends Human{
	int sabun;
	String dept;
	public Sawon(String name, String sex, String address, String phone) {
		super(name, sex, address, phone);
	}
}
public class 생성자 {
	public static void main(String[] args) {
		
	}
}
