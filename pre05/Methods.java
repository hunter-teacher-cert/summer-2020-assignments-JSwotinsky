import java.io.*;
import java.util.*;

//Pre Work 5
//Jonathan Swotinsky

public class Methods{
	
	// Method for 6.11 Exercise 2
	public static boolean isDivisible(int n, int m){
		if(n % m == 0){
			return true;
		} else {
			return false;
		}
	}

	// Method for 6.11 Exercise 3
	public static boolean isTriangle(int a, int b, int c){
		if((a + b <= c) || (a + c <= b) || (b + c <= a)){
			return false;
		} else {
			return true;
		}	
	}
		
	// Method for 6.11 Exercise 8
	public static int ack(int x, int y){
		if(x == 0){			
			return y + 1;
		} else if((x > 0) && (y == 0)){
			return ack(x - 1, 1);
		} else if ((x > 0) && (y > 0)){
			return ack(x - 1, ack(x, y - 1));
		} else {
			System.err.println("Arguments must be non-negative integers.");
			return -1;
		}
	}
	
	public static void main(String[] args){
		//Check for Exercise 2
		int n = 12;
		int m = 5;
		System.out.printf("%d is divisible by %d: ", n, m);
		System.out.println(isDivisible(n,m));
		
		//Check for Exercise 3
		int a = 2;
		int b = 11;
		int c = 4;
		System.out.printf("A triangle could of side of length %d, %d, and %d: ", a, b, c);
		System.out.println(isTriangle(a,b,c));
		
		//Check for Exercise 8
		int x = 3;
		int y = 4;
		if(ack(x,y) != -1){
			System.out.println(ack(x,y));
		}		
	}
}
