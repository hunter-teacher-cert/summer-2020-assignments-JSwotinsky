import java.io.*;
import java.util.*;

/**
 *Think Java 3.12, Exercise 2
 *Jonathan Swotinsky
 */

public class ConvertTemperature{
	public static void main(String[] args){
				
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature (in degrees Celsius): ");
		double cel = in.nextDouble();
		double far = cel*((double)9/(double)5)+32;
		System.out.printf("%.1f degrees Celsius = %.1f degrees Fahrenheit\n",cel,far);		
	}
}

