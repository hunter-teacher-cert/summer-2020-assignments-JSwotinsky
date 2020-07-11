import java.io.*;
import java.util.*;

/*

Hunter CS Program
Node Class
Jonathan Swotinsky

Task: 
Create a class for Node

*/


public class Node{
	
	////////////////////Instance Variables////////////////////
	
	private String name;
	private Node next;
	
	
	////////////////////Constructors////////////////////
	
	public Node(String data, Node next){
		this.name = data;
		this.next = next;
	}// end constructor with data and next parameters
	
	
	public Node(String data){
		this.name = data;
		this.next = null;
	}// end constructor with data parameter only
	
	
	public Node(){
		this.name = "";
		this.next = null;
	}// end constructor with no parameters
	
	
	////////////////////Methods////////////////////
	
	public void setData(String data){
		this.name = data;
	}// end setData
	
	
	public void setNext(Node next){
		this.next = next;
	}// end setNext
	
	
	public String getData(){
		return this.name;		
	}// end getData


	public Node getNext(){
		return next;
	}// end getNext

	
	public String toString(){
		return this.name;
	}// end toString

	
}// end Node class