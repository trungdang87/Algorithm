package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharactersInAString {
	
	//find all duplicate characters in a string
/*	public static void find(String input) {
		char[] characters = input.toCharArray();

		Map<Character,Integer> myMap = new HashMap<Character,Integer>();
		for(Character i : characters) {
			if(myMap.containsKey(i)) {
				myMap.put(i, myMap.get(i) + 1);
			}
			else {
				myMap.put(i, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = myMap.entrySet();
		for(Map.Entry<Character, Integer> i:entrySet) {
			if(i.getValue()>1) {
				System.out.printf("%s : %d %n", i.getKey(), i.getValue());
			}
		}

	}*/
	
	////////////////////////////////////////////////////////////////////////////////////
	//finding all non-duplicated characters in a string
/*	public static char dog(String input) {
		char[] characters = input.toCharArray();

		Map<Character,Integer> myMap = new HashMap<Character,Integer>();

		for (Character i : characters) {
			myMap.put(i, myMap.containsKey(i) ? myMap.get(i)+1 : 1);
		}

		Set<Map.Entry<Character, Integer>> entrySet = myMap.entrySet();
		for(Map.Entry<Character, Integer> i : entrySet) {
			if(i.getValue() == 1){
				return i.getKey();
			}
		}
		throw new RuntimeException("didn't find any non-repeated character");
	}*/
	
	public static void find(String s) {
		char[] chars = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c : chars) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		for(Map.Entry<Character, Integer> i : set) {
			if(i.getValue()>1) {
				System.out.printf("%s %d %n", i.getKey(), i.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		FindDuplicateCharactersInAString.find("dang quoc trung");

	}

}
