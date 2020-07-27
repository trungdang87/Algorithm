package com;

public class FindNumberOfVowelInString {
	
/*	public static void find(String input) {
		char[] characters = input.toCharArray();
		int count = 0;
		for(Character c : characters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': count++;
			}
		}
		System.out.println("# of vowel: " + count);
	}*/
	
	public static void find(String s) {
		int count = 0;
		char[] chars = s.toCharArray();
		for(char c : chars) {
			switch(c) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' : count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		FindNumberOfVowelInString.find("dang quoc trung");//4

	}

}
