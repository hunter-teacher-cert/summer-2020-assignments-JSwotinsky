import java.io.*;
import java.util.*;

/*

Hunter CS Program
MySort Class
Jonathan Swotinsky

Tasks:
-Write a method to find the minimum element in an ArrayList
-Write a method to sort an ArrayList

*/


public class MySort{
	
	static int counter;
	
	//Return the index of the minimum value in an ArrayList:
	public static int findMin(ArrayList a){
		int min = (int)a.get(0);
		int index = 0;
		for(int i = 1; i <= a.size() - 1; i++){
			if((int)a.get(i) < min){
				min = (int)a.get(i);
				index = i;
				counter++;
			}// end if
		}// end for i
	return index;	
	}// end findMin
	
	
	//Return the index of the minimum value in an ArrayList (overloaded to include an initial search index):
	public static int findMin(ArrayList a, int initialIndex){
		int min = (int)a.get(initialIndex);
		int index = initialIndex;
		for(int i = initialIndex + 1; i <= a.size() - 1; i++){
			if((int)a.get(i) < min){
				min = (int)a.get(i);
				index = i;
				counter++;
			}// end if
		}// end for i
	return index;	
	}// end findMin
	
	
	//Sort an array list from the least element to the greatest element:
	public static void sort(ArrayList a){
		counter = 0;
		// Find the mimimum value, swap it with the first value, remove the first value from the search range, and repeat:
		for(int i = 0; i <= a.size() - 1; i++){
			// Swap the first value in the search range with the minimum value in the search range:
			// Store the first value in the search range in a temporary variable:
			int first = (int)a.get(i);
			// Story the index value of the min in a temporary variable:
			int minIndex = findMin(a,i);
			// Store the minimum value in a temporary variable:
			int min = (int)a.get(findMin(a,i));	
			// Set the first value in the search range to the minimum value in the search range:
			a.set(i,min);
			// Replace the minimum value in the search range with the value stored in tmp:
			a.set(minIndex,first);
			counter++;
		}// end for i
	}// end sort
	
	
	//return index of target, or -1 if not found:
	public static int binSearch(ArrayList a, Integer target){
		int checkFrom = 0;
		int checkTo = a.size()-1;
		
		//While a has at least two elements, run the following code:		
		while(checkTo - checkFrom > 0){
		
			// Find an approximate midpoint of the section of a being searched:
			int midPoint = (checkTo + checkFrom) / 2;
					
			// If the midpoint is the target, return its index:
			if (target == (int)a.get(midPoint)){
				return midPoint;
			// If the midpoint is not the target, check whether the target is less than the
			// midpoint or greater than the midpoint, adjust checkFrom and checkTo accordingly,
			// and invoke binSearch recursively using the new values of checkFrom and checkTo: 
			} else if (target < (int)a.get(midPoint)){
				int newCheckFrom = checkFrom;
				int newCheckTo = midPoint - 1; 
				return binSearch(a, target, newCheckFrom, newCheckTo);		
			} else {
				int newCheckFrom = midPoint + 1;
				int newCheckTo = checkTo; 
				return binSearch(a, target, newCheckFrom, newCheckTo);			
			}// end if else
		
		}// end while
	
			if(target == (int)a.get(checkFrom)){
				return checkFrom;
			} else {
				return -1; 
			}//end if else
			
		}//end binSearch()
	
	
	//return index of target, or -1 if not found:
	public static int binSearch(ArrayList a, Integer target, int checkFrom, int checkTo){
		//While a has at least two elements, run the following code:
		while(checkTo - checkFrom > 0){
		
			// Find an approximate midpoint of the section of a being searched:
			int midPoint = (checkTo + checkFrom) / 2;
		
			// If the midpoint is the target, return its index:
			if (target == (int)a.get(midPoint)){
				return midPoint;
			// If the midpoint is not the target, check whether the target is less than the
			// midpoint or greater than the midpoint, adjust checkFrom and checkTo accordingly,
			// and invoke binSearch recursively using the new values of checkFrom and checkTo: 
			} else if (target < (int)a.get(midPoint)){
				int newCheckFrom = checkFrom;
				int newCheckTo = midPoint - 1; 
				return binSearch(a, target, newCheckFrom, newCheckTo);		
			} else {
				int newCheckFrom = midPoint + 1;
				int newCheckTo = checkTo; 
				return binSearch(a, target, newCheckFrom, newCheckTo);			
			}// end if else
		
		}// end while
	
			if(target == (int)a.get(checkFrom)){
				return checkFrom;
			} else {
				return -1; 
			}//end if else
			
	}//end binSearch()


	public static void main( String[] args ){
		
		// Test for binSearch() method:
		System.out.println("\nTest for binSearch() method:");
		int[] myArray = {2,5,8,9,13,15,17,19,27,37,38,82};
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i <= myArray.length - 1; i++){
			a.add(myArray[i]);
		}// for i
		System.out.println("ArrayList:\t" + a);
		
		for(int i = 0; i <= myArray.length - 1; i++){ 
			System.out.println("Search for " + myArray[i] + ":\t Position " + binSearch(a,myArray[i]));
		}// for i
		System.out.println();
		

		// Tests for findMin() and sort() methods:
		int[] myArray2 = {5,19,82,9,13,2,27,15,8,17,38,37};
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		for(int i = 0; i <= myArray2.length - 1; i++){
			a2.add(myArray2[i]);
		}// for i
		
		// findMin() test:
		System.out.println("\nTest for findMin() method:");
		System.out.println("ArrayList2: \t" + a2);
		System.out.println("The minimum value is located at index: " + findMin(a2));
		System.out.println();
		
		// sort() test:
		System.out.println("\nTest for sort() method:");
		System.out.println("ArrayList2 (unsorted): \t" + a2);
		sort(a2);
		System.out.println("ArrayList2 (sorted): \t" + a2);
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		for(int i = 10; i >= 0; i--){
			a3.add(i);
		}
		
		long start = System.currentTimeMillis();
		sort(a3);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		//System.out.println(counter);		
		

	}//end main

}//end class