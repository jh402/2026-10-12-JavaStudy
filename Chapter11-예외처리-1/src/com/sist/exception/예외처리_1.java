package com.sist.exception;

import java.io.IOException;

/*
 *   class MyException extends Exception
 *   {
 *       public MyExeption(String msg)
 *       {
 *           super(msg);
 *       }
 *   }
 * 예외처리 
 * sleep(long m) throws InterrupedException
 * 임의발생 / 사용자 정의
 * 테스팅 ==> throw 
 * 사용법 
 * throw new 예외생성자()
 * throw:사용자 정의 예외처리 -> 자바 JVM 인식을 못함 
 * -> throw를 이용해서 호출  
 *        
 * throws : 간접 처리 -> JVM에 맡긴다 
 *          복구가 불가능 -> 건너뛴다 
 * 형식 
 * method() throws 예상되는 예외처리 클래스, 예상되는 예외처리 클래스...
 * 순서는 없음 
 * 메소드를 사용하려면 반드시 예외처리후에 사용한다 
 * 예외 떠넘기기-라이브러리 메소드
 * 
 * void method() throws IOException 
 * void method1() {
 *   try{
 *     method();
 *   }catch(IOException  i){}
 * }
 * void method2() throws IOException {
 *   method(); => 오류 
 * }
 *      
 * void display() throws RuntimeException
 * void display1(){
 *   display();
 * }
 * 
 * 
 * 예외 던지기 - 테스트 목적 (배포)
 * 형식 
 * throw new 예외클래스 생성자()
 * -catch호출이 가능
 * # throws는 예외를 처리하는 것x 
 *   예외가 발생할 수 있다는 사실을 메소드에게 알려만 준다 = 위임을 내려준다 
 * # 예외가 발생이 가능성이 있는 메소드를 사용한자 
 * # 예외를 직접 처리하지 않는다 
 * # 메소드를 호춯출하는 곳에서 예외를 넘겨준다 
 * 
 * try : 예외가 발생할 수 있는 코드가 들어가는 부분 
 * catch : 발생한 예외를 처리하는 역할
 * finally : 자원 관리 - 닫기
 * throw : 예외를 직접 발생
 * throws : 예외처리를 호출한 곳에 위임한다 
 *  
 */
import java.util.Scanner; 
public class 예외처리_1 {
    public static void display()
    		throws Throwable, IOException, ClassNotFoundException, InterruptedException{
    	System.out.println("display() Call...");
    }
    // RuntimeException < Exception < Throwable 
    // IOException < Exception < Throwable
	public static void main(String[] args) throws Exception{
		/*
		 * for(int i=1;i<=10;i++) { try { int a=(int)(Math.random()*3);
		 * System.out.println(i+":"+(i/a)); }catch(Exception e) {} }
		 */
		/*try
		{
		  display();
		}catch(Throwable e) {}*/
		 // 통합 
		//catch(IOException e) {}
		//catch(ClassNotFoundException e) {}
		//catch(InterruptedException e) {}
		/*
		 * int a=10; try { if(a%2==0) { throw new Exception("홀수만 가능"); // -catch이동 // 소스
		 * 코딩 불가 임의로 예외 발생 => 견고 (테스트) } }catch(Exception ex) {
		 * System.out.println("catch 수행"); System.out.println(ex.getMessage()); }
		 */
		Scanner s=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=s.nextInt();
		try {
			if(a%2==0){
				System.out.println("예외를 임의의로 발생");
				throw new Exception("홀수만");
			}
		  /*
		    class My extends Exception {
		        public My(String msg) {
		        	super(msg);
		    	}
		    }*/
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}