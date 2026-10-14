/*
 * 증감연산자
 * ++ 한 개 증가
 * -- 한 개 감소
 * 
 * 전위연산
 * ex)int a=10; int b=++a;//a=11, b=11
 *  ㄴ 먼저 증가, 나중에 대입
 * 후위연산
 * ex)int a=10; int b=a++;//a=11, b=10
 *  ㄴ 먼저 대입, 나증에 증가
*/
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		int a=10;
		
		//증가
		System.out.println("a="+a);
		a++;
		System.out.println("a="+a);
		a++;
		System.out.println("a="+a);
		
		//출력 후 증가
		a=10;
		System.out.println("============");
		System.out.println("a="+a++);
		System.out.println("a="+a++);
		System.out.println("a="+a++);
		
		//증가 후 출력
		a=10;
		System.out.println("============");
		System.out.println("a="+ ++a);
		System.out.println("a="+ ++a);
		System.out.println("a="+ ++a);
		
		//출력 후 감소
		a=10;
		System.out.println("============");
		System.out.println("a="+a--);
		System.out.println("a="+a--);
		System.out.println("a="+a--);
		
		//감소 후 출력
		a=10;
		System.out.println("============");
		System.out.println("a="+ --a);
		System.out.println("a="+ --a);
		System.out.println("a="+ --a);
	}
}
