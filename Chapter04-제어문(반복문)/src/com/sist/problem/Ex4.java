package com.sist.problem;

public class Ex4 {
	public static void main(String[] args) {
		/// while문과 Math.random()메소드를 이용해서
		/// 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고
		/// 눈의 합이 5가 아니면 계속 주사위를 던지고
		/// 눈의 합이 5이면 실행을 멈추는 코드를 작성
		
		//합이 5가 되는 경우: (1, 4), (4, 1), (2, 3), (3, 2)
		int dice1=0, dice2=0;
		while (dice1+dice2!=5){
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;
			System.out.println("("+dice1+", "+dice2+")");
		}
	}
}
