package com.sist.problem;

public class Ex3 {
	public static void main(String[] args) {
		//for문을 이용해서 1부터 100까지 정수 중에서 3의 배수의 총합을 출력
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
