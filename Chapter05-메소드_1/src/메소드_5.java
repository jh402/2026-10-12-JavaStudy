import java.util.*;


//숫자 야구
public class 메소드_5 {
	
	public static void main(String[] args) {
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
		
		//System.out.println(Arrays.toString(com));
		
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
			System.out.printf("Input Number:%d, Result:%dS-%dB\n", input, s, b);
			//종료 여부
			if(s==3) {
				System.out.println("Game Over!!");
				break;
			}
		}
	}
}
