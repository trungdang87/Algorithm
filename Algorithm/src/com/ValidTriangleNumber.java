package com;

import java.util.Arrays;

//https://leetcode.com/problems/valid-triangle-number/
/*
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
 */
public class ValidTriangleNumber {
/*	public static int triangleNumber(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int k = i + 2;
			for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
				while (k < nums.length && nums[i] + nums[j] > nums[k]) {
					k++;
				}
				count += k - j - 1;
			}
		}
		return count;
	}*/
	
	
	//BinarySearch
/*	int binarySearch(int nums[], int l, int r, int x) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
                k = binarySearch(nums, k, nums.length - 1, nums[i] + nums[j]);
                count += k - j - 1;
            }
        }
        return count;
    }*/
	//https://leetcode.com/problems/valid-triangle-number/
	//triangleNumber
	public static int triangleNumber(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		for(int i = 0; i<arr.length-2; i++) {
			int k = i+2;
			for(int j=i+1; j<arr.length-1 && arr[i]!=0; j++) {
				k = binarySearch(arr, k, arr.length-1, arr[i] + arr[j]);
				count += k-j-1;
			}
		}
		return count;
	}
	public static int binarySearch(int[] arr, int l, int r, int x) {
		if(l<=r) {
			int m=(l+r)/2;
			if(arr[m] < x) {
				return binarySearch(arr, m+1, r, x);
			}
			return binarySearch(arr, l, m-1, x);
		}
		return l;
	}
	//https://leetcode.com/problems/valid-triangle-number/
	public static void main(String[] args) {
		System.out.println(ValidTriangleNumber.triangleNumber(new int[] {4,2,2,3}));//3
	}
}
