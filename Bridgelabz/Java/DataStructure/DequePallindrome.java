package com.Bridgelabz.DataStructure;

import java.util.Scanner;
import java.util.concurrent.DelayQueue;

public class DequePallindrome {

	static void ispallindrom(DequueUtility<Character> dq) {
		boolean b;
		if (dq.size() % 2 == 0) {
		b=true;
			while (dq.size() != 0) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
					System.out.println();;
					b=false;
					break;
				}
			}
		} else {
			while (dq.size() == 1) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
				b=true;
				break;
				}
			}
			
		}
		//return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = s.nextLine();
		DequueUtility<Character> dq = new DequueUtility<>();
		int i = 0;
		while (i < s1.length()) {
			dq.addRear(s1.charAt(i++));
		}
		System.out.println(dq + " " + dq.size());
		ispallindrom(dq);
}
}