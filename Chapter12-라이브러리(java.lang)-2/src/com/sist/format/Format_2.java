package com.sist.format;

import java.text.MessageFormat;

//MessageFormat
public class Format_2 {
	public static void main(String[] args) {
        int no=1;
        String name="홍길동";
        String sex="남자";
        String address="서울";
        String phone="010-1111-1111";
        int age=30;
        String content="홍길동입니다";
        
        //오라클에 저장 
        String sql="INSERT INTO member VALUES("
        		   +no+", '"+name+"', '"+sex+"', '"
        		   +address+"', '"+phone+"', "+age
        		   +", '"+content+"')";
        System.out.println(sql);
        
        //간단하게
        sql="INSERT INTO member VALUES({0}, ''{1}'', ''{2}'', ''{3}'',''{4}'', {5},''{6}'')";//''로 ' 출력
        //데이터형이 다 다르므로 Object
        Object[] obj={no, name, sex, address, phone, age, content};
        System.out.println(MessageFormat.format(sql, obj)); 
	}
}
