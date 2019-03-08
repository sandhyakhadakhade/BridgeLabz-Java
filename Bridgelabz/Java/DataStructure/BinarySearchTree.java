package com.Bridgelabz.DataStructure;
/**
 *@Problem Statement- For each test case, find the number of different binary search trees 
 			that can be created using those nodes
 *@author  Sandhyarani Khadakhade
 *@version 1.0
 *@date    6/03/2019
 */
import java.util.Scanner;

public class BinarySearchTree {
	//main function
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of test cases:");
		int test =sc.nextInt();
		int[] nodes = new int[test];
		System.out.println("Enter nodes:");
		for (int i = 0; i < test; i++) {
			nodes[i] = sc.nextInt();
		}
		for (int j = 0; j < test; j++) {
			try {
				System.out.println("Possibe no. of binary search tree with " + nodes[j] + " node(s):"
						+ Utility.countBST(nodes[j]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		sc.close();
}

	}
