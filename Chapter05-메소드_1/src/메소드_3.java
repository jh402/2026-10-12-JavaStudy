/*
 * 메소드는 반드시 종료 후에 원상복귀
 * 메소드는 한 개 기능만 수행
 * 반복 제거
 * 구조적인 프로그램 가능
*/
//메소드 호출 - 생명주기
public class 메소드_3 {
	
	static void display() {
		System.out.println("display() 진입");//4
		System.out.println("사용자 요청 처리");//5
		System.out.println("사용자 요청에 대한 결과값을 넘겨줌");//6
	}
	static void process() {
		System.out.println("display() 진입");//2
		System.out.println("사용자 요청 처리");//3
		display();
		System.out.println("사용자 요청에 대한 결과값을 넘겨줌");//7
	}
	//프로그램 시작 / 종료
	public static void main(String[] args) {
		System.out.println("main 시작");//1
		process();//메소드는 {} 종료-> 호출한 위치로 다시 돌아온다(원상복귀)
		System.out.println("main 종료");//8
	}
}
