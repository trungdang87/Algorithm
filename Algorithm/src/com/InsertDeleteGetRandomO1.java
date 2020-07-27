package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

//https://leetcode.com/problems/insert-delete-getrandom-o1/
public class InsertDeleteGetRandomO1 {
	/*	Design a data structure that supports all following operations in O(1) time.

	insert(val): Inserts an item val to the set if not already present.
	remove(val): Removes an item val from the set if present.
	getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.*/


/*	HashMap<Integer, Integer> valueMap;
	HashMap<Integer, Integer> idxMap;
	*//** Initialize your data structure here. *//*
	public InsertDeleteGetRandomO1() {
		valueMap = new HashMap<>();
		idxMap = new HashMap<>();
	}
	*//** Inserts a value to the set. Returns true if the set did not already contain the specified element. *//*
	public boolean insert(int val) {
		if(valueMap.containsKey(val)){
			return false;
		}
		valueMap.put(val, valueMap.size());
		idxMap.put(idxMap.size(), val);
		return true;
	}
	*//** Removes a value from the set. Returns true if the set contained the specified element. *//*
	public boolean remove(int val) {
		if(valueMap.containsKey(val)){
			int idx = valueMap.get(val);
			valueMap.remove(val);
			idxMap.remove(idx);
			Integer tailElem = idxMap.get(idxMap.size());
			if(tailElem!=null){
				idxMap.remove(idxMap.size());
				idxMap.put(idx,tailElem);
				valueMap.put(tailElem, idx);
			}
			return true;
		}
		return false;
	}
	*//** Get a random element from the set. *//*
	public int getRandom() {
		if(valueMap.size()==0){
			return -1;
		}
		if(valueMap.size()==1){
			return idxMap.get(0);
		}
		Random r = new Random();
		int idx = r.nextInt(valueMap.size());
		return idxMap.get(idx);
	}*/
	
	//https://leetcode.com/problems/insert-delete-getrandom-o1/
	HashMap<Integer,Integer> valueMap;
	HashMap<Integer,Integer> indexMap;
	InsertDeleteGetRandomO1(){
		valueMap = new HashMap();
		indexMap = new HashMap();
	}
	public boolean insert(int data) {
		if(valueMap.containsKey(data)) {
			return false;
		}
		valueMap.put(data, valueMap.size());
		indexMap.put(indexMap.size(), data);
		return true;
	}
	public boolean remove(int data) {
		if(!valueMap.containsKey(data)) {
			return false;
		}
		int index = valueMap.get(data);
		valueMap.remove(data);
		indexMap.remove(index);
		Integer last = indexMap.get(indexMap.size());
		if(last!=null) {
			indexMap.remove(indexMap.size());
			indexMap.put(index,last);
			valueMap.put(last, index);
		}
		return true;
	}
	public int getRandom() {
		if(valueMap.isEmpty()) return -1;
		if(valueMap.size()==1) return indexMap.get(0);
		Random random = new Random();
		int r = random.nextInt(valueMap.size());
		return indexMap.get(r);
	}

	//https://leetcode.com/problems/insert-delete-getrandom-o1/
	public static void main(String[] args) {
		InsertDeleteGetRandomO1 ob = new InsertDeleteGetRandomO1();
		ob.insert(123);
		ob.insert(567);
		ob.remove(123);
		ob.insert(999);
		ob.insert(33);
		ob.remove(33);
		
		Set<Map.Entry<Integer,Integer>> mapValue = ob.valueMap.entrySet();
		for(Map.Entry<Integer,Integer> m : mapValue) {
			System.out.printf( "%d : %d %n", m.getKey(), m.getValue());
		}
		
		Set<Map.Entry<Integer,Integer>> mapIndex = ob.indexMap.entrySet();
		for(Map.Entry<Integer,Integer> m : mapIndex) {
			System.out.printf( "%d : %d %n", m.getKey(), m.getValue());
		}
		System.out.println(ob.getRandom());
/*		567 : 0 
		999 : 1 
		0 : 567 
		1 : 999 */

	}

}
