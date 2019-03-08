package com.Bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Utility<T> {
	static Scanner scanner=new Scanner(System.in);
	//Method to balance expression
    public static void BalanceParanthesis(String exp)
    {
        Stack s=new Stack();
        char e[]=exp.toCharArray();
        int explen=exp.length();
        int count1=0;int count2=0;
        for(int i=0;i<explen;i++)
        {
            if(e[i]=='(')
            {
                s.push(e[i]);
                count1++;
            }
            else if(e[i]==')')
            {
                s.pop();
                count2++;
            }
        }
        if(count1==count2)
        {
            System.out.println("Expression is valid: Balanced");
        }
        else
        {
            System.out.println("Expression is invalid: Not Balanced");
        }
}
	//To return String Input Line
    public static String inputStringLine()
    {

        try {
        	return scanner.nextLine();
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputStringLine();
		}
    }
 

	public static boolean dateValidator(int d, int month, int y) {

		boolean b = true;
		if (((month == 4 || month == 6 || month == 9 || month == 11) && (d > 30)) || (d > 31)
				|| (month == 2 && y % 100 == 0 && y % 400 != 0 && d > 28) || (month == 2 && y % 400 == 0 && d > 29)
				|| (month == 2 && y % 100 != 0 && y % 4 != 0 && d > 28)
				|| (month == 2 && y % 100 != 0 && y % 4 == 0 && d > 29)) {
			b = false;
		} else {
			b = true;
		}
		return b;
	}

	public static int dayStart(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		return ((d + x + (31 * m0) / 12) % 7);

	}
	//Method for Calendar
    public static void Calendar(int month, int year)
    {   
       
        String[] months = {"January", "February", "March","April", "May", "June",
            "July", "August", "September","October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       
        if ((month == 2) && (isLeapOrNot(year)))
        {
            days[month] = 29;
        }
       
        System.out.println("   " + months[month-1] + " " + year);
        System.out.println(" S  M Tu  W Th  F  St");
        int d = dayOfWeek(month, 1, year);
       
        for (int i = 0; i < d; i++)
        {
            System.out.print("   ");
        }
       
        for (int i = 1; i <= days[month-1]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month-1]))
                System.out.println();
        }
}
//method for stack calendar
	public static void stackCalender(int m, int y) {
		Stack<Object> first[][] = new Stack[6][];
		for (int i = 0; i < 6; i++) {
			first[i] = new Stack[7];
			for (int j = 0; j < 7; j++) {
				first[i][j] = new Stack();
			}
		}

		Stack a[][] = new Stack[6][];
		for (int i = 0; i < 6; i++) {
			a[i] = new Stack[7];
			for (int j = 0; j < 7; j++) {
				a[i][j] = new Stack<>();
			}
		}
		int d = 1;
		String[] monthArray = { " ", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		String[] daysArray = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				first[i][j].push("  ");
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (dateValidator(d, m, y)) {
					j = dayStart(d, m, y);
					if (d < 10) {
						first[i][j].pop();
						first[i][j].push(" " + d);
						d++;
					} else {
						first[i][j].pop();
						first[i][j].push("" + d);
						d++;
					}
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				a[i][j].push(first[i][j].pop());
			}
		}

		System.out.println(monthArray[m] + " " + y);
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print(daysArray[i] + "  ");
		}
		System.out.println();
		System.out.println("--------------------------");
		for (int x = 0; x < 6; x++) {
			for (int y1 = 0; y1 < 7; y1++) {
				System.out.print(a[x][y1].pop() + "  ");
			}
			System.out.println();
		}

	}

	// Method to check Leap Year
	public static boolean isLeapOrNot(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			System.out.println("Is a Leap Year");
			return true;
		} else {
			System.out.println("Is not a Leap Year");
			return false;
		}

	}

	// Method to find day of a week
	public static int dayOfWeek(int m, int d, int y) {
		/*
		 * y0 = y − (14 − m) / 12 x = y0 + y0/4 − y0/100 + y0/400 m0 = m + 12 × ((14 −
		 * m) / 12) − 2 d0 = (d + x + 31m0 / 12) mod 7
		 */
		int y1 = y - (14 - m) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1 / 12) % 7;
		// System.out.println(d1);
		return d1;
	}

	// Method for Calendar Queue
	public static void CalendarQueue(int month, int year) {
		QueueLinkedList weekday = new QueueLinkedList();
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((month == 2) && (isLeapOrNot(year))) {
			days[month] = 29;
		}
		System.out.println("\t\t\t" + months[month - 1] + " " + year);
		System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
		int d = dayOfWeek(month, 1, year);
		for (int i = 0; i < d; i++) {
			weekday.insert("\t");
		}
		for (int i = 1; i <= days[month - 1]; i++) {
			// System.out.printf("%2d ", i);
			weekday.insert("\t" + i);
			if (((i + d) % 7 == 0) || (i == days[month - 1]))
				weekday.insert("\n");
		}
		weekday.display();
	}
	

	// Method to find prime anagram
	public static boolean FindAnagram(int[] out) {
		int len = out.length;
		boolean status = false;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				// System.out.println(out[i]+" "+out[j]);
				status = AnagramInteger(out[i], out[j]);

			}
		}
		return status;
	}

