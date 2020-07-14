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
	
	
	public static String reverseWords(String s1){
	
	// Next Steps: Either truncate all spaces at the beginning and end of s1, or throw an exception if there are spaces at the beginning or end of s1:
	
	// Instantiate a new Stack<String> object and assign it to stack:
		Stack<String> stack = new Stack<String>();
	
	// Break s1 into individual words, and push each word to stack:
		//Generate a whitespace in position 0 of the following String:
		String whiteSpace = " ";
		//Keep track of the position relative to the original String:
		int position = 0;
		//Keep track of the number of Strings in the Stack:
		int stringCounter = 0;
		String s2;
		while(position <= s1.length() - 1){
			s2 = "";
			// Construct each word:
			while(position <= s1.length() - 1 && s1.charAt(position) != whiteSpace.charAt(0)){
				s2 = s2 + s1.charAt(position);
				position++;
			}// end nested while
			// Push each word to stack, followed by the string, " ", as a seperator:
			stack.push(s2);
			stringCounter++;
			stack.push(" ");
			stringCounter++;
			position++;
		}// end while
		String s3 = "";
		// pop the string, " ", from the top of stack:
		stack.pop();
		// Construct a new String by popping the remaining values from stack:
		for(int i = 0; i <= stringCounter - 2; i++){
			s3 = s3 + stack.pop();
		}// end for i
		// Return stack as a string:
		return s3;	
	}// end reverseWords
	
	
	public static boolean isPalindrome(String s1){
		String s2 = reverse(s1);
		return s1.equals(s2);
	}// end isPalindrome
	
	
	public static boolean isPalindromeWords(String s1){
		String s2 = reverseWords(s1);
		return s1.equals(s2);
	}// end isPalindromeWords
		
	
	public static void main(String[] args) {
		System.out.println();
		
		//Test for reverse() method:
		System.out.println("Test for reverse() method:");
		String s = "I am a string!";
		System.out.println("The reverse of \"" + s + "\" is:\t \"" + reverse(s) + "\""); 
		System.out.println();
		
		
		//Test for isPalindrome() method:
		System.out.println("Test for isPalindrome() method:");
		String s1 = "racecar";
		String s2 = "able was i ere i saw elba";
		String s3 = "Hello, World!";
		System.out.println(s1 + ":\t" + isPalindrome(s1));
		System.out.println(s2 + ":\t" + isPalindrome(s2));
		System.out.println(s3 + ":\t" + isPalindrome(s3));
		System.out.println();
		
		
		//Test for reverseWords() method:
		System.out.println("Test for reverseWords() method:");
		String s4 = "I am what am I";
		String s5 = "Make it so";
		System.out.println("The reverse of \"" + s4 + "\" is:\t \"" + reverseWords(s4) + "\"");
		System.out.println("The reverse of \"" + s5 + "\" is:\t \"" + reverseWords(s5) + "\"");
		System.out.println();
		
		
		//Test for isPalindromeWords() method:
		System.out.println("Test for isPalindromeWords() method:");
		String s6 = "I am what am I";
		String s7 = "Make it so";
		System.out.println(s6 + ":\t" + isPalindromeWords(s6));
		System.out.println(s7 + ":\t" + isPalindromeWords(s7));
		System.out.println();
		
		
	}// end main
	
}// end class MyStackDriver