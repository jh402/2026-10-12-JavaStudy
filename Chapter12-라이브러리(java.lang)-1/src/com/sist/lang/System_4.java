package com.sist.lang;

//System.getProperty()-정보 가져오기
public class System_4 {
	public static void main(String[] args) {
		//운영체제 정보
		String osName=System.getProperty("os.name");
		System.out.println("OSName:"+osName);
		//유저 네임 정보
		String userName=System.getProperty("user.name");
		System.out.println("UserName:"+userName);
		//유저 홈 위치
		String userHome=System.getProperty("user.home");
		System.out.println("UserHome:"+userHome);
		//java 버젼
		String java=System.getProperty("java.version");
		System.out.println("Java:"+java);
	}
}
