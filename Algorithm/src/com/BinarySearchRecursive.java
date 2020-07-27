package com;

public class BinarySearchRecursive {
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Binary search for element x in a sorted array recursive
	//return index of x if found, else return -1
/*	public static int binarySearch(int[] input, int l, int r, int x) {
		if(l <= r) {
			int m = (l + r)/2;
			if(x == input[m]) {
				return m;
			}
			if(x < input[m]) {
				return binarySearch(input, l, m-1, x);
			}
			return binarySearch(input, m+1, r, x);	
		}
		return -1;
	}*/
	
	public static int binarySearchRecursive(int[] arr, int l, int r, int x) {
		if(l<=r) {
			int m = (l+r)/2;
			if(arr[m]==x) return m;
			if(x < arr[m]) return binarySearchRecursive(arr, l, m - 1, x);
			return binarySearchRecursive(arr, m+1, r, x);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int a = BinarySearchRecursive.binarySearchRecursive(arr, 0, 8, 0);
		int b = BinarySearchRecursive.binarySearchRecursive(arr, 0, 8, 1);
		int c = BinarySearchRecursive.binarySearchRecursive(arr, 0, 8, 5);
		int d = BinarySearchRecursive.binarySearchRecursive(arr, 0, 8, 9);
		int e = BinarySearchRecursive.binarySearchRecursive(arr, 0, 8, 12);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		//-1, 0, 4, 8, -1
	}

}
