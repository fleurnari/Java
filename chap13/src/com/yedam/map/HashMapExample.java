package com.yedam.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// key : String / value : Integer
		// key - value => Map.entry
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// Map.entry 저장
		map.put("신나리", 100);
		map.put("김치킨", 10);
		map.put("빌게이츠", 80);
		map.put("김치킨", 30);
		
		// entry 수
		System.out.println("총 Entry 수 : " + map.size());
		
		// key를 활용한 객체 찾기
		System.out.println(map.get("김치킨"));
		System.out.println();
		
		// 반복자(iterator)
		Set<String> keySet = map.keySet();
		
		// Set을 활용한 반복
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + " value : " + value);
		}
		
		// Map.entry -> Set(반복자)
		// EntrySet <K,V> 다 가져오는 Entry 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : " + key + " value : " + value);
		}
		System.out.println();
		
		// 향상된 for문
		for(Map.Entry<String, Integer> mEntry : entrySet) {
			String key = mEntry.getKey();
			Integer value = mEntry.getValue();
			System.out.println("key : " + key + " value : " + value);
		}System.out.println();
		
		// Entry 삭제
		map.remove("신나리");
		System.out.println("총 Entry 수 : " + map.size());
		
		// Entry 전체 삭제
		map.clear();
		
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
