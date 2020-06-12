package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AllPalindromeOfString {
	/*
	//All palindrome of a string
	public static Set<String> find(String s){
		Set<String> result = new HashSet();
		int left=0,right=0;
		int max = 0;
		int start = 0, end = 0;
		for(int i=0; i<s.length(); i++) {
			//even
			left=i;
			right=i+1;
			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
				result.add(s.substring(left,right + 1));
				left--;
				right++;
			}
			//odd
			left = i;
			right = i+1;
			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
				result.add(s.substring(left,right + 1));
				left--;
				right++;
			}
		}
		return result;
	}

	//Maximum palindrome substring
	public static String max(String s) {
		if (s == null || s.length() < 1) return "";
		int left=0, right =0;
		int start=0, end=0, max=0;
		for(int i=0; i<s.length(); i++) {
			//even
			left=i;
			right=i+1;
			while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
				if(right-left > max) {
					start = left;
					end = right;
					max = Math.max(max, right - left);
				}
				left--; right++;
			}
			//odd
			left=i;
			right=i;
			while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {	
				if(right-left > max) {
					start = left;
					end = right;
					max = Math.max(max, right - left);
				}
				left--; right++;
			}
		}
		return s.substring(start,end +1);
	}*/


	//All palindrome of a string find(String s)
	public static Set<String> find(String s){
		Set<String> result = new HashSet<>();
		int left = 0, right=0;
		for(int i = 0; i<s.length(); i++) {
			//even
			left = i;
			right= left+1;
			while(left>=0 && right<s.length()) {
				if(s.charAt(left)==s.charAt(right)) {
					result.add(s.substring(left, right + 1));
					left--;
					right++;
				}
				else {
					break;
				}
			}
			//odd
			left = i;
			right = i;
			while(left>=0 && right<s.length()) {
				if(s.charAt(left)==s.charAt(right)) {
					result.add(s.substring(left, right + 1));
					left--;
					right++;
				}
				else {
					break;
				}
			}
		}
		return result;
	}

	//Maximum palindrome substring max(String s)
	public static String max(String s) {
		int left =0, right=0, max=0;
		int start = 0, end = 0;
		for(int i=0; i<s.length(); i++) {
			//even
			left = i;
			right = left+1;
			while(left>=0 && right<s.length()) {
				if(s.charAt(left)==s.charAt(right)) {
					if(right - left > max) {
						start = left;
						end = right;
						max = Math.max(max,  right - left);
					}
					left--;
					right++;
				}
				else break;
			}
			//odd
			left = i;
			right = i;
			while(left>=0 && right<s.length()) {
				if(s.charAt(left)==s.charAt(right)) {
					if(right - left > max) {
						start = left;
						end = right;
						max = Math.max(max,  right - left);
					}
					left--;
					right++;
				}
				else break;
			}
		}
		return s.substring(start, end + 1);
	}
	


	public static void main(String[] args) {
		Set<String> result = AllPalindromeOfString.find("aabacca");
		System.out.println(result);
		//[a, aa, b, aba, c, cc, acca]

		System.out.println(max("aabacca"));
		//acca
		
	}

}
