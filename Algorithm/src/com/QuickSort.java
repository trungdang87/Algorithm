package com;

import java.util.Arrays;

public class QuickSort {
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//QuickSort 
/*	public static void quickSort(int[] input, int l, int r) {
		if(l < r) {
			int pivot = partition(input, l, r);

			quickSort(input, l, pivot - 1);
			quickSort(input, pivot + 1, r);
		}
	}
	public static int partition(int[] input, int l, int r) {
		int pivot = input[r];
		int i = l - 1; // index of the smaller element
		int temp = 0;
		for(int j = l; j<r; j++) {
			if(input[j] <= pivot) {
				i++;
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
		temp = input[i+1];
		input[i+1] = input[r];
		input[r] = temp;

		return i + 1;
	}*/
	
	public static void quickSort(int[] arr, int l, int r) {
		if(l<r) {
			int pivot = partition(arr, l, r);
			quickSort(arr, l, pivot - 1);
			quickSort(arr, pivot+1, r);
		}
	}
	public static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int j = l - 1;
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
		return j;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,10,10,0,9,7,6,5,3,3,1,8,7};
		QuickSort.quickSort(arr, 0, 12);
		System.out.println(Arrays.toString(arr));
	}

}
