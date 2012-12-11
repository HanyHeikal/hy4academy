package com.hy4academy.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "This,is,a,test";
		System.out.println(s);
		
		StringTokenizer st = new StringTokenizer(s, ",");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}
