package com.Bridgelabz.Functional;

import java.util.Scanner;

import com.Functional.Utility.Util;
/**
* @Author-sandhyarani
* @version- 1.0
* @date-20/2/2019
* @Problem statement-
 to find the roots of the equation a*x*x + b*x + c. 
*/
public class WindChill {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("Enter temperature in fahrenheit");
			double f = scan.nextDouble();
			System.out.println("Enter wind speed in miles per hour");
			double ws = scan.nextDouble();
			if (Math.abs(f) > 50 || ws > 120 || ws < 3) {
				System.out.println("Enter correct input");
			} else {
				Util.windChill(f, ws);
			}
		} catch (Exception e) {
			System.out.println("Enter proper input");
		}
scan.close();
	}
}
