package com;

public class PowerOfThree {
	//https://leetcode.com/articles/power-of-three/
	//without loop
	//input = 3^i;
	//i = log(3)input;
	//i = log(n)input/log(n)3;
/*	public static boolean isPowerOfThree(int n) {
		if(n <= 0) {
			return false;
		}
		double d =  (Math.log10(n)/Math.log10(3));
		return Math.pow(3, d) == n;
	}
	
	//with loop
	public static boolean isPowerOfThree2(int n) {
		if(n <= 0) {
			return false;
		}
		if(n == 1) {
			return true;
		}
		while(n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}*/
	
	
	public static boolean isIt(int n) {
		//n = 3^i;
		//i = log3(n);
		//i = log10(n) / log10(3);
		double i = Math.log10(n) / Math.log10(3);
		return i%1==0;
	}
	
	public static void main(String[] args) {
		System.out.println(PowerOfThree.isIt(0));//false
		System.out.println(PowerOfThree.isIt(-27));//false
		System.out.println(PowerOfThree.isIt(15));//false
		System.out.println(PowerOfThree.isIt(45));//false
		System.out.println(PowerOfThree.isIt(1));//true
		System.out.println(PowerOfThree.isIt(27));//true
		
	}

}
