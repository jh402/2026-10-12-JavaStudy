package com.sist.problem;

public class Ex7 {
	public static void main(String[] args) {
		//주어진 배열에서 최댓값 출력
		int[] array= {1, 5, 3, 8, 2};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println(max);
	}
}
