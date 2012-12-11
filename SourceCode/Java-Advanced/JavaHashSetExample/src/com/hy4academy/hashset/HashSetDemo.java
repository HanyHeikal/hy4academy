package com.hy4academy.hashset;

import java.util.HashSet;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Orange");
		hs.add("Banana");
		hs.add("Apple");
		hs.add("Beach");
		hs.add("Orange");
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Manago");
		hs1.add("Strawberry");
		
		hs.addAll(hs1);
		System.out.println(hs);
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Manago");
		hs2.add("Plum");
		System.out.println(hs2);
		hs.retainAll(hs2);
		System.out.println(hs);
		

	}

}
