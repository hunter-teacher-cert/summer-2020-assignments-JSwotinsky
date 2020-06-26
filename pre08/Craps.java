import java.io.*;
import java.util.*;

//Pre Work 8
//Jonathan Swotinsky

public class Craps{
	
	//Accept an integer parameter and return a random number between 1 and that number, inclusive.
	public static int roll(int n){
		 Random random = new Random();
		 int numberRolled = random.nextInt(n)+1;
		 return numberRolled;
	}
		
	//Accept two parameters - a number of dice and the maximum value for those dice and return the result of rolling those dice.
	public static int shoot(int numberOfDice, int maxValue){
		int result = 0;
		for(int i = 1; i <= numberOfDice; i++){
			int x = roll(maxValue);
			result = result + x;
			//System.out.printf("Roll: %d\tResult: %d\n",x,result);
		}
		return result;
	}
		
	//Return something to indicate if the shooter of the round wins or loses before the point has been set.
	public static int round(int n){
		if(n == 2 || n == 3 || n == 12){
			return -1;
		} else if(n == 7 || n == 11){
			return 1;			
		} else {
			return n;
		}
	}
	
	//Return something to indicate if the shooter of the round wins or loses before the point has been set.
	public static int roundAfterPoint(int n, int point){
		if(n == 7 ){
			return -1;
		} else if(n == point){
			return 1;			
		} else {
			return n;
		}
	}
	
	public static void main(String[] args){
		boolean gameOver = false;
		boolean pointSet = false;
		Scanner in = new Scanner(System.in);
		int pointValue = 0;
		
		while (gameOver == false){
			
			if(pointSet == false){
				System.out.print("Enter\"roll\" to roll: ");
				String nextPlay = in.nextLine();
				if(nextPlay.equals("roll")){
					int result = shoot(2,6);
					int winOrLose = round(result);
					if(winOrLose == -1){
						System.out.printf("You rolled %d. Craps! You Lose!\n", result);
						gameOver = true;
					} else if(winOrLose == 1){
						System.out.printf("You rolled %d. Natural! You Win!\n", result);
						gameOver = true;
					} else {
						System.out.printf("You rolled %d. Point is %d.\n", result, result);
						pointSet = true;
						pointValue = result;
					}
				}
			
			} else {
				System.out.print("Enter\"roll\" to roll: ");
				String nextPlay = in.nextLine();
				if(nextPlay.equals("roll")){
					int result = shoot(2,6);
					int winOrLose = roundAfterPoint(result, pointValue);
					if(winOrLose == -1){
						System.out.printf("You rolled %d. Craps! You Lose!\n", result);
						gameOver = true;
					} else if(winOrLose == 1){
						System.out.printf("You rolled %d. Natural! You Win!\n", result);
						gameOver = true;
					} else {
						System.out.printf("You rolled %d. Point is %d.\n", result, pointValue);
						pointSet = true;
					}
				}			
			}	
		}			
	}	
}
