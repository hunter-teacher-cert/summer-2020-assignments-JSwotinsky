import java.io.*;
import java.util.*;

/*

Hunter CS Program
LList Class (With Throwing Exceptions)
Jonathan Swotinsky


RUBBER-MEETS-THE-ROAD-TASK (Day 7):

Augment your linked list class so that it throws Exceptions where appropriate:
1. IllegalArgumentException.
2. IndexOutOfBoundsException.
3. NoSuchElementException.

*/


/*

Hunter CS Program
LList Class
Jonathan Swotinsky

Task: Create a class for LList

When developing this class, a little planning and preparation goes a long way. 
Try writing out an algorithm before diving into code. Diagram if that will help.
Once you've written a method, use diagrams to follow along and "debug"
Starting with the Node and LList classes developed in class today, augment LList class with the following methods:

Default constructor 
Initializes an empty linked list.

public String toString()  
Returns a String representation of the list.

public void addFront(String value)  
Add a new Node containing value to the front of the list.

public boolean isEmpty()
Returns true if the list is empty, false otherwise.

public String get(int index)
Returns the value (not the Node) at index.
If index is out of bounds, return null.

public void set(int index, String value)
Set the Node at index to contain value
If index is invalid, do nothing.

public void insert(int index, String value)
Insert a new Node containing value at index.
If index is invalid, do nothing.

public int search(String key)
Returns the index of the first time key occurs in the list.
Returns -1 if key is not found.

public void remove(int index)
Removes the Node at index from the list.
If index is invalid, do nothing.

If you use the provided driver file (LListDriver.java) your output should look like this:

Test Empty list print & isEmpty:
< >
true

Test addFront 3x & isEmpty():
< everyone! news good >
false

Test get 0, 1, 5:
everyone!
news
null

Test set 0, 1, 5:
< me! job good >

Test insert 0, 2, 5, 10:
< woo! me! go job good cool >

Test search "woo!", "cool", "too far"
0
5
-1

Test remove 0, 2:
< me! go job good cool >
< me! go good cool >

*/


public class LList{
    
	////////////////////Instance Variables////////////////////
	
	private Node head;
	private int length = 0;

    
	////////////////////Constructors////////////////////
	
	public LList(){
		head = null;
    }// end constructor

    
	////////////////////Methods////////////////////
	
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
			throw new IllegalArgumentException();
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
				
				//Instead of return null, throw an index out of bounds exception here.
				
				
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
		
			
			// Throw no such element exception here.	
		
		
		}// end if else
	}// end search


    public void remove(int index){
		Node tmp = head;
		// If the index is zero, remove the first node.
		if(index == 0){
			//Remove the first node.
			head = tmp.getNext();
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
			return;
		}// end if else
	}// end remove 
	
}// end LList class