import java.io.*;
import java.util.*;

//Pre Work 7
//Jonathan Swotinsky

public class ArrayExample{
	
	// Method for 8.12 Exercise 1, Part 1
	public static double[] powArray(double[] numbers, int power){
		double[] squares = new double[numbers.length];
		for(int i = 0; i <= numbers.length - 1; i++){
			squares[i] = Math.pow(numbers[i],power);
		}
		return squares;
	}
		
	//Method for 8.12 Exercise 1, Part 2
	public static int[] histogram(int[] scores){
		int[] counter = new int[100];
		for (int score : scores) {
			counter[score]++;
		}		
		return counter;
	}
	
	//Method for 8.12 Exercise 4
	//This method cannot be written using an enhanced for loop.  An enhanced for loop would exclude the use of an index.  
	//However this method requires searching through indices, and eventually uses an index as the return value of the method. 
	public static int indexOfMax(int[] integers){
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i <= integers.length - 1; i++){
			if (integers[i] >= max){
				max = integers[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
		
	//Method for 8.12 Exercise 5
	public static boolean[] sieve(int n){
		boolean[] possiblePrimes = new boolean[n];
		possiblePrimes[0] = false;
		possiblePrimes[1] = false;
		for(int i = 2; i <= n-1; i++){
			possiblePrimes[i] = true;
		}
		for(int i = 2; i <= n - 1; i++){
			if (possiblePrimes[i] == true){
				for(int k = 2; k <= (n-1)/i; k++){
					possiblePrimes[k*i] = false;
				}
			}
		}
		return possiblePrimes;
	}
	
	//Method to find maximum value in an array
	public static int findMaxValue(int[] counter){
		int max = 0;
		for(int value: counter){
			if (value >= max){
				max = value;
			}
		}
		return max;
	}
	
	//Method to print histogram visually
	public static void printHistogram(int[] counter){
		int max = findMaxValue(counter);
		int originalMax = max;
		for(int i = 0; i <=originalMax; i++){	
			for (int x = 0; x <= counter.length - 1; x++){
				if (counter[x] == max){
					System.out.print("x");
					counter[x] = counter[x] - 1;
				} else {
					System.out.print(" ");
				}
			}
			max = max - 1;
			System.out.println();	
		}
		return;
	}
		
	public static void main(String[] args){
		//Check for Exercise 1, Part 1
		System.out.println();
		System.out.println("Check for Exercise 1, Part 1:\n");
		double[] numbers = {1.0,2.0,3.0,4.0,5.0};
		System.out.println(Arrays.toString(powArray(numbers,3)));
		System.out.println();
		
		//Check for Exercise 1, Part 2
		System.out.println("Check for Exercise 1, Part 2:\n");
		Random random = new Random();
		int[] scores = new int[1000];
		for(int i = 0; i < 1000; i++){
			scores[i] = random.nextInt(100);
		}
		printHistogram(histogram(scores));
		System.out.println();
		
		//Check for Exercise 4
		System.out.println("Check for Exercise 4:\n");
		int[] integers = {8,13,17,2,27,15,5,19,9,13};
		System.out.println(indexOfMax(integers));
		System.out.println();
		
		//Check for Exercise 5
		System.out.println("Check for Exercise 5:\n");
		int sieveNumber = 20;
		System.out.println(Arrays.toString(sieve(sieveNumber)));
		System.out.println();
		for(int i = 0; i <= sieveNumber - 1; i++){
			System.out.printf("%d \t %b\n",i,sieve(sieveNumber)[i]);
		}
	}	
}
