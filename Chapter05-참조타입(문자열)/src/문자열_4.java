/*
 * 자르기
 * String substring(int index) - 중요!!! MVC에 사용
 * -index부터 뒤까지 다 잘라옴
 * 
 * String substring(int start, int end)
 * -start부터 end번까지 잘라옴
 * 
 * int indexOf(찾는 문자)
 * -앞에서부터 찾기
 * int lastIndexOf
 * -뒤에서부터 찾기
 * 
*/

public class 문자열_4 {

	public static void main(String[] args) {
		String msg="Hello Java!!";
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0, 5));//0~4까지
		
		String s="자바.java";
		System.out.println(s.substring(s.indexOf(".")+1));//.위치+1부터 잘라오기
		String path="c:\\javaDev\\MainClass.java";
		
		System.out.println(path.substring(path.lastIndexOf("\\")+1));
	}
}
