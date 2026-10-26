/*
 * 객체지향프로그램
 * 객체와 객체 연결
 * 
 * 객체와 객체 통신 : 메세지
*/
import java.util.*;

public class 숫자야구게임_메소드 {
	//1~9사이의 난수 생성
	static int[] rand() {
		int[] com=new int[3];
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		return com;
	}
	//입력
	static int[] userInput() {
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		while(true) {
			System.out.print("세 자리 정수를 입력:");
			int input=scan.nextInt();
			
			if(input<100||input>999) {
				System.err.println("잘못된 입력입니다. 세 자리 정수만 입력하세요.");
				continue;
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=(input%10);
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]) {
				System.err.println("같은 수는 사용할 수 없습니다.");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0) {
				System.err.println("0은 사용할 수 없습니다!!");
				continue;
			}
			break;
		}
		return user;
	}
	static int hint(int[] com, int[] user) {
		//비교
		//s:같은 자리 같은 수
		//b:같은 수만 존재
		int s=0, b=0;
		for(int i=0;i<com.length;i++) {
			for(int j=0;j<user.length;j++) {
				if(com[i]==user[j]) {
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		
		//힌트
		System.out.printf("Input Number:");
		for(int num:user) {
			System.out.print(num);
		}
		System.out.printf(", Result:%dS-%dB\n", s, b);
		
		return s;
	}
	static boolean exit(int s) {
		if(s==3)
			return true;
		return false;
	}
	//과정
	static void process() {
		Scanner scan=new Scanner(System.in);
		//System.out.println(Arrays.toString(com));
		
		while(true) {
			int[] com=rand();
			int[] user=userInput();
			int s=hint(com, user);
			if(exit(s)) {
				System.out.println("Game Over!!");
				System.out.print("게임을 다시 할까요?(y|Y):");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y') {
					System.out.println("새 게임을 시작합니다!!");
					continue;
				}
				else {
					System.out.println("게임을 종료합니다!!");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		process();
	}

}
