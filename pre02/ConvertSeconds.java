import java.io.*;
import java.util.*;

/**
 *Think Java 3.12, Exercise 3
 *Jonathan Swotinsky
 */

public class ConvertSeconds{
	public static void main(String[] args){
				
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number of seconds: ");
		int seconds = in.nextInt();
		int originalSeconds = seconds;
		int hours = seconds / 3600;
		seconds = seconds % 3600;
		int minutes = seconds / 60;
		seconds = seconds % 60;
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n",originalSeconds,hours,minutes,seconds);
	}
}

