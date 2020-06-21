import java.io.*;
import java.util.*;

//Think Java 4.11, Exercise 3
//Jonathan Swotinsky

public class PrintDate{
	
	public static void printAmerican(String day, int date, String month, int year){
		System.out.println(day+", " + month + " " + date + ", " + year);
	}

	public static void printEuropean(String day, int date, String month, int year){
		System.out.println(day+" " + date + " " + month + " " + year);
	}	

	public static void main(String[] args){
		printAmerican("Saturday",21,"June",2020);	
		printEuropean("Saturday",21,"June",2020);
	}
}

