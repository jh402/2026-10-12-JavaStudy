package com.sist.etc;

import java.util.*;

//FIFO
public class Queue_1 {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		//저장 In
		q.offer("홍길동");
		q.offer("이순신");
		q.offer("강감찬");
		
		System.out.println(q.size()); //갯수
		System.out.println(q.peek()); //데이터 출력만
		//데이터 Out
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		System.out.println(q.size());
	}
}
