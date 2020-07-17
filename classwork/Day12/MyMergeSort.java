import java.io.*;
import java.util.*;

/*

Hunter CS Program
MyMergeSort Class
Jonathan Swotinsky

Tasks:
-Write a method to find the minimum element in an ArrayList
-Write a method to sort an ArrayList

*/


public class MyMergeSort{
		
	// Return a slice of an array list:
	public static ArrayList slice(ArrayList a, int lo, int hi){
		ArrayList<Integer> slice = new ArrayList<Integer>();
		for(int i = lo; i < hi; i++){
			slice.add((int)a.get(i));
		}// end for i	
		return slice;
	}// end slice
		
		
	// Merge two sorted array lists into a single sorted array list:
	public static ArrayList merge(ArrayList a, ArrayList b){
			
		// Declare variables:
		int indexA = 0;
		int indexB = 0;
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		while(indexA <= a.size() - 1 && indexB <= b.size() - 1){ //While neither ArrayList has copied all of its elements to c.
			// Compare the first elements of a and b, and add the least element to c:
			if ((int)a.get(indexA) <= (int)b.get(indexB)){
				c.add((int)a.get(indexA));
				indexA++;
			} else {
				c.add((int)b.get(indexB));
				indexB++;
			}// end if else
		}// end while
		
		//Fill c with elements of b:
		while(indexB <= b.size() - 1){
			c.add((int)b.get(indexB));
			indexB++;
		}// end while
		
		//Fill c with elements of a:
		while(indexA <= a.size() - 1){
			c.add((int)a.get(indexA));
				indexA++;
		}// end while
		
		return c;
	}// end merge
	
	
	public static void main( String[] args ){
		
		// Test for slice() method:
		System.out.println("\nTest for merge() method:");
		int[] myArray = {5,19,82,9,13,2,27,15,8,17,37,38};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i <= myArray.length - 1; i++){
			arrayList.add(myArray[i]);
		}// for i
		System.out.println("Array:\t" + arrayList);		
		int lo = 0;
		int hi = 6;
		System.out.println("Slice of Array from Position " + lo + " to Position " + hi + ":\t" + slice(arrayList,lo,hi));

		
		// Test for merge() method:
		System.out.println("\nTest for merge() method:");
		int[] arrayA = {5,9,13,19};
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i <= arrayA.length - 1; i++){
			a.add(arrayA[i]);
		}// for i
		System.out.println("ArrayList A:\t" + a);
		
		int[] arrayB = {2,8,13,27};
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i <= arrayB.length - 1; i++){
			b.add(arrayB[i]);
		}// for i
		System.out.println("ArrayList B:\t" + b);
		System.out.println("Merged List:\t" + merge(a,b));
	
		
	}//end main

}//end class