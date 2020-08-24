package com;

//https://codippa.com/how-to-find-factors-of-a-number-in-java/
public class FactorOfANumber {
/*	static void printPFsInPairs(int n) 
    { 
        for(int i=1; i*i<=n; i++) {
        	if(n%i==0) {
        		System.out.println(i + "*" + n/i);
        	}
        }
    } */
	
	public static void print(int n) {
		for(int i=1; i*i<=n; i++) {
			if(n%i==0) {
				System.out.println(i + " " + n/i);
			}
		}
	}

    public static void main(String[] args) 
    { 
  
        int n = 16; 
        print(n); 
    } 
}
