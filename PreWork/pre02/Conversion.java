import java.io.*;
import java.util.*;

/**
 * This program converts centimeters to feet and inches.
 */

public class Conversion{
	public static void main(String[] args){
		double cm;
		int feet, inches, remainder;
		final double CM_PER_INCH = 2.54;
		final int INCHES_PER_FOOT = 12;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter a number of centimeters: ");
		cm = in.nextDouble();
		inches = (int) (cm / CM_PER_INCH);
		feet = inches / INCHES_PER_FOOT;
		remainder = inches % INCHES_PER_FOOT;
		System.out.printf("%.2f centimeters is equal to %d feet, %d inches\n", 
											cm, feet, remainder);		
		
		System.out.println("The End!");
	}
}

