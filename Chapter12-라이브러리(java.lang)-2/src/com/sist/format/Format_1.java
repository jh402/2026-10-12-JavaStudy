package com.sist.format;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
 * java.text.* 패키지 
 * 
 * SimpleDateFormat : 날짜 변경 
 * new SimpleDateFormat("yyyy-MM-dd") => 01 02....10 11 12
 *                        
 * MessageFormat : 데이터베이스 / 화면 출력 => 서식 
 * ChoiceFormat : switch 대신 사용이 가능 
 * DecimalFormat : 숫자 변경 1000->1,000
 *   - new DecimalFormat("#,###")
 *   
 * 1. 년도: yyyy / yy -> 2026 / 26
 * 2. 월: MM / M -> 09 / 9
 * 3. 일: dd/d -> 09 / 9
 * 4. 시간: hh/HH -> hh(12) / HH(24)
 * 5. 분: mm / m
 * 6. 초: ss / s 
 */
import java.util.*;
public class Format_1 {

	public static void main(String[] args) {
        Date date=new Date();
        
        //날짜
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yy/M/d hh:mm:ss");
        System.out.println(sdf.format(date));
        
        //구분자
        //오라클: TO_CHAR(100000,'99,999,999')
        DecimalFormat df=new DecimalFormat("###,###,###");
        int won=100000;
        System.out.println(df.format(won)+"원");   
	}

}
/*
 * NumberFormat : 숫자 형식 변경 / 천단위 구분, 통화, 백분율 
 * DecimalFormat : 숫자 패턴 변경 / 천단위 구분 
 * SimpleDateFormat : 날짜 형식 변경 / 날짜 / 시간 
 * MessageFormat : 문자열 형식 변경 -> 데이터값 추가가 많은 경우 
 * ChoiceFormat : 조건별 문자열 선택 -> 등급 (점수별)
 * 
 * 전체 : TO_CHAR()
 */   