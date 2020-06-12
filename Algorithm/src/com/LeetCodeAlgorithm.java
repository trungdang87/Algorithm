package com;

import java.util.Arrays;

//https://leetcode.com/problems/longest-consecutive-sequence/
//https://leetcode.com/problems/transpose-matrix/
//https://leetcode.com/problems/find-the-duplicate-number/
//https://leetcode.com/problems/linked-list-cycle-ii/
//https://leetcode.com/problems/happy-number/
//https://leetcode.com/problems/rotate-image/
//https://leetcode.com/problems/single-number/
//https://leetcode.com/problems/rotate-list/
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
//https://leetcode.com/problems/permutation-in-string/


//When you have Free time
//https://leetcode.com/problems/combinations/


// Hard questions
//https://leetcode.com/problems/first-missing-positive/


public class LeetCodeAlgorithm{
	public static boolean checkInclusion(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();
        if(s1Length > s2Length) return false;
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        for(int i=0; i<s1Length; i++){
            s1Array[s1.charAt(i) - 'a']++;
            s2Array[s2.charAt(i) - 'a']++; 
            
        }
        System.out.println(Arrays.toString(s1Array));
        System.out.println(Arrays.toString(s2Array));
        System.out.println();
        for(int i=s1Length; i<s2Length; i++){
            System.out.println(Arrays.toString(s1Array));
            System.out.println(Arrays.toString(s2Array));
            if(Arrays.equals(s1Array, s2Array)) return true;
            s2Array[s2.charAt(i - s1Length) - 'a']--;
            s2Array[s2.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(s1Array));
        System.out.println(Arrays.toString(s2Array));
        if(Arrays.equals(s1Array,s2Array)) return true;
        return false;
    }
	
	public static void main(String[] args) {
		String s1 = "adc";
			String s2 =	"ddcda";
			System.out.println(checkInclusion(s1, s2)); //true
	}
	
}