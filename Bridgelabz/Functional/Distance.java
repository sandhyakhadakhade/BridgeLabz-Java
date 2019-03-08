package com.Bridgelabz.Functional;

import java.util.Scanner;

import com.Functional.Utility.Util;

/**
* @Author-sandhyarani
* @version- 1.0
* @date-23/2/2019
* @Problem statement-
 	takes two integer command-line arguments x and y and prints the
 	Euclidean distance from the point (x, y) to the origin (0, 0)
*/
public class Distance {

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value for x");
			int x = s.nextInt();
			System.out.println("Enter value for y ");
			int y = s.nextInt();
			Util.calculate(x, y);
			s.close();
		} catch (Exception e) {
			System.out.println("Enter Integer only");
		}
	}
}
