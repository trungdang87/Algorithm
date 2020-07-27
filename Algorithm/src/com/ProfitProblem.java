package com;

public class ProfitProblem {
	
	//input [3,4,7,8] => output = 5 because of 8 - 3
	//input [5,100,3,5] => output = 95 because of 100 - 5; it can't be 100 - 3, min must be in front of max
	//input [5,3,100,5] => 97
	
/*	public static int profit(int[] priceData) {
		int n = priceData.length;
		int min = priceData[0];
		int profit = 0;
		for(int i=0; i<n; i++) {
			if(priceData[i] < min) {
				min = priceData[i];
			}
			if(priceData[i] > min) {
				profit = Math.max(profit, priceData[i] - min);
			}
		}
		return profit;
	}*/
	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	public static int profit(int[] arr) {
		int min = 0;
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[min]) {
				max = Math.max(arr[i] - arr[min], max);
			}
			else {
				min = i;
			}
		}
		return max;
	}
	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	public static void main(String[] args) {
		int[] dataPrice = new int[] {5,100,3,5};
		int[] dataPrice1 = new int[] {3,4,7,8};
		int[] dataPrice2 = new int[] {5,3,100,5};
		System.out.println(profit(dataPrice));	//95
		System.out.println(profit(dataPrice1));	//5
		System.out.println(profit(dataPrice2));	//97

	}

}
