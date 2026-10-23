/*
 * 선택정렬
 * 오름차순(ASC)/내림차순(DESC)
 * 
 * 30, 20, 50, 10, 40
 * 20, 30, 50, 10, 40
 * 10, 30, 50, 20, 40
 * ------------------------1round
 * 10, 30, 50, 20, 40
 * 10, 20, 50, 30, 40
 * ------------------------2round
 * 10, 20, 50, 30, 40
 * 10, 20, 30, 50, 40
 * ------------------------3round
 * 10, 20, 30, 50, 40
 * 10, 20, 30, 40, 50
 * ------------------------4round
 * 
*/
import java.util.*;
public class 선택정렬 {

	public static void main(String[] args) {
		int[] arr=new int[5];
		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬전:"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(i+1+"Round:"+Arrays.toString(arr));
		}
		
		System.out.println("정렬후:"+Arrays.toString(arr));
		
		char[] alpha=new char[5];
		//초기화
		for(int i=0;i<arr.length;i++) {
			alpha[i]=(char)(Math.random()*26+'A');
		}
		
		System.out.println("정렬전:"+Arrays.toString(alpha));
		
		for(int i=0;i<alpha.length-1;i++) {
			for(int j=i+1;j<alpha.length;j++) {
				if(alpha[i]>alpha[j]) {
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
			System.out.println(i+1+"Round:"+Arrays.toString(alpha));
		}
		
		System.out.println("정렬후:"+Arrays.toString(alpha));
		
	}

}
