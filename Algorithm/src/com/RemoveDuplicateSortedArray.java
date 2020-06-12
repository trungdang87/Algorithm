package com;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicateSortedArray {
/*	public static int removeDuplicates(int[] arr){
        if(arr.length==0) return 0;
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
	public static int[] afterRemove(int[] arr, int length) {
		return Arrays.copyOf(arr, length);
	}*/
	
	//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	public static int removeDuplicates(int[] arr) {
		int i = 0;
		for(int j=1; j<arr.length; j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return ++i;
	}
	public static int[] afterRemove(int[] arr, int k) {
		return Arrays.copyOf(arr, k);
	}
	
	public static void main(String[] args) {
		int[] input1 = {0,0,1,1,1,2,2,3,3,4};
		int a = removeDuplicates(input1);
		System.out.println(a);
		System.out.println(Arrays.toString(afterRemove(input1, a)));
		//5
		//[0, 1, 2, 3, 4]
	}

}
