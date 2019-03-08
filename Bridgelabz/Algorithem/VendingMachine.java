package com.Bridgelabz.Algorithem;

import java.util.Scanner;

import com.Algorithem.Utility.Util;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-27/2/2019
 * @Problem statement-  There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can 
	  be returned by Vending Machine. Write a Program to calculate the minimum
	  number of Notes as well as the Notes to be returned by the Vending Machine 
	  as a Change
 */
public class VendingMachine {
	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		int value = sc.nextInt();
		Util.notes(value);
		sc.close();
	} catch (Exception e) {
		System.out.println("Enter value in integer");
	}
}
}
