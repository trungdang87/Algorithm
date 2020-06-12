package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	static String findNumber(List<Integer> arr, int k) {

		if(arr.indexOf(k) == -1) {
			return "NO";
		}
		return "YES";
	}

	static List<Integer> oddNumbers(int l, int r) {
		LinkedList<Integer> solution = new LinkedList();
		if(l % 2 != 0) {
			while (l <= r) {
				solution.add(l);
				l += 2;
			}

		}
		else {
			l++;
			while(l <=r) {
				solution.add(l);
				l += 2;
			}
		}
		return solution;
	}
	
	//input [3, 1, 2, 2, 4]
	//output [1, 3, 4, 2, 2]
	public static void customSort(List<Integer> arr) {
		Collections.sort(arr);
		int n = arr.size();
		Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		for(int i=0; i<n; i++) {
			if(myMap.containsKey(arr.get(i))) {
				myMap.put(arr.get(i), myMap.get(arr.get(i)) + 1);
			}
			else {
				myMap.put(arr.get(i), 1);
			}
		}
		int tempV = 0;
		int tempK = 0;
		Set<Map.Entry<Integer,Integer>> mySet = myMap.entrySet();
		for(Map.Entry<Integer,Integer> e : mySet) {
			tempV = e.getValue();
			tempK = e.getKey();
			if(tempV > 1) {
				while(arr.indexOf(tempK) != -1) {
					System.out.println(tempK);
					arr.remove(e.getKey());
				}
				for(int j = 0; j<tempV; j++) {
					arr.add(tempK);
				}
			}
		}
		System.out.println(arr);
	}
	

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(5);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		System.out.println("Unsort " + list);
		System.out.print("CustomSort "); Solution.customSort(list);


	}

}
