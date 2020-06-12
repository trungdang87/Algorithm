package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/3sum/submissions/
public class ThreeSum {

	/*public LinkedList<LinkedList<Integer>> find(int[] input, int target){
		int n = input.length;
		int newTarget = 0;
		Map<Integer, Integer> map;
		LinkedList<Integer> solution;
		LinkedList<LinkedList<Integer>> output = new LinkedList();
		LinkedList<LinkedList<Integer>> seenList = new LinkedList();

		for(int i = 0; i<n; i++) {
			newTarget = target - input[i];
			map = new HashMap();
			for(int j=i+1; j<n; j++) {
				if(map.containsKey(input[j])) {
					solution = new LinkedList();
					solution.add(input[i]);
					solution.add(input[map.get(input[j])]);
					solution.add(input[j]);
					Collections.sort(solution);
					if(seenList.indexOf(solution) == -1) {
						output.add(solution);
					}
					seenList.add(solution);
					//output.add(solution);

				}
				else {
					map.put(newTarget - input[j], j);
				}
			}
		}
		return output;
	}*/

	/*	public static ArrayList<ArrayList<Integer>> find(int[] arr, int target){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> solution = null;
		int left = 0, right = 0, sum = 0;
		int l = arr.length;
		Arrays.sort(arr);
		for(int i=0; i<l - 2; i++) {
			left = i+1;
			right = l - 1;
			while(left < right) {
				sum = arr[i] + arr[left] + arr[right];
				if(sum == target) {
					solution = new ArrayList<Integer>();
					solution.add(arr[i]);
					solution.add(arr[left]);
					solution.add(arr[right]);
					Collections.sort(solution);
					if(result.indexOf(solution) == -1) {
						result.add(solution);
					}
					++left; --right;
				}
				else if(sum < target) ++left;
				else --right;
			}
		}
		return result;
	}*/

	//https://leetcode.com/problems/3sum/
    public static Set<List<Integer>> threeSum(int[] arr, int target){
    	Arrays.sort(arr);
    	int left=0,right=0,sum=0;
    	Set<List<Integer>> result = new HashSet();
    	List<Integer> solution;
    	for(int i=0; i<arr.length-2; i++) {
    		left = i+1;
    		right=arr.length-1;
    		while(left<right) {
    			sum = arr[i] + arr[left] + arr[right];
    			if(sum==target) {
    				solution = new ArrayList();
    				solution.add(arr[i]);
    				solution.add(arr[left]);
    				solution.add(arr[right]);
    				result.add(solution);
    				left++;
    				right--;
    			}
    			if(sum<target) left++;
    			if(sum > target) right--;
    		}
    	}
    	return result;
    }


	public static void main(String[] args) {
		ThreeSum ob = new ThreeSum();
		//int[] input = new int[] {-3,-2,-1,0,1,2,3};
		int[] input = new int[] {-1, 0, 1, 2, -1, -4, -1, 1, -1, 2};
		int target = 0;
		Set<List<Integer>> output = ob.threeSum(input, target);
		for(List<Integer> i : output) {
			System.out.println(i);
		}
	}
}
