package com.sist.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * java.time
 * java.time.format - 날짜, 시간 변경
 * 
 * LocalDateTime : 날짜+시간
 * LocalDate : 날짜
 * LocalTime : 시간
 * -> final 클래스
 * 
 * DB에서 날짜 가져올 때
 * MySQL-LocalDateTime
 * Oracle-Date
*/
public class Time_1 {
	public static void main(String[] args) {
		//현재 날짜와 시간
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
		
		//특정 날짜 시간 생성
		LocalDateTime dateTime=LocalDateTime.of(2026, 11, 11, 14, 30, 30);
		System.out.println(dateTime);
		

		//날짜나 시간 더하기 빼기
		LocalDateTime f=now.plusDays(4).plusHours(3);
		System.out.println(f);
		LocalDateTime p=now.minusMonths(1);
		System.out.println(p);
		
		//값 추출
		int year=now.getYear();
		int month=now.getMonthValue();
		int day=now.getDayOfMonth();
		int hour=now.getHour();
		
		System.out.println("년도:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+day);
		System.out.println("시:"+hour);
		
		//형식 변경
		DateTimeFormatter ff=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String str="2026-03-31 15:47:40";
		LocalDateTime t=LocalDateTime.parse(str, ff);
		System.out.println(t);
		
		String fff=dateTime.format(ff);
		System.out.println(fff);
	}
}
/*
 * yyyy - 년도
 * MM - 월
 * dd - 일
 * hh:1~12 / HH:1~24 - 시간
 * mm - 분
 * ss - 초
 */
