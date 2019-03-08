package com.Bridgelabz.DataStructure;
/**
 * @problem statement : A pallindrome is a string that reads the same forward and backward, 
  	We would like to construct an algorithm to input a string of characters and 
  	check whether it is a pallindrome or not.
 * @author sandhyarani
 * @version 1.0
 * @date 3/03/2019 
 */
import java.util.Scanner;


public class DequePallindrome {
	/**
	 * Function to check given string is pallindrome or not
	 * @param dequeue
	 * @return true or false
	 */
	static boolean ispallindrom(Dequue<Character> dequeue) {
		
		if (dequeue.size() % 2 == 0) {
		
			while (dequeue.size() !=0) {
				char c = dequeue.removeFront();
				char c2 = dequeue.removeRear();
				if (c != c2) {
					System.out.println();;
					return false;
				
				}
			}
		} else {
			while (dequeue.size() == 1) {
				char c = dequeue.removeFront();
				char c2 = dequeue.removeRear();
				if (c != c2) {
				return true;
		
				}
			}
			
		}
		return true;
	}
	//main function 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = scanner.nextLine();
		Dequue<Character> deqeue = new Dequue<>();
		int i = 0;
		while (i <s1.length()) {
			deqeue.addRear(s1.charAt(i++));
		}
		System.out.println(ispallindrom(deqeue));
		System.out.println(deqeue + " ");
		scanner.close();
	
}
}