import java.io.*;
import java.util.*;

/*

Hunter CS Program
BSTree() Class
Jonathan Swotinsky

Task: Create a class for BSTree()

*/


public class BSTree{
    
	////////////////////Instance Variables////////////////////
	
	private TreeNode root;
	private int depth = 0;

    
	////////////////////Constructors////////////////////
	
	public MyTree(){
		root = null;
    }// end constructor

    
	////////////////////Methods////////////////////
	
	public int getDepth(){
		return this.depth;
	}// end getDepth
	
	public String toString(){
		String s = "";
		Node tmp = head; // tmp and head are now aliases.
		while (tmp != null){
			s = s + tmp.getData()+"-->";
			tmp = tmp.getNext();
		}// end while
		s = s + "null";
		return s;
	}// end toString
	
		
	public void addFront(String data){		
		// If the value of data in a node is set to null, throw an illegal argument exception.
		if (data == null){
			throw new IllegalArgumentException("Name variable cannot be set to null!");
		}// exception
		// Create a new node and populate it with a name.
		Node newNode = new Node(data);
		// Point the new node to head.
		newNode.setNext(head);
		// Point head to the new node.
		head = newNode;
		//increment length by 1.
		length++;
    }// end addFront

    
	public boolean isEmpty(){
		return this.length == 0;
	}// end isEmpty


	public String get(int index){
		Node tmp = head;
		// Traverse through LList until the index has been reached.
		while(index != 0){
			// If the last element of LList is reached before the index has been reached, return null.
			if(tmp.getNext() == null){
				return null;
			// Otherwise, move forward to the next element in the LList and decrement the index by 1.
			} else {
				tmp = tmp.getNext();
				index--;
			}// end if else
		}// end while
		//Return the value of data at the index.
		return tmp.getData();
	}// end get
	

	public void set(int index, String value){
		Node tmp = head;
		// Traverse through LList until the index has been reached.
		while(index != 0){
			// If the last element of LList is reached before the index has been reached, return null.
			if(tmp.getNext() == null){
				return;
			// Otherwise, move forward to the next element in the LList and decrement the index by 1.
			} else {
				tmp = tmp.getNext();
				index--;
			}// end if else
		}// end while
		//Overwrite the current value of name with the value passed in the argument.
		tmp.setData(value);		
	}// end set
	
	
	public void insert(int index, String value){
		Node tmp = head;
		// If the index is 0, add a new node to the front of LList.
		if (index == 0){
			addFront(value);
			return;
		} else {
			// Traverse through LList until the index has been reached.
			while(index != 1){
				// If the last element of LList is reached before the index has been reached, return null.
				if(tmp.getNext() == null){
					return;
				// Otherwise, move forward to the next element in LList and decrement the index by 1.
				} else {
					tmp = tmp.getNext();
					index--;
				}// end if else
			}// end while
			// Add a new node
			Node newNode = new Node();			
			// Set the new node's name value to the value passed in the argument.
			newNode.setData(value);
			// Point the new node to the node after tmp.
			newNode.setNext(tmp.getNext());
			// Point tmp to the new node.
			tmp.setNext(newNode);
			// Increase the length of LList by 1.
			length++;
			return;
		}// end if else	
	}// end insert
		

	public int search(String key){
		Node tmp = head;
		// Traverse through LList until the key has been located.  
		// If the key is located in any elements (except for the last element), return the index of the key.
		int index = 0;
		while(tmp.getNext() != null){
			//If the key has been located, return the index of the key.
			if(tmp.getData().equals(key)){
				return index;
			//If the key has not been located, move forward to the next element in LList.
			} else {
				tmp = tmp.getNext();
				index++;
			}// end if else
		} // end while
		// If the key is located in the last element, return the index of the key.
		if(tmp.getData().equals(key)){
			return index;
		// If the key is not located in the last element, return -1.
		} else {
			return -1;	
		}// end if else
	}// end search


    public void remove(int index){
		Node tmp = head;
		// If the index is zero, remove the first node.
		if(index == 0){
			//Remove the first node.
			head = tmp.getNext();
			length--;
			return;
		} else {
			// Traverse through LList until the element before the index has been reached.
			while(index != 1){
				// If the last element of LList is reached before the index has been reached, return null.
				if(tmp.getNext() == null){
					return;
				// Move forward to the next element in LList and decrement the index by 1.
				} else {
					tmp = tmp.getNext();
					index--;
				}// end if else
			}// end while			
			// Point tmp to the node after the next node.
			tmp.setNext(tmp.getNext().getNext());
			length--;
			return;
		}// end if else
	}// end remove 
	
	
}// end LList class