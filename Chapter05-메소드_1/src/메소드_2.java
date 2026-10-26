import java.util.*;

//사칙연산
public class 메소드_2 {
	static int plus(int num1, int num2) {
		return num1+num2;
	}
	static int minus(int num1, int num2) {
		return num1-num2;
	}
	static int mult(int num1, int num2) {
		return num1*num2;
	}
	static String div(int num1, int num2) {
		if(num2==0)
			return "0으로 나눌 수 없습니다";
		else
			return num1+"/"+num2+"="+String.valueOf(num1/(double)num2);
	}
	static void process() {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력:");
		int num1=scan.nextInt();
		System.out.print("두 번째 정수를 입력:");
		int num2=scan.nextInt();
		System.out.print("연산자 입력(+, -, *, /):");
		
		switch(scan.next()) {
		case "+"->System.out.println(num1+"+"+num2+"="+plus(num1, num2));
		case "-"->System.out.println(num1+"-"+num2+"="+minus(num1, num2));
		case "*"->System.out.println(num1+"*"+num2+"="+mult(num1, num2));
		case "/"->System.out.println(div(num1, num2));
		}
	}
	
	public static void main(String[] args) {
		process();
	}
}
