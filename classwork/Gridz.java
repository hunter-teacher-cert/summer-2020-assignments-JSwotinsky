import java.io.*;
import java.util.*;

public class Gridz{

	public static void main(String[] args){
	
		//int[row][column]	
		int[][] arr = new int[10][5];
		
		System.out.println(arr);
		printArray(arr);

		popArray(arr);
		printArray(arr);
		
		System.out.printf("rowsum 2: %d\n", rowSum(arr,2));
		System.out.printf("colsum 2: %d\n", colSum(arr,0));
	
	}//end main
	
	public static int rowSum(int[][] a,int r){
		int sum = 0;
		for (int c = 0; c <= a[r].length - 1; c++){
			sum += a[r][c]; //sum += a[r][c] means sum = sum + a[r][c]
		}//end c
		return sum;
	}//end rowSum
	
	public static int colSum(int[][] a,int c){
		int sum = 0;
		for (int r = 0; r <= a.length - 1; r++){
			sum += a[r][c]; //sum += a[r][c] means sum = sum + a[r][c]
		}//end r
		return sum;
	}//end colSum
	
	public static void printArray(int[][] a){
		for(int r = 0; r <a.length; r++){
			for(int c = 0; c < a[r].length; c++){//Note: a[r] refers to the length of the row.
				System.out.printf("%02d ",a[r][c]);
			} //end for c
			System.out.println();
		} //end for r
		System.out.println();
	}//end printArray
	
	public static void popArray(int[][] a){
		
		int value = 0;
		
		for(int r = 0; r <a.length; r++){
			for(int c = 0; c < a[r].length; c++){//Note: a[r] refers to the length of the row.
				a[r][c] = value;
				value++;
			} //end for c
		} //end for r
	}//end printArray	
	
}//end class 

