/*
 * 3개의 정수를 난수 발생 (1~100사이의 난수)
 * ->최댓값 / 최솟값 추출 -> 단일 조건문
 * 
 * Math.random() ->0부터 1미만의 실수형 난수값
 * 
 * 1. 조건문 만들기
 * 2. 어떤 내용 출력
 * 
*/
public class 단일조건문_1 {
	public static void main(String[] args) {
		int rand1=(int)(Math.random()*100)+1;
		int rand2=(int)(Math.random()*100)+1;
		int rand3=(int)(Math.random()*100)+1;
		
		//최댓값
		int max=rand1;
		if(max<rand2)
			max=rand2;
		if(max<rand3)
			max=rand3;
		
		System.out.printf("rand1=%d, rand2=%d, rand3=%d\n",rand1, rand2, rand3);
		System.out.println("최댓값: "+max);
		
		
		int min=rand1;
		if(min>rand2)
			min=rand2;
		if(min>rand3)
			min=rand3;
		
		System.out.println("최솟값: "+min);
	}
}
