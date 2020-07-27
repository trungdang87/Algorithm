package com;

import java.lang.reflect.Array;
import java.util.Arrays;
/*
https://www.cnblogs.com/Dylan-Java-NYC/p/11280623.html
https://leetcode.com/problems/connecting-cities-with-minimum-cost/
*/
public class ConnectCitiesWithMinCost {
/*	class UF{
		int [] parent;
		int [] size;
		int count;
		public UF(int n){
			parent = new int[n+1];
			size = new int[n+1];
			for(int i = 0; i<=n; i++){
				parent[i] = i;
				size[i] = 1;
			}
			this.count = n;
		}
		public int find(int i){
			if(i != parent[i]){
				parent[i] = find(parent[i]);
			}
			return parent[i];
		}
		public void union(int p, int q){
			int i = find(p);
			int j = find(q);
			if(size[i] > size[j]){
				parent[j] = i;
				size[i] += size[j];
			}else{
				parent[i] = j;
				size[j] += size[i];
			}
			this.count--;
		}
	}

	public int minimumCost(int N, int[][] connections) {
		Arrays.sort(connections, (a, b) -> a[2]-b[2]);
		int res = 0;
		UF uf = new UF(N);
		for(int [] connect : connections){
			if(uf.find(connect[0]) != uf.find(connect[1])){
				uf.union(connect[0], connect[1]);
				res += connect[2];
			}
			if(uf.count == 1){
				return res;
			}
		}
		return -1;
	}*/
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//https://www.youtube.com/watch?v=V4hm80xAJmM
/*	int[] parent; //initialize parent point to itself parent of city1 is city1, 2->2, 3->3 ...
	//find parent of a city, "The city" that the input city points to
	public int findParent(int city) {
		if(parent[city] != city) {
			parent[city] = findParent(parent[city]);
		}
		return parent[city];
	}
	//convert all cities to connect to first city;
	public void union(int city1, int city2) {
		parent[findParent(city2)] = findParent(city1);
	}
	public int minimumCost(int n, int[][] connections) {
		parent = new int[n];
		for(int i=0; i<n; i++) {
			parent[i] = i;  //1->1, 2->2, 3->3 ....
		}
		Arrays.sort(connections, (a,b)->a[2]-b[2]); //sort by cost
		int cost = 0;
		for(int[] connection : connections) {
			if(findParent(connection[0] - 1) != findParent(connection[1] - 1)) { //if city1 nad city2 don't have same parent
				cost += connection[2];	//get the cost to connect 2 cities
				union(connection[0] - 1, connection[1] - 1); //connect them up
			}
		}
		int group = findParent(0); //get the "root city" that all other cities connect to
		for(int i=0; i<n; i++) {  //iterate through all cities to find out which city doesn't connect to the "root city"
			if(findParent(i) != group) { //if one city doesn't connect to "root city" return -1.
				return -1;
			}
		}
		return cost; //return the minimumCost
	}*/
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//Same as above but start i = 1 not 0;
	/*	int[] parent;
	public int findParent(int city) {
		if(city != parent[city]) {
			parent[city] = findParent(parent[city]);
		}
		return parent[city];
	}
	public void union(int city1, int city2) {
		parent[findParent(city2)] = findParent(city1);
	}
	public int minimumCost(int n, int[][] connections) {
		parent = new int[n+1];
		for(int i=1; i<=n; i++) {
			parent[i] = i;
		}
		Arrays.sort(connections, (a,b)->a[2]-b[2]);
		int cost = 0;
		for(int[] con : connections) {
			if(findParent(con[0]) != findParent(con[1])) {
				cost += con[2];
				union(con[0], con[1]);
			}
		}
		int rootCity = findParent(1); //city 1 must exist, cityId starts from 1 -> n
		for(int i=1; i<=n; i++) {
			if(findParent(i) != rootCity) {
				return -1;
			}
		}
		return cost;
	}*/
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//minimumCost
	
	
	
	
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public static void main(String[] args) {
		ConnectCitiesWithMinCost ob = new ConnectCitiesWithMinCost();
		int[][] input = {new int[] {1,2,5}, new int[] {1,3,6}, new int[] {2,3,1}};
		System.out.println(ob.minimumCost(3, input));
		
		int[][] input2 = {new int[] {1,2,3}, new int[] {3,4,4}};
		System.out.println(ob.minimumCost(4, input2));
		//6 -1
	}

	
		
	
	
	
	
}
