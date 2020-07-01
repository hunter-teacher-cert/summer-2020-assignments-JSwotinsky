import java.io.*;
import java.util.*;

/*

2D array

set up array
change values in array

method to apply game of life rules (will the next generation be alive or not?)

*/

class Life{

	/*
	
	create a new 2D array, fill it with ' ' 
	representing that the entire board is empty.
	
	*/
	
	public static char[][] createNewBoard(int rows, int cols){
		char[][] board = new char[rows][cols];
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
				board[r][c] = ' ';
			} //end for c		
		} //end for r
		return board;
	} //end createNewBoard

	public static void printBoard(char[][] board){
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[r].length; c++){
				System.out.printf("%c",board[r][c]);
			} //end for c
			System.out.println();	
		} //end for r
		System.out.println("\n\n-------------------------\n\n");
	} //end printBoard


	/*
	
	set the cell (r,c) to value)
	
	*/	

	public static void setCell(char[][] board, int r, int c, char val){
		if(r >= 0 && r <= board.length - 1 && c >= 0 && c <= board[r].length - 1){
			board[r][c] = val;
		} //if
	} //end setCell
		
	/*
	
	Count and return the number of living neighbors around board[r][c]
	
	approach 1 - lots of if statements
	approach 2 - you can loop over the grid from board[r-1][c]
				 to board[r+1][c+1]
	
	*/
	
	public static int countNeighbors(char[][] board, int r, int c){
		int livingNeighbors = 0;
		for(int row = (r-1); row <= (r + 1); row++){
			for(int col = (c-1); col <= (c + 1); col++){
				if(board[(row+25)%(board.length)][(col+25)%(board[r].length)] == 'X'){
					livingNeighbors++;
				} //end if		
			} //end for col
		} //end for row
		if(board[r][c] == 'X'){
			livingNeighbors--;
		} //end if
		return livingNeighbors;
	} //end countNeighbors
		
	/*
	
	given a board and a cell, determine based on the rules for 
	Conway's GOL if the cell is alive ('X') or dead(' ') in the 
	next generation.
	
	*/
		
	public static char getNextGenCell(char[][]board, int r, int c){
		
		// If board[r][c] is living:
		if(board[r][c] == 'X'){
			// Any live cell with 2 or 3 live neighbors survives:
			if(countNeighbors(board,r,c) == 2 || countNeighbors(board,r,c) == 3){
				board[r][c] = 'X';
			} else{
				board[r][c] = ' ';
			}
		// If board[r][c] is dead:
		} else {
			// Any dead cell with 3 live neighbors becomes a live cell:	
			if(countNeighbors(board,r,c) == 3){
				board[r][c] = 'X';
			} else {
				board[r][c] = ' ';
			}
		}
		return board[r][c];
	} //end getNextGenCell
	
	/*
	
	scan the board to generate a NEW board with the 
	next generation
	*/
	
	public static char[][] generateNextGenCell(char[][] board){
		char newBoard[][] = board;
		//fill the new board
		for(int r = 0; r <= board.length - 1; r++){
			for(int c = 0; c <= board[r].length - 1; c++){
				newBoard[r][c] = getNextGenCell(board,r,c);	
			} //end for c
		} //end for r
		return newBoard;
	} //end generateNextGenCell
	
	public static void main(String[] args){
		char[][] board;
		board = createNewBoard(25,25);
		setCell(board,5,5,'X');
		setCell(board,5,6,'X');
		setCell(board,5,7,'X');
		printBoard(board);
		System.out.println("Check");
		System.out.println(getNextGenCell(board, 4, 5));
		System.out.println(getNextGenCell(board, 4, 6));
		System.out.println(getNextGenCell(board, 4, 7));
		System.out.println(getNextGenCell(board, 5, 5));
		System.out.println(getNextGenCell(board, 5, 6));
		System.out.println(getNextGenCell(board, 5, 7));
		System.out.println(getNextGenCell(board, 6, 5));
		System.out.println(getNextGenCell(board, 6, 6));
		System.out.println(getNextGenCell(board, 6, 7));
		
		//printBoard(board);
		
		
		
		
		//for(int i = 0; i <= 10; i++){
		//	printBoard(board);
		//	generateNextGenCell(board);
		//} //end for i
	} //end main

} //end class