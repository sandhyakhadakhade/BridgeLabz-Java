package com.Bridgelabz.Functional;

import java.util.Scanner;

import com.Functional.Utility.Util;
/**
* @Author-sandhyarani
* @version- 1.0
* @date-20/2/2019
* @Problem statement-
 	generate all permutations of a String
*/
public class Permitation {

		// Find Permutations of a String in Java
			public static void main(String[] args)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter String");
				String s = scan.next();
				Util.permutations("", s);
				scan.close();
			}
}
