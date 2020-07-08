import java.io.*;
import java.util.*;

// Hunter CS Program
// Game Of Life
// Jonathan Swotinsky

public class gameOfLife {

	public static void main(String[] args) {
		int rows = 20;
		int cols = 10;
		
		//Construct 2d array:
		int[][] grid = new int[rows][cols];
		
		//Print 2d array of 0's:
		print2d(grid);
		System.out.println();
		
		//Check for rowPop and colPop methods:
		rowPop(grid, 3, 111);
		colPop(grid, 3, 999);
		print2d(grid);
		System.out.println();
		
		//Check for invert method:
		invert(grid);
		print2d(grid);
		System.out.println();
		
		//Reset all values to 0:
		for(int r = 0; r <= grid.length - 1; r++){
			rowPop(grid,r,0);
		} //end for r
		
		//Check for diagonal method:
		diagonal(grid, 0,0,3,111);
		print2d(grid);
		System.out.println();
		
		//Check for neighborhood method:
		print2d(neighborhood(grid, 1, 1));
		System.out.println();
		print2d(neighborhood(grid, 0, 0));
		
	} //end main

	public static int[][] neighborhood(int[][] d2, int row, int col){
		//For the top left corner:
		if(row == 0 && col == 0){
			int[][] grid = new int[2][2];
			for(int r = 0; r <= 1; r++){
				for(int c = 0; c <= 1; c++){
					grid[r][c] = d2[r][c];
				} //end for c			
			} //end for r
			return grid;
		} else {
		
		//For the top right corner:
		
		//For the bottom left corner:
		
		//For the bottom right corner:		
		
		//For the top edge:
				
		//For the bottom edge:
		
		//For the left edge:
		
		//For the right edge:		
		
		//For points not on a corner or edge:
			int[][] grid = new int[3][3];
			for(int r = 0; r <= 2; r++){
				for(int c = 0; c <= 2; c++){
					grid[r][c] = d2[row - 1 + r][col - 1 + c];
				} //end for c			
			} //end for r
			return grid;
		}
	} //end neighborhood
	
	public static void print2d(int[][] d2) {
		for (int r=0; r < d2.length; r++) {
			for (int c=0; c < d2[r].length; c++) {
				System.out.printf("%03d ", d2[r][c]);
			} //end for c
		System.out.println();
		} //end for r
	} //end print2d

	public static void colPop(int[][] d2, int c, int value) {
		for(int r = 0; r <= d2.length - 1; r++){
			d2[r][c] = value;
		} //end for r	  
	} //end colPop

	public static void rowPop(int[][] d2, int r, int value) {
		for(int c = 0; c <= d2[r].length - 1; c++){
			d2[r][c] = value;
		} //end for c	  
	} //end rowPop

	public static void invert(int[][] d2) {
		for(int r = 0; r <= d2.length - 1; r++){
			for(int c = 0; c <= d2[r].length - 1; c++){
				if(d2[r][c] == 0){
					d2[r][c] = 255;
				} else {
					d2[r][c] = 0;
				} // end if
			} //end for c
		} //end for r	
	} //end invert

	/*
    0: up + left
    1: up + right
    2: down + left
    3: down + right
	*/
	public static void diagonal(int[][] d2, int r, int c, int direction, int value) {
		//populate value
		//base case.
		if(r == -1 || c == -1 || r == d2.length || c == d2[r].length ){
			return;
		//recursive step
		} else { 
			d2[r][c] = value;
			if(direction == 0){
				diagonal(d2, r - 1, c - 1, direction, value);
			} else if (direction == 1){
				diagonal(d2, r - 1, c + 1, direction, value);
			} else if (direction == 2){
				diagonal(d2, r + 1, c - 1, direction, value);
			} else {
				diagonal(d2, r + 1, c + 1, direction, value);
			} //end if direction
		} //end else
	} //end diagonal

} //end class