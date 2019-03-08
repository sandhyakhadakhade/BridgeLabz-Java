package com.Bridgelabz.DataStructure;

import java.util.Scanner;
/**
 * @problem statement :  Create a Program which creates Banking Cash Counter where people come in
   		to deposit Cash and withdraw Cash. Have an input panel to add people to Queue to either deposit
  		or withdraw money and dequeue the people. Maintain the Cash Balance.
 * @author sandhyarani
 * @version 1.0
 * @date 5/03/2019 
*/
public class BankCashCounter {
	 
		public static void main(String args[])
		{ 
			QueueBankCCLogic q=new QueueBankCCLogic();
			Scanner sc=new Scanner(System.in);
			int ch = 0;
			do
			{ 
				System.out.println();
			   	System.out.println("------------Banking Cash Counter-----------");
			   	System.out.println("1.Deposit");
			   	System.out.println("2.Withdraw");
			   	System.out.println("3.Number of people in the Queue ");
			   	System.out.println("4.Exit");
			   	System.out.println();
			   	System.out.println("Enter your choice: ");
			   	int choice=sc.nextInt();
			   	switch (choice) 
			   	{
			   	case 1:
				   		System.out.println("Enter the amount you want to Deposit");
				   		q.insert(sc.nextInt()); 
				   		q.display();
				   		break;
			   	case 2:
				   		System.out.println("Enter the amount you want to Withdraw ");
						sc.nextInt();
				   		q.remove();
				   		q.display();
				   		System.out.println(" Your Available Balance is: "); 
				   		
				   		break;
				case 3:
						int j=q.getSize();
						System.out.println("The Number of People in Queue is: "+j);			
			   	case 4:
				   		System.exit(0);
			   	default: 
				   		System.out.println("You entered wrong choice");
				   		break;
			   	}
		   	}
			while(ch<5);
		}		
	} 

