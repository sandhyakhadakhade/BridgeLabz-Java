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
public class SwapNibble {
	/**
	 * Function to convert decimal to binary
	 *
	 */
	public static int[] toBinary(int d) {
		String bin = "";
		while (d != 0) {
			bin = (d % 2) + bin;
			d = d / 2;
		}
		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntArray(bin);
	}// tB

	/**
	 * Function to convert string to int array helper function of Binary.java
	 */

	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}// sTA

	/**
	 * Function to convert binary to decimal
	 */
	static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}// toDecimal

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
			int[] binary = SwapNibble.toBinary(sc.nextInt());
			System.out.println("binary is");
			showArr(binary);
			sc.close();
			swapNibbles(binary);
			System.out.println("After Swapping ");
			showArr(binary);
			int swapDec = SwapNibble.toDecimal(binary);
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
