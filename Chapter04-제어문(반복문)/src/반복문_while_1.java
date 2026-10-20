/*
 * while
 * 형식
 * 초기값---1
 * while(조건식---2){
 *   수행문장---3
 *   증감식---4
 * }
 */
public class 반복문_while_1 {

	public static void main(String[] args) {
		//1~10 까지 출력
		System.out.println("\n====== while ========");
		int i=1;//초기값
		//조건식
		while(i<=10) { 
			System.out.print(i+" ");//반복 실행문장
			i++;//증가식
		}
		//i=11
		System.out.println("\n====== for ========");
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}

}