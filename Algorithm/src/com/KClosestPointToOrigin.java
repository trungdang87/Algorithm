package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/k-closest-points-to-origin/
public class KClosestPointToOrigin {
	/*public static int[][] kClosest(int[][] points, int k) {
		HashMap<int[],Integer> hm= new HashMap<>();
		int[][] result=new int[k][2];
		PriorityQueue<Map.Entry<int[],Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
		for(int[] a:points)
		{
			int distance=(a[0]*a[0]) + (a[1]*a[1]);
			hm.put(a,distance);
		}
		pq.addAll(hm.entrySet());
		while(k>0)
		{
			int[] a= pq.poll().getKey();
			System.out.println( Arrays.toString(a));
			result[k-1]=a;
			k--;

		}
		return result;

	}*/
	
	public static  int[][] kClosest(int[][] points, int k){
		Map<int[], Integer> map = new HashMap<>();
		for(int[] i : points) {
			int distance = i[0]*i[0] + i[1]*i[1];
			map.put(i, distance);
		}
		PriorityQueue<Map.Entry<int[], Integer>> pq = new PriorityQueue<>((a,b)->a.getValue() - b.getValue());
		pq.addAll(map.entrySet());
		int[][] result = new int[k][2];
		for(int i=0; i<k; i++) {
			result[i] = pq.poll().getKey();
		}
		return result;
	}
			
	public static void main(String[] args) {
		int[][] result = KClosestPointToOrigin.kClosest(new int[][] {{3, 3},{5,-1},{-2,4}}, 2);//[3, 3] , [-2, 4]
		//Input: points = [[3,3],[5,-1],[-2,4]], K = 2
		//Output: [[3,3],[-2,4]]
		//(The answer [[-2,4],[3,3]] would also be accepted.)
		System.out.println("result: ");
		for(int[] i : result) {
			System.out.print(Arrays.toString(i) + " ");
		}
		
	}
	
	
	
}
