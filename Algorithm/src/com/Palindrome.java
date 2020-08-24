package com;

public class Palindrome {
/*	
	public static boolean isIt(String s) {
		if(s.length()<=1) return true;
		int n = s.length();
		int left=0, right=0;
		if(n%2==0) {
			left = n/2 - 1;
			right = left + 1;
			while(left>=0) {
				if(s.charAt(left)==s.charAt(right)) {
					left--;
					right++;
				}
				else {
					return false;
				}
			}
		}
		else {
			left = n/2 - 1;
			right = n/2 + 1;
			while(left>=0) {
				if(s.charAt(left)==s.charAt(right)) {
					left--;
					right++;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isIt1(String s) {
		return s.equals(reverse(s));
	}
	public static String reverse(String s) {
		if(s.length()<=1) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}*/
	
	public static boolean isIt1(String s) {
		return s.equals(reverse(s));
	}
	public static String reverse(String s) {
		if(s.length()<=1) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
	//isIt
	public static boolean isIt(String s) {
		boolean result = true;
		if(s==null) return false;
		if(s.length()==0 || s.length()==1) return true;
		if(s.length() % 2==0) {
			int left = s.length()/2 - 1;
			int right = left+1;
			result = check(s, left, right);
		}
		else {
			int left = s.length()/2;
			int right = left;
			result = check(s, left, right);
		}
		return result;
	}
	public static boolean check(String s, int left, int right) {
		while(left>=0 && right<s.length()) {
			if(s.charAt(left)==s.charAt(right)){
				left--;
				right++;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(Palindrome.isIt("qqw"));
		System.out.println(Palindrome.isIt("eeq"));
		System.out.println(Palindrome.isIt(""));
		System.out.println(Palindrome.isIt("sas"));
		System.out.println(Palindrome.isIt("sss"));
		System.out.println(Palindrome.isIt("baab"));
		System.out.println();
		System.out.println(Palindrome.isIt1("qqw"));
		System.out.println(Palindrome.isIt1("eeq"));
		System.out.println(Palindrome.isIt1(""));
		System.out.println(Palindrome.isIt1("sas"));
		System.out.println(Palindrome.isIt1("sss"));
		System.out.println(Palindrome.isIt1("baab"));
		

	}

}
