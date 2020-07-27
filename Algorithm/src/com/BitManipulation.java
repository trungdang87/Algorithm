package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class BitManipulation{	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//You are given two 32-bit numbers, N and M, and two bit positions, i and j Write a method 
	//to set all bits between i and j in N equal to M (e g , M becomes a substring of N located at 
	//		i and starting at j)
	//EXAMPLE:
	//Input: N = 128 = 10000000, M = 21 = 10101, i = 2, j = 6 // Output = 212 = 11010100
/*	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0; //max = 11111111111; all 1's

		// 1’s through position j, then 0’s
		//(1<<j) = 01000000;
		//(1<<j)-1 = 00111111;
		//max-((1<<j)-1) = 11000000;
		int left=max-((1<<j)-1);
		
		// 1’s after position i
		//(1<<i) = 00000100
		//(1<<i)-1 = 00000011
		int right=((1<<i)-1);

		// 1’s, with 0s between i and j
		//mask = 11000011
		int mask = left | right;

		// Clear i through j, then put m in there
		//(n & mask) = 10000000
		//(m << i) = 01010100
		//(n & mask) | (m << i) = 11010100
		return (n & mask) | (m << i);
	}*/
	//updateBits nnnnjmmmminnnn (n, m, i, j)
	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0;
		int left = max - ((1<<j) - 1);
		int right = (1<<i) - 1;
		int temp = left | right;
		return (n&temp) | (m<<i);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Write a function to determine the number of bits required to convert integer A to integer B
	//Input: 31, 14 Output: 2
	/*public static int bitSwapRequired(int a, int b) {
		//get different bits between 2 numbers using XOR ^
		int diff_bits = a ^ b;
		
		int count = 0;
		while(diff_bits != 0) {
			count = count + (diff_bits & 1);
			diff_bits >>= 1;
		}
		return count;
	}*/
	//bitSwapRequired
	public static int bitSwapRequired(int a, int b) {
		int diff = a^b;
		int count = 0;
		while(diff!=0) {
			count = count + (diff&1);
			diff = diff >> 1;
		}
		return count;
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Write a program to swap odd and even bits in an integer with as few instructions as possible (e g , bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc)
	//https://www.geeksforgeeks.org/swap-all-odd-and-even-bits/
	//input = 23, output = 43
/*	public static int swapOddEvenBits(int x) {
		//get all even bits by & 10101010101010101010101010101010
		int even_bits = x & 0xaaaaaaaa; 
		
		//get all odd bits by & 1010101010101010101010101010101
		int odd_bits = x & 0x55555555;
		
		//shift even bits to odd bits >>
		even_bits = even_bits >> 1;
		
		//shift odd bits to even bits <<
		odd_bits = odd_bits << 1;
		
		//combine even bits and odd bits
		return (even_bits | odd_bits);
	}*/
	//swapOddEvenBits
	public static int swapOddEvenBits(int n) {
		int odd = n&0x55555555;
		int even = n&0xaaaaaaaa;
		odd = odd <<1;
		even = even >> 1;
		return odd | even;
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//RETURN MAXIMUM CONSECUTIVE 0 BITS
	//EXAMPLE 545 = 1000100001 HAS 3 0'S AND 4 0'S, METHOD SHOULD RETURN 4;
	// 521 = 1000001001 HAS 5 0'S AND 2 0'S, METHOD SHOULD RETURN 5;
/*	public static int max(int input) {
		int count = 0, max = 0;
		while(input != 0) {
			if((input & 1) == 0) {
				count++;
				max = Math.max(max, count);
			}
			else {
				//max = Math.max(max, count); //Do we need this line?
				count = 0;
			}
			input >>= 1;
		}
		return max;
	}*/
	//max
	public static int max(int n) {
		int count = 0;
		int max = 0;
		while(n!=0) {
			if((n&1)==0) {
				count++;
			}
			else {
				max = Math.max(max,  count);
				count = 0;
			}
			n >>= 1;
		}
		return max;
	}
	
	public static void main( String[] args) {
		int a = 123;
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {1,10,10,0,9,7,6,5,3,3,1,8,7};
		String b = "1234";
		String c = "42315";
		
		System.out.println("Update Bits (212) : " + BitManipulation.updateBits(128,21,2,6));
		System.out.println("Bits swap required (2) "  + bitSwapRequired(31,14));
		System.out.println("swap odds and evens (43) " + BitManipulation.swapOddEvenBits(23));
		System.out.println("MAXIMUM CONSECUTIVE 0 BITS (5) : " + BitManipulation.max(521)); //5
	}

}