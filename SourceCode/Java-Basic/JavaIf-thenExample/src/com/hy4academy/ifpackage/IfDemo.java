package com.hy4academy.ifpackage;

public class IfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int appleWeight = 200;
		int bananaWeight = 100;
		
		checkWeight(appleWeight, bananaWeight);

	}

	private static void checkWeight(int appleWeight, int bananaWeight) {
		if (appleWeight > bananaWeight) {
			System.out.println("Apple is bigger than Banana");
		}
	}

}
