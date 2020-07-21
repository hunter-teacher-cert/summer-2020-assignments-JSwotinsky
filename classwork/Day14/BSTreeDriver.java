import java.io.*;
import java.util.*;

/*

Hunter CS Program
Driver to test BSTree() class
Jonathan Swotinsky

*/


public class BSTreeDriver {
	
	
	public static void main(String[] args) {
				
		// Test for search() method:
		BSTree tree1 = new BSTree();
		tree1.seed();
		System.out.println("\nTest for search() method:\n");
		System.out.println("10 is an element (This should be true):  " + tree1.search(10));
		System.out.println("5 is an element (This should be true):  " + tree1.search(5));
		System.out.println("20 is an element (This should be true):  " + tree1.search(20));
		System.out.println("8 is an element (This should be true):  " + tree1.search(8));
		System.out.println("15 is an element (This should be true):  " + tree1.search(15));
		System.out.println("22 is an element (This should be true):  " + tree1.search(22));
		System.out.println("99 is an element (This should be false):  " + tree1.search(99));
		System.out.println();
		
		
		// Test for randomTree() and printTree() methods (Visualization only, not an actual tree):
		BSTree tree2 = new BSTree();
		System.out.println("Test for randomTree() and printTree() methods:\n(This prints a visualization only, not an actual tree.)");
		tree2.printTree();
		System.out.println();
		
	}// end main
	
}// end class MyStackDriver