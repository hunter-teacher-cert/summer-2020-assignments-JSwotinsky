import java.io.*;
import java.util.*;

/*

Hunter CS Program
Tree Node Class
Jonathan Swotinsky

Task: 
Create a class for TreeNode

*/


public class TreeNode{
	
	////////////////////Instance Variables////////////////////
	
	private String name;
	private TreeNode nextLeft;
	private TreeNode nextRight;
	
	
	////////////////////Constructors////////////////////
	
	public TreeNode(String data, TreeNode nextLeft, TreeNode nextRight){
		this.name = data;
		this.nextLeft = nextLeft;
		this.nextRight = nextRight;
	}// end constructor with data and next parameters
	
	
	public TreeNode(String data){
		this.name = data;
		this.nextLeft = null;
		this.nextRight = null;
	}// end constructor with data parameter only
	
	
	public TreeNode(){
		this.name = "";
		this.nextLeft = null;
		this.nextRight = null;
	}// end constructor with no parameters
	
	
	////////////////////Methods////////////////////
	
	public void setData(String data){
		this.name = data;
	}// end setData
	
	
	public void setNextLeft(TreeNode nextLeft){
		this.nextLeft = nextLeft;
	}// end setNextLeft
	
	
	public void setNextRight(TreeNode nextRight){
		this.nextRight = nextRight;
	}// end setNextRight
	
	
	public String getData(){
		return this.name;		
	}// end getData


	public TreeNode getNextLeft(){
		return nextLeft;
	}// end getNextLeft

	
	public TreeNode getNextRight(){
		return nextRight;
	}// end getNextRight
	
	
	public String toString(){
		return this.name;
	}// end toString

	
}// end TreeNode class