package com.Bridgelabz.Functional;

import java.util.Scanner;

import com.Functional.Utility.Util;
/**
* @Author-sandhyarani
* @version- 1.0
* @date-21/2/2019
* @Problem statement-Simulates a gambler who start with $stake and place fair $1 bets 
    until he/she goes broke (i.e. has no money) or reach $goal.
 	Keeps track of the number of times he/she wins and the number of bets he/she makes.
    Run the experiment N times, averages the results, and prints them out.
 
*/
public class Gambler {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, $stack, $goal;
		System.out.println("enter stack amount");
		$stack = s.nextInt();
		System.out.println("enter goal amount");
		$goal = s.nextInt();
		System.out.println("enter no of times to gamble");
		n = s.nextInt();
		s.close();
		Util.gamble(n, $stack, $goal);
	}
}
