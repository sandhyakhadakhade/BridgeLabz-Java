package com.Bridgelabz.Functional;

import java.util.Scanner;

import com.Functional.Utility.Util;
/**
* @Author-sandhyarani
* @version- 1.0
* @date-20/2/2019
* @Problem statement-
	2D arrays of integers and doubles from standard input and printing them out to standard output.
*/
public class Array2D {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int m = scan.nextInt();
		System.out.println("Enter number of columns: ");
		int n = scan.nextInt();

		// calling methods
		int[][] a = Util.arrayInt(m, n);
		double[][] b = Util.arrayDouble(m, n);
		String[][] c = Util.arrayBoolean(m, n);

		// calling display method
		Util.display(a, b, c, m, n);

	}

}
