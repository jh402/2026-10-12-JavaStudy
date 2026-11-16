package com.sist.map;

import java.util.*;

interface I{
	public void execute();
}

class A implements I{
	@Override
	public void execute() {
		System.out.println("A:execute() Call...");
	}
}
class B implements I{
	@Override
	public void execute() {
		System.out.println("B:execute() Call...");
	}
}
class C implements I{
	@Override
	public void execute() {
		System.out.println("C:execute() Call...");
	}
}
class D implements I{
	@Override
	public void execute() {
		System.out.println("D:execute() Call...");
	}
}
//Spring
class Container{
	Map<String, I> map=new HashMap<String, I>();
	//XML
	public Container() {
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D());
	}
	public I getBean(String key) {
		return map.get(key);
	}
}

//클래스 관리
//주로 프레임워크에 사용(Spring, SpringBoot, MyBatis, JPA)
public class Map_3 {
	public static void main(String[] args) {
		//싱글톤
		Container c=new Container();
		I i=c.getBean("a");
		i.execute();
		
		i=c.getBean("b");
		i.execute();
		
		i=c.getBean("c");
		i.execute();
		
		i=c.getBean("d");
		i.execute();
	}
}
