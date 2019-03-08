package com.Bridgelabz.Algorithem;
/**
 * @version 1.0
 * @date 22/02/2019
 * @author sandhyarani
 * @problem statement  Use Binary Search to find the number
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.Algorithem.Utility.Util;

public class SearchWordFile {
		/**
		 * Main function to test the class
		 * 
		 * @param args
		 * @throws Exception if input is not correct
		 */
		public static void main(String[] args) throws Exception {
			File f = new File("/home/admin1/docs/sample.txt");
			try {
				Scanner s = new Scanner(System.in);
				String arr[] = Util.fileRead(f);
				for (String string : arr) {
					System.out.println(string);
				}
				System.out.println("Enter Name to Search");
				String s1 = s.nextLine();
				int i = Util.binarySearchString(arr, s1);
				if (i==-1)
					System.out.println(" not found");
				else
					System.out.println("found");
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Exception");
	}
	}

}
