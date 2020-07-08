import java.io.*;
import java.util.*;

/*

Hunter CS Program
Driver and Time Class
Jonathan Swotinsky

Task: 
1. Fetch KtS.
2. Read Chapter 10 in ThinkJava. Note any questions/comments/concerns. This will inform discussion.
3. Copy Time.java and Driver.java into your work repo.
4. Read Chapter 11 in ThinkJava. Note any questions/comments/concerns. This will inform discussion.
5. As you read Chapter 11, fill in your Time class in Time.java. Grow it incrementally, testing as you go.

*/

public class Driver{
    public static void main(String[] args) {
		
		//Set time
		Time t = new Time(11,44,30.5);
		Time t2 = new Time(12,31,45);
		Time t3 = new Time(12,31,45);
				
		//Check for printTime method
		System.out.print("Time 1 = ");
		Time.printTime(t);
		System.out.println();
		
		//Check for printTime2 method
		System.out.print("Time 2 = ");
		t2.printTime2();
		System.out.println();
		
		System.out.print("Time 3 = ");
		t3.printTime2();
		System.out.println();
		
		//Check for toString method
		System.out.println("Time 1 printed as string: ");
		String s = t.toString();
		System.out.println(s);
		System.out.println();
		
		//Check for toString method using System.out.println
		System.out.println("Time 1 re-printed as string: ");
		System.out.println(t);
		System.out.println();
		
		//Check for equals
		System.out.print("Time 1 = Time 2: ");
		System.out.println(t.equals(t2));
		System.out.print("Time 1 = Time 3: ");
		System.out.println(t.equals(t3));
		System.out.print("Time 2 = Time 1: ");
		System.out.println(t2.equals(t));
		System.out.print("Time 2 = Time 3: ");
		System.out.println(t2.equals(t3));
		System.out.print("Time 3 = Time 1: ");
		System.out.println(t3.equals(t));
		System.out.print("Time 3 = Time 2: ");
		System.out.println(t3.equals(t2));
		System.out.println();
		
		//Check for add (static)
		System.out.println("Check for add method (Static): ");
		System.out.print("Sum of Time 1 and Time 2: ");
		System.out.println(Time.add(t,t2));
		System.out.println();
				
		//Check for add (instance)
		System.out.println("Check for add method (instance): ");
		System.out.print("Sum of Time 1 and Time 2: ");
		System.out.println(t.add(t2));
		System.out.println();
		
		//Check for increment
		System.out.println("Check for increment: ");
		t.increment(t3);
		System.out.print("Time 1 incremented by Time 3 = ");
		System.out.println(t);
		System.out.println();
		
    }// end main
	
}// end class