import java.io.*;
import java.util.*;

/*

Hunter CS Program
BSTree() Class
Jonathan Swotinsky

Task: Create a Binary Search Tree class.

Methods to Consider:
1) Search
2) Insert
3) Delete
4) Traverse/Print

*/


public class BSTree{
    
	////////////////////Instance Variables////////////////////
	
	private TreeNode root;
	private int depth;
	private	Stack<TreeNode> junctionStack; 

    
	////////////////////Constructors////////////////////
	
	public BSTree(){
		this.root = null;
		this.depth = 0;
		this.junctionStack = new Stack<TreeNode>();
    }// end constructor

    
	////////////////////Methods////////////////////
	
	public int getDepth(){
		return this.depth;
	}// end getDepth
	
	
	public void seed(){
		TreeNode t;
	
		t = new TreeNode(10);
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
		
	}// end seed

	
	/*
	New strategy for search() method:
	
	(1) Create an empty junction stack.
	
	(2) Check the current TreeNode.  If the value of the current TreeNode is the key, return true.  
		Otherwise, do the following:
	
	(3) Check if the current TreeNode is a junction (e.g. if it has both a left and a right TreeNode).
		If the current TreeNode is a junction, add it to the junction stack.  
		If the current TreeNode is not a junction, do not add it to the junction stack.

	(4) If the current node has a left node, proceed to the left node.  
		If the current node has a right node only, proceed to the right node.  
		If the current node is a dead end, proceed to the last element of the junction stack's right node and pop it off the stack.
		
	(5) Continue until both of the following conditions are met:
		The current node is a dead end, and
		The junction stack is empty
	
	(6) If the method has not yet returned true, return false.
	
	Additional Thoughts: 	Does this need recursion?
							Does this need an overloaded method?
	
	*/
	
	
	public boolean search(int key){
		
		// Point current to the root:
		TreeNode current = root;
		
		// Check if the current TreeNode is equal to the key.  If it is, return "true":
		if(current.getValue() == key){
			return true;
		}// end if
		
		// If the key is less than the value of the current TreeNode, 
		// and there is a nextLeft TreeNode to check, then recursively invoke
		// search on the left TreeNode:
		if(key <= current.getValue() && current.getNextLeft() != null){
			return search(key, current.getNextLeft());	
		// If the key is greater than the value of the current TreeNode, 
		// and there is a nextRight TreeNode to check, then recursively invoke
		// search on the right TreeNode:
		} else if(key >= current.getValue() && current.getNextRight() != null){
			return search(key, current.getNextRight());	
		// If there are no appropriate TreeNodes to, return false:
		} else {
			return false;
		}// end if else
	
	}// end search() (1 parameter)
	
	
	public boolean search(int key, TreeNode current){
		
		// Check if the current TreeNode is equal to the key.  If it is, return "true":
		if(current.getValue() == key){
			return true;
		}// end if
		
		// If the key is less than the value of the current TreeNode, 
		// and there is a nextLeft TreeNode to check, then recursively invoke
		// search on the left TreeNode:
		if(key <= current.getValue() && current.getNextLeft() != null){
			return search(key, current.getNextLeft());	
		// If the key is greater than the value of the current TreeNode, 
		// and there is a nextRight TreeNode to check, then recursively invoke
		// search on the right TreeNode:
		} else if(key >= current.getValue() && current.getNextRight() != null){
			return search(key, current.getNextRight());	
		// If there are no appropriate TreeNodes to, return false:
		} else {
			return false;
		}// end if else
	
	}// end search() (2 parameters)


