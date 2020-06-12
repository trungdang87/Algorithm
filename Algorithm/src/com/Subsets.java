package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/subsets/submissions/
public class Subsets {
/*	
	1.Subsets (easy one)
	Given a set of distinct integers, nums, return all possible subsets (the power set).

	Note: The solution set must not contain duplicate subsets.

	Example:

	Input: nums = [1,2,3]
	Output:
	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
	]
*/
	
/*	public static ArrayList<ArrayList<Integer>> subsets(int[] input){
		if(input == null) {
			return null;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> temp;
		ArrayList<Integer> single;
		for(int i = 0; i<input.length; i++) {
			temp = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
			for(ArrayList<Integer> a : temp) {
				a.add(input[i]);
			}
			single = new ArrayList<Integer>();
			single.add(input[i]);
			temp.add(single);
			result.addAll(temp);
		}
		result.add(new ArrayList<Integer>());
		return result;
	}*/
	
	//RECURSION
/*	public static List<List<Integer>> subsets(int[] arr){
		List<List<Integer>> result = new LinkedList();
		subsets(arr, 0, new LinkedList(), result);
		return result;
	}
	public static void subsets(int[] arr, int index, LinkedList<Integer> list, List<List<Integer>> result) {
		if(index==arr.length) {
			result.add(new LinkedList(list));
			return;
		}
		list.add(arr[index]);
		subsets(arr, index + 1, list, result);
		list.removeLast();
		subsets(arr, index+1, list, result);
	}*/
	
	// 2 methods: iterative and recursive (think int[] arr = {1})
	//https://leetcode.com/problems/subsets/
	public static List<List<Integer>> subsets(int[] arr){
		List<List<Integer>> result = new ArrayList();
		LinkedList<Integer> list = new LinkedList();
		subsets(arr, 0, list, result);
		return result;
	}
	public static void subsets(int[] arr, int index, LinkedList<Integer> list, List<List<Integer>> result) {
		if(index>=arr.length) {
			result.add(new LinkedList(list));
			return;
		}
		list.add(arr[index]);
		subsets(arr, index+1, list, result);
		list.removeLast();
		subsets(arr, index+1, list, result);
	}
	//https://leetcode.com/problems/subsets/
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	//https://leetcode.com/problems/subsets/
	public static void main(String[] args) {
		int[] input = {1,2,3};
		List<List<Integer>> result = Subsets.subsets(input);
		for(List<Integer> a : result) {
			System.out.println(a);
		}
	}
    
    
}
