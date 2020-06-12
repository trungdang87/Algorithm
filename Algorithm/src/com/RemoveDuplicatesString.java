package com;

import java.util.Arrays;

public class RemoveDuplicatesString {
	static char[] removeDuplicatesFromString(String string) { 
		// keeps track of visited characters 
		int counter = 0; 
		char[] str = string.toCharArray(); 
		int i = 0; 
		int size = str.length; 

		// gets character value 
		int x; 

		// keeps track of length of resultant String 
		int length = 0; 

		while (i < size) { 
			x = str[i] - 97; 

			// check if Xth bit of counter is unset 
			if ((counter & (1 << x)) == 0) { 

				str[length] = (char)('a' + x); 

				// mark current character as visited 
				counter = counter | (1 << x); 

				length++; 
			} 
			i++; 
		} 
		return Arrays.copyOfRange(str, 0, length); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "AbraCadABraAlakAzam"; 
		System.out.println(removeDuplicatesFromString(str)); //AbrCdlkzm
		
	} 
}
