package com.sist.inter;

public interface Execute {
	public void execute();
	//메소드 추가할 때 default 메소드를 이용하면 오류 없이 코딩 가능
	public default void display() {} 
}
