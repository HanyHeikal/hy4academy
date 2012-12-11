package com.hy4academy.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Orange");
		al.add("Banana");
		al.add("Apple");
		al.add("Beach");
//		al.add(1);
		
		System.out.println(al);
		System.out.println(al.contains("Orange"));
		Collections.sort(al);
		System.out.println(al);
		
		for(String s : al) {
			System.out.println(s);
		}
		
	}

}
