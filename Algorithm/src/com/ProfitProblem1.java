package com;

import java.util.Arrays;

public class ProfitProblem1 {

	/*public static int[] solution(int[] data) {
		int buy = 0;
		int sell = 0;
		int profit = 0;
		int min = 0;
		for(int i=1; i<data.length; i++) {
			if(data[min] < data[i]) {
				if(profit < data[i] - data[min]) {
					profit = Math.max(profit, data[i] - data[min] );
					buy = min;
					sell = i;
				}
			}
			else if(data[min] > data[i]){
				min = i;
			}
		}
		return new int[] {buy + 1, sell + 1};
	}*/

	public static int[] solution(int[] arr) {
		int min=0, max=0, buy=0, sell=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[min] < arr[i]) {
				if(arr[i]-arr[min] > max) {
					buy = min;
					sell = i;
					max = arr[i]-arr[min];
				}
				
			}
			else {
				min = i;
			}
		}
		return new int[] {buy+1, sell+1};
	}


	public static void main(String[] args) {
		int[] data = new int[]{3,8,8,55,38,1,7,42,54,53};
		int[] dataPrice = new int[] {5,100,3,5,0,0,0,0,0,0};
		int[] dataPrice1 = new int[] {0,0,0,0,0,0,3,4,7,8};
		int[] dataPrice2 = new int[] {5,3,100,5};
		int[] data3 = new int[] {1,1,1,1};

		int[] output = ProfitProblem1.solution(data);
		System.out.println(Arrays.toString(output));
		System.out.println(Arrays.toString(ProfitProblem1.solution(dataPrice)));
		System.out.println(Arrays.toString(ProfitProblem1.solution(dataPrice1)));
		System.out.println(Arrays.toString(ProfitProblem1.solution(dataPrice2)));
		System.out.println(Arrays.toString(ProfitProblem1.solution(data3)));
		//[6, 9]
		//[1, 2]
		//[6, 10]
		//[2, 3]
		//[1, 1]
	}

}
