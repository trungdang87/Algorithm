package com;

import java.util.Arrays;

public class MergeSort {

	/*public static void sort(int[] input, int l, int r) {
		if(l < r) {
			int m = (l+r)/2;
			sort(input, l, m);
			sort(input, m + 1, r);
			merge(input, l, m, r);
		}
		
	}
	public static void merge(int[] input, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i = 0; i<n1; i++) {
			left[i] = input[l + i];
		}
		for(int j = 0; j<n2; j++) {
			right[j] = input[m + j + 1];
		}
		int i = 0, j = 0, k = l;
		while(i<n1 && j<n2) {
			if(left[i] <= right[j]) {
				input[k] = left[i];
				i++;
			}
			else {
				input[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			input[k] = left[i];
			i++; k++;
		}
		while(j<n2) {
			input[k] = right[j];
			j++; k++;
		}
	}*/
	
	public static void sort(int[] arr, int l, int r) {
		if(l < r) {
			int m = (l+r)/2;
			sort(arr, l, m);
			sort(arr, m+1, r);
			merge(arr, l, r, m);
		}
	}
	public static void merge(int[] arr, int l, int r, int m) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i=0; i<n1; i++) {
			left[i] = arr[l + i];
		}
		for(int j=0; j<n2; j++) {
			right[j] = arr[m + j + 1];
		}
		int i=0, j=0, k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				k++;
				i++;
			}
			else {
				arr[k] = right[j];
				j++; k++;
			}
		}
		while(i<n1) {
			arr[k] = left[i];
			k++; i++;
		}
		while(j<n2) {
			arr[k] = right[j];
			k++;j++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,10,10,0,9,7,6,5,3,3,1,8,7};
		MergeSort.sort(arr, 0, 12);
		System.out.println(Arrays.toString(arr));
		
	}

}
