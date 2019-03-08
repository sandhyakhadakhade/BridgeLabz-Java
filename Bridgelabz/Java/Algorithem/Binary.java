package com.Bridgelabz.Algorithem;

import java.util.Scanner;

import com.Algorithem.Utility.Util;

/**
 * @author sandhyarani
 * @version 1.0
 * @date 24/02/2019 
 * @problem statement :to read an integer as an Input, convert
 *       to Binary using toBinary function and perform the following functions.
 *       i. Swap nibbles and find the new number. 
 *       ii. Find the resultant number is the number is a power of 2
 */
public class Binary {
	/**
	 * Function to print array
	 */
	static void showArr(int[] arr) {
		// System.out.println("Array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * Function to check if no is power of 2
	 */
	public static boolean powerOf2(int n) {
            int i = 0;
            int power = 1;
            while (i <= n)
            {
                power = power * 2;
                i++;
                return true;
            }
            return false;
	}

	/**
	 * Function to swap nibbles in array
	 */
	public static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		// System.out.println("Binary.swapNibbles()");
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) {// run 4 times
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	/**
	 * main function to call binary class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Binary.main()");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a No");
			int[] binary = Util.toBinary(sc.nextInt());
			System.out.println("binary is");
			showArr(binary);
			sc.close();
			swapNibbles(binary);
			System.out.println("After Swapping ");
			showArr(binary);
			int swapDec = Util.toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);
			if (powerOf2(swapDec))
				System.out.println("its pwoer of 2");
			else
				System.out.println("not power of 2");
		} catch (Exception e) {
			System.out.println("enter input as integer");
		}

	}
}
