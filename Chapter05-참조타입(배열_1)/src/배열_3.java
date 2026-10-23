import java.util.*;

public class 배열_3 {

	public static void main(String[] args) {
		//양수 입력 32767 - 16bit
		//4자리씩 끊어서 2진법 출력 10->0000 0000 0000 1010
		int[] binary=new int[16];
		//배열의 뒤에부터 값 채우기
		int index=binary.length-1;
		Scanner scan=new Scanner(System.in);
		System.out.print("양수 입력:");
		int input=scan.nextInt();
		
		while(true) {
			binary[index]=input%2;
			input/=2;
			if(input==0)
				break;
			index--;
		}
		
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}

}
