package com.Bridgelabz.DataStructure;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @problemStatement a Slot of 10 to store Chain of Numbers that belong to each
 *                   Slot to efficiently search a number from a given set of
 *                   number
 * @author Sandhyarani
 * @version 1.0
 * @since 6/03/2019
 */

public class HashingSearchMain<T> {
//search the element into Hashmap
	public void hashingSearch(LinkedList<T> list[], String[] num) {
		for (int i = 0; i < num.length; i++) {
			int number = Integer.parseInt(num[i]);
			int key = number % 11;
			list[key].sort(number);
		}
	}

	/**
	 * function to search the element into list
	 * 
	 * @param number
	 * @param list
	 */
	public void search(int number, LinkedList<T> list[]) {
		int key = number % 11;
		if (list[key].search(number)) {
			list[key].remove(number);
			System.out.println("Found Hence Remove..");
			
		} else {
			list[key].sort(number);
			System.out.println("Not Found hence Added..");
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		HashingSearchMain<Integer> h = new HashingSearchMain<>();

		LinkedList<Integer> list[] = new LinkedList[11];
		//Utility<Object> u = new Utility<>();
		IoFile io = new IoFile();
		String num[] = io
				.readFromFile("/home/admin1/sample.txt")
				.split(" ");
		for (int i = 0; i < 11; i++) {
			list[i] = new LinkedList<>();
		}
		h.hashingSearch(list, num);
		for (int i = 0; i < 11; i++) {
			if (list[i].size() == 0) {
				continue;
			}
			list[i].display();
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for finding : ");
		int n = sc.nextInt();
		h.search(n, list);
		FileWriter fw = new FileWriter(
				"/home/admin1/sample.txt");
		fw.write("");
		fw.close();
		for (int i = 0; i < 11; i++) {
			if (list[i].size() == 0) {
				continue;
			}
			list[i].display();
			System.out.println();
		}
		for (int i = 0; i < 11; i++) {
			if (list[i].size() == 0) {
				continue;
			}
			io.appendToFile(list[i],
					"/home/admin1/sample.txt");
		}
		sc.close();
	}

}
