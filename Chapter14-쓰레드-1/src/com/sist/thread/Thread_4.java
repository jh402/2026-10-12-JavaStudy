package com.sist.thread;

import java.util.concurrent.*;


public class Thread_4 {
	public static void main(String[] args) {
		ExecutorService pool=Executors.newFixedThreadPool(3);
		String[] food= {"볶음밥", "짜장면", "짬뽕", "탕수육", "울면"};
		
		//주문한 음식 제작
		for(int i=0;i<5;i++) {
			int no=i;
			pool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+":"+food[no]+"요리 시작");
					try {
						Thread.sleep(1000);
					}catch(Exception ex) {
						ex.printStackTrace();
						Thread.currentThread().interrupt();
					}
					System.out.println("주문 "+food[no]+" 완료");
				}
			});
		}
		pool.shutdown();
	}
}
