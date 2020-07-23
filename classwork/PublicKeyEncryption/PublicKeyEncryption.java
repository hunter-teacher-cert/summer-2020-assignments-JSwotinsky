import java.io.*;
import java.util.*;

/*

Hunter CS Program
PublicKeyEncryption() Class

*/


public class PublicKeyEncryption{
    
	////////////////////Instance Variables////////////////////
	
	
    
	
	////////////////////Constructors////////////////////
	
	

    
	////////////////////Methods////////////////////
	
	/**
	* Take two longs, m and n, and return true if m is a factor of n or false if m is not a factor of n.
	*/
	private boolean isFactorOf(long m, long n){
		for(i == 2; i <= Math.sqrt(n); i++){
			if(n % m == 0){
				return true;
			} else {
				return false;
			}// end if else
		}// end for i
	}// end isFactorOf()
	
	
	/**
	* Take a long, n, and return true if n is prime or false if n is not prime.
	*/
	private boolean isPrime(long n){
		for(i == 2; i <= n/2; i++){
			if(isFactorOf(i, n){
				return false;
			}// end if	
		}// end for i
		return true;	
	}// end isPrime()
	
	
	/**
	* Take two "large" primes, p and q, and return the product of p and q. 
	*/
	private long getN(long p, long q){
		return p*q;
	}// end getN()
	
	
	/**
	* Take two "large" primes, p and q, and return the product of (p-1) and (q-1). 
	*/
	private long getPhi(long p, long q){
		return (p-1)*(q-1);
	}// end getPhi
	
	
	/**
	* Return the least prime number that is not a factor of Phi. 
	*/
	private long getE(){
		// Beginning with n = 3, check to see if n meets the following conditions:
		// (1) n is prime.
		isPrime(argument)
		// (2) n is not a factor of Phi.
		
		
		
		isPrime(35) --> false
		isPrime(7) --> true
		
	}
	
	
	
	public static void main(String[] args){
			
			
			
	}// end main
	
}// end LList class