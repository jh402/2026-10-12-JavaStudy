import java.util.*;

//정수를 5개 보내고 최댓값을 가지고 오기, 정렬된 데이터 받기
public class 메소드연습_2 {
	//정수 5개 생성
	static int[] rand() {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	//최댓값
	static int max(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	//정렬
	static int[] sort(int[] arr) {
		int temp=0;
		//순차정렬
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				//오름차순
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr=rand();
		int max=max(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		System.out.println(Arrays.toString(sort(arr)));
	}
}
