package com;

public class ReverseWordInString {

/*	public static String reverse(String input) {
		String[] words = input.trim().split("\\s");
		StringBuilder reverse = new StringBuilder();
		for(int i = words.length - 1; i>=0; i--) {
			reverse.append(words[i]);
			reverse.append(" ");
		}
		return reverse.toString().trim();
	}*/
	public static String reverse(String s) {
		String[] strings = s.split("\\s");
		StringBuilder sb = new StringBuilder();
		for(int i=strings.length - 1; i>=0; i--) {
			sb.append(strings[i] + " ");
		}
		return sb.toString().trim();
	}
		
	public static void main(String[] args) {
		String a = ReverseWordInString.reverse("dang quoc trung");
		System.out.println(a);
	}

}
