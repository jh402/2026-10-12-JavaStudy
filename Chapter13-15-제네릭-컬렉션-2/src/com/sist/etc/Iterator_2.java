package com.sist.etc;

import java.util.*;

public class Iterator_2 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("참외");
		set.add("수박");
		set.add("바나나");
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
