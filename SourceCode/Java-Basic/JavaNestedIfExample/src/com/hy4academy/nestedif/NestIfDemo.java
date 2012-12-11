package com.hy4academy.nestedif;

public class NestIfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int appleWeight = 75;
		int bananaWeight = 100;
		int orangeWeight = 50;
		
		if (appleWeight > bananaWeight) {
			System.out.println("Apple is bigger than Banana");
			if(appleWeight > orangeWeight) {
				System.out.println("Apple is bigger than Orange");
				if (bananaWeight > orangeWeight) {
					System.out.println("Banana is bigger than Orange");
				}
			}
		} else {
			System.out.println("Apple is smaller than Banana");
		}

	}

}
