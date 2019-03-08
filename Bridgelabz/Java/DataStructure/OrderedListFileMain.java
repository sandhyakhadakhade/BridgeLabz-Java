package com.Bridgelabz.DataStructure;

/******************************************************************************
 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
 *  Take a user input to search a Word in the List. If the Word is not found then add 
 *  it to the list, and if it found then remove the word from the List. 
 *  In the end save the list into a file
 *
 * @author chiragkatare
 * @version 1.0
 * @since 08-10-2018
 *
 ******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * importing custom ordered list
 */

public class OrderedListFileMain {

	static void addRemove(int num, OrderedList<Integer> list) {
		if (list.search(num)) {
			list.remove(num);
			System.out.println("found and removed");
			System.out.println(list);
		} else {
			list.add(num);
			System.out.println("number not found hence added");
			System.out.println(list);
		}
	}

	/**
	 * Main function to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// creating a new file
			File file = new File("/home/admin1/docs/sampleNumber.txt");

			OrderedList<Integer> list = new OrderedList<>();

			Scanner scanner = new Scanner(file);
			Scanner scan = new Scanner(System.in);
			// adding values from file to list
			while (scanner.hasNext()) {
				list.add(scanner.nextInt());
			}
			// printing list
			System.out.println(list);
			/*
			 * writing to file using file writer
			 */
			FileWriter fileWriter = new FileWriter(file);

			System.out.println("Enter A Number ");
			Integer number = scan.nextInt();
			System.out.println(list.size());
			// addRemove(number, list);
			if (list.search(number)) {
				list.remove(number);
				System.out.println("found and removed");
				System.out.println(list);
			} else {
				list.add(number);
				System.out.println("number not found hence added");
				System.out.println(list);
			}

		} catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}
