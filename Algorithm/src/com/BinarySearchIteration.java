package com;

public class BinarySearchIteration {
	
	//Bionary search using iteration 
/*	public static int binarySearch2(int[] input, int x) {
		int l = 0, r = input.length -1;
		while(l <= r) {
			int m = (r+l)/2;
			if(x == input[m]) {
				return m;
			}

			if (x > input[m]) {
				l = m + 1;
			}
			else {
				r = m - 1;
			}	
		}
		return -1;
	}*/

	public static int search(int[] arr, int l, int r, int x) {
		while(l<=r) {
			int m = (l+r)/2;
			if(x== arr[m]) return m;
			if(x>arr[m]) l = m+1;
			else {
				r = m-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int a = BinarySearchIteration.search(arr, 0, 8, 0);
		int b = BinarySearchIteration.search(arr, 0, 8, 1);
		int c = BinarySearchIteration.search(arr, 0, 8, 5);
		int d = BinarySearchIteration.search(arr, 0, 8, 9);
		int e = BinarySearchIteration.search(arr, 0, 8, 12);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		//-1, 0, 4, 8, -1
	}

}
