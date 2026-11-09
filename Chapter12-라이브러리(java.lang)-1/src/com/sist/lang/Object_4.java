package com.sist.lang;

import java.util.*;

//hashCode()-객체구분자
class Sawon{
	private int sabun;
	private String name;
	//생성자
	public Sawon(int sabun, String name) {
		this.sabun=sabun;
		this.name=name;
	}
	//getter, setter
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Sawon) {
			Sawon s=(Sawon)obj;
			return sabun==s.sabun&&name.equals(s.name);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sabun, name);
	}
}

public class Object_4 {
	public static void main(String[] args) {
		Sawon s1=new Sawon(1, "박문수");
		Sawon s2=new Sawon(1, "박문수");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Set<Sawon> set=new HashSet<Sawon>();
		set.add(s1);
		set.add(s2);
		
		for(Sawon s:set) {
			System.out.print(s.getSabun()+"\t");
			System.out.println(s.getName());
		}
		
		s2.setSabun(2);
		s2.setName("홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
