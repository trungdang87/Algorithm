package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

class A{
	public static void print() {
		System.out.println("AAAAAA");
	}
}
class B extends A{
	public static void print() {
		System.out.println("BBBBBBBB");
	}
}
class C extends A{
	public static void print() {
		System.out.println("CCCCCCCCCCCCC");
	}
}


public class ZZZZ {
	public static String solution(String s) {
		char[] chars = s.toCharArray();
		HashSet<Character> set = new HashSet();
		for(Character c : chars){
			set.add(c);
		}

		PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> b-a);
		pq.addAll(set);
		StringBuilder sb = new StringBuilder();
		for(Character c : pq) {
			sb.append(c);
		}
		return sb.toString();
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}


	public static void main(String args[]){  
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		String s4 = s2.intern();
		System.out.println(s1==s2);//false because reference variables are pointing to different instance  
		System.out.println(s2==s3);//true because reference variables are pointing to same instance  
		System.out.println(s4==s2);
		System.out.println(ZZZZ.solution("cbacdcbc"));
		final ArrayList<Integer> list = new ArrayList();
		list.add(123);

		Integer[] a = new Integer[] { 1,2,3,4 }; 

		// getting the list view of Array 
		List<Integer> list1 = Arrays.asList(a); 

		// printing the list 
		System.out.println("The list is: " + list1); 
		int[] wtf = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(wtf);
		System.out.println(Arrays.toString(wtf));

	}

}
