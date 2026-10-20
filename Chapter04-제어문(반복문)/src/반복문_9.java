// 한개의 정수를 받아서 1부터 시작해서 입력받은 정수까지의 합을 출력 
import java.util.Scanner;

public class 반복문_9 {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        
        int sum=0;
        for(int i=1;i<=num;i++){
        	sum+=i; 
        }
        System.out.println("1~"+num+"까지의 합:"+sum);
	}

}