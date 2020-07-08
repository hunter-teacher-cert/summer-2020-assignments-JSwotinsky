import java.io.*;
import java.util.*;

//Pre Work 6
//Jonathan Swotinsky

public class Loops{
	
	// Method for 7.9 Exercise 3
	public static double power(double x, int n){
		//Negative Exponents
		if(n < 0){
			n = n * -1;
			double result = 1;
			int i = 1;
			while(i <= n){
				result *= x;
				i++;
			}
		return (1/result);
				
		//Non-negative Exponents
		} else {
			double result = 1;
			int i = 1;
			while(i <= n){
				result *= x;	
				i++;
			}
			return result;
		}
	}
		
	// Method for 7.9 Exercise 4
	public static double factorial(int n){
		int i = 1;
		int result = 1;
		while(i <= n){
			result = result * i;
			i += 1;
		}
		return result;
	}
	
	// Method for 7.9 Exercise 5
	public static double myExp(double x, double n){
		double result = 1;
		double lastTerm = 1;
		for(double i = 1; i <= n-1; i++){
			lastTerm = lastTerm * (x/i);
			result = result + lastTerm;
		}
		return result;
	}
	
	//Method for 7.9 Exercise 5, Part 3
	public static void check(double x){
		double myExp = myExp(x, 10);
		double mathExp = Math.exp(x);
		System.out.println(x + "\t" + myExp + "\t" + mathExp);
	}
	
	//Method for 7.9 Exercise 5, Part 4
	public static void precisionCheck(double x,int n){
		for(int i = 1; i <= n; i++){
			double myExp = myExp(x, i);
			double mathExp = Math.exp(x);
			System.out.println(i + "\t" + myExp + "\t" + mathExp);
		}
	}
	
	public static void main(String[] args){
		//Check for Exercise 3
		System.out.println();
		System.out.println("Power Check:");
		System.out.println(power(5,0));
		System.out.println(power(5,1));
		System.out.println(power(5,2));
		System.out.println(power(5,-2));
		System.out.println(power(0,2));
		System.out.println(power(1.5,2));
		System.out.println(power(1.5,3));
		System.out.println(power(-1.5,3));
		System.out.println(power(-1.5,-3));
		System.out.println(power(0,-1));
		System.out.println(power(0,-2));
		System.out.println(power(0,0));
		System.out.println();
		
		//Check for Exercise 4
		System.out.println("Factorial Check:");
		for(int i = 0; i <= 5; i++){
			System.out.println(factorial(i));
		}
		System.out.println(factorial(-2));
		System.out.println();
				
		//Check for Exercise 5, Parts  1 - 3
		System.out.println("\"Check\" Check:");
		check(1);	
		System.out.println();
		
		//Check for Exercise 5, Part 4
		System.out.println("\"precisionCheck\" check:");
		precisionCheck(1,18);		
		System.out.println();
							
		//Check for Exercise 5, Part 5
		//As x increases, accuracy decreases
		System.out.println("\"Check\" for 0.1, 1.0, 10.0, and 100.0:");
		for(int i = -1; i <= 2 ; i++){
			check(power(10,i));
		}	
		System.out.println();
		
		//Check for Exercise 5, Part 6
		//As x increases, accuracy decreases
		System.out.println("\"Check\" for -0.1, -1.0, -10.0, and -100.0:");
		for(int i = -1; i <= 2 ; i++){
			check(power(10,i)*-1);
		}	
		System.out.println();
	}
}
