package com.Bridgelabz.Functional;

import java.util.Scanner;
/**
* @Author-sandhyarani
* @version- 1.0
* @date-24/2/2019
* @Problem statement-program Quadratic.java to find the roots of the equation a*x*x + b*x + c. 
* Since the equation is x*x, hence there are 2 roots
 */
public class QuadraticEquations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A");
		double A = sc.nextDouble();
		System.out.println("Enter value of B");
		double B = sc.nextDouble();
		System.out.println("Enter value of C");
		double C = sc.nextDouble();
		double root1 = 0;
		double root2 = 0;
		double delta = B * B - 4 * A * C;
		// roots are equal e.g a=2,b=4,c=2
		if (delta == 0) {
			System.out.println("roots are equal...........");
			root1 = -B / (2 * A);
			root2 = -B / (2 * A);
		}
		// roots are unequal e.g a=2,b=6,c=2
		else if (delta > 0) {
			System.out.println("roots are unequal...........");
			root1 = (-B + Math.sqrt(delta * A));
			root2 = (-B - Math.sqrt(delta * A));
		}
		// delta<0 then roots are imaganary e.g a=2,b=4,c=6
		else {
			System.out.println("roots are imaganary........");
		}
		System.out.println("root1 is: " + root1);
		System.out.println("root2 is: " + root2);
		sc.close();
	}
}


