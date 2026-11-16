package com.sist.study;

import java.util.*;

/*
 * 사용처
 * ArrayList: DB의 실행 결과값(브라우저로 전송 시)
 * Set: 접속자 정보 저장
 * Map: 클래스 관리 / 쿠키 관리 / SQL 관리
 * 
 * 실행 중 수정 / 삭제 필요 시
 * Iterator - (Set, Map) / ListIterator - (List)
*/


public class 컬렉션_정리 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		final String[] fuits= {"사과", "배", "바나나", "포도", "참외"};
		final int[] num= {100, 200, 150, 180, 120};
		
		for(int i=0;i<5;i++) {
			map.put(fuits[i], num[i]);
			System.out.println(fuits[i]+" 갯수:"+map.get(fuits[i]));
		}
		
		System.out.println("전체 데이터:"+map);
		//키 존재
		if(map.containsKey("바나나")) {
			System.out.println("바나나가 있다");
		}
		
		//키
		for(String key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
		//값
		for(int val:map.values()) {
			System.out.println(val);
		}
		//키+값
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
