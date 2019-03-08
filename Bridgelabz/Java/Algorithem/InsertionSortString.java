package com.Bridgelabz.Algorithem;

import java.util.Scanner;

import com.SearchAndSort.Utility.Util;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-20/2/2019
 * @Problem statement- TemperaturConversion
 */
public class InsertionSortString {

	public static void main(String[] args) {
		Util u=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("InsertionSort  For String");
		System.out.println("Enter number of words to be sorted: ");
		int arraySize4=sc.nextInt();
		String d[]=u.input1DStringArray(arraySize4);
		u.print1DStringArray(d);
		//System.out.println("Enter Key: ");
		String k1[]=Util.insertionSortString(d);
		System.out.println("Sorted Array is: ");

		for(int i=0;i<k1.length;i++)
		{
			System.out.println(k1[i]);
		}

	}

}
