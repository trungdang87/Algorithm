package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/discuss/interview-question/370112
//https://leetcode.com/discuss/interview-question/344976/Amazon-or-OA-2019-or-Substrings-of-size-K-with-K-distinct-chars
public class SubstringSizeKDistintChar {
/*	public static List<String> kSubstring(String s, int k) {
        Set<Character> window = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int start = 0, end = 0; end < s.length(); end++) {
            for (; window.contains(s.charAt(end)); start++) {
                window.remove(s.charAt(start));
            }

            window.add(s.charAt(end));

            if (window.size() == k) {
                result.add(s.substring(start, end + 1));
                window.remove(s.charAt(start++));
            }
        }
        return new ArrayList<>(result);
    }*/
	
	//Revised solution, easier to understand
/*	public static List<String> kSubstring(String s, int k){
		Set<Character> window = new HashSet<>();
		Set<String> result = new HashSet<>();
		for(int start=0, end=0; end<s.length(); end++) {
			while(window.contains(s.charAt(end))) {
				window.remove(s.charAt(start));
				start++;
			}
			window.add(s.charAt(end));
			if(window.size()==k) {
				result.add(s.substring(start, end+1));
				window.remove(s.charAt(start));
				start++;
			}
		}
		return new ArrayList<>(result);
	}*/
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//kSubstring
	//think of all distincts to have if(window.size()==k) execute first, then think of while statement
	
	
	
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    public static void main(String[] args) {
    	System.out.println(kSubstring("baaaaaabaaaaaabc", 3));
    	System.out.println(kSubstring("abcabc", 3));
    	System.out.println(kSubstring("abacab", 3));
        System.out.println(kSubstring("awaglknagawunagwkwagl", 4));
        //[abc]
        //[bca, abc, cab]
        //[bac, cab]
        //[lkna, nagw, kwag, awun, wuna, agwk, wagl, aglk, glkn, gawu, unag, knag]
        
        
    }
}
