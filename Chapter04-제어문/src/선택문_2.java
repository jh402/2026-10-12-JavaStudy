/*
 * if
 * 조건에 맞는 경우에만 수행(원하는 문장만 수행)
 * 
 * if~else
 * true / false
 * 
 * if~else if
 * 여러 조건을 순서대로 검사
 * 
 * switch
 * 변수나 값에 따라 선택
 */
import java.util.Scanner;

public class 선택문_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력: ");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /): ");
		switch(scan.next()) {
		case "+"->System.out.println(num1+"+"+num2+"="+(num1+num2));
		case "-"->System.out.println(num1+"-"+num2+"="+(num1-num2));
		case "*"->System.out.println(num1+"*"+num2+"="+(num1*num2));
		case "/"->{
			switch(num2) {
			case 0->System.out.println("0으로 나눌 수 없습니다");
			default->System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
		}
		default->System.out.println("없는 연산자입니다");
		}
	}
}
