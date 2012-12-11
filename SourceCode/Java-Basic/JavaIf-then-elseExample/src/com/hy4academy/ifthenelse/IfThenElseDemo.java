package com.hy4academy.ifthenelse;

public class IfThenElseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int appleWeight = 50;
		int bananaWeight = 100;
		
		checkWeight(appleWeight, bananaWeight);

	}

	private static void checkWeight(int appleWeight, int bananaWeight) {
		if (appleWeight > bananaWeight) {
			System.out.println("Apple is bigger than banana");
		} else {
			System.out.println("Apple is smaller than banana");
		}
	}

}
