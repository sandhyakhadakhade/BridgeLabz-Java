package com.Bridgelabz.DataStructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnordedList {
	public static void main(String[] args) {
		try {
			// creating a new file
		File file = new File("/home/admin1/docs/sample.txt");
		UnorderedListUtility<String> list = new UnorderedListUtility<>();
		
		FileInputStream fis=new FileInputStream(file);
		Scanner scanner = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		// adding values from file to list
		
		int data;
		while((data=fis.read())!=-1){
			
			while (scanner.hasNext()) {
				list.add(scanner.next());
			}
		}
		// printing list
		System.out.println(list);
		//writing to file using file writer
		FileWriter fileWriter = new FileWriter(file);

		System.out.println("Enter A Word ");
		String word = scan.nextLine();
		System.out.println(list.size());
		// checking if word is found and deleting it and then saving list to file
		if (list.search(word)) {
			list.remove(word);
			int n = 0;
			while (n < list.size()) {
				fileWriter.write(list.pop(0) + " "+word);
				fileWriter.flush();
				n++;
			}
			System.out.println(word+" Word is Found and Deleted");
			// or adding it to list and saving it to file
		} else {
			list.add(word);
			//list.append(s1);
			
			int n = 0;
			while (n < list.size()) {
				fileWriter.write(list.pop(0) + " ");
				fileWriter.flush();
				n++;
				
			}
			
			System.out.println(word+" Word is Added And Saved");
			fileWriter.close();
			scan.close();
		}
		
	}catch(FileNotFoundException fio) {
		fio.printStackTrace();
	}catch(IOException io) {
		io.printStackTrace();
	}

}
}