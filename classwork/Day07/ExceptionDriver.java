import java.io.*;
import java.util.*;

public class ExceptionDriver {
	public static void main(String[] args){
		int[] a = new int[5];
		
		//The next line of code will result in a runtime error (ArrayIndexOutOfBoundsException: Inded 10 out of bounds for length 5).
		//a[10] = 100;	

		//The next line of code will result in a runtime error (ArithmeticException: / by 0).
		//System.out.println(4 / 0);
		
		//The next line of code will result in a runtime error (ArithmeticException: / by 0).
		//System.out.println(4 % 0);
		
		//The next 2 lines of code will result in a compile time error because n has not been instantiated.
		//Node n;
		//n.setData("Hello");
		
		//The next line of code will result in...?
		//n.getNext().setData("hello");
		
		//The next 2 lines of code will result in...?
		//Node n = new Node("yo");
		//n.getNext().setData("hello");
		
		//The next 2 lines of code will result in...?
		//Node n = null;
		//n.getNext().setData("hello");	
		
		//The next 3 lines of code will not result in an exception, but we want them to because...?
		LList g = new LList();
		g.addFront(null);
		System.out.println(g);
		
	}// end main
	
}// end ExceptionDriver class