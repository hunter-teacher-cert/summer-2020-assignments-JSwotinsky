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
		System.out.println("10 is an element (This should be true):  " + tree1.searchAnyTree(10));
		System.out.println("5 is an element (This should be true):  " + tree1.searchAnyTree(5));
		System.out.println("99 is an element (This should be false):  " + tree1.searchAnyTree(17));
		System.out.println("8 is an element (This should be true):  " + tree1.searchAnyTree(8));
		System.out.println("15 is an element (This should be true):  " + tree1.searchAnyTree(15));
		System.out.println("22 is an element (This should be true):  " + tree1.searchAnyTree(22));
		System.out.println("20 is an element (This should be true):  " + tree1.searchAnyTree(20));
		System.out.println();
		
		
		// Test for searchAnyTree() method:
		BSTree tree2 = new BSTree();
		tree2.seed();
		System.out.println("\nTest for searchAnyTree() method:\n");
		System.out.println("10 is an element (This should be true):  " + tree2.searchAnyTree(10));
		System.out.println("5 is an element (This should be true):  " + tree2.searchAnyTree(5));
		System.out.println("20 is an element (This should be true):  " + tree2.searchAnyTree(20));
		System.out.println("8 is an element (This should be true):  " + tree2.searchAnyTree(8));
		System.out.println("15 is an element (This should be true):  " + tree2.searchAnyTree(15));
		System.out.println("22 is an element (This should be true):  " + tree2.searchAnyTree(22));
		System.out.println("99 is an element (This should be false):  " + tree2.searchAnyTree(17));
		System.out.println();
		
		
		// Test for insert() method:
		System.out.println("\nTest for insert() method:\n");
		tree2.insert(10);
		tree2.insert(17);
		tree2.insert(17);
		tree2.insert(99);
		System.out.println();
		
		
		// Test for randomTree() and printTree() methods (Visualization only, not an actual tree):
		BSTree tree3 = new BSTree();
		System.out.println("Test for randomTree() and printTree() methods:\n(This prints a visualization only, not an actual tree.)");
		tree3.printTree();
		System.out.println();
		
	}// end main
	
}// end class MyStackDriver