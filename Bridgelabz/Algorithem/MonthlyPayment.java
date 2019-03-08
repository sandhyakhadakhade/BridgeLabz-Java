package com.Bridgelabz.Algorithem;

import com.Algorithem.Utility.Util;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-20/2/2019
 * @Problem statement- calculate monthlyPayment 
 */
public class MonthlyPayment {

	public static void main(String[] args) {
		int year;
		int perRent;
		int principal;
		year = Integer.parseInt(args[0]);
		perRent = Integer.parseInt(args[1]);
		principal = Integer.parseInt(args[2]);
		double result = (double) Util.monthlyPayment(year, perRent, principal);
		System.out.println("MonthlyPayment.main()");
		System.out.println("years to pay: " + year + "\nprincipal loan amount: " + perRent + "\ninterest: " + perRent);
		System.out.println("Monthly payment is: " + result);

	}

}
