package com.Bridgelabz.Functional;

import java.util.Scanner;

/**
 * @Author-sandhyarani 
 * @version- 1.0 
 * @date-20/2/2019 
 * @Problem statement- Find the year is a leap year or not
 */
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit year only ");
		int year = sc.nextInt();
		if (year % 400 == 0 && year % 100 == 0) {
			System.out.println(+year + "  is a leap year");
		} else if (year % 4 != 0 && year % 100 == 0) {
			System.out.println(+year + "  is a leap year");
		} else
			System.out.println(+year + " Not a leap year");
		sc.close();

	}// main

}// class
