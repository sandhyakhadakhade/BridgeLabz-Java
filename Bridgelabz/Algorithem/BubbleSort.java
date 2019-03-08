package com.Bridgelabz.Algorithem;

import java.util.Scanner;

import com.Algorithem.Utility.Util;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-20/2/2019
 * @Problem statement-  Reads in integers prints them in sorted order using Bubble Sort
*/

public class BubbleSort {
	public static void main(String args[]) {
	 int n, array[];
	 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = in.nextInt();
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	 
	    for (int c = 0; c < n; c++) {
	      array[c] = in.nextInt();
	    }
	    System.out.println("After bubble sort ");
	    for(int count=0;count<n;count++) {
	    	Util.bubbleSort(array);
    	 System.out.println(array[count]);
     }
	    in.close();
	}
}
