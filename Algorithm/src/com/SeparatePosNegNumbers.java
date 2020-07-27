package com;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
public class SeparatePosNegNumbers {

	/*public static void rearrange(int[] arr) {
		int j=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		j++;
		int i = 0;
		while(j<arr.length) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
			i+=2;
		}
	}*/
	public static void rearrange(int[] arr) {
		int j = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		j++;
		int i = 0;
		while(j<arr.length) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
			i+=2;
		}
	}
	
	//Arrange + - + - + - ......
	public static void main(String[] args) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		rearrange(arr);
		System.out.println(Arrays.toString(arr));
	}
}
