package com.sist.math;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * 수학 연산과 관련된 클래스
 * Math 클래스의 메소드
 * ceil(double) - 올림
 * random() - 0.0~0.99
 * round(double) - 반올림
 * 
 * Math는 모든 메소드가 static
 */
public class Math_1 {

	public static void main(String[] args) {
        try{
        	// 1. 오라클 연결 => driver 설정 
        	Class.forName("oracle.jdbc.driver.OracleDriver"); // 자동으로 메모리 할당 - 리플렉션
        	
        	// 2. 연결 
        	String url="jdbc:oracle:thin:@xxx.xxx.xxx.xx:xxxx:XE";
        	Connection conn=DriverManager.getConnection(url, "hr","happy");
        	
        	// 3. 오라클 명령어 전송
        	String sql="SELECT CEIL(COUNT(*)/10) FROM recipe";
        	PreparedStatement ps=conn.prepareStatement(sql);// 네트워크 통신 
        	ResultSet rs=ps.executeQuery();
        	rs.next();
        	int count=rs.getInt(1);
        	rs.close();
        	ps.close();
        	conn.close();
        	
        	System.out.println("레시피의 갯수:"+count);
        	
        	// 10개씩 -> 1페이지 -> 총페이지
        	// ceil(10.1) -> 11 
        	int totalpage=(int)(Math.ceil(count/10.0));
        	System.out.println("총페이지:"+totalpage);
        	
        	//1~100
        	int rand=(int)(Math.random()*100)+1;
        	System.out.println(rand);
        	
        	//반올림
        	double d=Math.round(10.5);
        	System.out.println(d);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
	}

}