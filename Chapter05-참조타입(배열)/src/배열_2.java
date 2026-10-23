/*
 * 배열은 몇개가 필요한지 확인
 * 배열 선언
 * 배열 초기화
 * 배열 출력
 * 저장된 데이터를 변경
*/

import java.util.*;

public class 배열_2 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		
		System.out.println("=========== 일반for ===========");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n========== for-each ==========");
		//값을 변경할 수 없다
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n========== toString ==========");
		System.out.println(Arrays.toString(arr));
		
		//최솟값과 최댓값
		int max=arr[0];
		int min=arr[0];
		
		for(int i:arr) {
			if(i>max)max=i;
			if(i<min)min=i;
		}
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		
		
		int max_idx=0, min_idx=0;
		System.out.println("============ Max의 위치 =============");
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
				max_idx=i;
				break;
			}
		}
		System.out.println("Max의 위치:"+max_idx);
		
		System.out.println("============ Min의 위치 =============");
		
		for(int i=0;i<arr.length;i++) {
			if(min==arr[i]) {
				min_idx=i;
				break;
			}
		}
		System.out.println("Min의 위치:"+min_idx);
	}
}
