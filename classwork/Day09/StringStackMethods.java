import java.io.*;
import java.util.*;

/*

Hunter CS Program
StringStackMethods
Jonathan Swotinsky

Task:
Using a stack as data structure, write the following methods:

1) public static String reverse(String s) - Returns s in reverse order.
2) public static boolean isPalindrome(String s) - Returns true or false 
depeneding on whether s is a palindrome (can be read the same forward & backward).

Example palindromes:
racecar
able was i ere i saw elba

There are at least 2 ways to do this...

3) public static boolean parenCheck(String s)

Assume s is a string representing a mathematical expression.
Limit the expression to containing letters, numbers and the following characters: ()+-/*
Returns true if the parentheses in the expression are matched accurately.
This should just check valid parentheses matching, ignoring any other potential syntax issues.

Extensions:

For reverse and isPalindrome instead of going through a string by character, 
go through by word (assume a single space between words and no punctuation.)

For example:
reverse("make it so") ==> so it make.
isPalindrome("i am what am i") ==> true.
For parenCheck, allow for []{} symbols, and check to make sure they match correctly.

*/


public class StringStackMethods {
	
	public static String reverse(String s1){
		// Instantiate a new Stack<Character> object and assign it to stack:
		Stack<Character> stack = new Stack<Character>();
		// Populate stack with the characters in s1:
		for(int i = 0; i <= s1.length() - 1; i++){
			stack.push(s1.charAt(i));
		}// end for i
		// Construct a new String by popping the values from stack.
		String s2 = "";
		for(int i = 0; i <= s1.length() - 1; i++){
			s2 = s2 + stack.pop();
		}// end for i
		// Return stack as a string:
		return s2;	
	}// end reverse
	
	
	public static boolean isPalindrome(String s1){
		String s2 = reverse(s1);
		return s1.equals(s2);
	}// end isPalindrome
	
	
	public static void main(String[] args) {
		System.out.println();
		
		//Test for reverse() method:
		System.out.println("Test for reverse() method:");
		String s = "I am a string!";
		System.out.println("The reverse of " + s + " is " + reverse(s)+"\n"); 
		
		
		//Test for isPalindrome() method:
		System.out.println("Test for isPalindrome() method:");
		String s1 = "racecar";
		String s2 = "able was i ere i saw elba";
		String s3 = "Hello, World!";
		System.out.println(s1 + ":\t" + isPalindrome(s1));
		System.out.println(s2 + ":\t" + isPalindrome(s2));
		System.out.println(s3 + ":\t" + isPalindrome(s3));
		
	}// end main
	
}// end class MyStackDriver