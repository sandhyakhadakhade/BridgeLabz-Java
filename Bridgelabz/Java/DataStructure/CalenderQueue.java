package com.Bridgelabz.DataStructure;

import java.util.Scanner;
/**
 * @author sandhyarani
 * @version 1.0
 * @date 5/03/2019 
 * @problem statement : program Calendar.java that takes the month and year as CMA and prints the Calendar of the month. 
  	Store the Calendar in an 2D Array, the first dimension the week of the month and 
 	the second dimension stores the day of the week
 */

public class CalenderQueue {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Utility<Integer>();
		//arg1 for month
		int month=Integer.parseInt(args[0]);
		//arg2 for year
		int year=Integer.parseInt(args[1]);
		Utility.CalendarQueue(month,year);
	}

}
