package com.sist.main;

class AA{
	int a, b;
	public void AA() {
		System.out.println("A:aaa() Call...");
	}
}
class BB extends AA{
	int c;
	public void bbb() {
		System.out.println("B:bbb() Call...");
	}
}
public class 다형성_2 {
	public static void main(String[] args) {
		BB bb=new BB();
		
	}
}
