package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern2 {
/*
	public boolean wordPatternMatch(String pattern, String str) {
	    if(pattern.length()==0 && str.length()==0)
	        return true;
	    if(pattern.length()==0)
	        return false;
	    HashMap<Character, String> map = new HashMap<Character, String>();
	    HashSet<String> set = new HashSet<String>();
	    return helper(pattern, str, 0, 0, map, set);
	}
	public boolean helper(String pattern, String str, int i, int j, HashMap<Character, String> map, HashSet<String> set){
	    if(i==pattern.length() && j==str.length()){
	        return true;
	    }
	    if(i>=pattern.length() || j>=str.length())
	        return false;
	    char c = pattern.charAt(i);
	    for(int k=j+1; k<=str.length(); k++){
	        String sub = str.substring(j, k);
	        if(!map.containsKey(c) && !set.contains(sub)){
	            map.put(c, sub);
	            set.add(sub);
	            if(helper(pattern, str, i+1, k, map, set))
	                return true;
	            map.remove(c);
	            set.remove(sub);
	        }else if(map.containsKey(c) && map.get(c).equals(sub)){
	            if(helper(pattern, str, i+1, k, map, set))
	                return true;
	        }
	    }
	    return false;
	}*/
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public boolean wordPatternMatch(String pattern, String string) {
		Map<Character, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		return helper(pattern, string, map, set, 0, 0);
	}
	public boolean helper(String pattern, String string, Map<Character, String> map, Set<String> set, int i, int j) {
		if(i==pattern.length() && j==string.length()) return true;
		if(i==pattern.length() || j==string.length()) return false;
		char c = pattern.charAt(i);
		for(int k=j+1; k<string.length(); k++) {
			String substring = string.substring(j, k);
			if(!map.containsKey(c) && !set.contains(substring)) {
				map.put(c, substring);
				set.add(substring);
				if(helper(pattern, string, map, set, i+1, k)) return true;
				map.remove(c, substring);
				set.remove(substring);
			}
			else if(map.containsKey(c) && map.get(c).equals(substring)) {
				if(helper(pattern, string, map, set, i+1, k)) return true;
			}
		}
		return false;
	}
	
	
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public static void main(String[] args) {
		WordPattern2 ob = new WordPattern2();
		System.out.println(ob.wordPatternMatch("abab", "redblueredblue"));
		System.out.println(ob.wordPatternMatch("aaaa", "asdasdasdasd"));
		System.out.println(ob.wordPatternMatch("aabb", "xyzabcxzyabc"));
		//true true false
	}
	
	
}
