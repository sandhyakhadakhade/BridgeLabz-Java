package com.Bridgelabz.Algorithem;

import java.util.Arrays;
import java.util.Scanner;
import com.SearchAndSort.Utility.Util;
/**
 * @Author-sandhyarani
 * @version- 1.0 
 * @date-20/2/2019
 * @Problem statement- 
 			1. BinarySearch  for Integer
			2. BinarySearch  for String
			3. InsertionSort  for Integer
			4. InsertionSort  for String
			5. BubbleSort for Integer
			6. BubbleSort for String
 */
public class SearchAndSort {
	public static long start=0;
	public static long end=0;
	public static long elapsed;
	static int ch=0;
	
	public static void main(String[] args)
	{
		
		//UtilityForSearch uf=new UtilityForSearch();
		Util u=new Util();
		do
		{ 
			Scanner sc=new Scanner(System.in);
			System.out.println("--------Menu for Searching and Sorting----------");
			System.out.println("1. BinarySearch  for Integer");
			System.out.println("2. BinarySearch  for String");
			System.out.println("3. InsertionSort  for Integer");
			System.out.println("4. InsertionSort  for String");
			System.out.println("5. BubbleSort for Integer");
			System.out.println("6. BubbleSort for String");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			int choice=sc.nextInt();
			System.out.println();
	
			switch (choice) 
			{ 
			case 1:
					start=System.currentTimeMillis();
					System.out.println("BinarySearch  For Integer");
					System.out.println("Enter size: ");
					int arraySize=sc.nextInt();
					int a[]=u.input1DArray(arraySize);
					Arrays.sort(a);
					u.print1DArray(a);
					System.out.println("Enter Key: ");
					int position=Util.binarySearch(a,sc.nextInt());

					if(position==-1)
					{
						System.out.println(" Entered Key is Not Found");
					}
					else
					{
						System.out.println("Found at "+position+" position");
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 2:
					start=System.currentTimeMillis();
					System.out.println("BinarySearch  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize1=sc.nextInt();
					String b[]=u.input1DStringArray(arraySize1);
					Arrays.sort(b);
					u.print1DStringArray(b);
					System.out.println("Enter Key: ");
					int position1=Util.binarySearchString(b,sc.next());

					if(position1==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+position1+" position");
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 3:
					start=System.currentTimeMillis();
					System.out.println("InsertionSort  For Integer");
					System.out.println("Enter size: ");
					int arraySize5=sc.nextInt();
					int c[]=u.input1DArray(arraySize5);
					u.print1DArray(c);
					//System.out.println("Enter Key: ");
					int k[]=Util.insertionSort(c);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k.length;i++)
					{
						System.out.println(k[i]);
					}

					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 4 :
					start=System.currentTimeMillis();
					System.out.println("InsertionSort  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize4=sc.nextInt();
					String d[]=u.input1DStringArray(arraySize4);
					u.print1DStringArray(d);
					//System.out.println("Enter Key: ");
					String k1[]=Util.insertionSortString(d);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k1.length;i++)
					{
						System.out.println(k1[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 5:
					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For Integer: ");
					System.out.println("Enter size: ");
					int arraySize2=sc.nextInt();
					int e[]=u.input1DArray(arraySize2);
					u.print1DArray(e);
					//System.out.println("Enter Key: ");
					int k2[]=Util.bubbleSort(e);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k2.length;i++)
					{
						System.out.println(k2[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 6:
					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize3=sc.nextInt();
					String f[]=u.input1DStringArray(arraySize3);
					u.print1DStringArray(f);
					//System.out.println("Enter Key: ");
					String k3[]=Util.bubbleSortString(f);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k3.length;i++)
					{
						System.out.println(k3[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 7: 
					System.exit(0);
			default:
					System.out.println("Wrong Input");
					break;
			}
		}
		while(ch<8);
	}
}
