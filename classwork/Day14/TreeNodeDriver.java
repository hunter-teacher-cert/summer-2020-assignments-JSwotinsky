import java.io.*;
import java.util.*;

/*

Hunter CS Program
Driver to test TreeNode() class
Jonathan Swotinsky

*/


public class TreeNodeDriver {
	
	public static void main(String[] args) {
		TreeNode t;
	
		t = new TreeNode(10);
		TreeNode root = new TreeNode();
		root = t;
		t = new TreeNode(5);
		root.setNextLeft(t);
		t = new TreeNode(20);
		root.setNextRight(t);
	
		root.getNextLeft().setNextRight(new TreeNode(8));
		
		t = new TreeNode(15);
		root.getNextRight().setNextLeft(t);
		
		t = new TreeNode(22);
		root.getNextRight().setNextRight(t);
		
		System.out.println(t.getParent().getValue());
	
	}// end main
	
}// end class MyStackDriver