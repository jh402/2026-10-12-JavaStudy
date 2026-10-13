import java.util.Scanner; // 입력값을 받을 때
/*
 * 변수 선언 - 난수 or 사용자로부터 값을 받을 때
 * 데이터형 변수명;
 * 
 * 값 설정
 * 변수명=값;
 * 
 * 선언과 동시에 값 설정
 * 데이터형 변수명=값;
 * 
 * 
 * 지역변수는 반드시 초기화 후에 사용
 * 
*/
public class 변수2 {
	//멤버변수
	public static void main(String[] args) {
		//지역변수
		int rand=(int)(Math.random()*100)+1;//(0.0~0.99)*100+1 난수 생성
		System.out.println("난수값 출력:"+rand);
		
		//사용자로부터 입력받기
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 입력:");
		int scan=scanner.nextInt();
		System.out.println("입력값 출력:"+scan);
	}
}
