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
		BSTree tree3 = new BSTree();
		tree3.insert(10);
		tree3.insert(20);
		tree3.insert(5);
		tree3.insert(7);
		tree3.insert(8);
		tree3.insert(3);
		tree3.insert(25);
		tree3.insert(25);
		System.out.println();
		
		
		// Test for preOrderTraverse() method:
		System.out.println("\nTest for preOrderTraverse() method:");
		tree3.preOrderTraverse();
		System.out.println();
		
		
		// Test for postOrderTraverse() method:
		System.out.println("\nTest for postOrderTraverse() method:");
		tree3.postOrderTraverse();
		System.out.println();
		
		
		// Test for inOrderTraverse() method:
		System.out.println("\nTest for inOrderTraverse() method:");
		tree3.inOrderTraverse();
		System.out.println("\n");
		
		/*
		// Test for randomTree() and printTree() methods (Visualization only, not an actual tree):
		BSTree tree4 = new BSTree();
		System.out.println("Test for randomTree() and printTree() methods:\n(This prints a visualization only, not an actual tree.)");
		tree4.printTree();
		System.out.println();
		*/
	}// end main
	
}// end class MyStackDriver