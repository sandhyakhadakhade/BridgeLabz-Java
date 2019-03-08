package com.Bridgelabz.Functional;

import java.util.Scanner;

import com.Functional.Utility.Util;

/**
 * @Author-sandhyarani 
 * @version- 1.0 
 * @date-20/2/2019 
 * @Problem statement- Program to find the prime factors of given no
 */
public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No To Find Prime Factors");
		int number = scanner.nextInt();
		System.out.println("Prime Factors Are ");
		Util.primeFactors(number);
		// System.out.println(isPrime(n));
		scanner.close();
	}

}
