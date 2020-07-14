import java.io.*;
import java.util.*;

/*

Hunter CS Program
MyStackDriver 
Jonathan Swotinsky

Task:
Develop a driver for MyArrayStack.
When developing your driver, try to keep it small, just large enough to ensure you've testing the functionality of your stack well.

*/


public class MyArrayStackDriver {
	
	public static void main(String[] args) {

	MyStack stack = new MyStack();
	
	// Test MyStack() constructor:
	System.out.println("\nTest for MyStack() constructor:");
	System.out.println(stack);
	System.out.println();
		
	// Test 1 for MyStack() size() method:
	System.out.println("Test 1 for MyStack() size() method: " + "\t" + stack.size());	

	
	// Test 1 for MyStack() isEmpty() method:
	System.out.println("Test 1 for MyStack() isEmpty() method: " + "\t" + stack.isEmpty() + "\n");
	
	
	// Test for IndexOutOfBoundsException() in pop() method.
	/*
	stack.pop();
	*/
	
	
	// Test for IndexOutOfBoundsException() in top() method.
	/*
	stack.top();
	*/
	
	
	// Test for IllegalArgumentException() in push() method, inherited from addFront() method in LList() class.
	/*
	stack.push(null);
	*/
	
	
	// Test for MyStack push() method:
	System.out.println("Test for MyStack() push() method:");
	stack.push("f");
	stack.push("e");
	stack.push("d");
	stack.push("c");
	stack.push("b");
	stack.push("a");
	System.out.println(stack);
	System.out.println();

	
	// Test 2 for MyStack() size() method:
	System.out.println("Test 2 for MyStack() size() method: " + "\t" + stack.size());
	
	
	// Test 2 for MyStack() isEmpty() method:
	System.out.println("Test 2 for MyStack() isEmpty() method: " + "\t" + stack.isEmpty() + "\n");


	// Test for MyStack pop() method:
	System.out.println("Test for MyStack() pop() method:");
	System.out.println("Current state of stack: " + stack);
	String s = stack.pop();
	System.out.println("Stack state after pop(): " + stack + "\t" + "Element returned: " + s);
	System.out.println();

	
	// Test 3 for MyStack() size() method (after pop):
	System.out.println("Test 3 for MyStack() size() method (after pop): " + "\t" + stack.size());
	
	
	// Test 3 for MyStack() isEmpty() method (after pop):
	System.out.println("Test 3 for MyStack() isEmpty() method (after pop): " + "\t" + stack.isEmpty() + "\n");

	
	// Test for MyStack top() method:
	System.out.println("Test for MyStack() top() method:");
	System.out.println("Current state of stack: " + stack + "\t" + "Top element in stack: " + stack.top());
	System.out.println();
	
	
	}// end main
	
}// end class MyStackDriver