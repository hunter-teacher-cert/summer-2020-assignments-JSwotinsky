import java.io.*;
import java.util.*;

/*

Hunter CS Program
Exception Driver for LList Class (With Throwing Exceptions)
Jonathan Swotinsky


RUBBER-MEETS-THE-ROAD-TASK (Day 7):

Augment your linked list class so that it throws Exceptions where appropriate:
1. IllegalArgumentException.
2. IndexOutOfBoundsException.
3. NoSuchElementException.

*/


public class ExceptionDriver {
	public static void main(String[] args){
		//Some Notes About Exceptions:
		
		//int[] a = new int[5];
		
		//The next line of code will result in a runtime error (ArrayIndexOutOfBoundsException: Inded 10 out of bounds for length 5).
		//a[10] = 100;	

		//The next line of code will result in a runtime error (ArithmeticException: / by 0).
		//System.out.println(4 / 0);
		
		//The next line of code will result in a runtime error (ArithmeticException: / by 0).
		//System.out.println(4 % 0);
		
		//The next 2 lines of code will result in a compile time error because n has not yet been instantiated.
		//Node n;
		//n.setData("Hello");
		
		//Lines 23 and 24 will result in a runtime error (NullPointerException) because n is not actually pointing to any object.
		//Note: The use of the assignment operator convinces the compiler that n will be instantiated.
		//Node n = null;
		//n.setData("hello");
		
		//The next 3 lines of code will not result in an exception, but if we wanted them to, we would need to throw an exception.
		LList g = new LList();
		g.addFront("No Problem!");
		System.out.println(g);
		g.addFront(null); // This line will throw the exception that has been written in the addFront() method of the LList() class.
		System.out.println(g);
		
	}// end main
	
}// end ExceptionDriver class