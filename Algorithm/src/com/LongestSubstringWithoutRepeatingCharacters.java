package com;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class LongestSubstringWithoutRepeatingCharacters {
	

/*Complexity Analysis

Time complexity : O(n)O(n). Index jj will iterate nn times.

Space complexity (HashMap) : O(min(m, n))O(min(m,n)). Same as the previous approach.

Space complexity (Table): O(m)O(m). mm is the size of the charset.*/
	
	
	
	//https://leetcode.com/problems/longest-substring-without-repeating-characters/
	//Given a string, find the length of the longest substring 
	//without repeating characters.
/*    public static int find(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }*/
	
	//[i,j) if encounter repeated char, i move to index of repeated char + 1
	
	//https://leetcode.com/problems/longest-substring-without-repeating-characters/
	public static int find(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int max = 0;
		for(int i=0,j=0; j<s.length(); j++) {
			char c = s.charAt(j);
			if(map.containsKey(c)) {
				i = Math.max(i, map.get(c));
			}
			map.put(c, j+1);
			max = Math.max(max,  j - i +1);
		}
		return max;
	}
	
	public static String lookup(String s) {
		int max = 0;
		int start=0, end = 0;
		char c = ' ';
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0, j=0; j<s.length(); j++) {
			c = s.charAt(j);
			if(map.containsKey(c)) {
				i = Math.max(i, map.get(c));
			}
			if(j-i+1 > max) {
				start = i;
				end = j;
				max = Math.max(max, j - i + 1);
			}
			
			map.put(c, j+1);
			
		}
		return s.substring(start, end + 1);
	}
	public static void main(String[] args) {
		System.out.println(LongestSubstringWithoutRepeatingCharacters.find("abcabcbb"));//3 The answer is "abc", with the length of 3. 
		System.out.println(LongestSubstringWithoutRepeatingCharacters.find("bbbbb"));	//1 The answer is "b", with the length of 1.
		System.out.println(LongestSubstringWithoutRepeatingCharacters.find("pwwkew"));	//3 The answer is "wke", with the length of 3. 
        																		//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
		System.out.println(LongestSubstringWithoutRepeatingCharacters.find("abacd")); 	//4	"bacd" = 4
		
		System.out.println(LongestSubstringWithoutRepeatingCharacters.lookup("abcabcbb"));//abc
		System.out.println(LongestSubstringWithoutRepeatingCharacters.lookup("pwwkew"));//wke
		System.out.println(LongestSubstringWithoutRepeatingCharacters.lookup("abacd"));//bacd
	}

}
