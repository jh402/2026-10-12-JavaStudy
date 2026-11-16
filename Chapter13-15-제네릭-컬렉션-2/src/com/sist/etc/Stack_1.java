package com.sist.etc;

import java.util.*;

//LIFO
public class Stack_1 {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		
		//In
		s.push("사과");
		s.push("배");
		s.push("포도");//Last
		
		System.out.println(s.size());
		System.out.println(s.peek());
		
		//Out
		System.out.println(s.pop());//Fist - 포도
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
