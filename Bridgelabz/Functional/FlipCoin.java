package com.Bridgelabz.Functional;

/**
* @author-sandhyarani
* @version- 1.0
* @date-20/2/2019
* @Problem statement-
 	Flip Coin and print percentage of Heads and Tails
*/
import java.util.Scanner;

import com.Functional.Utility.Util;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No of Times  To Flip The Coin");
		int times = s.nextInt();
		Util.flipPerc(times);
		s.close();

	}//main
}//class
