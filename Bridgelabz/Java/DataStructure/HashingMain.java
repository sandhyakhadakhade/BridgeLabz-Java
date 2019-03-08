package com.Bridgelabz.DataStructure;

import java.util.Scanner;



public class HashingMain {
	Scanner sc=new Scanner(System.in);
	System.out.println()
	OrderedList<Integer> list[] = new OrderedList[];

	public HashingMain() {
		for (int i = 0; i < list.length; i++) {
			list[i] = new OrderedList<>();
		}
	}

	void put(int n) {
		list[n % 11].add(n);
	}

	boolean search(int n) {
		return list[n % 11].search(n);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashingMain hf = new HashingMain();
		OrderedList<Integer> ll = new OrderedList<>();
		System.out.println("Enter how many elements u want to add");
		int no=s.nextInt();
		System.out.println("Enter the Element:");
		
		for (int i = 0; i < no; i++) {
			ll.add(s.nextInt());
		}
		System.out.println(ll);
		/*
		 * try { Scanner s = new Scanner(new
		 * File("/home/bridgelabz/chiragCodes/hashingnumbers.txt")); while
		 * (s.hasNextInt()) { int i = s.nextInt(); hf.put(i);
		 * System.out.println(hf.list[i % 11]); System.out.println(i); } } catch
		 * (FileNotFoundException e) { System.out.println("Exception");
		 * e.printStackTrace(); }
		 */
	}
}