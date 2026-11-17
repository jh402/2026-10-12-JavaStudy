package com.sist.thread;


/*
 * 
 * Thread: 한 개의 프로그램 안에 여러 개의 기능이 동시에 수행
 * - java.lang에 있음
 * 
 * 사용처
 * - 데이터 수집
 * - 네트워크 서버
 * - 게임
 * - 웹 서버 / 오라클 서버
 * 
 * 시분할-CPU가 작업을 나눠서 작업을 수행할 수 있게 만든다
 * 
 * 
 * 사용자 정의 쓰레드
 * 1. 쓰레드 상속
 * class MyThread extends Thread{
 *   자원 공유
 *   반드시 처리
 *   public void run(){
 *     쓰레드 작업 내용-한 가지 일만 수행
 *   }
 * }
 * 
 * 2. 인터페이스 상속
 * class MyThread implements Runnable{
 *   
 * }
 * 
 * 3. 익명의 함수
 * new Runnable()->{
 * 
 * }
 * 
 * 쓰레드 우선 순위
 * 10=MAX_PRIORITY - main
 * 1=Min_PRIORITY - GC
 * 5=LOW_PRIORITY - 사용자 정의
 * 
 * 
 * 동작 방식
 * 비동기화 : 여러가지 일을 동시에 처리
 * 동기화: 한번 씩 수행
 * 
 * 
 * 주요 메소드
 * start() - 대기상태 (run()을 호출하는 경우)
 * run() - 쓰레드의 동작
 * sleep() - 일시 정지
 * interrupt() - 쓰레드 종료
 * currentThread() - 현재 실행중인 쓰레드의 이름
 * getName() / setName() - 쓰레드 이름 get / set
 * getPriority() / setPriority() - 우선 순위 결정(1~10)
 * 
 * wait() - 대기상태
 * join() - 모든 쓰레드 종료
 * 
 * 
 * JVM에서
 * - 쓰레드 이름 부여
 * - 쓰레드 우선순위 배정
*/



class MyThread extends Thread{
	//동작
	public void run() {
		for(int i=1;i<=10;i++) {
			//쓰레드 이름 : i
			System.out.println(getName()+":"+i);
			try {
				Thread.sleep(100);//0.1초 일시 정지
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
	}
}
public class Thread_1 {
	public static void main(String[] args) {
		//쓰레드 생성
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		
		//쓰레드 이름, 우선순위
		System.out.println("m1 정보:"+m1.getName()+", "+m1.getPriority());
		System.out.println("m2 정보:"+m2.getName()+", "+m2.getPriority());
		System.out.println("m3 정보:"+m3.getName()+", "+m3.getPriority());
		
		//쓰레드 이름 변경
		m1.setName("홍길동");
		m2.setName("박문수");
		m3.setName("심청이");
		
		//쓰레드 우선순위 변경
		m1.setPriority(10);
		m2.setPriority(3);
		m3.setPriority(1);
		
		System.out.println("m1 정보:"+m1.getName()+", "+m1.getPriority());
		System.out.println("m2 정보:"+m2.getName()+", "+m2.getPriority());
		System.out.println("m3 정보:"+m3.getName()+", "+m3.getPriority());
		
		//run() 메소드 호출
		m1.start();
		m2.start();
		m3.start();
	}
}
