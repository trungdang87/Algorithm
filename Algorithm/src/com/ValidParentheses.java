package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

/*	https://leetcode.com/problems/valid-parentheses/
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	determine if the input string is valid.
	An input string is valid if:
	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Note that an empty string is also considered valid.
	
	Input: "()"
	Output: true
	
	Input: "()[]{}"
	Output: true
	
	Input: "(]"
	Output: false
	
	Input: "([)]"
	Output: false
	
	Input: "{[]}"
	Output: true*/
	
	/*Map<Character, Character> map;
	ValidParentheses(){
		map = new HashMap();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
	}
	
	public  boolean isIt(String s) {
		Stack<Character> stack = new Stack();
		char c = ' ';
		for(int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			if(map.containsKey(c)) {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					if(map.get(stack.pop()) != c) {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}*/
	
	//https://leetcode.com/problems/valid-parentheses/
	HashMap<Character,Character> map;
	ValidParentheses(){
		map = new HashMap();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
	}
	public boolean isIt(String s) {
		Stack<Character> stack = new Stack<>();
		char[] chars = s.toCharArray();
		for(Character c : chars) {
			if(map.containsKey(c)) {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) return false;
				else {
					if(map.get(stack.pop())!=c)return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		ValidParentheses object = new ValidParentheses();
		System.out.println(object.isIt("(]"));		//false
		System.out.println(object.isIt("([)]"));	//false
		System.out.println(object.isIt("()"));		//true
		System.out.println(object.isIt("()[]{}"));	//true
		System.out.println(object.isIt("{[]}"));	//true

	}

}
