import java.io.*;
import java.util.*;

/*

Hunter CS Program
MyStackDriver 
Jonathan Swotinsky

Task:
Develop a driver for MyStack.
When developing your driver, try to keep it small, just large enough to ensure you've testing the functionality of your stack well.

*/


public class MyStackDriver {
	
	public static void main(String[] args) {

	MyStack stack = new MyStack();
	
	// Test MyStack() constructor:
	System.out.println("\nTest for MyStack() constructor:");
	System.out.println(stack);
	System.out.println();
	
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

	// Test for MyStack pop() method:
	System.out.println("Test for MyStack() pop() method:");
	System.out.println("Current state of stack: " + stack);
	String s = stack.pop();
	System.out.println("Stack state after pop(): " + stack + "\t" + "Element returned: " + s);
	System.out.println();
	
	
	
	
	
	
	}// end main
	
}// end class MyStackDriver