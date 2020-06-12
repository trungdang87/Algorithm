package com;

import java.util.Arrays;

public class BubbleSort {

/*	public static void sort(int[] input) {
		int n = input.length;
		int temp = 0;
		for (int i = 0; i<n - 1; i++) {
			for (int j = 1; j<n - i; j++) {
				if(input[j - 1] > input[j]) {
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
	}*/
	public static void sort(int[] arr) {
		int l = arr.length;
		for(int i=0; i<l - 1; i++) {
			for(int j=1; j<l - i; j++) {
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		int[] arr = {1,10,10,0,9,7,6,5,3,3,1,8,7};
		BubbleSort.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
