import java.util.Scanner;

public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		System.out.println(5/2);
		System.out.println(5/2.0);
		int a=10, b=0;
		System.out.println(b==0?"0으로 나눌 수 없다":a/b);
		
		//앞 자리 부호 따라감
		System.out.println("========== % ==========");
		System.out.println("5%2="+5%2);
		System.out.println("5%-2="+5%-2);
		System.out.println("-5%2="+-5%2);
		System.out.println("-5%-2="+-5%-2);
		
		//100원 10원 1원 단위로 나누기
		int won=789;
		int w100=won/100;
		int w10=won%100/10;
		int w1=won%10;
		System.out.println("won="+won+"\nw100="+w100+"\tw10="+w10+"\tw1="+w1);
		
		//홀수 짝수
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
		System.out.println(num%2==0?num+"은(는) 짝수입니다.":num+"은(는) 홀수입니다.");
	}
}
