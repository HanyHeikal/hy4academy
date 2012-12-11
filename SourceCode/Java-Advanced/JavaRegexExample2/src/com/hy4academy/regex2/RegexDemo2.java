package com.hy4academy.regex2;

public class RegexDemo2 {

	/**
	 * @param args
	 */
	public static final String EXAMPLE_TEST = "This is my small example "
			+ "string which I'm going to " + "use for pattern matching.";
	public static void main(String[] args) {
		System.out.println(EXAMPLE_TEST.matches("\\w.*"));
		
		String[] sa = EXAMPLE_TEST.split("\\s+");
		System.out.println(sa.length);
		
		System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
		
	}

}
