/*
 * Arrays.copyOf()
 *   - 기존의 배열의 내용을 복사 후 새로운 배열을 만드는 메소드
 *   - 배열의 크기를 늘리거나 줄일 때 사용
 * Arrays.copyOf(기존 배열, length)
 *   -새로운 배열 생성
 *   -복사범위: 시작위치~length
 *   -배열크기: 원하는 크기로 변경 가능
 *   -주요사용:배열 크기 변경 / 전체 복사
 * 
 * System.arraycopy()
 *   -배열의 데이터를 다른 배열로 복사하는 메소드
 * System.arraycopy(원본, 원본 시작인덱스, 카피 저장할 배열, 카피 저장할 배열의 인덱스번호, 갯수)
 *   -기존의 배열 데이터 복사
 *   -복사범위: 원본 시작인덱스~갯수
 *   -배열크기: 자동변경x
 *   -주요 사용: 부분 복사 / 배열 통합
*/

import java.util.*;
public class 배열_2 {

	public static void main(String[] args) {
		/*int[] arr= {100, 200, 300};
		int[] copy=Arrays.copyOf(arr, 5);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		
		int[] copy2=new int[5];
		for(int i=0;i<arr.length;i++) {
			copy2[i]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy2));*/
		
		int[] arr= {10, 20, 30, 40, 50};
		int[] target=new int[5];
		
		System.arraycopy(arr, 0, target, 1, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(target));
	}
}
