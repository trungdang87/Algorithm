package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/discuss/interview-question/373202
public class OptimalUtilization {
/*	
	public List<int[]> solution(List<int[]> a, List<int[]> b, int target){
        Map<Integer, List<int[]>> map = new HashMap<>();//key is sum , value is list of ids from a and b.

        for (int i = 0; i < a.size(); i ++){
            for (int j = 0; j < b.size(); j ++){
                List<int[]> sums = map.getOrDefault(a.get(i)[1] + b.get(j)[1], new ArrayList<int[]>());
                sums.add(new int[] {a.get(i)[0], b.get(j)[0]});
                map.put(a.get(i)[1] + b.get(j)[1], sums);
            }
        }

        List<Integer> allSums = new ArrayList<>();
        for (Integer i : map.keySet()){
            if (i < target){
                allSums.add(i);
            } else if (i == target){
                return map.get(target);
            }
        }
        if (allSums.size() == 0){
            return new ArrayList<>();//target is less than every possible sums.
        }
        return map.get(Collections.max(allSums));
    }*/
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//public List<int[]> solution(List<int[]> a, List<int[]> b, int target)
	
	
	
	
	
	//[2, 4] [3, 2] 
	//[1, 2] 
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public static void main(String[] args) {
		OptimalUtilization ob = new OptimalUtilization();
		List<int[]> a = new ArrayList<>();
		a.add(new int[] {1,3});
		a.add(new int[] {2,5});
		a.add(new int[] {3,7});
		a.add(new int[] {4,10});
		List<int[]> b = new ArrayList<>();
		b.add(new int[] {4,5});
		b.add(new int[] {2,3});
		b.add(new int[] {3,4});
		b.add(new int[] {1,2});
		
		List<int[]> result = ob.solution(a, b, 10);
		for(int[] i : result) {
			System.out.print(Arrays.toString(i) + " ");
		}
		System.out.println();
		List<int[]> result2 = ob.solution(a, b, 6);
		for(int[] i : result2) {
			System.out.print(Arrays.toString(i) + " ");
		}
		
		
	}
	
	
/*	
		Input:
		a = [[1, 3], [2, 5], [3, 7], [4, 10]]
		b = [[1, 2], [2, 3], [3, 4], [4, 5]]
		target = 10

		Output: [[2, 4], [3, 2]]

		Explanation:
		There are two pairs possible. Element with id = 2 from the list `a` has a value 5, and element with id = 4 from the list `b` also has a value 5.
		Combined, they add up to 10. Similarily, element with id = 3 from `a` has a value 7, and element with id = 2 from `b` has a value 3.
		These also add up to 10. Therefore, the optimal pairs are [2, 4] and [3, 2].
	
			Input:
			a = [[1, 8], [2, 7], [3, 14]]
			b = [[1, 5], [2, 10], [3, 14]]
			target = 20

			Output: [[2, 2], [3, 1]]
*/			
			
	
}
