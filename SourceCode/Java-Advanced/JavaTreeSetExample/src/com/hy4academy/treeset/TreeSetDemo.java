package com.hy4academy.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Orange");
		ts.add("Banana");
		ts.add("Apple");
		ts.add("Beach");
		ts.add("Orange");
		
		System.out.println(ts.size());
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("Orange");
		ts1.add("Banana");
		
		ts.removeAll(ts1);
		System.out.println(ts);

	}

}
