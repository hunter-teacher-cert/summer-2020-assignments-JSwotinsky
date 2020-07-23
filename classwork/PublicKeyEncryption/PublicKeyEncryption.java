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
	* Take two "large" primes, p and q, and return the product of p and q. 
	*/
	private long getN(int p, int q){
		return p*q;
	}
	
	
	/**
	* Take two "large" primes, p and q, and return the product of (p-1) and (q-1). 
	*/
	private long getPhi(int p, int q){
		return (p-1)*(q-1);
	}
	
	/**
	* Return the least prime number that is not a factor of Phi. 
	*/
	private long getE(){
		return (p-1)*(q-1);
		
		
		
	}
	
	
	
	public static void main(String[] args){
			
			
			
	}// end main
	
}// end LList class