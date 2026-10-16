/*+
 * 사용자로부터 년도 입력받기
 * 윤년인지 확인
 * 
 * 윤년의 조건
 * 1. 4년마다 윤년
 * 2. 100년마다 윤년x
 * 3. 400년 마다 윤년
 * 
 */

import java.util.Scanner;
public class 단일조건문_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("년도를 입력: ");
		
		int year=scan.nextInt();
		
		//4년마다			100년마다			400년마다
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("윤년이다");
		if(year%4!=0 || year%100==0 && year%400!=0)
			System.out.println("윤년이 아니다");
		
	}
}
