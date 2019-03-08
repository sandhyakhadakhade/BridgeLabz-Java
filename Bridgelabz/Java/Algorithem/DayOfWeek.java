package com.Bridgelabz.Algorithem;

import java.util.Scanner;

import com.Algorithem.Utility.Util;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-20/2/2019
 * @Problem statement-  
*/
public class DayOfWeek {
	public static void main(String[] args) {
		/*
		 * int date,month,year; Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter Date in day month year"); date=sc.nextInt();
		 * month=sc.nextInt(); year=sc.nextInt();
		 * System.out.println("day is  "+UtilClassExample.dayOfWeek(date, month, year));
		 * sc.close();
		 */
		int date, month, year;
		date = Integer.parseInt(args[0]);
		month = Integer.parseInt(args[1]);
		year = Integer.parseInt(args[2]);
		System.out.println("DayOfWeek.main()");
		System.out.println(date + "/" + month + "/" + year);
		System.out.println("day is  " + Util.dayOfWeek(date, month, year));

	}
}
