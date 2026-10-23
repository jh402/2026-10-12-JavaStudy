/*
 * 1. 배열
 *   같은 데이터형을 모아서 관리가 쉬움
 *   사용시에는 index를 이용하는 방식
 *   속도가 빠르고, 자료구조가 단순
 *   고정데이터이기 때문에 수정, 삭제, 추가가 어려움
 * 
 * 배열 선언
 *   데이터형[] 배열명;
 *   byte[]-파일 / 네트워크 - 업로드시 주로 등장
 *   int[]-가격 / 성적 ...
 *   long[] - 금융권
 *   char[] - 사용빈도가 거의 없음
 *   double[] - 평점 ...
 *   boolean - 재고
 *   String[] - 영화제목 / 노래
 * 초기화
 *   int[] arr={1, 2, ...};
 *   int[] arr=new int[10];
 * 데이터 출력
 *   데이터 변경 - 일반 for
 *   데이터만 출력 - for-each
 * 데이터 변경
 *   int[] arr={10, 20, 30};
 *   arr[2]=300;
 * 배열크기 조절 / 새로운 배열 생성
 *   Arrays.copyOf()
 *   clone()
 * 
 * 
 * 
*/

import java.util.*;

public class 배열_1 {

	public static void main(String[] args) {
		int[] a={10, 20, 30, 40, 50};
		System.out.println("a의 주소:"+a);
		
		int[] b=a;
		System.out.println("b의 주소:"+b);
		b[0]=100;
		System.out.println(b[0]); //같은 주소면 같은 데이터를 공유


		System.out.println(a[0]);
		
		int[] c=a.clone();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		c[0]=200;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		System.out.println("a의 주소:"+a);
		System.out.println("c의 주소:"+c);
	}

}
