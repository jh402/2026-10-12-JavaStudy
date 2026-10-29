/*
 * 캡슐화 : 데이터 보호
 * 접근지정어
 * private
 * -자신의 클래스에서만 접근
 * -보통 인스턴스 변수에 사용
 * default
 * -같은 폴더(패키지 내)에 접근 가능
 * protected
 * -같은 폴더에 상속
 * public
 * -모든 클래스에 접근 가능
 * -보통 생성자에서 사용
 * 
 * 접근 범위
 * 1. 자신의 클래스 - private
 * 2. 같은 폴더(패키지) - default
 * 3. 같은폴더+상속 - protected
 * 4. 모든 클래스 - public
 * 
 * 형식
 * 변수:접근지정어 [제어어(static/final)] 데이터형 변수명
 * 메소드:접근지정어 [제어어(static/final/abstract)] 리턴형 메소드명(매개변수)
 * 생성자:접근지정어 클래스명()
 * 클래스:접근지정어 [제어어(static/final/abstract)] class 클래스명 
 * 
 * abstract 추상적인
 * -구현없이 선언만 가능
 * 
*/
import lombok.*;

@Data //모든 인스턴스 변수에 대해 Getter, Setter 메소드를 만듬
class Sawon{
	//lombok으로 필요한 멤버변수 마다 Getter, Setter 메소드 만들기
	//@Getter
	//@Setter
	private int sabun;
	//@Getter
	//@Setter
	private String name;
	protected String job;
	String dept;
	public int pay;	
}
public class 데이터보호_캡슐화 {

	public static void main(String[] args) {
		Sawon s=new Sawon();
		s.job="과장";
		s.dept="개발부";
		s.pay=4500;
		s.setName("홍길동");
		s.setSabun(1);
		
		System.out.println(s.getName());
		System.out.println(s.getSabun());
		System.out.println(s.job);
		System.out.println(s.dept);
		System.out.println(s.pay);
	}
}
