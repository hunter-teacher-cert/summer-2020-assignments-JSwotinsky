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

Codew Challenge 3: Add and test the following methods to SuperArray

public void grow() - This should increase the capacity of your SuperArray: 
Make a new array with extra room.
Copy the data from the original internal array over to the new one.
Set the internal instance variable data to the new array.

public void add(int value) - Modify the add routine you wrote above. 
Now, if there is no room at the end of the array it should call grow().

public void add(int index, int value) - This is a second version of add it will add an element at location index. 
If index is past the end of the array, do nothing. 
Otherwise, shift down all the elements past index to create room and then insert value into the correct location. 
Don’t forget to grow the array as in the previous question if necessary.

public void remove(int index) - delete the element at location index from the array. Don’t forget to shift down elements to remove the open space.


*/


/*

UML Diagram:

 ---------------------------
| SuperArray             	|
|---------------------------|
| - data: int[]            	|
| - numberElements: int		|
|---------------------------|
| + constructor()			|
| + constructor(int)		|
| + add(int): void			|
| + add(int, int): void		|
| + remove(int): void		|
| + get(int): int			|
| + isEmpty(): boolean		|
| + toString(): String		|
| - grow(): void			|
| + printArray(): void		|
 ---------------------------

*/

public class SuperArray{
	
	////////////////////Instance Variables////////////////////
	
	private int[] data;
	private int numberElements;
	
	
	////////////////////Constructors////////////////////
	
	public SuperArray(){
		this.data = new int[10];
		this.numberElements = 0;	
	}// end constructor 
	
	
	public SuperArray(int n){
		this.numberElements = 0;
		this.data = new int[n];
	}// end constructor with array size parameter
	
	
	////////////////////Methods////////////////////
	
	public void add(int value){
		if(this.numberElements == this.data.length){
			this.grow();
			this.data[this.numberElements] = value;
			this.numberElements++;
		} else {
			this.data[this.numberElements] = value;
			this.numberElements++;
		}// end if else
	}// end add with value parameter

	
	public void add(int index, int value){
		//If the index is past the end of the array, do nothing.
		if(index > this.numberElements - 1){
			return;
		} else {
			// If the array is full, increase the length of the array by 1 before shifting.
			if(this.numberElements == this.data.length){
				this.grow();
			}// end nested if
		
			// Shift all elements to make room for the new value.
			for(int i = this.numberElements - 1; i >= index; i--){
				this.data[i+1] = this.data[i];		
			}//end for i
			this.data[index] = value;
			this.numberElements++;
		} // end if else	
	}// end add with index and value parameters
		
		
	public void remove(int index){
		//If the index is past the end of the array, do nothing.
		if(index > numberElements - 1){
			return;
		} else {
			for(int i = index; i <= this.numberElements - 2; i++){
				this.data[i] = this.data[i+1];		
			}// end for i
			this.numberElements--;
		} // end if else	
	}// end remove
	
	
	public int get(int index){
		if(index > this.numberElements - 1){
			return -1;
		} else {
			return this.data[index];
		}// end if else
	}// end get


	public boolean isEmpty(){
		return (this.numberElements == 0);
	}// end isEmpty
	
	
	public String toString(){
		if(this.numberElements > 0){ 
			String s = "" + this.data[0];
			for(int i = 1; i <= this.numberElements - 1; i++){
				s = s + ", " + this.data[i];
			}// end for i
			return s;
		} else {
			return "";
		}// end if else
	}// end toString
	
	
	private void grow(){
		int[] newArray = new int[this.data.length + 1];
		for (int i = 0; i < this.data.length; i++){
			newArray[i] = this.data[i];
		}// end for i
		this.data = newArray;
	}// end grow
	
	
	public void printArray(){
		
		for(int i = 0; i < this.data.length; i++){
			System.out.print(this.data[i]);
			System.out.print(" ");
		}// end for i
		System.out.println();
	}// end printArray

	
	public static void main(String[] args){
		SuperArray object1 = new SuperArray(4);
		SuperArray object2 = new SuperArray();
		
		//Test for constructor methods:
		System.out.println("\nTest for constructor methods:");
		System.out.print("Object 1:\t");
		object1.printArray();
		System.out.print("Object 2:\t");
		object2.printArray();
		System.out.println();
		
		//Test for add method (without grow):
		System.out.println("Test for add method (without grow):");
		object1.add(1);
		object1.add(2);
		object1.add(3);
		System.out.print("Object 1:\t");
		object1.printArray();
		System.out.print("Object 2:\t");
		object2.printArray();
		System.out.println();

		//Test for get method:
		System.out.println("Test for get method:");
		int position = 2;
		System.out.printf("Object 1, Position %d:\t",position);
		System.out.println(object1.get(position));
		position = 3;
		System.out.printf("Object 1, Position %d:\t",position);
		System.out.println(object1.get(position));
		System.out.println();
				
		//Test for isEmpty method:
		System.out.println("Test for isEmpty method:");
		System.out.print("Object 1:\t");
		System.out.println(object1.isEmpty());
		System.out.print("Object 2:\t");
		System.out.println(object2.isEmpty());
		System.out.println();
		
		//Test for toString method:
		System.out.println("Test for toString method:");
		System.out.print("Object 1:\t");
		System.out.println(object1.toString());
		System.out.print("Object 2:\t");
		System.out.println(object2.toString());
		System.out.println();
		
		//Test for grow method:
		System.out.println("Test for grow method:");
		System.out.print("Object 1 before grow:\t");
		object1.printArray();
		object1.grow();
		System.out.print("Object 1 after grow:\t");
		object1.printArray();
		System.out.println();
		
		//Test for add (with grow):
		System.out.println("Test for add method (with grow):");
		System.out.print("Object 1 before add:\t");
		object1.printArray();
		object1.add(4);
		object1.add(5);
		System.out.print("Object after add (grow not required):\t");
		object1.printArray();
		object1.add(6);
		System.out.print("Object after add (grow required):\t");
		object1.printArray();
		System.out.println();
		
		//Test for add method at index (with and without grow required):		
		System.out.println("Test for add method at index (with and without grow required):");
		System.out.print("Object 2 before add:\t");
		object2.printArray();
		for(int i = 0; i<= 8; i++){
			object2.add(i);
		}// end for i
		System.out.print("Object 2 with all but one position filled:\t");
		object2.printArray();
		object2.add(3,99);
		System.out.print("Object 2 after add at index (grow not required):\t");
		object2.printArray();
		object2.add(3,98);
		System.out.print("Object 2 after add at index (grow required):\t");
		object2.printArray();
		System.out.println();		
			
		//Test for remove method:
		System.out.println("Test for remove method:");
		System.out.print("Object 1 before remove:\t");
		object1.printArray();
		object1.remove(3);
		System.out.print("Object 1 after remove (including insignifcant elements):\t");
		object1.printArray();
		System.out.print("Object 1 after remove (including significant elements only):\t");
		System.out.println(object1.toString());
		System.out.println();
		
	}// end main
	
}// end SuperArray

	

