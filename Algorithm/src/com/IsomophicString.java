package com;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/
public class IsomophicString {
	//leetcode solution
/*	public boolean isIsomorphic(String s, String t) {
       	char []temp1 = new char[128];
    	char []temp2 = new char[128];
    
    	for(int i=0;i<t.length();i++){
        	char ch1 = s.charAt(i);
        	char ch2 = t.charAt(i);
        	if(temp2[ch1]!=ch2 && temp2[ch1] !=0) return false;
        	if(temp1[ch2]!=ch1 && temp1[ch2] !=0) return false;
        	temp1[ch2] = ch1;
        	temp2[ch1] = ch2;
    	}
    	return true;
    }*/


	public static boolean isIsomorphic(String a, String b) {
		if(a.length()!=b.length()) return false;
		char[] temp1 = new char[128];
		char[] temp2 = new char[128];
		for(int i=0; i<a.length(); i++) {
			char ch1 = a.charAt(i);
			char ch2 = b.charAt(i);
			if(temp1[ch1] != ch2 && temp1[ch1]!=0) {
				return false;
			}
			if(temp2[ch2]!=ch1 && temp2[ch2]!=0) {
				return false;
			}
			temp1[ch1] = ch2;
			temp2[ch2] = ch1;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(IsomophicString.isIsomorphic("egg", "add"));//true
		System.out.println(IsomophicString.isIsomorphic("paper", "title"));//true
		System.out.println(IsomophicString.isIsomorphic("foo", "bar"));//false
		System.out.println(IsomophicString.isIsomorphic("ab", "aa"));//false
	}

}
