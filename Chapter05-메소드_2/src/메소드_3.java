/*
 * 2가지 경우의 수 : boolean
 * 여러 개 경우의 수 : String
 * 목록 : 배열 / 컬렉션
 * 상세보기 : 클래스
 * 나머지는 기본형
 * 
 * 글쓰기 / 회원가입 - 클래스
 * 페이지 변경 - int
*/
import java.util.*;

public class 메소드_3 {
	static boolean isLogin(String id, String pw) {
		if(id.equals("admin")&&pw.equals("1234"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("ID, Password 입력:");
		String id=scan.next();
		String pw=scan.next();
		
		if(isLogin(id, pw))
			System.out.println("로그인 되었습니다");
		else
			System.err.println("로그인 실패!!!");
	}

}