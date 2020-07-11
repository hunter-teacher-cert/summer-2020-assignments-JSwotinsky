import java.io.*;
import java.util.*;

/*

Hunter CS Program
MyStack Class 
Jonathan Swotinsky

Task:
A stack is a data structure that stores data in a "last in first out" manner. 
That is, you add items one at a time and then the last item you added is the first one you remove.
For example, if you first add "A", then "B", and then finally "C", then the first item you remove would be "C", then "B", then finally "A."

The traditional operations on a stack are:
push - add an item to the top of the stack (Psuedocode Example: push "A")
pop	- remove and return the item on the top of the stack (Psuedocode Example: pop)
top	- return but don't remove the item from the top of the stack (Pseudocode Example: top)

We can represent a Stack using an existing Java collection. The class should contain another data structure to store:
-The items added and removed from the stack, and
-Methods implementing the core operations.

Your task is to create a class that represents a stack data structure.

It should be named MyStack. Choose one of our data structures to hold the stack data: 
SuperArray, LList, Java's built-in ArrayList, Java's built in LinkedList, or custom code something else.

The data should be stored using the stack semantics described above (see below for suggested code skeleton with comments).
You should also write a driver file that tests the features of MyStack.
For the previous few assignments, we've provided a Driver file with specific tests. 
When developing your driver, try to keep it small, just large enough to ensure you've testing the functionality of your stack well.

Make sensible decision for situations that could result in an error and feel free to add methods as needed.

*/


public class MyStack {
	
	////////////////////Instance Variables////////////////////
	
	private LList stack;
    
	////////////////////Constructors////////////////////
	
	public MyStack(){
		this.stack = new LList();
    }// end constructor

    
	////////////////////Methods////////////////////
	
	public void push(String data){
		// Push data onto the stack.
		stack.addFront(data);		
    }// end push


    public String pop(){
		// Store the first element in the stack in a variable.
		String s = stack.get(0);
		// Remove the first element from the stack.
        stack.remove(0);
		// Return the first element.
		return s;
    }// end pop


    public String top(){
		// Return the first element in the stack but do now remove it.
		return stack.get(0);
	}// end top


	public boolean isEmpty(){
		// Return true if the stack has no data.  Otherwise, return false.
		return stack.getLength() == 0;
	 }// end isEmpty


	public int size(){
		// Return the number of items in the stack.
		return stack.getLength();	
	}// end size


	public String toString(){
		return stack.toString();
	}// end toString

}// end myStack class