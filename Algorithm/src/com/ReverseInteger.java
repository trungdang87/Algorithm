package com;

public class ReverseInteger {

/*	public static int reverse(int input) {
		int output = 0;
		while(input != 0) {
			output = output * 10 + (input % 10);
			input = input / 10;
		}
		return output;
	}*/
	public static int reverse(int input) {
		int output = 0;
		while(input != 0) {
			output = output * 10 + input%10;
			input /= 10;
		}
		return output;
	}

	
	public static void main(String[] args) {
		System.out.println(reverse(12345));
		System.out.println(-12 % 10);
	}

}
