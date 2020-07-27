package com;



/* We can use Java inbuilt Deque as a double  
	   ended queue to store the cache keys, with  
	   the descending time of reference from front  
	   to back and a set container to check presence  
	   of a key. But remove a key from the Deque using 
	   remove(), it takes O(N) time. This can be  
	   optimized by storing a reference (iterator) to  
	   each key in a hash map. */
import java.util.Deque; 
import java.util.HashSet; 
import java.util.LinkedList; 
import java.util.Iterator; 
import java.util.*;




public class LRUCache { 
	
	//leetcode solution
	//https://leetcode.com/problems/lru-cache/
	/*class LRUCache {

	    Deque<Integer> dq;
	    Map<Integer,Integer> map;
	    int size;

	    public LRUCache(int capacity) {
	        size = capacity;
	        map = new HashMap<Integer,Integer>();
	        dq = new LinkedList<Integer>();
	    }

	    public int get(int key) {
	        if(map.containsKey(key)){
	            dq.remove(key);
	            dq.addFirst(key);
	            return map.get(key);
	        }
	        return -1;
	    }

	    public void put(int key, int value) {
	        if(!map.containsKey(key)){
	            if(dq.size() == size){
	                int last = dq.removeLast();
	                map.remove(last);
	            }
	        }
	        else{
	            dq.remove(key);
	        }
	        dq.addFirst(key);
	        map.put(key,value);
	    }
	}*/
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
	
	// store keys of cache 
	/*	static Deque<Integer> dq; 
	// store references of key in cache 
	static HashSet<Integer> map; 
	// maximum capacity of cache 
	static int csize; 

	LRUCache(int n) 
	{ 
		dq = new LinkedList<>(); 
		map = new HashSet<>(); 
		csize = n; 
	} 
	 Refers key x with in the LRU cache 
	public void put(int x) 
	{ 
		if (!map.contains(x)) { 
			if (dq.size() == csize) { 
				int last = dq.removeLast(); 
				map.remove(last); 
			} 
		} 
		else { 
			 The found page may not be always the last element, even if it's an  
	               intermediate element that needs to be removed and added to the start  
	               of the Queue 
			int index = 0, i = 0; 
			Iterator<Integer> itr = dq.iterator(); 
			while (itr.hasNext()) { 
				if (itr.next() == x) { 
					index = i; 
					break; 
				} 
				i++; 
			} 
			dq.remove(x); //deque can remove element directly deque.remove(element);
		} 
		dq.push(x); 
		map.add(x); 
	} 
	
	public int get(int value) {
		if(set.contains(value)) {
			queue.remove(value);		
			queue.addFirst(value);
			return value;
		}
		return -1;
	}

	// display contents of cache 
	public void display() 
	{ 
		Iterator<Integer> itr = dq.iterator(); 
		while (itr.hasNext()) { 
			System.out.print(itr.next() + " "); 
		} 
	} */

/*	
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
	//MY SOLUTION
	Deque<Integer> queue;
	HashSet<Integer> set;
	int size;
	LRUCache(int size){
		this.size = size;
		queue = new LinkedList<Integer>();
		set = new HashSet<Integer>();
	}
	public void put(int x) {
		if(!set.contains(x)) {
			if(queue.size() == size) {
				int last = queue.removeLast();
				set.remove(last);
			}
		}
		else {
			queue.remove(x);
		}
		queue.addFirst(x);
		set.add(x);
	}
	public int get(int key) {
		if(set.contains(key)) {
			queue.remove(key);
			queue.addFirst(key);
			return queue.getFirst();
		}
		return -1;
	}
	public void display() {
		Iterator<Integer> i = queue.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
	}
*/
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
	
	//https://leetcode.com/problems/lru-cache/
	int size;
	Deque<Integer> queue;
	Set<Integer> set;
	LRUCache(int size){
		this.size = size;
		queue = new LinkedList();
		set = new HashSet();
	}
	public void put(int data) {
		if(!set.contains(data)) {
			if(queue.size()==size) {
				queue.removeLast();
			}
		}else {
			queue.remove(data);
		}
		queue.addFirst(data);
		set.add(data);
	}
	public int get(int data) {
		if(!set.contains(data)) {
			return -1;
		}
		else {
			queue.remove(data);
			queue.addFirst(data);
			return queue.getFirst();
		}
	}
	public void display() {
		for(Integer i : queue) {
			System.out.print(i + " ");
		}
	}
	
	//https://leetcode.com/problems/lru-cache/submissions/
	public static void main(String[] args) 
	{ 
		LRUCache ca = new LRUCache(4); 
		ca.put(1); 
		ca.put(5); 
		ca.put(3); 
		ca.put(1); 
		ca.put(4); 
		ca.put(5); 
		ca.display(); //5 4 1 3
		ca.get(1);
		System.out.println();
		ca.display(); //1 5 4 3
	} 
} 

	
	




