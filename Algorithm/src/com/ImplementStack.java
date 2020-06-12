package com;

import java.util.*;

/*class Stack2
{
	private int arr[];
	private int top;
	private int capacity;

	// Constructor to initialize Stack2
	Stack2(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Utility function to add an element x in the Stack2
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	// Utility function to pop top element from the Stack2
	public int pop()
	{
		// check for Stack2 underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + peek());

		// decrease Stack2 size by 1 and (optionally) return the popped element
		return arr[top--];
	}

	// Utility function to return top element in a Stack2
	public int peek()
	{
		if (!isEmpty())
			return arr[top];
		else
			System.exit(1);

		return -1;
	}

	// Utility function to return the size of the Stack2
	public int size()
	{
		return top + 1;
	}

	// Utility function to check if the Stack2 is empty or not
	public Boolean isEmpty()
	{
		return top == -1;	// or return size() == 0;
	}

	// Utility function to check if the Stack2 is full or not
	public Boolean isFull()
	{
		return top == capacity - 1;	// or return size() == capacity;
	}
}*/

class Stack2{
	int[] stack;
	int top;
	int size;
	int capacity;
	Stack2(int capacity){
		this.capacity = capacity;
		top = -1;
		size = 0;
		stack = new int[capacity];
	}
	public int size() {
		return size;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty...");
			System.exit(1);
		}
		return stack[top];
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty...");
			System.exit(1);
		}
		int temp = stack[top--];
		System.out.println("POP " + temp);
		size--;
		return temp;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void push(int val) {
		if(isFull()) {
			System.out.println("stack is full...");
			System.exit(1);
		}
		System.out.println("PUSH " + val);
		stack[++top] = val;
		size++;
	}
	public boolean isFull() {
		return size==capacity;
	}
}

public class ImplementStack{
	public static void main (String[] args)
	{
		Stack2 Stack2 = new Stack2(3);

		Stack2.push(1);		// Inserting 1 in the Stack2
		Stack2.push(2);		// Inserting 2 in the Stack2

		Stack2.pop();		// removing the top 2
		Stack2.pop();		// removing the top 1

		Stack2.push(3);		// Inserting 3 in the Stack2

		System.out.println("Top element is: " + Stack2.peek());
		System.out.println("Stack2 size is " + Stack2.size());

		Stack2.pop();		// removing the top 3

		// check if Stack2 is empty
		if (Stack2.isEmpty())
			System.out.println("Stack2 Is Empty");
		else
			System.out.println("Stack2 Is Not Empty");
	}
}