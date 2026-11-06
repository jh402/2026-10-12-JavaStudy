package com.sist.problem;

public class Ex8 {
	public static void main(String[] args) {
		//주어진 배열 항목의 전체 합과 평균 구하기
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum=0, cnt=0;
		double avg;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
			}
			cnt+=array[i].length;
		}
		avg=sum/(double)cnt;
		System.out.println("합: "+sum+" 평균: "+avg);
	}
}
