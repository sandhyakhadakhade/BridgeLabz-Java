package com.Bridgelabz.Functional;

import java.util.Scanner;
/**
 * @Author : sandhyarani 
 * @date : 19/02/2019
 * @version : 1.0
 * Problem Statement
 	1.User Input and Replace String Template “Hello <<UserName>>, How are you?” 
 **/
public class ReplaceString {
/**
 * @param args -
 * @return new string
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to Replace");
		String str=sc.next();
		String str1="Sandhya";
		int length=str.length();
		if(length>=3) {
			str=str.replace(str1, str);
			System.out.println( "“Hello << "+str+" >>, How are you?”" );
		}
		else {
			System.out.println("Please Enter Minimun 3 Char");
		}
		sc.close();

	}
	

}
