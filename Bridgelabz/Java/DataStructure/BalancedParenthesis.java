package com.Bridgelabz.DataStructure;

/******************************************************************************
 * Purpose: Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) 
 * where parentheses are used to order the performance of operations. 
 * Ensure parentheses must appear in a balanced fashion.
 *
 * @author 
 * @version 1.0
 * @since 27-02-2019
 *
 ******************************************************************************/


public class BalancedParenthesis {

	/**
	 * Function to check for parenthesis is balanced or not
	 * 
	 * @param s the String containing arithmetic expression which needs to check
	 * @return true is balanced or false if not balanced
	 */
	static boolean check(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			/*
			 * push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the
			 * Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
			 */
			char c = s.charAt(i);
			if (c == '(')
				st.push(s.charAt(i));
			else if (c == ')')
				st.pop();
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {

		String s = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String result = (check(s)) ? "Balanced" : "Not Balanced";
		System.out.println(result);
	}
}