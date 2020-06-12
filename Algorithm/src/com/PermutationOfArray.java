package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationOfArray {
/*
	//https://leetcode.com/problems/permutations/
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    
    private void dfs(List<List<Integer>> res, int[] nums, List<Integer> temp, boolean[] isUsed) {
        if(temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!isUsed[i]) {
                temp.add(nums[i]);
                isUsed[i] = true;
                dfs(res, nums, temp, isUsed);
                temp.remove(temp.size() - 1);
                isUsed[i] = false;
            }
        }
    }
	*/


/*	public ArrayList<ArrayList<Integer>> permute(int[] nums){
		ArrayList<ArrayList<Integer>> result = new ArrayList();
		ArrayList<Integer> solution = new ArrayList();
		ArrayList<Integer> list = (ArrayList) Arrays.stream(nums).boxed().collect(Collectors.toList());
		permute(result, solution, list);
		return result;
	}
	public void permute(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> solution, ArrayList<Integer> input) {
		if(input.isEmpty()) {
			results.add(solution);
			return;
		}
		for(Integer i : input) {
			ArrayList<Integer> temp1 = new ArrayList(input);
			temp1.remove(i);
			ArrayList<Integer> temp2 = new ArrayList(solution);
			temp2.add(i);
			permute(results, temp2, temp1);
		}
	}*/
	
	//https://leetcode.com/problems/permutations/
	public ArrayList<ArrayList<Integer>> permute(int[] arr){
		ArrayList<Integer> input = (ArrayList) Arrays.stream(arr).boxed().collect(Collectors.toList());
		ArrayList<ArrayList<Integer>> result = new ArrayList();
		ArrayList<Integer> list = new ArrayList();
		permute(list, input, result);
		return result;
	}
	public void permute(ArrayList<Integer> list, ArrayList<Integer>input, ArrayList<ArrayList<Integer>> result) {
		if(input.isEmpty()) {
			result.add(new ArrayList(list));
			return;
		}
		for(Integer i : input) {
			ArrayList<Integer> temp1 = new ArrayList(list);
			ArrayList<Integer> temp2 = new ArrayList(input);
			temp1.add(i);
			temp2.remove(i);
			permute(temp1, temp2, result);
		}
	}
	//https://leetcode.com/problems/permutations/
	
	public static void main(String[] args) {
		PermutationOfArray ob = new PermutationOfArray();
		int[] input = {-1,2,3};
		ArrayList<ArrayList<Integer>> results =  ob.permute(input);
		for(List<Integer> i : results) {
			System.out.println(i);
		}
		System.out.println((Integer.valueOf(-1 + "")) instanceof Integer);
	}
}
