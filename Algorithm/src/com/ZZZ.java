package com;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ZZZ{
	 public int subarraysWithKDistinct(int[] arr, int k) {
	        int count = 0;
	    Map<Integer, Integer> map1 = new HashMap<>();
	    Map<Integer, Integer> map2 = new HashMap<>();
	    int left1 = 0;
	    int left2 = 0;
	    
	    for (int right = 0; right < arr.length; right++) {
	        int val = arr[right];
	        map1.put(val, map1.getOrDefault(val, 0) + 1);
	        map2.put(val, map2.getOrDefault(val, 0) + 1);
	        
	        while(map1.size() > k) {
	            //System.out.println("left1 " + left1);
	            int amount = map1.getOrDefault(arr[left1], 0);
	            if (amount - 1 <= 0)
	                map1.remove(arr[left1]);
	            else
	                map1.put(arr[left1], amount-1);
	            left1++;                   
	        }
	        
	        while(map2.size() == k) {
	            //System.out.println("left2 " + left2);
	            int amount = map2.getOrDefault(arr[left2], 0);
	            if (amount - 1 <= 0)
	                map2.remove(arr[left2]);
	            else
	                map2.put(arr[left2], amount-1);
	            left2++;                   
	        }
	        System.out.println(arr[left1] + " " + arr[left2]);
	        count += left2 - left1;
	        //System.out.println("count " + count + " left1 " +left1 +" left2 " + left2);
	    }
	    
	    return count;
	    }
    
    public static void main(String[] args) {
    	ZZZ ob = new ZZZ();
    	System.out.println(ob.subarraysWithKDistinct(new int[] {1,2,2,3,4,5,6}, 2));
    }
	
}

