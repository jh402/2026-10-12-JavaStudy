import java.util.*;

public class 배열_4 {

	public static void main(String[] args) {
		//달력
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year=scan.nextInt();
		
		System.out.print("월 입력: ");
		int month=scan.nextInt();
		
		System.out.print("일 입력: ");
		int day=scan.nextInt();
		
		System.out.println(year+"년도 "+month+"월");
	}

}
