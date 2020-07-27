package com;

import java.util.*;

//Class for queue
public class ImplementQueue 
{
	/*private int arr[];         // array to store queue elements
	private int front;         // front points to front element in the queue
	private int rear;          // rear points to last element in the queue
	private int capacity;      // maximum capacity of the queue
	private int count;         // current size of the queue

	// Constructor to initialize queue
	ImplementQueue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// Utility function to remove front element from the queue
	public void dequeue()
	{
		// check for queue underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	// Utility function to add an item to the queue
	public void enqueue(int item)
	{
		// check for queue overflow
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	// Utility function to return front element in the queue
	public int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}

	// Utility function to return the size of the queue
	public int size()
	{
		return count;
	}

	// Utility function to check if the queue is empty or not
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	// Utility function to check if the queue is empty or not
	public Boolean isFull()
	{
		return (size() == capacity);
	}*/
	
	int[] queue;
	int size;
	int capacity;
	int front;
	int rear;
	ImplementQueue(int capacity){
		this.capacity = capacity;
		size = 0;
		front = 0;
		rear = -1;
		queue = new int[capacity];
	}
	public int size() {
		return size;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("empty...");
			System.exit(1);
		}
		return queue[front];
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("empty...");
			System.exit(1);
		}
		size--;
		int temp = queue[front];
		front = (front+1) % capacity;
		return temp;
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("full..");
			System.exit(1);
		}
		size++;
		rear = (rear+1) % capacity;
		queue[rear] = data;
		System.out.println("ENQUEUE " + data);
	}
	public boolean isFull() {
		return size==capacity;
	}
	
	
	// Queue implementation in java
	public static void main (String[] args)
	{
		// create a queue of capacity 5
		ImplementQueue q = new ImplementQueue(5);

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		System.out.println("Front element is: " + q.peek());
		q.dequeue();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Queue size is " + q.size());

		q.dequeue();
		q.dequeue();
		q.enqueue(5);
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
		q.dequeue();
		q.dequeue();
	}
}