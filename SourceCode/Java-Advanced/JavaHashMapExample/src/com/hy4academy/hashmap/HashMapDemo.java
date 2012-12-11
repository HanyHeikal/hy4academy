package com.hy4academy.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Orange");
		map.put(9, "Banana");
		map.put(5, "Apple");
		map.put(3, "Beach");
		
		System.out.println(map);
		map.put(3, "Mango");
		System.out.println(map);
		
		for(int i : map.keySet()) {
			System.out.println(i + ", " + map.get(i));
		}
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Orange");
		map1.put(9, "Banana");
		map1.put(5, "Apple");
		map1.put(3, "Beach");
		
		System.out.println(map1);
		

	}

}
