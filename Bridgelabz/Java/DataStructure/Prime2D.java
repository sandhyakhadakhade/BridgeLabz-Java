package com.Bridgelabz.DataStructure;
/**
 *@purpose Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
 		   Store the prime numbers in a 2D Array, the first dimension represents the range 0-100, 100-200, 
 		   and so on. While the second dimension represents the prime numbers in that range
 * @author sandhyarani khadakhade
 * @date 6/03/2019
 * @version 1.0
 */
import java.util.Scanner;

public class Prime2D {
	public static void main(String[] args)
	{
  	primeCalculate p=new primeCalculate();
  	Scanner sc=new Scanner(System.in);
  	int a=0,b=1000;

    System.out.println("\nPrime numbers:\n \n[0t99]  [100]  [200]   [300]   [400]   [500]   [600]   [700]   [800]  [900]");
  	p.primeCalc(a,b);
  	p.print();
}
}
