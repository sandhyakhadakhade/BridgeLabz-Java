package com.Bridgelabz.Functional;

import java.util.Scanner;

import com.Functional.Utility.Util;

/**
* @Author-sandhyarani
* @version- 1.0
* @date-20/2/2019
* @Problem statement-
  A program with cubic running time. Read in N integers and 
counts the   number of triples that sum to exactly 0.
*/
public class SumOfThreeInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number Of Inputs");
		int n = scan.nextInt();
		Util.sum0count(n);
		scan.close();
	}
}
