package com.sist.music;

/*
 * 데이터형을 변경해서 사용 가능
 * 데이터형을 안정성 있게 만드는 도구
 * 
 * 제네릭을 사용하는 이유: 모든 데이터형이 Object-데이터형 확인이 어러움
 * 
*/
class Box<T>{
	T t;
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
}

public class MainClass {
	public static void main(String[] args) {
		Box box1=new Box();
		Box<String> box2=new Box<String>();
		Box<Integer> box3=new Box<Integer>();
		
		try {
			Class<?> c;
		}catch(Exception ex) {}
		
	}
}
