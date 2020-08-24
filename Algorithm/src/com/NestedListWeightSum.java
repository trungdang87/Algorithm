package com;

import java.util.ArrayList;
import java.util.List;

//https://gist.github.com/cangoal/a6dec68b4bde9f6653d86272435bdc9f

interface NestedInteger {

	// @return true if this NestedInteger holds a single integer, rather than a nested list.
	public boolean isInteger();

	// @return the single integer that this NestedInteger holds, if it holds a single integer
	// Return null if this NestedInteger holds a nested list
	public Integer getInteger();

	// @return the nested list that this NestedInteger holds, if it holds a nested list
	// Return null if this NestedInteger holds a single integer
	public List<NestedInteger> getList();
}


public class NestedListWeightSum {

	//Given the list [[1,1],2,[1,1]], return 10. (four 1's at depth 2, one 2 at depth 1)
	/*	public static int depthSum(List<NestedInteger> nestedList) {
        int res = 0; 
        if(nestedList == null || nestedList.size() == 0) return res;
        res = helper(nestedList, 1);
        return res;
    }
    private static int helper(List<NestedInteger> lst, int level){
        int res = 0;
        for(NestedInteger integer : lst){
            if(integer.isInteger()){
                res += integer.getInteger() * level;   
            } else {
                res += helper(integer.getList(), level + 1);
            }
        }
        return res;
    }*/
	//think of [2,[1,1],[1,1]]
	public int sum(List<NestedInteger> nestedList) {
		return sum(nestedList, 1);
	}
	public int sum(List<NestedInteger> nestedList, int level) {
		int sum = 0;
		for(NestedInteger i : nestedList) {
			if(i.isInteger()) {
				sum += i.getInteger() * level;
			}
			else {
				sum += sum(i.getList(), level +1);
			}
		}
		return sum;
	}



	//https://tenderleo.gitbooks.io/leetcode-solutions-/GoogleMedium/364.html
	//Given the list [[1,1],2,[1,1]], return 8. (four 1's at depth 1, one 2 at depth 2)
	/*public int depthSumInverse(List<NestedInteger> nestedList) {
		List<Integer> res = new ArrayList<>();
		sum(nestedList, res, 0);
		int total = 0;
		int w = res.size();
		for(Integer i : res){
			total += i * w--;
		}
		return total;
	}
	private void sum(List<NestedInteger> nestedList, List<Integer> list, int depth){
		while(depth >= list.size()){ 
			list.add(0);
		}
		for(NestedInteger ni : nestedList){
			if(ni.isInteger()){
				list.set(depth, list.get(depth) + ni.getInteger());
			}else{
				sum(ni.getList(), list, depth+1);
			}
		}
	}*/
	//think of [2,[1,1],[1,1]] after getting out of helper method our list = (2,4) with 2 at depth 2 and 4 at depth 1
	public int sumInverse(List<NestedInteger> nestedList) {
		List<Integer> list = new ArrayList<>();
		helper(nestedList, list, 0);
		int level = list.size();
		int result = 0;
		for(Integer i : list) {
			result += i*level;
			level--;
		}
		return result;
	}
	public void helper(List<NestedInteger> nestedList, List<Integer> list, int level) {
		while(level == list.size()) {
			list.add(0);
		}
		for(NestedInteger i : nestedList) {
			if(i.isInteger()) {
				list.set(level, list.get(level) + i.getInteger());
			}
			else {
				helper(nestedList, list, level + 1);
			}
		}
	}


	public static void main(String[] args) {
		System.out.println();
	}
}
