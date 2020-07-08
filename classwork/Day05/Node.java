import java.io.*
import java.util.*

public class Node{
	private String name;
	private Node next;
	
	public Node(String data, Node next({
		this.next = next;
		this.data = data;
	}// end constructor with data and next parameters
	
	public Node(String data){
		this.next = null;
		this.data = data;
	}// end constructor with data parameter only
	
	public Node(){
		this.next = null;
		this.data = "";
	}// end constructor with no parameters
	
	public void setData(String data){
		this.data = data;
	}// end setData
	
	public void setNext(String data){
		this.data = data;
	}// end setData
	
	
	public void getData(){
		return data;		
	}// end getData

	public Node getNext(){
		return next;
	}// end getNext
	
	public String toString(){
		return this.data();
	}// end toString
	
}// end Node class