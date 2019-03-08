package com.Bridgelabz.Algorithem;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-24/2/2019
 * @Problem statement- 
	1.The Two Strings are Anagram or not....
	2.Two values are anagrams or not 
	3.print the prime no between to 1 to 1000
	4.Given number is prime or not
	5.Find the is pallindrome or no
 */
import java.util.Scanner;

import com.Algorithem.Utility.Util;

public class AnagramAndPP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int ch=0;
		do {
		System.out.println("1 Two Strings are Anagram or not");
		System.out.println("2 Two values are anagrams or not");
		System.out.println("3 print the prime no between to 1 to 1000");
		System.out.println("4 Given number is prime or not");
		System.out.println("5 Find the is pallindrome or no");
		System.out.println("6 Exit");
		System.out.println();
		System.out.println("Enter Your Choice: ");
		int choice =sc.nextInt();
		System.out.println();
		switch(choice) {
		case 1:
			System.out.println(" Two Strings are Anagram or not");
			System.out.println("Enter Two Strings");
			String str1=sc.next();
			String str2=sc.next();
			boolean result= Util.anagram(str1, str2);
			System.out.println(result);
			break;
		
		case 2:
			System.out.println("Two values are anagrams or not");
			System.out.println("Enter Two Integer");
			int i1=sc.nextInt();
			int i2=sc.nextInt();
			boolean no=Util.anagram(i1, i2);
			System.out.println(no);
			break;
			
		case 3:
			System.out.println("print the prime no between to 1 to 1000");
			System.out.println("prime No is");
			Util.isPrimeNumber();
			break;
		
		case 4:
			System.out.println("Given number is prime or not");
			System.out.println("Enter any number");
			int noI=sc.nextInt();
			boolean res=Util.isPrimeNo(noI);
			System.out.println("Given no is"+res);
			break;
		case 5:
			System.out.println(" Find the number is pallindrome or not");
			System.out.println("Enter number");
			int noP=sc.nextInt();
			boolean resP=Util.isPallindrome(noP);
			System.out.println("Number is"+resP);
			break;
		case 6:
			System.out.println("Execution Stoped");
			System.exit(0);
			
		default :
			System.out.println("Wrong Input");
			break;
			
		}
	}while(ch<6);
		sc.close();
	}
	

}
