/*
 * 메소드는 사용자 요청 처리하기 위한 명령문의 집합
 * 코드 재사용 / 기능 분리(분업 처리)
 * 유지보수 목적
 * 
 * 매개변수 : 사용자 요청 값
 * 리턴형 : 요청처리 결과 값
 * 결과값을 넘겨주는 경우 : return 값
 * 
*/

import java.util.*;

//정수 10개 합을 구해서 반환
public class 메소드_1 {
	
	static int hap(int[] arr) {
		int sum=0;
		for(int i:arr)
			sum+=i;
		
		return sum;
	}
	//배열 초기화
	static int[] arrInitialize() {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	//최댓값
	static int max(int[] arr) {
		int max=arr[0];
		for(int i:arr) {
			if(max<i)
				max=i;
		}
		
		return max;
	}
	//최솟값
	static int min(int[] arr) {
		int min=arr[0];
		for(int i:arr) {
			if(min>i)
				min=i;
		}
		return min;
	}
	//평균
	static double avg(int[] arr) {
		double avg=hap(arr);
		return avg/arr.length;
	}
	//짝수의 갯수
	static int even(int[] arr) {
		int cnt=0;
		for(int i:arr) {
			if(i%2==0)
				cnt++;
		}
		
		return cnt;
	}
	//홀수의 갯수
	static int odd(int[] arr) {
		return arr.length-even(arr);
	}
	//출력
	static void print() {
		int[] arr=arrInitialize();
		
		System.out.println(Arrays.toString(arr));
		System.out.println("합:"+hap(arr));
		System.out.println("최댓값:"+max(arr));
		System.out.println("최솟값:"+min(arr));
		System.out.printf("평균:%.2f\n", avg(arr));
		System.out.println("짝수의 갯수:"+even(arr));
		System.out.println("홀수의 갯수:"+odd(arr));
	}
	public static void main(String[] args) {
		print();
	}
}
