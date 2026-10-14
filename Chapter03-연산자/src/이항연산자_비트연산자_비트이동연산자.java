/*
 * 비트연산자(&, |, ^)
 * 
*/
public class 이항연산자_비트연산자_비트이동연산자 {

	public static void main(String[] args) {
		//이진법 Integer.toBinaryString(정수)
		System.out.println("28의 이진법 : "+Integer.toBinaryString(28));//11100
		System.out.println("10의 이진법 : "+Integer.toBinaryString(10));// 1010
		/*
		 * AND연산(&)
		 * 0 & 0 = 0
		 * 0 & 1 = 0
		 * 1 & 0 = 0
		 * 1 & 1 = 1
		 * 
		 * 
		 * 11100
		 * 01010
		 * ------
		 * 01000 -> 8
		*/
		System.out.println("28&10="+(28&10));
		/*
		 * OR연산(|)
		 * 0 | 0 = 0
		 * 0 | 1 = 1
		 * 1 | 0 = 1
		 * 1 | 1 = 1
		 * 
		 * 
		 * 11100
		 * 01010
		 * ------
		 * 11110 -> 30
		*/
		System.out.println("28|10="+(28|10));
		/*
		 * XOR연산(^)
		 * 0 ^ 0 = 0
		 * 0 ^ 1 = 1
		 * 1 ^ 0 = 1
		 * 0 ^ 0 = 0
		 * 
		 * 
		 * 11100
		 * 01010
		 * ------
		 * 10110 -> 22
		*/
		System.out.println("28^10="+(28^10));
		/*
		 * 비트이동연산자(<<, >>)
		 * 10<<2 = 40
		 * 1010->101000
		 * 10<<2 == 10*2^2
		 * 
		 * 10>>2 = 2
		 * 1010->10
		 * 10>>2 == 10/2^2
		*/
		System.out.println("10<<2="+(10<<2));
		System.out.println("10>>2="+(10>>2));
		
		//진법 출력
		System.out.println("100의 2진법 : "+Integer.toBinaryString(100));//2진법
		System.out.println("100의 8진법 : "+Integer.toOctalString(100));//8진법
		System.out.println("100의 16진법 : "+Integer.toHexString(100));//16진법
	}

}
