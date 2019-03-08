package com.Bridgelabz.DataStructure;

/******************************************************************************
 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
 *  Take a user input to search a Word in the List. If the Word is not found then add 
 *  it to the list, and if it found then remove the word from the List. 
 *  In the end save the list into a file
 *
 * @author sandhyarani
 * @version 1.0
 * @date 27-02-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//

public class UnorderedListFileMain {
	/*
	 * static void word(String s1 ,UnorderedList<String> list) {
	 * System.out.println(list.size()); if (list.search(s1)) { list.remove(s1);
	 * System.out.println(list); } }
	 */
	public static void main(String[] args) {
		/*
		 * try and catch block for checking for file related exceptions
		 */
		try {
			// creating a new file
			File file = new File("/home/admin1/docs/sample.txt");
				
			UnorderedListUtility<String> list = new UnorderedListUtility<>();
			Scanner sf = new Scanner(file);
			Scanner s = new Scanner(System.in);
			// adding values from file to list
			while (sf.hasNext()) {
				list.add(sf.next());
			}
			// printing list
			System.out.println(list);
			/*
			 * writing to file using file writer
			 */
			FileWriter fw = new FileWriter(file);
			System.out.println("enter a word ");
			String s1 = s.nextLine();
			System.out.println(list.size());
			// checking if word is found and deleting it and then saving list to file
			if (list.search(s1)) {
				list.remove(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop(0) + " ");
					fw.flush();
					n++;
				}
				System.out.println("found and deleted");
				// or adding it to list and saving it to file
			} else {
				list.add(s1);
				
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop(0) + " ");
					//fw.write(list.append(s1));
					fw.flush();
					n++;
				}
				list.push(s1);
				System.out.println("added and saved");
				fw.close();
				s.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io excep");
		}
}
	}

