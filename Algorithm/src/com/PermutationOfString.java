package com;

import java.util.Arrays;

public class PermutationOfString {
	
/*	public static void permutation(String input) {
		permutation("", input);
	}
	
	public static void permutation(String perm, String input) {
		if(input.isEmpty()) {
			System.out.println(perm);
			return;
		}
		for(int i = 0; i < input.length(); i++) {
			permutation(perm + input.charAt(i), input.substring(0, i) + input.substring(i+1));
		}
	}*/
	
	//permutation
	public static void permutation(String s) {
		permute("", s);
	}
	public static void permute(String p, String s) {
		if(s.length()==0) {
			System.out.println(p);
			return;
		}
		for(int i=0; i<s.length(); i++) {
			permute(p+s.charAt(i), s.substring(0,i) + s.substring(i+1));
		}
	}

	public static void main(String[] args) {
		PermutationOfString.permutation("ABC");
		
	}

}
