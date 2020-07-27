package com;


//https://leetcode.com/articles/climbing-stairs/
public class ClimbingStairs {
	/*	You are climbing a stair case. It takes n steps to reach to the top.
	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	Note: Given n will be a positive integer.

	Example 1:

	Input: 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
	Example 2:

	Input: 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step*/
	
	
	/*	Approach 1: Brute Force
	Algorithm
	In this brute force approach we take all possible step combinations i.e. 1 and 2, at every step. 
	At every step we are calling the function climbStairsclimbStairs for step 11 and 22, and return the sum of returned values of both functions.
	climbStairs(i,n)=(i + 1, n) + climbStairs(i + 2, n) climbStairs(i,n)=(i+1,n)+climbStairs(i+2,n)
	where ii defines the current step and nn defines the destination step.*/
/*	public static int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }*/
	//climbStairs
	public static int climbStairs(int n) {
		return climbStairs(n, 0);
	}
	public static int climbStairs(int n, int i) {
		if(i>n) return 0;
		if(i==n) return 1;
		return climbStairs(n, i+1) + climbStairs(n, i+2);
	}
	
    
/*    Approach 2: Recursion with Memoization
    Algorithm
    In the previous approach we are redundantly calculating the result for every step. 
    Instead, we can store the result at each step in memo array and directly 
    returning the result from the memo array whenever that function is called again.
    In this way we are pruning recursion tree with the help of memo array and reducing the size of recursion tree upto n.*/
/*    public static int climbStairsRecursion(int n) {
    	int[] memo = new int[n + 1];
    	return climbStairsRecursion(n, memo, 0);
    }
    public static int climbStairsRecursion(int n, int[] memo, int i) {
    	if(i>n) return 0;
    	if(i==n) return 1;
    	if(memo[i]>0) return memo[i];
    	memo[i] = climbStairsRecursion(n, memo, i+1) + climbStairsRecursion(n, memo, i+2);
    	return memo[i];
    }*/
	//climbStairsMemo
	public static int climbStairsMemo(int n) {
		int[] memo = new int[n+1];
		return climbStairsMemo(n, 0, memo);
	}
	public static int climbStairsMemo(int n, int i, int[] memo) {
		if(i>n) return 0;
		if(i==n) return 1;
		if(memo[i]>0) return memo[i];
		memo[i] = climbStairsMemo(n, i+1, memo) + climbStairsMemo(n, i+2, memo);
		return memo[i];
	}
    
	
	//Dynamic programming
/*	public static int climbStairsDynamic(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }*/
	//climbStairsDynamic
	public static int climbStairsDynamic(int n) {
		if(n==1) return 1;
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
    
	public static void main(String[] args) {
		System.out.println(ClimbingStairs.climbStairs(5)); //3
		System.out.println(ClimbingStairs.climbStairsMemo(5)); //3
		System.out.println(ClimbingStairs.climbStairsDynamic(5)); //3
	}

}
