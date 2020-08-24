package com;

//https://leetcode.com/problems/can-place-flowers/

public class Flowerbed {
/*	public static boolean canPlaceFlowers(int[] arr, int n) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i==arr.length - 1 || arr[i+1]==0)) {
				arr[i] = 1;
				count++;
			}
			if(count>=n) {
				return true;
			}
		}
		return false;
	}*/
	//https://leetcode.com/problems/can-place-flowers/
	public static boolean canPlaceFlowers(int[] arr, int n) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i==arr.length-1 || arr[i+1]==0)) {
				arr[i] = 1;
				count++;
			}
			if(count>=n) return true;
		}
		return false;
	}
	
	////https://leetcode.com/problems/can-place-flowers/
	public static void main(String[] args) {
		System.out.println(Flowerbed.canPlaceFlowers(new int[] {0,1,0,1,0,1,0,0}, 1));//true
		System.out.println(Flowerbed.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));//true
		System.out.println(Flowerbed.canPlaceFlowers(new int[] {0,0,0,0}, 2));//true
		System.out.println(Flowerbed.canPlaceFlowers(new int[] {1,0,0,0,1}, 2));//false
		System.out.println(Flowerbed.canPlaceFlowers(new int[] {0,0,0,0,0}, 4));//false 
		
	}

}
