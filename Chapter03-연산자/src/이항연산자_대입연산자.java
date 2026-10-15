/*
 * 대입연산자
 * =연산자 - 변수 초기값이나 연산자 결과값에 사용, 연산자 우선순위 낮음
 * 
 * 복합대입연산자 
 * +=연산자 - 문자열 결합이나 누적에 사용
 * -=
 * *=
 * /=
 * %=
 * _____아래 연산자는 잘 안씀______
 * <<=
 * >>=
 * |=
 * &=
 * ^=
*/
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		int a=10;
		a++;a++;a++;a++;a++;
		System.out.println(a);
		
		a=10;
		a+=5;
		System.out.println(a);
		
		//문자열 결합
		String s1="ABC", s2="DEF", s3="";
		s3+=s1;//ABC
		s3+=s2;//ABCDEF
		System.out.println("======== += ==========");
		System.out.println(s3);
		
		int b=10;
		b-=5;
		System.out.println("======== -= ==========");
		System.out.println(b);
		
		int c=10;
		c*=100;
		System.out.println("======== *= ==========");
		System.out.println(c);
		
		int d=10;
		d/=3.0;//복합대입연산자는 자동 형변환을 함
		System.out.println("======== /= ==========");
		System.out.println(d);//따라서 3이 출력됨
		
		int e=10;
		e%=3;
		System.out.println("======== %= ==========");
		System.out.println(e);
	}
}