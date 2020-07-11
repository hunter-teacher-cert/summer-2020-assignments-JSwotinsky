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
	
	System.out.println(stack);
	
	stack.push("a");
	stack.push("b");
	stack.push("c");
	
	System.out.println(stack);
	

	}// end main
	
}// end class MyStackDriver