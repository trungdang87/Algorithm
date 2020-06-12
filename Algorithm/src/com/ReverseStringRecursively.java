package com;

public class ReverseStringRecursively {

/*	//reverse string recursively
	public static String reverse(String input) {
		if(input.length() < 2) {
			return input;
		}
		return reverse(input.substring(1)) + input.charAt(0);
	}*/
	
	public static String reverse(String s) {
		if(s.length()<=1) return s;
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse("1234"));
	}

}
