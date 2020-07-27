package com;

//https://leetcode.com/problems/min-stack/


public class MinStack {
	class Node {
	    int value;
	    int min;
	    Node next;
	    public Node(int val) {
	        this.value = val;
	        this.next = null;
	        this.min = val;
	    }
	    
	    public Node(int val, Node next) {
	        this.value = val;
	        this.next = next;
	        this.min = Math.min(val,next.getMin()); //Minimum of current value and previous head value
	    }
	    
	    int getValue() {
	        return this.value;
	    }
	    
	    Node getNext() {
	        return this.next;
	    }
	    
	    int getMin() {
	        return this.min;
	    }
	}
	
	Node head;
	
	public MinStack() {
	    //Not needed
	    head = null;
	}

	public void push(int x) {
	    if (head == null) {
	        head = new Node(x);
	    }
	    else {
		    //create new Node and assign it as head
	        head = new Node(x,head);            
	    }    
	}

	public void pop() {
	    head = head.getNext();
	}

	public int top() {
	    return head.getValue();
	}

	public int getMin() {
	    return head.getMin();
	}
	
}
