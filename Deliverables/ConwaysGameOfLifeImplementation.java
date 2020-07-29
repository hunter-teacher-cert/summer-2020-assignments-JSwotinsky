import java.io.*;
import java.util.*;

/*

Hunter CS Program
Game Of Life
Jonathan Swotinsky

Task: 

Write a program to simulate Conway's Game of Life (GOL)

GOL Rules:
Any live cell with 2 or 3 live neighbors survives.
Any dead cell with 3 live neighbors becomes a live cell.
All other cells become dead cells.

Wrapping Approach:
Row 24 wraps to row 0.
Column 25 wraps to column 0.

*/

class ConwaysGameOfLifeImplementation{

	/*
	Create a new 2 dimensional array, and fill it with ' ' 
	to represent that the entire board is empty.
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

	
	/*
	Print a given 2 dimensional array.
	*/		
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
	Set the value of a cell.
	*/	
	public static void setCell(char[][] board, int r, int c, char val){
		if(r >= 0 && r <= board.length - 1 && c >= 0 && c <= board[r].length - 1){
			board[r][c] = val;
		} //if
	} //end setCell
	
	
	/*
	Count and return the number of living cells around a given cell.
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
	Given a board and a cell, determine whether the cell is alive or dead.
	*/
	public static char getNextGenCell(char[][]board, int r, int c){
		// If board[r][c] is living:
		if(board[r][c] == 'X'){
			// Any live cell with 2 or 3 live neighbors survives:
			if(countNeighbors(board,r,c) == 2 || countNeighbors(board,r,c) == 3){
				return 'X';
			} else{
				return ' ';
			}
		// If board[r][c] is dead:
		} else {
			// Any dead cell with 3 live neighbors becomes a live cell:	
			if(countNeighbors(board,r,c) == 3){
				return 'X';
			} else {
				return ' ';
			}
		}
	} //end getNextGenCell
	
	
	/*
	Generate a new board with the next generation of cells.
	*/
	public static char[][] generateNextGenCell(char[][] board){
		char newBoard[][] = new char[board.length][board[0].length];
		//fill the new board
		for(int r = 0; r <= board.length - 1; r++){
			for(int c = 0; c <= board[r].length - 1; c++){
				newBoard[r][c] = getNextGenCell(board,r,c);	
			} //end for c
		} //end for r
		return newBoard;
	} //end generateNextGenCell
	
	
	/*
	Main
	*/
	public static void main(String[] args){
		//Generate a 25 x 25 2-d array of 0's:
		char[][] board;
		board = createNewBoard(25,25);
		
		//Generate a GOL glider:
		setCell(board,0,2,'X');
		setCell(board,1,0,'X');
		setCell(board,1,2,'X');
		setCell(board,2,1,'X');
		setCell(board,2,2,'X');
						
		//Run 200 iterations of Conway's GOL:
		for(int i = 0; i <= 199; i++){
			printBoard(board);
			board = generateNextGenCell(board);
		} //end for i
	} //end main


} //end class