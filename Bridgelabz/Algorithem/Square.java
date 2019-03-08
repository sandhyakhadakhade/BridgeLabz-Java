package com.Bridgelabz.Algorithem;

import java.util.Scanner;

import com.Algorithem.Utility.Util;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-20/2/2019
 * @Problem statement- Program to find the square root of a given nos
 */

public class Square {
	/**
	 * Main method to test the class
	 * @param args
	 * @throws Exception if input is not integer
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		// int n= sc.nextInt();
		double c = sc.nextDouble();

		// Square.sqrtNewton(c);
		Util.sqrtNewton(c);

	}
}
