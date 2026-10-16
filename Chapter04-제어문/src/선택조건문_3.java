/*
 * 알파벳을 난수로 받음
 * ->대소문자 구분하기
*/
public class 선택조건문_3 {

	public static void main(String[] args) {
		int type=(int)(Math.random()*2);//0:대문자 or 1:소문자
		char alpha=' ';
		
		if(type==0) {
			alpha=(char)((Math.random()*26)+'A');//알파벳 26개
		}
		else {
			alpha=(char)((Math.random()*26)+'a');
		}
		//System.out.println(alpha);
		
		if(alpha>='A'&&alpha<='Z')
			System.out.println(alpha+"는(은) 대문자입니다.");
		else
			System.out.println(alpha+"는(은) 소문자입니다.");
	}
}
