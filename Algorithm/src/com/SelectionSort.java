package com;

import java.util.Arrays;

public class SelectionSort {
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Selection Sort
/*	public static void selectionSort(int[] input) {
		int n = input.length;
		//one by one move boundary of unsorted subarray
		for(int i = 0; i < n-1; i++) {
			//find the minimum element in unsorted array
			int minIndex = i;
			for(int j = i+1; j < n; j++) {
				if(input[j] < input[minIndex]) {
					minIndex = j;
				}
			}
			//swap the found minimum element with the first element
			int temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
		}
	}*/
	
	public static void selectionSort(int[] arr) {
		int l = arr.length;
		int min = 0;
		for(int i = 0; i<l - 1; i++) {
			min = i;
			for(int j=i+1; j<l; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,10,10,0,9,7,6,5,3,3,1,8,7};
		SelectionSort.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
