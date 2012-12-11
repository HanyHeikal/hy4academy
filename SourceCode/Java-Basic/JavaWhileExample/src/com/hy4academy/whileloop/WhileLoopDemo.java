package com.hy4academy.whileloop;

public class WhileLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int appleNumber = 10;
		int orangeNumber = 5;
		
		while(appleNumber != orangeNumber) {
			System.out.println("One apple will be converted to Juice");
			
			appleNumber --;
		}
		
		System.out.println("Number of apples: " + appleNumber);
		System.out.println("Number of oranges: " + orangeNumber);

	}

}
