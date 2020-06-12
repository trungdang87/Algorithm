package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
/*
	public static int[] twoSum(int[] nums, int target) {
	    if(nums==null || nums.length<2)
	        return new int[]{0,0};

	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            return new int[]{map.get(nums[i]), i};
	        }else{
	            map.put(target-nums[i], i);
	        }
	    }

	    return new int[]{0,0};
	}
	public static ArrayList<ArrayList<Integer>> find(int[] arr, int target){
		if(arr == null || arr.length <= 1) {
			return null;
		}
		Map<Integer,Integer> map = new HashMap();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> solution = null;
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				solution = new ArrayList<Integer>();
				solution.add(arr[i]);
				solution.add(arr[map.get(arr[i])]);
				Collections.sort(solution);
				if(!result.contains(solution)) {
					result.add(solution);
				}
			}
			map.put(target - arr[i], i);
		}
		return result;
	}
	*/
	//https://leetcode.com/problems/two-sum/
	public static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				return new int[] {map.get(arr[i]), i};
			}
			else {
				map.put(target - arr[i], i);
			}
		}
		return new int[] {0,0};
	}
	
	public static ArrayList<ArrayList<Integer>> find(int[] arr, int target){
		if(arr == null || arr.length <= 1) {
			return null;
		}
		Map<Integer,Integer> map = new HashMap();
		ArrayList<ArrayList<Integer>> result = new ArrayList();
		ArrayList<Integer> solution;
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			if(map.containsKey(arr[i])) {
				solution = new ArrayList();
				solution.add(arr[i]);
				solution.add(arr[map.get(arr[i])]);
				Collections.sort(solution);
				if(!result.contains(solution)) {
					result.add(solution);
				}
			}
			else {
				map.put(target - arr[i], i);
			}
		}
		return result;
	}

	

	public static void main(String[] args) {
		int[] input = {10,4,6,4,0};
		int[] output = new int[2];
		output = TwoSum.twoSum(input, 10);
		System.out.println(Arrays.toString(output)); // [1, 2]
		System.out.println();

		ArrayList<ArrayList<Integer>> result = TwoSum.find(input, 10);
		for(ArrayList<Integer> a : result) {
			System.out.println(a);
		}
		//[4, 6] , [0, 10]
		
	}

}
