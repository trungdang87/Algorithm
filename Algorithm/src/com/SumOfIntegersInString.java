package com;

public class SumOfIntegersInString {
//https://stackoverflow.com/questions/28227772/return-the-sum-of-all-integers-from-a-random-string-without-using-regex
	
/*	public static int solution(String s) {
		String currentNumber = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			// Add digits or a leading minus to "currentNumber"
			if (Character.isDigit(currentChar) || (currentNumber.equals("") && currentChar == '-')) {
				currentNumber += currentChar;
			} 
			else {
				// We've stumbled across a non-digit char.
				//Try to parse the "currentNumber" we have so far
				if (!currentNumber.equals("") && !currentNumber.equals("-"))
					sum += Integer.parseInt(currentNumber);
				currentNumber = "";
			}
		}

		// Add the last "currentNumber" in case the string ends with a
		// number
		if (!currentNumber.equals("") && !currentNumber.equals("-"))
			sum += Integer.parseInt(currentNumber);
		return sum;
	}*/
	//this solution can't do negative numbers, above solution can do negative solution
	//My solution can't do negative numbers
/*	public static int solution(String s) {
		int currentNumber = 0;
		int result = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				currentNumber = currentNumber*10 + Integer.valueOf("" + s.charAt(i));
			}
			else {
				result += currentNumber;
				currentNumber = 0;
			}
		}
		result += currentNumber;
		return result;
	}*/
	
	//try both methods (one don't work with negative numbers)
	

	public static void main(String[] args) {
		String testStrings[] = { "-a1b-2b3c","1a2b3c", "123ab!45c", "abcdef", "0123.4",
		"dFD$#23+++12@#T1234;/.,10" };
		for(String s : testStrings) {
			System.out.println(solution(s));
		}

		/*
		"-a1b-2b3c" = 2 (1-2+3) if negative number is count (top most solution can solve negative number)
		"1a2b3c" => 6        (1+2+3)
		"123ab!45c" => 168   (123+45)
		"abcdef" => 0        (no Integers in String)
		"0123.4" => 127      (0123+4)
		"dFD$#23+++12@#T1234;/.,10"  => 1279  (23+12+1234+10)
		
		//0
		//6
		//168
		//0
		//127
		//1279
		
		*/

	}
}
