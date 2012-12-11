package com.hy4academy.dowhile;

public class DoWhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int appleNumber = 10;
		int bananaNumber = 5;
		
		do {
			
			System.out.println("One apple will be converted to Juice.");
			appleNumber --;
			
		} while (appleNumber < bananaNumber);
		
		System.out.println("Number of apples is : " + appleNumber);
		System.out.println("Number of bananas is : " + bananaNumber);

	}

}
