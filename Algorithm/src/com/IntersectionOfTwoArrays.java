package com;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
	
	
	//https://leetcode.com/problems/intersection-of-two-arrays/
/*	public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i : nums1){
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i : nums2){
            set2.add(i);
        }
        if(set1.size() < set2.size()){
            return setIntersection(set1,set2);
        }
        else {return setIntersection(set2,set1);}
    }
    public static int[] setIntersection(HashSet<Integer> set1, HashSet<Integer> set2){
        int[] temp = new int[set1.size()];
        int index = 0;
        for(Integer i : set1){
            if(set2.contains(i)){
                temp[index++] = i;
            }
        }
        return Arrays.copyOf(temp,index);
    }*/
	
	public static int[] intersection(int[] num1, int[] num2) {
		HashSet<Integer> set1 = new HashSet();
		for(int i : num1) {
			set1.add(i);
		}
		HashSet<Integer> set2 = new HashSet();
		for(int i : num2) {
			set2.add(i);
		}
		int length1 = set1.size();
		int length2 = set2.size();
		if(length1 <= length2) {
			return intersection(set1, set2);
		}
		return intersection(set2, set2);
	}
	public static int[] intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
		int[] result = new int[set1.size()];
		int index = 0;
		for(Integer i : set1) {
			if(set2.contains(i)) {
				result[index++] = i;
			}
		}
		return Arrays.copyOf(result, index);
	}
	
	//Intersection and Union of 2 lists
	//https://www.geeksforgeeks.org/union-and-intersection-of-two-linked-lists/
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));	//2
		
		int[] nums3 = {4,9,5};
		int[] nums4 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersection(nums3, nums4)));	//4,9
		

	}

}
