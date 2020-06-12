package com;

import java.util.Stack;

import javax.xml.stream.events.Characters;
//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class ReversePolishNotation {
	/*	public static int evalRPN(String[] tokens) {
        int returnValue = 0;
        String operators = "+-*\/";
        Stack<String> stack = new Stack<String>();
        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch(index){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
	 */
	//https://leetcode.com/problems/evaluate-reverse-polish-notation/
	public static int evalRPN(String[] arr) {
		Stack<String> stack = new Stack();
		String operators = "+-*/";
		for(String s : arr) {
			if(!operators.contains(s)) {
				stack.push(s);
			}
			else {
				int second = Integer.valueOf(stack.pop());
				int first = Integer.valueOf(stack.pop());
				int operator = operators.indexOf(s);
				switch(operator) {
				case 0 : stack.push(String.valueOf(first+second)); break;
				case 1 : stack.push(String.valueOf(first-second)); break;
				case 2 : stack.push(String.valueOf(first*second)); break;
				case 3 : stack.push(String.valueOf(first/second)); break;
				}
			}
		}
		return Integer.valueOf(stack.pop());
	}

	public static void main(String[] args) {
		System.out.println(ReversePolishNotation.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
		System.out.println(ReversePolishNotation.evalRPN(new String[] {"4", "13", "5", "/", "+"}));
		//["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
		//["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
	}

}