//Method to display anagram
	public static void displayangaram(boolean status) {
		if (status) {
			System.out.println("Is Anagram");
		} else
			System.out.println("Is Not Anagram");
	}

//Method for integer anagram
	public static boolean AnagramInteger(int n1, int n2) {

		String num1 = String.valueOf(n1);
		String num2 = String.valueOf(n2);
		boolean status = Anagram(num1, num2);
		return status;
	}

	// Method for 2D Prime Array
	public static int[] Prime2D() {
		int[][] a = new int[10][30];
		int b[] = new int[250];
		int k = 0;
		int c = 0;

		while (c < 250) {
			if (isPrime(k)) {
				b[c] = k;
				c++;
			}
			k++;
		}
		int v = 0;
		for (int i = 0; i < 10; i++) {
			int max = 100;
			for (int j = 0; j < 30; j++) {
				if (b[v] < (i + 1) * max) {
					a[i][j] = b[v];
					v++;
				}
			}
		}
		int start = 0, end = 1;
		for (int i = 0; i < 10; i++) {
			end = (i + 1) * 100;
			System.out.print("[" + start + "-" + end + "]");
			start = 1 + end;
			for (int j = 0; j < 30; j++) {
				if (a[i][j] > 0) {

					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();
		}
		return b;
	}

	// Method for Anagram String
	public static boolean Anagram(String str1, String str2) {
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		boolean isAnagram = false;
		isAnagram = Arrays.equals(string1, string2);
		if (isAnagram == true) {
			// pSystem.out.println(str1+" , "+str2+" are Anagram Strings");
			return isAnagram;
		} else
			// System.out.println(str1+" , "+str2+" are not Anagram Strings");
			return isAnagram;

	}

//To check number is prime or not
	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Method for 2D Prime Anagram
	public static int[][] PrimeAnagram2D() {
		int array[] = Prime2D();
		int n1 = 0;
		int n2 = 0;
		int k = 0;
		boolean status = false;
		int newarray[] = new int[300];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				n1 = array[i];
				n2 = array[j];
				status = AnagramInteger(n1, n2);
				if (status == true) {
					newarray[k++] = n1;
					newarray[k++] = n2;

				}
			}
		}
		int v = 0;
		int a[][] = new int[10][30];
		for (int i = 0; i < 10; i++) {
			int max = 100;
			for (int j = 0; j < 30; j++) {
				if (array[v] < (i + 1) * max) {
					a[i][j] = newarray[v];
					v++;
				}
			}
		}
		System.out.println("-------------------------------");
		System.out.println("Prime Numbers that are Anagram");
		System.out.println("-------------------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 30; j++) {
				if (a[i][j] > 0 && a[i][j] < 1000) {

					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();
		}
		return a;
	}

	// Method for Prime Anagram in Stack
	public static void StackPrimeAnagram() {

		int array[][] = PrimeAnagram2D();
		StackLinkList stack = new StackLinkList();
		System.out.println("----------------------------------");
		System.out.println("Prime Anagram in reverse order using Stack");
		System.out.println("----------------------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 30; j++) {
				if (array[i][j] > 0 && array[i][j] < 1000) {
					stack.insert(array[i][j] + "\t");
					// System.out.print(a[i][j]+"\t");
				}

			}
			stack.insert("\n");
		}
		stack.display();
	}

	// Method for Prime Anagram in Queue
	public static void QueuePrimeAnagram() {

		int array[][] = PrimeAnagram2D();
		QueueLinkedList queue = new QueueLinkedList();
		System.out.println("----------------------------------");
		System.out.println("Prime Anagram using Queue");
		System.out.println("----------------------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 30; j++) {
				if (array[i][j] > 0 && array[i][j] < 1000) {
					queue.insert(array[i][j] + "\t");
					// System.out.print(a[i][j]+"\t");
				}

			}
			queue.insert("\n");
		}
		queue.display();
	}
	//function to calculate Binary Search Tree Node
	//to find catalan number
			public static long findPossibleTree(int node) {
				return (factorial(2 * node) / (factorial(node + 1) * factorial(node)));
			}

			// to find  factorial of a given number
			public static long factorial(int n) {
				if (n == 0)
					return 1;
				else
					return (n * factorial(n - 1));
			}

			// to count number of possible BST
			public static long countBST(long count) {
				long intsum = 0;
				if (count == 0 || count == 1) {
					return 1;
				} else if (count == 2) {
					return 2;
				} else {
					for (long i = 0; i < count; i++) {
						intsum = intsum + countBST(i) * countBST(count - i - 1);
					}
					
					return intsum;
				}
		}
			// To return String Input
		    public static String inputString()
		    {

		        try {
		        	return scanner.next();
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println("Invalid input, try again.");
					return inputString();
				}
		}
		  //To write into file
		    public static FileWriter fileWrite(String string)
		    {
		        FileWriter f = null;
		        try
		        {
		            f = new FileWriter(string);
		        }
		        catch (IOException e)
		        {
		            //
		            e.printStackTrace();
		        }
		        return f;   
		    }

		 
		    
			//To return Integer input
		    public static int inputInt()
		    {
		    	
		            try {
		            	return scanner.nextInt();
					} catch (Exception e) {
						scanner.nextLine();
						System.out.println("Invalid input, try again.");
						return inputInt();
					}
		       
		}
			//To Read File
		    public static FileReader fileRead(String string)
		    {
		        FileReader f = null;
		        try {
		            f = new FileReader(string);
		        } catch (FileNotFoundException e) {
		       
		            e.printStackTrace();
		        }
		        return f;   
		    }
