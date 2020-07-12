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
		
		
		//Test for IllegalArgumentException():
		
		System.out.println("\nTest for IllegalArgumentException():\n");
		LList g = new LList();
		System.out.print("Adding \"No Problem!\" to LList: \t");
		g.addFront("No Problem!");
		System.out.println(g);
		System.out.print("\nAdding null to LList: \t");
		g.addFront(null); // This line will throw the exception that has been written in the addFront() method of the LList() class.
		System.out.println(g);
		
		
		
		//Test for IndexOutOfBoundsException() in get() method:
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in get() method:\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to get element at index 2: \t");
		System.out.println(g.get(2));
		System.out.println();
		System.out.print("Attempt to get element at index 4: \t");
		System.out.println(g.get(4)); // This line will throw the exception that has been written in the get() method of the LList() class.
		*/	
		
		
		//Test for IndexOutOfBoundsException() in get() method (if index is negative):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in get() method (if index is negative):\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to get element at index 2: \t");
		System.out.println(g.get(2));
		System.out.println();
		System.out.print("Attempt to get element at index -1: \t");
		System.out.println(g.get(-1)); // This line will throw the exception that has been written in the get() method of the LList() class.
		*/	
		
		
		//Test for IndexOutOfBoundsException() in get() method (if LList is empty):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in get() method (if LList is empty):\n");
		LList g = new LList();
		System.out.print("Empty LList: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to get element at index 0: \t");
		System.out.println(g.get(0));
		*/
		
		
		//Test for IndexOutOfBoundsException() in set() method:
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in set() method:\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to set element at index 2: \t");
		g.set(2, "New Element");
		System.out.println(g + "\n");
		System.out.print("Attempt to set element at index 4: \t");
		g.set(4, "New Element"); // This line will throw the exception that has been written in the set() method of the LList() class.
		System.out.println(g);
		*/	
		
		
		//Test for IndexOutOfBoundsException() in set() method (if index is negative):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in set() method (if index is negative):\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to set element at index 2: \t");
		g.set(2, "New Element");
		System.out.println(g + "\n");
		System.out.print("Attempt to set element at index -1: \t");
		g.set(-1, "New Element"); // This line will throw the exception that has been written in the set() method of the LList() class.
		System.out.println(g);
		*/			
		
	
		//Test for IndexOutOfBoundsException() in set() method (if LList is empty):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in set() method (if LList is empty):\n");
		LList g = new LList();
		System.out.print("Empty LList: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to set element at index 0: \t");
		g.set(0, "New Element");
		System.out.println(g);
		*/
	
		
		//Test for IndexOutOfBoundsException() in insert() method:
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in insert() method:\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to insert a new element at index 2: \t");
		g.insert(2, "New Element");
		System.out.println(g + "\n");
		System.out.print("Attempt to insert a new element at index 5: \t");
		g.insert(5, "New Element"); // This line will throw the exception that has been written in the insert() method of the LList() class.
		System.out.println(g);
		*/
		
		
		//Test for IndexOutOfBoundsException() in insert() method (if index is negative):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in insert() method (if index is negative):\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to insert a new element at index 2: \t");
		g.insert(2, "New Element");
		System.out.println(g + "\n");
		System.out.print("Attempt to insert a new element at index -1: \t");
		g.insert(-1, "New Element"); // This line will throw the exception that has been written in the insert() method of the LList() class.
		System.out.println(g);
		*/
		
		
		//Test for IndexOutOfBoundsException() in insert() method (if LList is empty):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in insert() method (if LList is empty):\n");
		LList g = new LList();
		System.out.print("Empty LList: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to insert element at index 0: \t");
		g.insert(0, "New Element");
		System.out.println(g);
		*/
	
		
		//Test for IndexOutOfBoundsException() in remove() method:
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in remove() method:\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to remove the element at index 2: \t");
		g.remove(2);
		System.out.println(g + "\n");
		System.out.print("Attempt to remove the element at index 3: \t");
		g.remove(3); // This line will throw the exception that has been written in the remove() method of the LList() class.
		System.out.println(g);
		*/
		
		
		//Test for IndexOutOfBoundsException() in remove() method (if index is negative):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in remove() method (if index is negative):\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to remove the element at index 2: \t");
		g.remove(2);
		System.out.println(g + "\n");
		System.out.print("Attempt to remove the element at index -1: \t");
		g.remove(-1); // This line will throw the exception that has been written in the remove() method of the LList() class.
		System.out.println(g);
		*/
		
		
		//Test for IndexOutOfBoundsException() in remove() method (if LList is empty):
		/*
		System.out.println("\nTest for IndexOutOfBoundsException() in remove() method (if LList is empty):\n");
		LList g = new LList();
		System.out.print("Empty LList: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to remove the element at index 0: \t");
		g.remove(0);
		System.out.println(g);
		*/
		
		
		//Test for NoSuchElementException() in search() method:
		/*
		System.out.println("\nTest for NoSuchElementException() in search() method:\n");
		LList g = new LList();
		g.addFront("d");
		g.addFront("c");
		g.addFront("b");
		g.addFront("a");
		System.out.print("LList with 4 elements: \t");
		System.out.println(g);
		System.out.println();
		System.out.print("Attempt to search for \"b\": \t");
		System.out.println(g.search("b"));
		System.out.println();
		System.out.print("Attempt to search for \"e\": \t");
		System.out.println(g.search("e")); // This line will throw the exception that has been written in the search() method of the LList() class.
		*/
	
	
	}// end main
	
}// end ExceptionDriver class