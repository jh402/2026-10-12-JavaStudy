/*
 * 메소드 : 여러 개 기능을 만들어서 조립
 * 리턴형 / 매개변수 - 메소드명은 의미
 * 라이브러리 - 메소드만
*/
import java.util.*;

//사용자가 id, pw 입력 -> 로그인 여부 확인
public class 메소드_4 {
	static boolean isLogin(String id, String pw) {
		final String MID="hong";
		final String PW="1234";
		
		boolean bChk=false;
		
		if(id.equals(MID)&&pw.equals(PW))
			bChk=true;
		
		return bChk;
	}
	static void process() {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("아이디 입력:");
		String id=scan.next();
		
		System.out.print("비밀번호 입력:");
		String pw=scan.next();
		
		if(isLogin(id, pw))
			System.out.println("Main Page로 이동!");
		else {
			System.err.println("아이디나 패스워드가 틀립니다!! 다시 입력하세요.");
			process();
		}
	}
	public static void main(String[] args) {
		process();
	}
}
