package com.sist.problem;

public class Ex2 {
	public static void main(String[] args) {
		int score=85;
		String result=(!(score>90))?"가":"나";//!(false)->true->"가"
		System.out.println(result);
	}
}
