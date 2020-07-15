/*

Hunter CS Program
Boogle Class
Jonathan Swotinsky

Task:
Complete the assignment below.

*/

  
/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Boogle
   A tester class for code analysis and search exploration.
   USAGE:
   Read through at least once.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   Insert comment preceding each method to summarize functionality.
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Boogle{
	
	//return index of first occurence of target, or -1 if not found:
	public static int linSearch(ArrayList a, int target){
		for(int pos = 0; pos < a.size(); pos++) {
			if (a.get(pos).equals(target)){
				return pos;
			}// end if
		}// end for int
		return -1;
	}// end linSearch()


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


	//return ArrayList of random ints on range [lo,lo+hi)
	public static ArrayList prestoArrayListo(int numItems, int lo, int hi){
		ArrayList retArr = new ArrayList();

		for(int i = 0; i < numItems; i++){
			//System.out.println(i);  //diagnostic under-the-hood view
			//retArr.add( Math.random() ); // [0,1)
			//retArr.add( (int)Math.random() ); // 0
			//retArr.add( (int)(hi * Math.random()) ); // [0,hi)
			retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
		}// end for i
    
		return retArr;
	}// end prestoArrayListo()


	//return ArrayList of random ints, sorted in ascending order
	public static ArrayList prestoSortedArrayListo(int numItems, int lo, int hi){
		ArrayList retArr = new ArrayList();

		//if requested, return empty ArrayList
		if (numItems < 1){
			return retArr;
		}// end if

		// populate index 0
		retArr.add( (int)(lo * Math.random()) );

		//populate rest of indices, each one greater than last
		for(int i=1; i<numItems; i++) {
			//System.out.println(i);  //diagnostic under-the-hood view
			//retArr.add( Math.random() ); // [0,1)
			//retArr.add( (int)Math.random() ); // 0
			//retArr.add( (int)(hi * Math.random()) ); // [0,hi)
			//retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
			//System.out.println(retArr.get(i-1));
			retArr.add( (int)retArr.get(i-1) + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
		}// end for i
		return retArr;
	}// end prestoSortedArrayListo()


	public static void main( String[] args ){
		/*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
		System.out.println("\n"+"al000"+":");
		ArrayList al000 = prestoArrayListo(0,0,0);
		System.out.println(al000);
		System.out.println(linSearch(al000,3));
		System.out.println("\n"+"al01"+":");
		ArrayList al01 = prestoArrayListo(5,0,100);
		System.out.println(al01);
		System.out.println(linSearch(al01,3));
		System.out.println("\n"+"al02"+":");
		ArrayList al02 = prestoArrayListo(5,3,10);
		System.out.println(al02);
		System.out.println(linSearch(al02,3));
		System.out.println("\n"+"al05"+":");
		ArrayList al05 = prestoArrayListo(20,1,5);
		System.out.println(al05);
		System.out.println(linSearch(al05,3));
		  ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


		// test battery using sorted ArrayLists as search space
		/*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
		System.out.println("\n"+"sal000"+":");
		ArrayList sal000 = prestoSortedArrayListo(0,0,0);
		System.out.println(sal000);
		System.out.println(linSearch(sal000,3));
		System.out.println(binSearch(sal000,3));
		System.out.println("\n"+"sal00"+":");
		ArrayList sal00 = prestoSortedArrayListo(5,0,100);
		System.out.println(sal00);
		System.out.println(linSearch(sal00,3));
		System.out.println(binSearch(sal00,3));
		System.out.println("\n"+"sal01"+":");
		ArrayList sal01 = prestoSortedArrayListo(5,0,100);
		System.out.println(sal01);
		System.out.println(linSearch(sal01,3));
		System.out.println(binSearch(sal01,3));
		System.out.println("\n"+"sal02"+":");
		ArrayList sal02 = prestoSortedArrayListo(5,3,100);
		System.out.println(sal02);
		System.out.println(linSearch(sal02,3));
		System.out.println(binSearch(sal02,3));
		System.out.println("\n"+"sal03"+":");
		ArrayList sal03 = prestoSortedArrayListo(5,0,100);
		System.out.println(sal03);
		System.out.println(linSearch(sal03,3));
		System.out.println(binSearch(sal03,3));
		System.out.println("\n"+"sal04"+":");
		ArrayList sal04 = prestoSortedArrayListo(20,0,3);
		System.out.println(sal04);
		System.out.println(linSearch(sal04,3));
		System.out.println(binSearch(sal04,3));
		System.out.println("\n"+"sal05"+":");
		ArrayList sal05 = prestoSortedArrayListo(20,1,5);
		System.out.println(sal05);
		System.out.println(linSearch(sal05,3));
		System.out.println(binSearch(sal05,3));
		  ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/

		//batch of commands for easier test case generation:
		/*
		System.out.println("\n"+"al"+":");
		ArrayList al = prestoArrayListo(,,);
		System.out.println(al);
		System.out.println(linSearch(al, ));
		System.out.println(binSearch(al, ));
		*/
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(10);
		a.add(11);
		a.add(19);
		a.add(23);
		a.add(24);
		a.add(25);
		System.out.println(a);
		System.out.println(binSearch(a,2));
		System.out.println(binSearch(a,3));
		System.out.println(binSearch(a,5));
		System.out.println(binSearch(a,10));
		System.out.println(binSearch(a,11));
		System.out.println(binSearch(a,19));
		System.out.println(binSearch(a,23));
		System.out.println(binSearch(a,24));
		System.out.println(binSearch(a,25));

	}//end main

}//end class