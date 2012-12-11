package com.hy4academy.stringbuilder;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		sb.append(" Java");
		sb.append(" World");
		sb.append(" 2012");
		
		System.out.println(sb.toString());
		
		sb.replace(4, 5, "test");
		
		System.out.println(sb.toString());
		
		sb.delete(4, 8);
		
		System.out.println(sb.toString());
		
		sb.insert(4, "o");
		
		System.out.println(sb.toString());

	}

}
