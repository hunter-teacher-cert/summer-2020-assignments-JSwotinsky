import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
		
		//Set time
		Time t = new Time(11,44,30.5);
		Time t2 = new Time(12,16,0);
		Time t3 = new Time(12,16,0);
		
		//Check for printTime method
		Time.printTime(t);
		
		//Check for printTime2 method
		t.printTime2();
		
		//Check for toString method
		String s = t.toString();
		System.out.println(s);
		
		//Check for toString method using System.out.println
		System.out.println(t);
		
		//Check for equals
		System.out.println(t.equals(t2));
		System.out.println(t.equals(t3));
		System.out.println(t2.equals(t));
		System.out.println(t2.equals(t3));
		System.out.println(t3.equals(t));
		System.out.println(t3.equals(t2));
		
    }// end main
}// end class