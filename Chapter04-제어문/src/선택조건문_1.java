/*
 * 선택조건문
 * true/false를 나눠서 작업
 * 
 * 형식
 * if(조건){조건이 true면 실행}
 * else{조건이 false면 실행}
*/
public class 선택조건문_1 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*100)+1;
		
		if(num%2==0)
			System.out.println(num+"은 짝수다");
		else
			System.out.println(num+"은 홀수다");
		
	}
}
