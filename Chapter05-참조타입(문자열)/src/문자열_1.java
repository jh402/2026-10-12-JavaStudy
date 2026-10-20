/*
 * 데이터형 - 기본형, 참조형
 * 참조형 - 배열, 클래스
 * 클래스 - 라이브러리, 사용자정의-객체지향
 * 
 * 저장: new - 새로운 메모리 공간을 만들어서 저장
 * 해제: delete
 * 
 * 단점: 가독성 / 결합성이 높다-Spring에서 new를 사용하지 않는다-리플랙션
 * 
 * 메모리 구조
 * method area: 메소드, static
 * 
 * Stack: 지역변수
 * -메모리 자체 관리
 * 
 * Heap: 참조형 변수
 * -개발자가 관리x, (가비지 컬렉션)
 * 
 * 
 * String s="Java";//0x100에 "Java"값 저장되었다고 가정
 * s==0x100 (Stack)
 * 0x100위치에 "Java" 저장 (Heap) 실제 데이터 공간
 * 
 * 
 * String 클래스 - char[]을 제어
 * -여러 개의 문자를 저장하는 클래스
 * -변경해서 사용 불가능(final) / 제공한 내용을 사용(표준화)
 * 
 * String -> ""
 * char ->''
 * 
 * 같은 문자열은 주소가 동일
 * 
 * 사용법
 * String s="Hello";
 * 데이터형 변수명=리터럴;
 * 
 * String s="Hello"
 * char[] c={'H', 'e', 'l', 'l', 'o'}
 * 
 * 
 * 기능 : 메소드 - 리턴형 / 매개변수
 * 
 * charAt() - 원하는 위치의 문자를 추출
 * char charAt(int index)//리턴형(처리 결과값) 메소드명(데이터형 매개변수)
 * length() - 문자의 갯수
 * 
 * 비교
 * equals() : ==
 * contains() : 포함된 문자열
 * startsWith() : 시작 문자열이 같은 경우
 * endsWith() : 끝 문자열이 같은 경우
 * 
*/
import javax.swing.*;
public class 문자열_1 {

	public static void main(String[] args) {
//		String msg="Hello Java!!";
//		System.out.println("문자 갯수: "+msg.length());
//		
//		int cnt=0;
//		char c;
//		
//		for(int i=0;i<msg.length();i++) {
//			//System.out.println(i+"."+msg.charAt(i));
//			c=msg.charAt(i);
//			if(c=='a'||c=='A') {
//				cnt++;
//			}
//		}
//		System.out.println("A, a의 갯수: "+cnt);
		
		String myId="hong";
		String myPwd="1234";
		
		String id=JOptionPane.showInputDialog("아이디 입력: ");
		String pwd=JOptionPane.showInputDialog("비밀번호 입력: ");
		
		if(id.equalsIgnoreCase(myId) && pwd.equals(myPwd)) {
			JOptionPane.showMessageDialog(null, "로그인 되었습니다");
		}
		else {
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 틀렸습니다");
		}
		
	}
}
