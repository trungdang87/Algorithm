package com;

import java.util.Arrays;

/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

Java Solution

This is a dp problem. The key is to find the relation which is dp[i] = min(dp[i], dp[i-square]+1). For example, dp[5]=dp[4]+1=1+1=2.
 */

//https://leetcode.com/problems/perfect-squares/submissions/
public class PerfectSquare {
	/*	
	public static int numSquares(int n) {
	    int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		for(int i=1;i*i<=n;i++){
			dp[i*i]=1;
		}
		dp[0]=0;
		for(int i=1; i*i<=n;i++){
			int k = i*i;
			for(int j=k; j+k<=n ; j++){
				dp[j+k] = Math.min(dp[j+k], dp[j]+1);
			}
		}

		return dp[n];
	}
	 */
	//https://leetcode.com/problems/perfect-squares/
	public static int numSquares(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		Arrays.fill(dp, Integer.MAX_VALUE);
		for(int i=1; i*i<=n; i++) {
			dp[i*i] = 1;
		}
		for(int i=1; i*i<=n; i++) {
			int k = i*i;
			for(int j=k; j+k<=n; j++) {
				dp[j+k] = Math.min(dp[j+k], dp[j] + 1);
			}
		}
		return dp[n];
	}


	public static void main(String[] args) {
		System.out.println(PerfectSquare.numSquares(12)); //3 because 12 = 4 + 4 + 4
		System.out.println(PerfectSquare.numSquares(13)); //2 because 13 = 4 + 9.
		System.out.println(PerfectSquare.numSquares(11)); //3 because 11 = 9 + 1 + 1

		//System.out.println(Integer.MAX_VALUE);

	}
}
