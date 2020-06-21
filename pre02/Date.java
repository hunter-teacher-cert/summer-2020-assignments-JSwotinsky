import java.io.*;
import java.util.*;

/**
 *Think Java 2.12, Exercise 2
 *Jonathan Swotisnky
 */

public class Date{
	public static void main(String[] args){
		String day = "Saturday";
		int date = 20;
		String month = "June";
		int year = 2020;
		System.out.println("American Format:");
		System.out.printf("%s, %s %d, %d\n",day,month,date,year);
		System.out.println("European Format:");
		System.out.printf("%s %d %s %d\n",day,date,month,year);
	}
}

