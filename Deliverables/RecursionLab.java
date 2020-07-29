import java.io.*;
import java.util.*;

// Hunter CS Program
// Day 0 Exercises
// Recursion
// Jonathan Swotinsky

// Task:
// 
// 1. Start off with a simple java "Hello world" program. Then add the following methods. Making sure to test each one along the way via print statements inside main. (example program skeleton below all the questions).
// 
// 2. Write a recusive factorial method.
// 
// factorial(n) Should return the value of n!
// Assume that n is a positive integer.
// Mathematically n! = n * (n-1) * (n-2) ... * 1
// 
// Examples:
// factorial(1) ==> 1
// factorial(4) ==> 24
//
// If you would like a skeleton method, you can start here:
// 
// public static int factorial(int n) {
//     return 1;
// }
//
// 3. Write a recursive fibonacci method.
// 
// fib(n) Should return the nth number of the fibonacci series.
// Assume n is a positive integer.
// 
// The fibonacci series is defined as follows.
// n = 1: 1
// n = 2: 1
// n > 2: The sum of the previous 2 fibonacci values.
//
// Examples:
// fib(1) ==> 1
// fib(4) ==> 3 (2 + 1)
// fib(9) ==> 34 (21 + 13)
//
// If you would like a skeleton method, you can start here:
//
// public static int fib(int n) {
//     return 1;
// }
//
// 4. Pause for a moment and write 2 trace diagrams for each of the above methods on a key to success.
// What are some similarities between the 2 traces? What are some differences?
//
// 5. For pre-work 5, there was a recursive ackerman method problme (exercise 8)
// Add your ackerman method here. Feel free to utilize anything you've seen this morning to tune up your code.
// This is partly so that you can have a one stop reference for early recursion problems.
//
// 6. Challenge problem!
// If you're feeling good on recursion, give this a go (if you're not, that's ok, don't struggle here, we'll get to this stuff eventually).
// Write a recursive function that will find the sum of the elements of an integer array.
// 
// If you would like a skeleton method, you can start here:
// public static int recursiveSum(int[] ia) {
//     return 0;
// }
//
// As promised, here's a starter java file if you would like:
//
// import java.io.*;
// import java.util.*;
//
// public class Recursion {
//
//     public static void main(String[] args) {
//         System.out.println("Good News Everyone!");
//         System.out.printf("1! = %d\n", factorial(1) );
//         System.out.printf("fib(1) = %d\n", fib(1) );
//     }
//
//     public static int factorial(int n) {
//         return 1;
//     }
//
//     public static int fib(int n) {
//         return 1;
//     }
// }

public class RecursionLab{
	//Take an integer input, n, and output n factorial.
	public static int factorial(int n) {
		if(n == 0){
			return 1; //0! = 1.  Note: I noticed that this return value could be either 1 or n.  Why is that?  
		} else if (n == 1){
			return 1; //1! = 1.  Note: I noticed that this return value could be either 1 or n.  Why is that?
		} else {		
			n = n*factorial(n-1); //n! = n * (n-1)!
			return n;
		}
	}
	
	//Take an integer input, n, and output the nth Fibonacci number.
	public static int fib (int n) {
		if(n == 1){
			return 1; //The first Fibonacci number is 1.
		} else if (n == 2){
			return 1; //The second Fibonacci number is 1.
		} else {		
			n = fib(n-1) + fib(n-2); //The nth Fibonacci number is the sum of the previous 2 Fibonacci numbers.
			return n;
		}
	}	
	
	// Ackerman function:
	// A(m, n) = n + 1, 				if m = 0.
	// A(m, n) = A(m - 1, 1), 			if m > 0 and n = 0.
	// A(m, n) = A(m - 1, A(m, n - 1)), if m > 0 and n > 0
	public static int ack(int m, int n){
		if(m == 0){			
			return n + 1; 
		} else if((m > 0) && (n == 0)){
			return ack(m - 1, 1); 
		} else {
			return ack(m - 1, ack(m, n - 1));
		} 
	}
	
	//Use recursion to find the sum of all elements in an array.
	public static int[] recursiveSum(int[] myArray) {
		
		//If there is only one element in myArray, return myArray
		if(myArray.length == 1){
			return myArray;
		} else {
			//Replace the last element of myArray with the sum of the last two elements of the array.
			myArray[myArray.length - 2] = myArray[myArray.length - 2] + myArray[myArray.length - 1];
		
			//Create a copy of myArray.
			int[] copyOfMyArray = new int[myArray.length];
			for(int i = 0; i <= myArray.length - 1; i++){
				copyOfMyArray[i] = myArray[i];		
			}
						
			//Use copyOfmyArray to recreate myArray with the last element removed.
			myArray = new int[myArray.length - 1];
			for(int i = 0; i <= myArray.length - 1; i++){
				myArray[i] = copyOfMyArray[i];		
			}
			//Recursive step.
			return recursiveSum(myArray);
		}
	}
	
	public static void main(String[] args){
		//Check factorial and fib methods for k = 1 through k = 10.
		System.out.println("\nCheck for factorial and Fibonacci methods: \n");
		for(int k = 1; k <= 10; k++){
			//Check for factorial method.
			System.out.printf("%d! = ",k);
			System.out.print(factorial(k));
			System.out.print("\t");
			//Check for fib method.
			System.out.printf("The %dth Fibonacci number is ",k);
			System.out.println(fib(k));
		}
		
		//Check for Ackerman function
		System.out.println("\nCheck for Ackerman function method: \n");
		System.out.println(ack(3,4));
		
		//Check for recursive sum method
		System.out.println("\nCheck for recursive sum method:\n");
		int[] myArray = {9,13,27,2,19,5,21,8};
		System.out.println(recursiveSum(myArray)[0]);
	}
}

// Trace Diagram for factorial(5):
// 5! = 5 * 4!
// 5! = 5 * 4 * 3!
// 5! = 5 * 4 * 3 * 2!
// 5! = 5 * 4 * 2 * 2 * 1!
// 5! = 5 * 4 * 3 * 2 * 1
// 5! = 120

// Trace Diagram for fib(5):
// F(5) = F(4) + F(3)
// F(5) = F(3) + F(2) + F(2) + F(1)
// F(5) = F(2)+ F(1) + 1 + 1 + 1
// F(5) = 1 + 1 + 1 + 1 + 1
// F(5) = 5 

// Similarities between the trace diagrams above:
// Both diagrams "expand" from the top line working downward

// Differences between the trace diagrams above:
// The trace diagram for factorial "expands" by one term at a time.  From the first line to the second line of the trace diagram for fib, both terms "expand"