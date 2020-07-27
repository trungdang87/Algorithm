package com;

public class FindSecondSmallestInSinglePass {
	//https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
	/*public static void find(int[] arr) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] < first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}
		if(second == Integer.MAX_VALUE) {
			System.out.println("No second smallest");
		}
		else {
			System.out.println("Second smallest is " + second);
		}
	}*/
	public static void find(int[] arr) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i : arr) {
			if(i<first) {
				second = first;
				first = i;
			}
			else if(i<second && i!=first) {
				second = i;
			}
		}
		System.out.println(second);
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 13, 1, 10, 34, 1};
		int[] arr1 = {1,1};
		int[] arr2 = {1,2};
		find(arr);	//10
		find(arr1);	//no second max
		find(arr2);	//2
	}

}
