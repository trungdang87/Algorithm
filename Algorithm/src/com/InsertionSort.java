package com;

import java.util.Arrays;

public class InsertionSort {
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Insertion sort
/*	public static void insertionSort(int[] input) {
		int l = input.length;
		int key = 0;
		int j = 0;
		for(int i = 1; i < l; i++) {
			key = input[i];
			j = i - 1;
			while(j>=0 && input[j] > key) {
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = key;
		}
	}*/
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		int key = 0;
		int j = 0;
		for(int i = 1; i<n; i++) {
			key = arr[i];
			j = i - 1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	

	
	public static void main(String[] args) {
		int[] arr = {1,10,10,0,9,7,6,5,3,3,1,8,7};
		InsertionSort.insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
