import java.io.*;
import java.util.*;

/*

Hunter CS Program
PublicKeyEncryption() Class

*/


public class PublicKeyEncryption{
    
	////////////////////Instance Variables////////////////////
	
	private static long p = 7;
	private static long q = 11;
    
	
	////////////////////Constructors////////////////////
	
    
	
	
	////////////////////Methods////////////////////
	
	/**
	* Take two longs, m and n, and return true if m is a factor of n or false if m is not a factor of n.
	*/
	private static boolean isFactorOf(long m, long n){
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % m == 0){
				return true;
			}// end if else
		}// end for i
		return false;
	}// end isFactorOf()
	
	
	/**
	* Take a long, n, and return true if n is prime or false if n is not prime.
	*/
	private static boolean isPrime(long n){
		for(int i = 2; i <= n/2; i++){
			if(isFactorOf(i, n)){
				return false;
			}// end if	
		}// end for i
		return true;	
	}// end isPrime()
	
	
	/**
	* Take two "large" primes, p and q, and return the product of p and q. 
	*/
	private static long getN(long p, long q){
		return p*q;
	}// end getN()
	
	
	/**
	* Take two "large" primes, p and q, and return the product of (p-1) and (q-1). 
	*/
	private static long getPhi(long p, long q){
		return (p-1)*(q-1);
	}// end getPhi()
	
	
	/**
	* Return the least positive long, e, that meets both of the following requirements:
	* e is greater than or equal to 3. 
	* e is prime.
	* e is not a factor of Phi.
	*/
	private static long getE(long p, long q){
		boolean foundE = false;
		long e = 2;
		while(foundE == false){
			e++;
			if(isPrime(e) && isFactorOf(e,getPhi(p,q)) != true){
				foundE = true;
			}// end if
		}// end while
		return e;		
	}// end getE()
	
	
	/**
	* main
	*/
	public static void main(String[] args){
		
		// Test for isFactorOf() method:
		System.out.println("\nTest for isFactorOf() method:");
		System.out.printf("%d is a factor of %d: %B\n",2,10,isFactorOf(2,10));
		System.out.printf("%d is a factor of %d: %B\n",2,6,isFactorOf(2,6));
		System.out.printf("%d is a factor of %d: %B\n",6,2,isFactorOf(6,2));
		System.out.printf("%d is a factor of %d: %B\n",3,10,isFactorOf(3,10));			
		System.out.println();
		
		
		// Test for isPrime() method:
		System.out.println("Test for isPrime() method:");
		for(int i = 2; i <= 20; i++){
			System.out.printf("%d is prime: %B\n", i, isPrime(i));
		}// end for i
		System.out.println();
		
		
		// Test for getN() method:
		System.out.println("Test for getN() method:");
		System.out.printf("p = %d\n", p);
		System.out.printf("q = %d\n", q);
		System.out.printf("n = %d\n", getN(p,q));	
		System.out.println();
		
		
		// Test for getPhi() method:
		System.out.println("Test for getPhi() method:");
		System.out.printf("p - 1 = %d\n", p - 1);
		System.out.printf("q - 1 = %d\n", q - 1);
		System.out.printf("Phi = %d\n", getPhi(p,q));	
		System.out.println();
		
		
		// Test for getE() method:
		System.out.println("Test for getE() method:");
		System.out.printf("Phi = %d\n", getPhi(p,q));
		System.out.printf("e = %d\n", getE(p,q));	
		System.out.println();
			
	}// end main()
	
}// end LList class