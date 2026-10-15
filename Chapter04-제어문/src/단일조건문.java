/*
 * 단일 조건문
 * if(조건){
 * 		조건이 true면 수행
 * }
 * 
 * 조건문 : true/false가 나오는 연산자 사용
 * 
*/

import java.util.Scanner;
public class 단일조건문 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*3);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user=scan.nextInt();
		String[] str= {"가위","바위","보"};
		
		System.out.println("컴퓨터: "+str[com]);
//		if(com==0)System.out.println("가위");
//		if(com==1)System.out.println("바위");
//		if(com==2)System.out.println("보");
		
		System.out.println("사용자: "+str[user]);
//		if(user==0)System.out.println("가위");
//		if(user==1)System.out.println("바위");
//		if(user==2)System.out.println("보");
		
		System.out.println("\n=========결과==========");
//		if(com==user)System.out.println("비겼습니다.");
//		
//		if(com==0&&user==1)System.out.println("이겼습니다.");
//		if(com==0&&user==2)System.out.println("졌습니다.");
//		
//		if(com==1&&user==0)System.out.println("졌습니다.");
//		if(com==1&&user==2)System.out.println("이겼습니다.");
//		
//		if(com==2&&user==0)System.out.println("이겼습니다.");
//		if(com==2&&user==1)System.out.println("졌습니다.");
		
		int res=com-user;
		if(res==-1||res==2)
			System.out.println("이겼습니다.");
		if(res==1||res==-2)
			System.out.println("졌습니다.");
		if(res==0)
			System.out.println("비겼습니다.");
		
		
		/*
		 * com-user
		 * com=0
		 * 	use=0 무	-> 0
		 * 	use=1 승 -> -1
		 * 	use=2 패 -> -2
		 * com=1
		 * 	use=0 패 -> 1
		 * 	use=1 무 -> 0
		 * 	use=2 승 -> -1
		 * com=2
		 * 	use=0 승 -> 2
		 * 	use=1 패 -> 1
		 * 	use=2 무 -> 0
		 * 
		 * 
		 * user가
		 * 이길 때 -1, 2
		 * 질 때 -2, 1
		 * 무승부 0
		*/
	}
}