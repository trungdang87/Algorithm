package com;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElement {

	public int findKthLargest(int[] arr, int k) {
        // (nums.length - k)th smallest element = kth largest element
		int quickSelect = quickSelect(arr, arr.length - k, 0, arr.length - 1);
        return arr[quickSelect];
    }
    
    // Quickselect to get the position of kth SMALLEST element 
    int quickSelect(int[] arr, int k, int l, int r) {
        int pivot = arr[r], j = l - 1;
        
        for(int i=l; i<r; i++) {
        	if(arr[i] <= pivot) {
        		j++;
        		int temp = arr[i];
        		arr[i] = arr[j];
        		arr[j] = temp;
        	}
        }
        j++;
        int temp = arr[r];
        arr[r] = arr[j];
        arr[j] = temp;
        
        if(j==k) {
        	return j;
        }
        if(j<k) {
        	return quickSelect(arr, k, j+1, r);
        }
        return quickSelect(arr, k, l, j-1);
    }
    
    
}