//display no 
		    public static void display(HashMap<Integer, OrderedLinkedList<Integer>> hashMap) 
		    {   
		    	Set<Integer> keys = hashMap.keySet();
		    	 System.out.println();
		    	 
		        for (Integer key : keys) {
		        	OrderedLinkedList<Integer> value=hashMap.get(key);
		            System.out.print(key +"-->");
		            value.list();
		            System.out.println();
		        }
		}

			//search hash number
			 public static void searchHashNumber(HashMap<Integer, OrderedLinkedList<Integer>> hashMap) throws FileNotFoundException, UnsupportedEncodingException {
			       
			        System.out.print("Enter a number to search: ");
			        int search = inputInt();    //    number to be searched
			       
			        //    getting list in which the number should be
			        OrderedLinkedList<Integer> list = hashMap.get(search % 11);
			       
			        if(list.search(search))
			        {    //    file contains the number
			            System.out.println("File contains number. Removing it.");
			            list.remove(search);
			       
			        }
			        else
			        {    //    file does not contain the number
			            System.out.println("File does not contain the number. Adding it to the file.");
			            list.add(search);
			           
			        }
			        display(hashMap);
			        PrintWriter printWriter = null;    // to write to the file
			        printWriter = new PrintWriter("/home/admin1/Java/FellowshipProblem/src/com/Bridgelabz/DataStructure/NumberHash");
			            for(int i = 0; i < 11; i++)
			            {
			            list = hashMap.get(i);    //    getting lists
			           // System.out.println(list);
			            while(!list.isEmpty())
			            {
			                //    popping every element and adding to the file
			            	Integer str=list.pop(0);
			            	System.out.print(str+"\t");
			                printWriter.print(str+"\t");
			            }           
			        }       
			            printWriter.close();
			          
			    }
			 //method for raeding data into file
			    public static void readHashFile(HashMap<Integer, OrderedLinkedList<Integer>> hashMap) throws NumberFormatException, IOException {
			        FileReader fileread=fileRead("/home/admin1/Java/FellowshipProblem/src/com/Bridgelabz/DataStructure/NumberHash");
			        BufferedReader br=new BufferedReader(fileread);
			        String line;
			        try {
			        while((line=br.readLine())!=null)
			        {
			            String[] strings = line.split(",");    //    splits line into string array
			            for(String integers : strings)
			            {
			                //    converts string into integer
			                int numberToAdd = Integer.parseInt(integers);
			                //    adds number to appropriate list
			                OrderedLinkedList<Integer> list = hashMap.get(numberToAdd % 11);
			                list.add(numberToAdd);
			                list.list();
			            }
			        }
			        display(hashMap);
			        
			    }catch(NumberFormatException no) {
			    	no.printStackTrace();
			    }
			    }
//function to check numbers should be 10 or not
			    public static void intializeHash(HashMap<Integer, OrderedLinkedList<Integer>> hashMap)
			    {
			        for(int i=0;i<11;i++)
			        {
			            hashMap.put(i, new OrderedLinkedList<Integer>());
			        }
			        
			}
			//hashFunction for reading and storing data into liked list and file
			 public static void  hashFunction() throws NumberFormatException, IOException
			    {
			        HashMap<Integer, OrderedLinkedList<Integer>> hashMap= new HashMap<Integer, OrderedLinkedList<Integer>>();
			       
			        intializeHash(hashMap);
			      
			        readHashFile(hashMap);

			        searchHashNumber(hashMap);  

			}
}
