package com;

public class PrimeNumber {

/*	public static boolean isPrime(int number) {
		if(number == 0 || number == 1) {
			return false;
		}
		if(number == 2) return true;
		if(number%2 == 0) return false;
		for(int i=3; i*i<number; i+=2) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}*/
	
	public static boolean isPrime(int n) {
		if(n==0 || n==1) return false;
		if(n==2) return true;
		if(n%2==0) return false;
		for(int i=3; i*i<=n; i+=2) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPrime(2147483647));//false
		System.out.println(isPrime(14));		//fasle
		System.out.println(isPrime(20));		//false
		System.out.println(isPrime(5));			//true
		System.out.println(isPrime(17));		//true
		System.out.println(isPrime(2));			//true
		System.out.println(isPrime(999999937));	//true
		
	}

}
