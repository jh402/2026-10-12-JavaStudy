/*
 * 부정연산자(!), 비교연산자(>, <, >=, <=, ==, !=), 논리연산자(&&, ||)
 * 	-조건문에 사용
 * 
 * 대입연산자(=, +=, -=, *=, /=, ...) - 계산 결과값
 * 삼항연산자 - if~else - 조건에 맞는 결과값을 가져옴
 * 	-JSP에서 주로 사용 / ThymeLeaf
 * 
 */

 /* 
  * 비교연산자 - 조건문이나 반복문에서 주로 사용
 *  정수형, 문자형, 실수형 : 숫자
 *  논리형 : ==, != 만 사용가능
 *  String : equals(), !equals(), compare(), contains(), startsWith, endsWith()
 *  
 *  비교연산자 종류
 *  ==	같다			10==10	true
 *  !=	같지 않다		10!=10	false
 *  <	작다			10<10	false
 *  >	크다			10>10	false
 *  <=	작거나 같다	10<=10	true
 *  >=	크거나 같다	10>=10	true
*/
import java.util.Scanner;

public class 이항연산자_비교연산자 {
	public static void main(String[] args) {
		int a='A';//문자는 자동으로 int로 변경
		int b=65;
		System.out.println("============정수형===========");
		System.out.println(a==b);//true
		System.out.println(a!=b);//false
		System.out.println(a<b);//false
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//true
		
		float f=10.3f;
		double d=10.3;
		System.out.println("============실수형===========");
		System.out.printf("f=%f, d=%f\n",(double)f, d);
		System.out.println(f==d);
		System.out.println(f!=d);
		System.out.println(f<d);
		System.out.println(f>d);
		System.out.println(f<=d);
		System.out.println(f>=d);
		
		boolean b1=true;
		boolean b2=false;
		System.out.println("============논리형===========");
		System.out.println(b1==b2);
		System.out.println(b1!=b2);
		//에러
//		System.out.println(b1<b2);
//		System.out.println(b1>b2);
//		System.out.println(b1<=b2);
//		System.out.println(b1>=b2);


		String str1="Hello", str2="Hello";
		System.out.println("============문자열===========");
		System.out.println(str1==str2);
		Scanner scan=new Scanner(System.in);
		
		String mId="admin";
		System.err.print("입력:");//admin입력
		String id=scan.next();
		System.out.println(mId==id);//false
		System.out.println(mId.equals(id));//true
	}
}
