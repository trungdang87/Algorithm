package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/4sum
public class FourSum {

	/*public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> solution = null;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; ++i) {
            for (int j = i + 1; j < nums.length - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                    	solution = new ArrayList<Integer>();
                    	solution.add(nums[i]);
                    	solution.add(nums[j]);
                    	solution.add(nums[left]);
                    	solution.add(nums[right]); 
                    	Collections.sort(solution);
                        if(result.indexOf(solution) == -1){
                            result.add(solution);
                        }
                        ++left; --right;
                    } else if (sum < target) ++left;
                    else --right;
                }
            }
        }
        return result;
    }*/
	
	public static Set<List<Integer>> fourSum(int[] arr, int target){
		Set<List<Integer>> result = new HashSet<>();
		List<Integer> list;
		Arrays.sort(arr);
		int left = 0, right = 0, sum = 0;
		for(int i=0; i<arr.length - 3; i++) {
			for(int j=i+1; j<arr.length - 2; j++) {
				if(j>i+1 && arr[j]==arr[j-1]) continue;
				left = j+1;
				right = arr.length - 1;
				while(left < right) {
					sum = arr[i] + arr[j] + arr[left] + arr[right];
					if(sum==target) {
						list = new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[left]);
						list.add(arr[right]);
						result.add(list);
						left++;
						right--;
					}
					if(sum<target) left++;
					if(sum>target) right--;
				}
			}
		}
		return result;
	}
	
	////https://leetcode.com/problems/4sum
	public static void main(String[] args) {
		int[] nums = new int[] {1, 0, -1, 0, -2, 2, 2, 3};
		Set<List<Integer>> result = FourSum.fourSum(nums, 0);
		for(List<Integer> a : result) {
			System.out.println(a);
		}
		//[-2, -1, 0, 3]
		//[-2, 0, 0, 2]
		//[-2, -1, 1, 2]
		//[-1, 0, 0, 1]
	}

}