	public boolean searchAnyTree(int key){
		
		// Point current to the root:
		TreeNode current = root;
		
		// Check if the root is equal to the key.  If it is, return "true":
		if(current.getValue() == key){
			return true;
		}// end if
		
		// Check if the current TreeNode is a junction.  If it is, push it onto junctionStack:
		if(current.getNextLeft() != null && current.getNextRight() != null){
			junctionStack.push(current);
		}// end if
				
		// If the current TreeNode has a left TreeNode, recursively invoke search on the left TreeNode:
		if(current.getNextLeft() != null){
			return searchAnyTree(key, current.getNextLeft());
		// If the current TreeNode has a right TreeNode, but no left TreeNode, recursively invoke search on the right TreeNode:
		} else if(current.getNextLeft() == null && current.getNextRight() != null){
			return searchAnyTree(key, current.getNextRight());
		// If the current TreeNode is a dead-end, and junctionStack is non-empty, 
		// pop off it's top element and recursively invoke search on it's right TreeNode:
		} else if(current.getNextLeft() == null && current.getNextRight() == null && junctionStack.size() >= 1) {
			TreeNode lastJunction = junctionStack.pop();
			return searchAnyTree(key, lastJunction.getNextRight());
		// If the current TreeNode is a dead-end, and the junction stack is empty, return false:
		} else {
			return false;	
		}// end if else	
			
	}// end searchAnyTree() (1 parameter)
	
	
	public boolean searchAnyTree(int key, TreeNode current){
		
		// Check if the current TreeNode is equal to the key.  If it is, return "true":
		if(current.getValue() == key){
			return true;
		}// end if
		
		// Check if the current TreeNode is a junction.  If it is, push it onto junctionStack:
		if(current.getNextLeft() != null && current.getNextRight() != null){
			junctionStack.push(current);
		}// end if
		
		// If the current TreeNode has a left TreeNode, recursively invoke search on the left TreeNode:
		if(current.getNextLeft() != null){
			return searchAnyTree(key, current.getNextLeft());
		// If the current TreeNode has a right TreeNode, but no left TreeNode, recursively invoke search on the right TreeNode:
		} else if(current.getNextLeft() == null && current.getNextRight() != null){
			return searchAnyTree(key, current.getNextRight());
		// If the current TreeNode is a dead-end, and junctionStack is non-empty, 
		// pop off it's top element and recursively invoke search on it's right TreeNode:
		} else if(current.getNextLeft() == null && current.getNextRight() == null && junctionStack.size() >= 1) {
			TreeNode lastJunction = junctionStack.pop();
			return searchAnyTree(key, lastJunction.getNextRight());
		// If the current TreeNode is a dead-end, and the junction stack is empty, return false:
		} else {
			return false;	
		}// end if else
	
}// end searchAnyTree() (2 parameters)


	// Generate an array of values to fill a full binary search tree of a given depth (Values ONLY...No actual tree):
	public int[] randomTree(int depth){
		// Create a Random object:
		Random random = new Random();		
		// Generate an array sized to hold the values that will fill the tree
		int arraySize = 0;
		for(int i = 0; i <= depth; i++){
			arraySize += Math.pow(2,i);
		}// end for i
		int[] treeValues = new int[arraySize];
		
		// Fill the array with random values between 0 and 99:
		for(int i = 0; i <= treeValues.length - 1; i++){
			treeValues[i] = random.nextInt(100);
		}// end for i
		
		//Sort the array from least to greatest:
		Arrays.sort(treeValues);		
		return treeValues;		
	}// end randomTree	
	
	
	
	// Print a full binary search tree with random values up to a depth of 3 (Image ONLY...No actual tree):
	public void printTree(){
		int[] a = randomTree(3);
		System.out.println();
		System.out.println("The values in the tree will be:\t" + Arrays.toString(a) + "\n");
		System.out.printf("                            %02d\n",a[7]);
		System.out.println("                     ______/  \\______"); 
		System.out.println("              ______/                \\______"); 
		System.out.println("             /                              \\");  
		System.out.printf("            %02d                              %02d\n",a[3],a[11]);
		System.out.println("         __/  \\__                        __/  \\__"); 
		System.out.println("      __/        \\__                  __/        \\__"); 
		System.out.println("     /              \\                /              \\");  
		System.out.printf("    %02d              %02d              %02d              %02d\n",a[1],a[5],a[9],a[13]);
		System.out.println("   /  \\            /  \\            /  \\            /  \\"); 
		System.out.println("  /    \\          /    \\          /    \\          /    \\"); 
		System.out.println(" /      \\        /      \\        /      \\        /      \\");   
		System.out.printf("%02d      %02d      %02d      %02d      %02d      %02d      %02d      %02d",a[0],a[2],a[4],a[6],a[8],a[10],a[12],a[14]);
	}
	
}// end LList class