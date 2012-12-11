package com.hy4academy.forloop;

public class ForDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i]%2 == 0) {
				System.out.println(numbers[i] + " is an even number.");
			} else {
				System.out.println(numbers[i] + " is an odd number.");
			}
			
		}

	}

}
