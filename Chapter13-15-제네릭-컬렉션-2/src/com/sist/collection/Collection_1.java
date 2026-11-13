package com.sist.collection;

import java.util.*;
import java.util.List;

public class Collection_1 {
	public static void main(String[] args) {
		//List
		ArrayList list1=new ArrayList();
		Vector list2=new Vector();
		LinkedList list3=new LinkedList();
		
		//Set
		HashSet set1=new HashSet();
		TreeSet set2=new TreeSet();
		
		//Map
		HashMap<?, ?> map1=new HashMap<>();//생략 가능
		Hashtable<?, ?> map2=new Hashtable<>();
		TreeMap<?, ?> map3=new TreeMap<>();
		Properties map4=new Properties();
	}
}
