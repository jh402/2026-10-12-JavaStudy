package com.sist.etc;

import java.util.*;

/*
 * Iterator
 * -하나씩 조회
 * -반복 도중에 삭제나 수정
 * 
 * 
 * ListIterator
 * -List에서만 사용
 * -반복 중에 데이터 추가 / 수정 / 삭제가 가능
 * -앞뒤 방향에서 이동 가능
*/
public class ListIterator_1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext()) {
			if(it.next()<3) {
				it.remove();
			}
		}
		System.out.println(list);
		
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}
		System.out.println();	
	}
}
