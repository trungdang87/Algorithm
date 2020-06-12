package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramStrings{

	//really bad solution
/*	public static boolean anagram(String a, String b) {
		if(a.length() != b.length()) return false;
		char[] chars = a.toCharArray();
		for(char c : chars) {
			if(b.indexOf(c)==-1) return false;
			b = b.substring(0,b.indexOf(c)) + b.substring(b.indexOf(c) + 1);
		}
		return b.isEmpty();
	}*/

	/*
	 https://leetcode.com/problems/group-anagrams/
	 https://leetcode.com/problems/find-all-anagrams-in-a-string/
	 https://leetcode.com/problems/valid-anagram/
	 
	 */
	
	
	
	public static void main(String[] args) {
		//System.out.println(AnagramStrings.anagram("1234","341")); //false
		//System.out.println(AnagramStrings.anagram("1236","3166"));	//false
		//System.out.println(AnagramStrings.anagram("1234","3421"));	//true
	}
}




