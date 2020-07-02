import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
		
		//Set time
		Time t = new Time(11,44,30.5);
		
		//Check for printTime method
		Time.printTime(t);
		
		//Check for printTime2 method
		t.printTime2();
		
		//Check for toString method
		String s = t.toString();
		System.out.println(s);
		
		//Check for toString method using System.out.println
		System.out.println(t);
		
    }// end main
}// end class