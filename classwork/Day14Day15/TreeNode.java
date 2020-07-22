import java.io.*;
import java.util.*;

/*

Hunter CS Program
TreeNode Class
Jonathan Swotinsky

Task: 
Create a class for TreeNode

*/


public class TreeNode{
	
	////////////////////Instance Variables////////////////////
	
	private int value;
	private TreeNode nextLeft;
	private TreeNode nextRight;
	private TreeNode parent;
	
	////////////////////Constructors////////////////////
	
	public TreeNode(int value, TreeNode nextLeft, TreeNode nextRight){
		this.value = value;
		this.nextLeft = nextLeft;
		this.nextRight = nextRight;
	}// end constructor with data and next parameters
	
	
	public TreeNode(int value){
		this(value, null, null);
	}// end constructor with data parameter only
	
	
	public TreeNode(){
		this(0);
	}// end constructor with no parameters
	
	
	////////////////////Methods////////////////////
	
	public void setValue(int value){
		this.value = value;
	}// end setValue
	
	
	private void setParent(TreeNode parent){
		this.parent = parent;
	}// end setParent

	
	public void setNextLeft(TreeNode nextLeft){
		this.nextLeft = nextLeft;
		this.nextLeft.setParent(this);
	}// end setNextLeft
	
	
	public void setNextRight(TreeNode nextRight){
		this.nextRight = nextRight;
		this.nextRight.setParent(this);
	}// end setNextRight
	
	
	public int getValue(){
		return this.value;		
	}// end getValue


	public TreeNode getNextLeft(){
		return nextLeft;
	}// end getNextLeft

	
	public TreeNode getNextRight(){
		return nextRight;
	}// end getNextRight
	
	
	public TreeNode getParent(){
		return parent;
	}// end getNextRight
	
	
	public String toString(){
		return Integer.toString(this.value);
	}// end toString
	
	
}// end TreeNode class