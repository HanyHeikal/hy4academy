package com.hy4academy.swtich;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int day = 100;
		String dayString ;
		
		switch(day) {
		case 1 : 
			dayString = "Saturday";
			break;
		case 2 : 
			dayString = "Sunday";
			break;
		case 3 : 
			dayString = "Monday";
			break;
		case 4 : 
			dayString = "Tuesday";
			break;
		default :
			dayString = "Invalid value";
			break;
			
		}
		
		System.out.println("Day is : " + dayString);

	}

}
