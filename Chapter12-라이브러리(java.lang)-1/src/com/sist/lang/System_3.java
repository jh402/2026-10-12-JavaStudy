package com.sist.lang;

//System.currentTimeMillis()-수행 시간 측정
public class System_3 {
	public static void main(String[] args) {
		//로그파일 만들 때 사용
		long start=System.currentTimeMillis();
		for(int i=1;i<=10_000_000;i++) {
			System.out.println(i);
		}
		
		long end=System.currentTimeMillis();
		System.out.println("걸린 시간:"+(end-start)/1000.0+"초");
	}
}
