package com;
//Java program to demonstrate implementation of our 
//own hash table with chaining for collision detection 
import java.util.ArrayList; 
/*
//A node of chains 
class HashNode<K, V> 
{ 
	K key; 
	V value; 

	// Reference to next node 
	HashNode<K, V> next; 

	// Constructor 
	public HashNode(K key, V value) 
	{ 
		this.key = key; 
		this.value = value; 
	} 
} 


//Class to represent entire hash table 
class MyMap<K, V> 
{ 
	// bucketArray is used to store array of chains 
	private ArrayList<HashNode<K, V>> bucketArray; 

	// Current capacity of array list 
	private int numBuckets; 

	// Current size of array list 
	private int size; 

	// Constructor (Initializes capacity, size and 
	// empty chains. 
	public MyMap() 
	{ 
		bucketArray = new ArrayList<>(); 
		numBuckets = 10; 
		size = 0; 

		// Create empty chains 
		for (int i = 0; i < numBuckets; i++) 
			bucketArray.add(null); 
	} 

	public int size() { return size; } 
	public boolean isEmpty() { return size() == 0; } 

	// This implements hash function to find index 
	// for a key 
	private int getBucketIndex(K key) 
	{ 
		int hashCode = key.hashCode(); 
		int index = hashCode % numBuckets; 
		return index; 
	} 

	// Method to remove a given key 
	public V remove(K key) 
	{ 
		// Apply hash function to find index for given key 
		int bucketIndex = getBucketIndex(key); 

		// Get head of chain 
		HashNode<K, V> head = bucketArray.get(bucketIndex); 

		// Search for key in its chain 
		HashNode<K, V> prev = null; 
		while (head != null) 
		{ 
			// If Key found 
			if (head.key.equals(key)) 
				break; 

			// Else keep moving in chain 
			prev = head; 
			head = head.next; 
		} 

		// If key was not there 
		if (head == null) 
			return null; 

		// Reduce size 
		size--; 

		// Remove key 
		if (prev != null) 
			prev.next = head.next; 
		else
			bucketArray.set(bucketIndex, head.next); 

		return head.value; 
	} 

	// Returns value for a key 
	public V get(K key) 
	{ 
		// Find head of chain for given key 
		int bucketIndex = getBucketIndex(key); 
		HashNode<K, V> head = bucketArray.get(bucketIndex); 

		// Search key in chain 
		while (head != null) 
		{ 
			if (head.key.equals(key)) 
				return head.value; 
			head = head.next; 
		} 

		// If key not found 
		return null; 
	} 

	// Adds a key value pair to hash 
	public void put(K key, V value) 
	{ 
		// Find head of chain for given key 
		int bucketIndex = getBucketIndex(key); 
		HashNode<K, V> head = bucketArray.get(bucketIndex); 

		// Check if key is already present 
		while (head != null) 
		{ 
			if (head.key.equals(key)) 
			{ 
				head.value = value; 
				return; 
			} 
			head = head.next; 
		} 

		// Insert key in chain, insert at the beginning
		size++; 
		head = bucketArray.get(bucketIndex); 
		HashNode<K, V> newNode = new HashNode<K, V>(key, value); 
		newNode.next = head; 
		bucketArray.set(bucketIndex, newNode); //set newNode at the beginning of linked list

		// If load factor goes beyond threshold, then 
		// double hash table size 
		if ((1.0*size)/numBuckets >= 0.7) 
		{ 
			ArrayList<HashNode<K, V>> temp = bucketArray; 
			bucketArray = new ArrayList<>(); 
			numBuckets = 2 * numBuckets; 
			size = 0; 
			for (int i = 0; i < numBuckets; i++) 
				bucketArray.add(null); 

			for (HashNode<K, V> headNode : temp) 
			{ 
				while (headNode != null) 
				{ 
					put(headNode.key, headNode.value); //call itself (function add)
					headNode = headNode.next; 
				} 
			} 
		} 
	} 

}
 */

class HashNode<K,V>{
	K key;
	V value;
	HashNode<K,V> next;
	HashNode (K key, V value){
		this.key = key;
		this.value = value;
		this.next = null;
	}
}
class MyMap<K,V>{
	int size;
	int capacity;
	ArrayList<HashNode<K,V>> bucketArray;
	MyMap(){
		size = 0;
		capacity = 2;
		bucketArray = new ArrayList<>();
		for(int i=0; i<capacity; i++) {
			bucketArray.add(null);
		}
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	public V remove(K key) {
		int bucketIndex = bucketIndex(key);
		HashNode<K,V> head = bucketArray.get(bucketIndex);
		if(head!=null && head.key.equals(key)) {
			size--;
			V temp = head.value;
			bucketArray.set(bucketIndex, head.next);
			return temp;
		}
		while(head!=null && head.next!=null) {
			if(head.next.key.equals(key)) {
				size--;
				V temp = head.next.value;
				head.next = head.next.next;
				return temp;
			}
			head = head.next;
		}
		return null;
	}
	public V get(K key) {
		int bucketIndex = bucketIndex(key);
		HashNode<K,V> head = bucketArray.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	public int bucketIndex(K key) {
		int hashCode = key.hashCode();
		int bucketIndex = hashCode % capacity;
		return bucketIndex;
	}
	public void put(K key, V value) {
		int bucketIndex = bucketIndex(key);
		HashNode<K,V> head = bucketArray.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = bucketArray.get(bucketIndex);
		HashNode<K,V> newNode = new HashNode<K,V>(key, value);
		newNode.next = head;
		bucketArray.set(bucketIndex, newNode);
		if(1.0*size/capacity > 0.7) {
			size = 0;
			capacity = capacity*2;
			ArrayList<HashNode<K,V>> temp = bucketArray;
			bucketArray = new ArrayList<>();
			for(int i=0; i<capacity; i++) {
				bucketArray.add(null);
			}
			for(HashNode<K,V> h : temp) {
				while(h!=null) {
					put(h.key, h.value);
					h = h.next;
				}
			}
		}
	}
}


public class ImplementHashTable{

	// Driver method to test MyMap class 
	public static void main(String[] args) 
	{ 

		MyMap<String, Integer>MyMap = new MyMap<>(); 
		MyMap.put("this",1 ); 
		MyMap.put("coder",2 ); 
		MyMap.put("this",4 ); 
		MyMap.put("hi",5 ); 
		System.out.println(MyMap.size()); 			//3
		System.out.println(MyMap.remove("this")); 	//4
		System.out.println(MyMap.remove("this")); 	//null
		System.out.println(MyMap.size()); 			//2
		System.out.println(MyMap.isEmpty()); 		//false
		System.out.println(MyMap.get("this"));		//null
		System.out.println(MyMap.get("hi"));		//5
		System.out.println(MyMap.remove("coder"));  //2
		System.out.println(MyMap.remove("hi"));		//5
		System.out.println(MyMap.size());			//0
	} 
}