package com.yedam.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBatis");
	
		// size
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		// Iterator (반복자) 를 활용한 HashSet 객체 출력
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("Java");
		set.remove("JDBC");
		
		System.out.println("=====향상된 for문=====");
		
		for(String temp : set) {
			System.out.println("\t" + temp);
		}
		
		set.clear();
		
		System.out.println("총 객체 수 : " + set.size());
		
		if (set.isEmpty()) {
			System.out.println("객체가 하나도 없다");
		}
		
		Set<Member> mSet = new HashSet<>();
		
		mSet.add(new Member("김치킨", 100));
		mSet.add(new Member("김치킨", 100));
		
		System.out.println("총 객체 수 : " + mSet.size());
		
		
		
		
		
		
	}

}
