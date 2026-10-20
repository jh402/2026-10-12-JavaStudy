import java.util.Scanner;

public class 반복제어문_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		
		int user=0;
		while(true) {
			System.out.print("정수 입력: ");
			user=scan.nextInt();
			if(user<1 || user>100) {
				System.out.println("1~100 사이의 정수를 입력해야 합니다.");
				continue;
			}
			//비교
			if(com>user)
				System.out.println("입력값 Up");
			else if(com<user)
				System.out.println("입력값 Down");
			else {
				System.out.println("Game Over!!");
				break;
			}
		}
		
		
	}

}
