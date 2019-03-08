package com.Bridgelabz.Functional;
import java.util.Scanner;

import com.Functional.Utility.Util;
/**
* @Author-sandhyarani
* @version- 1.0
* @date-20/2/2019
* @Problem statement-
 Program to Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
*/
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int N = sc.nextInt();

		System.out.print("harmonicNumber is:" + Util.nthHarmonic(N));
		sc.close();

	}//main

}//class
