package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class RemoveDuplicateAdvance {

	/*
	// Remove Duplicates
// -----------------
//
// Please follow the below instructions exactly and carefully
//
// Deliverables:
//  Write a working application that means all requirements.  You can write the application in 
//  Java OR JavaScript (you do NOT need to write in both languages).
//
//  Email us both the source code and console output with results from running the application.
//
//  The console output must be shown for running your application with the input 
//  “AbraCadABraAlakAzam”
// 
//  The console output from your application must exactly match the sample output provided 
//  below.
//
//  Send us your work within 30 minutes.  It is better to submit what you have at 30 minutes, 
//  and then followup with better code later should you wish to do so.
//
// Requirements:
//  Write an application that takes a single string as input.  
//  Write a function `removeDuplicates` that removes duplicate letters, case insensitively, so 
//  that every letter appears once and only once. 
//  Always keep the first occurrence of a letter, regardless of case.
//  The function should only accept uppercase and lowercase letters.
//  Your application should output the result of this function when called on the input string to 
//  the console.
//
//  The application may not terminate due to exceptions or errors, including if we test the 
//  program with different inputs than the example provided.
//
//
// Example: the output from an input String of "AbraCadABraAlakAzam" is shown below.
// 
// AbrCdlkzm
	 */

	/*	public static String remove(String input) {
		try {	//Prevent application is terminated if something went wrong;
			Map<Integer,Character> map = new HashMap();
			int count = 0;
			int temp = 0;
			String output = "";
	        char[] chars = input.toCharArray();
	        for(Character c : chars) {
	        	if((65<=c && c<=90) || (97<=c && c<=122)) {	//To check input String contains only lowercase and uppercase letters;
	        		if(!map.containsValue(c)) {
		        		map.put(++count, c);
		        		if(Character.isLowerCase(c)) {
		        			map.put(--temp, Character.toUpperCase(c));
		        		}
		        		else {
		        			map.put(--temp, Character.toLowerCase(c));
		        		}
		        	}
	        	}
	        	else {
	        		return "String can only contain lowercase and uppercase letters";
	        	}
	        }
	        for(int i=1; i<=count; i++) {
	        	output += map.get(i);
	        }
	        return output;
		}
		catch(Exception e) {
			return "Something went wrong!";
		}
    }*/

	public static String remove(String s) {
		Set<Character> set = new HashSet<>();
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(Character c : chars) {
			if(!set.contains(c)) {
				sb.append(c);
			}
			set.add(Character.toLowerCase(c));
			set.add(Character.toUpperCase(c));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(RemoveDuplicateAdvance.remove("AbraCadABraAlakAzam"));
		PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
	}
}

//Output is "AbrCdlkzm"


