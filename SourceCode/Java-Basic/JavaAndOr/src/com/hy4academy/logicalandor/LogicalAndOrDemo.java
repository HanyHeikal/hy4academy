package com.hy4academy.logicalandor;

public class LogicalAndOrDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int appleWeight = 200;
		int bananaWeight = 100;
		int orangeWeight = 50;
		
		// Logical And
		if (appleWeight > bananaWeight && appleWeight > orangeWeight) { 
			System.out.println("Apple is bigger than banana");
			System.out.println("Apple is bigger than orange");
		}

		// Logical OR
		if (appleWeight > bananaWeight || appleWeight > orangeWeight) { 
			System.out.println("Apple is bigger than banana");
			System.out.println("Apple is bigger than orange");
		}
	}

}
