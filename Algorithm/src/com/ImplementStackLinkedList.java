package com;

/*class SNode{
	int data;
	SNode next;
	SNode(int data){
		this.data = data;
		this.next = null;
	}
}

class Stack1{
	int size;
	SNode top;
	Stack1(){
		size = 0;
		top = null;
	}
	public void push(int data) {
		SNode newNode = new SNode(data);
		if(top == null) {
			top = newNode;
			size++;
			return;
		}
		newNode.next = top;
		top = newNode;
		size++;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return top.data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		SNode temp = top;
		top = top.next;
		size--;
		return temp.data;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public int size() {
		return size;
	}
}*/

class SNode{
	int val;
	SNode next;
	SNode(int val){
		this.val = val;
		this.next = null;
	}
}
class Stack1{
	SNode top;
	int size;
	Stack1(){
		top = null;
		size = 0;
	}
	public void push(int val) {
		if(top==null) {
			size++;
			top = new SNode(val);
			System.out.println("PUSH " + val);
			return;
		}
		SNode newNode = new SNode(val);
		newNode.next = top;
		top = newNode;
		size++;
		System.out.println("PUSH " + val);
	}
	public int pop() {
		if(top==null) {
			System.out.println("stack is empty...");
			System.exit(1);
		}
		size--;
		int temp = top.val;
		top = top.next;
		return temp;
	}
	public int peek() {
		if(top==null) {
			System.out.println("stack is empty...");
			System.exit(1);
		}
		return top.val;
	}
	public int size() {
		return size;
	}
}

public class ImplementStackLinkedList {

	public static void main(String[] args) {
		Stack1 stack = new Stack1();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Top element is " + stack.peek());
		System.out.println("Pop element " + stack.pop());
		System.out.println("Pop element " + stack.pop());
		System.out.println("Stack size " + stack.size());
		System.out.println("Top element is " + stack.peek());
		stack.push(4);
		System.out.println("Pop element " + stack.pop());
		System.out.println("Pop element " + stack.pop());
		stack.push(5);
		System.out.println("Pop element " + stack.pop());
		System.out.println("Pop element " + stack.pop());
	}

}
