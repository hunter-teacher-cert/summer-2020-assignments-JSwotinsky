import java.io.*;
import java.util.*;

/*

Hunter CS Program
PublicKeyEncryption() Class

*/


public class PublicKeyEncryption{
    
	////////////////////Instance Variables////////////////////
	
	private static long p = 3;
	private static long q = 7;
    
	
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
	* Return the public key, e, the least positive long that meets both of the following requirements:
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
	* Return a private key, d, such that (e * d) mod phi = 1.
	* (This method uses the Extended Euclidean Algorithm (EAE).)
	*/
	private static long getD(long p, long q){
		// Establish variables:
		long phi = getPhi(p,q);
		long e = getE(p,q);		
		// Construct a 2D Array to walk through the steps of the EAE: 
		long[][] euclid = new long[2][2];
		// Set the values of the first row in the array to phi:
		euclid[0][0] = phi;
		euclid[0][1] = phi;
		// Set the values of the second row in the array to e and 1 respectively:
		euclid[1][0] = e;
		euclid[1][1] = 1;
		//Repeat the following process until euclid row 2 column 1 is equal to 1:
		while(euclid[1][0] != 1){
			// Find the quotient of euclid[0][0] and [1][0]
			long quotient = (euclid[0][0] - euclid[0][0]%euclid[0][1])/euclid[1][0];
			// Create an array to hold the products of quotient and each of the values in euclid row 2 respectively:
			long[] products = {euclid[1][0]*quotient,euclid[1][1]*quotient};
			// Create an array to hold the differences of the values in euclid row 1 and the values in product[] respectively.
			long[] differences = {euclid[0][0] - products[0], euclid[0][1] - products[1]};
			// While any of the values in differences are negative add Phi until they become positive:
			while(differences[0] < 0){
				differences[0] = differences[0] + phi;
			}// end while
			while(differences[1] < 0){
				differences[1] = differences[1] + phi;
			}// end while		
			// Assign the values in euclid row 2 to euclid row 1, and assign the values in differences to euclid row 2:
			euclid[0][0] = euclid[1][0];
			euclid[0][1] = euclid[1][1];
			euclid[1][0] = differences[0];
			euclid[1][1] = differences[1];
		}// end while
		return euclid[1][1];		
	}// end getD()
	
		
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
		
		
		// Test for getD() method:
		System.out.println("Test for getD() method:");
		long e = getE(p,q);
		long d = getD(p,q);
		long Phi = getPhi(p,q);
		System.out.printf("e = %d\n", e);
		System.out.printf("d = %d\n", d);
		System.out.printf("Phi = %d\n",Phi);
		System.out.printf("%d * %d mod %d = %d\n",e,d,Phi,(e*d)%Phi);
		System.out.println();
			
	}// end main()
	
}// end LList class