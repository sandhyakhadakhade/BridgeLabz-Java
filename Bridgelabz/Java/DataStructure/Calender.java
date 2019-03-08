package com.Bridgelabz.DataStructure;

import java.util.Scanner;
/**
 * @author sandhyarani
 * @version 1.0
 * @date 3/03/2019 
 * @problem statement : program Calendar.java that takes the month and year as CMA and prints the Calendar of the month. 
  						Store the Calendar in an 2D Array, the first dimension the week of the month and 
 						the second dimension stores the day of the week
 */

public class Calender {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//take month arg
		int month=Integer.parseInt(args[0]);
		//take year arg
		int year=Integer.parseInt(args[1]);
		Utility.Calendar(month, year);
	}

}
