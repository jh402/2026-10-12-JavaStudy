
public class 메소드연습_1 {
	//1~10까지 출력하는 메소드 구현
	static void print() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//A-Z까지 출력하는 메소드
	static void alpha() {
		for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//1~10까지의 합을 구하는 메소드
	static int sum() {
		int s=0;
		for(int i=1;i<=10;i++)
			s+=i;
		return s;
	}
	//1~n까지의 합을 구하는 메소드
	//함수명이 같고 매개변수가 다르면 다른 메소드로 인식 - 오버로딩
	static int sum(int n) {
		int s=0;
		for(int i=1;i<=n;i++)
			s+=i;
		return s;
	}
	//대문자를 소문자로 변경
	static char lower(char c) {
		return (char)(c+('a'-'A'));
	}
	
	//문자열을 거꾸로 출력
	static void reverse(String msg){
		for(int i=msg.length()-1;i>=0;i--) {
			System.out.print(msg.charAt(i));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//print();
		alpha();
		int s=sum();
		System.out.println(s);
		s=sum(100);
		System.out.println(s);
		
		char c=lower('A');
		System.out.println(c);
		reverse("Hello Java");
	}

}
