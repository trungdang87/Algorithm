package com;

public class MaximumSubarray {

/*	Given an integer array nums, find the contiguous subarray 
	(containing at least one number) which has the largest sum and return its sum.
	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.*/
	
/*    public static int find(int[] nums) {
        int sum, max;
        max = sum = nums[0];
        for(int i = 1; i < nums.length; ++i) {
            sum = sum < 0 ? nums[i] : nums[i] + sum;
            max = Math.max(sum, max);
        }
        return max;
    }*/
	//https://leetcode.com/problems/maximum-subarray/
	public static int find(int[] arr) {
		int sum = arr[0];
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			sum = sum < 0 ? arr[i] : sum + arr[i];
			max = Math.max(sum, max);
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] input = {-2,1,-3,4,-1,2,1,-5,4};
		int[] input1 = {-2,1,-3};
		int[] input2 = {-2,-3};
		int[] input3 = {-3,-1};
		System.out.println(MaximumSubarray.find(input));	//6
		System.out.println(MaximumSubarray.find(input1));	//1
		System.out.println(MaximumSubarray.find(input2));	//-2
		System.out.println(MaximumSubarray.find(input3));	//-1

	}

}
