import java.io.*;
import java.util.*;

/*

Hunter CS Program
SuperArray Class
Jonathan Swotinsky

Task: 

UML Diagram:
Draw a UML diagram for the SuperArray class as (loosely) described above. Think about the core functionality you would want in this class. 
Remember you do not need to worry about the implementation of the class here, just what instance variables and methods you will need.

Question:
What instance variable(s) do we need

Answer:
Minimally, we need an array and a variable to hold the number of elements in the array used. SuperArray is empty, the this variable will be 0.

Code:

public class SuperArray {
    private int[] data;
    private int numberElements;
}

Code Challenge:
Write the following constructors for SuperArray

A constructor that accepts no parameters. It should set the data array so that it can hold 10 elements and numberElements to 0.
A constructor with a single parameter representing the size of the internal array.

Code Challenge 2: Add and test the following methods to SuperArray

public add(int value) - this routine will add the parameter value to the end of the SuperArray (don’t forget to update numberElements). If there is no more room in the array do nothing.
pubic int get(int index) - return the value at location index from the array. If index is past the last element, return -1.
public boolean isEmpty() - return True if ther are no elemets in the internal array, false otherwise.
public String toString() - build and return a String with all the elements of the array in a printable form

*/


/*

UML Diagram:

-------------------------
SuperArray
-------------------------
- data: int[]
- numberElements: int
-------------------------
+ constructor
+ constructor: int 
+ printArray
+ getSize
+ append: int
+ add: int
+ get: int
+ isEmpty: boolean
+ toString: String
-------------------------

*/

public class SuperArray{
	private int[] data;
	private int numberElements;
	
	
	public SuperArray(){
		this.numberElements = 10;
		this.data = new int[this.numberElements];
	}// end constructor without parameters
	
	
	public SuperArray(int n){
		this.numberElements = n;
		this.data = new int[this.numberElements];
	}// end constructor with
	
	
	public void append(int n){
		int[] newArray = new int[this.data.length + 1];
		for (int i = 0; i < this.data.length; i++){
			newArray[i] = this.data[i];
		}// end for i
		newArray[newArray.length - 1] = n;
		this.data = newArray;
	}// end append
	
	
	public void add(int n){
		for (int i = 0; i < this.data.length; i++){
			if (this.data[i] == 0){
				this.data[i] = n;
				return;
			}// if
		}// end for i
	}// end add
	
		
	public void printArray(){
		
		for(int i = 0; i < this.data.length; i++){
			System.out.print(this.data[i]);
			System.out.print(" ");
		}// end for i
		System.out.println();
	}// end printArray

	
	public int getSize(){
		return this.numberElements;
	}// end getSize
	
	
	public static void main(String[] args){
		SuperArray object1 = new SuperArray();
		SuperArray object2 = new SuperArray(5);
		object1.printArray();
		object2.printArray();
		System.out.println(object1.getSize());
		System.out.println(object2.getSize());
		object2.add(1);
		object2.add(0);
		object2.add(2);
		object2.add(3);
		object2.add(4);
		object2.add(5);
		object2.add(6);
		object2.printArray();
		object1.append(1);
		object1.printArray();
		
	}// end main
	
	
}// end SuperArray

	

