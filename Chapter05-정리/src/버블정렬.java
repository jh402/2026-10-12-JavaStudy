/*
 * 버블정렬-인접한 수끼리 비교
 * 
 * 30, 20, 50, 10, 40
 * 20, 30, 50, 10, 40
 * 20, 30, 50, 10, 40
 * 20, 30, 10, 50, 40
 * 20, 30, 10, 40, 50
 * -----------------------round1
 * 20, 30, 10, 40, 50
 * 20, 30, 10, 40, 50
 * 20, 10, 30, 40, 50
 * 20, 10, 30, 40, 50
 * -----------------------round2
 * 20, 10, 30, 40, 50
 * 10, 20, 30, 40, 50
 * 10, 20, 30, 40, 50
 * -----------------------round3
 * 10, 20, 30, 40, 50
 * 10, 20, 30, 40, 50
 * -----------------------round4
 * 
 * 
*/
import java.util.*;

public class 버블정렬 {

	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*100)+1;
		
		System.out.println("정렬전:"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬후:"+Arrays.toString(arr));
	}

}
