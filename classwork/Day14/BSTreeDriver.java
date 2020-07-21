import java.io.*;
import java.util.*;

/*

Hunter CS Program
Driver to test TreeNode() class
Jonathan Swotinsky

*/


public class BSTreeDriver {
	
	
	public static void main(String[] args) {
		// Test for randomTree() and printTree() methods:
		BSTree tree1 = new BSTree();
		tree1.printTree();
		
		// Test for search() method:
		BSTree tree2 = new BSTree();
		tree2.seed();
		System.out.println(tree2.search(10));
		System.out.println(tree2.search(5));
		System.out.println(tree2.search(20));
		System.out.println(tree2.search(8));
		System.out.println(tree2.search(15));
		System.out.println(tree2.search(22));
		System.out.println(tree2.search(99));
		
	
	}// end main
	
}// end class MyStackDriver