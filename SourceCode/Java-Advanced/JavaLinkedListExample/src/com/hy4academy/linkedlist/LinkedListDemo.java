package com.hy4academy.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		
		ls.add("Orange");
		ls.add("Banana");
		ls.add("Apple");
		ls.add("Beach");
		
		System.out.println(ls);
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		LinkedList ls1 = new LinkedList();
		
		ls1.add("Orange");
		ls1.add("Banana");
		
		System.out.println(ls.containsAll(ls1));
		
		Iterator iter = ls.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
