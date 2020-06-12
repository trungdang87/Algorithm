package com;

public class Fibonacci {

/*	public static int fabonacci(int input) {
		if(input == 1 || input == 2) {
			return 1;
		}
		return fabonacci(input - 1) + fabonacci(input - 2);
	}*/
	
/*	public static int fabonacci(int x) {
		if(x == 0) {
			return 0;
		}
		if(x == 1 || x == 2) {
			return 1;
		}
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i=3; i<=x; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}*/
	
	//https://leetcode.com/problems/fibonacci-number/
	public static void main(String[] args) {
		for(int i = 0; i <= 8; i++) {
			//System.out.print(fabonacci(i) + " ");
		}

	}

}
