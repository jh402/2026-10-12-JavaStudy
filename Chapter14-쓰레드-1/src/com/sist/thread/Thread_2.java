package com.sist.thread;

import java.util.concurrent.*;
/*
 * 일반 프로그램
 * -싱글 쓰레드
 * -하나씩 실행
 * -순차 처리
 * -간단한 구조
 * -작업이 오래걸림
 * 
 * 멀티쓰레드
 * -여러 작업을 동시 수행
 * -작업 처리 효율성
 * -동기화 문제 발생
 * 
 * 
 * Thread
 * -작업마다 생성
 * -재사용(x)
 * -직접 관리
 * -생성시 마다 비용 발생
 * -단순 쓰레드 이해
 * 
 * ThreadPool
 * -미리 생성 / 관리
 * -재사용(o)
 * -Executors가 관리
 * -반복 작업시 효율적
 * -실제 서버에서 주로 사용
 * 
 * ThreadPool 동작 순서
 * 1. ThreadPool 생성 - 저장 장소 확보
 * 2. 쓰레드 필요한 갯수만큼 생성 - POOL에 저장
 * 3. 대기열에서 기다림
 * 4. 쓰레드가 다음 작업을 수행
 * 5. 사용이 끝나면 반환
 * 
 */


public class Thread_2 {
	public static void main(String[] args) {
		//Thread 3개 생성
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=5;i++) {
			int no=i;
			pool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("작업 "+no+" 실행:"+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					System.out.println(" 작업 "+no+" 완료");
				}
			});
			/*위 함수와 같음()
			pool.excute(()->{
			
			});
			 */
		}
		pool.shutdown();
	}
}
