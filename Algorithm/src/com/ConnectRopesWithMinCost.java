package com;

import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/
public class ConnectRopesWithMinCost {
	/*
	static int solution(int arr[], int n) 
    { 
        // Create a priority queue 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
  
        // Adding items to the pQueue 
        for (int i = 0; i < n; i++) { 
            pq.add(arr[i]); 
        } 
  
        // Initialize result 
        int res = 0; 
  
        // While size of priority queue 
        // is more than 1 
        while (pq.size() > 1) { 
            // Extract shortest two ropes from pq 
            int first = pq.poll(); 
            int second = pq.poll(); 
  
            // Connect the ropes: update result 
            // and insert the new rope to pq 
            res += first + second; 
            pq.add(first + second); 
        } 
  
        return res; 
    } */
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//solution
	//think of {100 1 2 200}
	//1+2, 3+100, 103 + 200
	
	
	
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	public static void main(String[] args) {
		int[] input = {4,3,2,6};
		System.out.println(solution(input, 4));
		int[] input2 = {100, 2, 1, 200};
		System.out.println(solution(input2, 4));
		//29 409
	}
	
	
	

}
