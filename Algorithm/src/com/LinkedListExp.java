package com;
//Single LinkedList

/*class ListNode2{
	int data;
	ListNode2 next;
	public ListNode2(int data) {
		this.data = data;
		this.next = null;
	}
	public void addNode(int data) {
		ListNode2 newNode2 = new ListNode2(data);
		ListNode2 end = this;
		while(end.next != null) {
			end = end.next;
		}
		end.next = newNode2;
	}
	public ListNode2 deleteNode(ListNode2 head, int data) {
		ListNode2 current = head;

		if(head.data == data) {
			return head.next;
		}
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return head;
			}
			current = current.next;	
		}
		return head;
	}
}*/

class Node2{
	int data;
	Node2 next;
	Node2(int data){
		this.data = data;
		next = null;
	}
}

class LinkedList1{
	int size;
	Node2 head;
	LinkedList1(){
		size = 0;
		head = null;
	}
	public void addNode(int data) { //add last
		Node2 newNode2 = new Node2(data);
		if(head == null) {
			head = newNode2;
			size++;
			return;
		}
		Node2 iterator = head;
		while (iterator.next != null) {
			iterator = iterator.next;
		}
		iterator.next = newNode2;
		size++;
	}
	public Node2 deleteNode(int data) {
		if(head == null) {
			System.out.println("LinkedList is empty...");
			return null;
		}
		if(head.data == data) {
			size--;
			head = head.next;
			return head;
		}
		Node2 iterator = head;
		while(iterator.next != null) {
			if(iterator.next.data == data) {
				iterator.next = iterator.next.next;
			}
			iterator = iterator.next;
		}
		return head;
	}
	public void printList() {
		if(head == null) {
			System.out.println("LinkedList is empty...");
			return;
		}
		Node2 iterator = head;
		while(iterator != null) {
			System.out.print(iterator.data + " ");
			iterator = iterator.next;
		}
		System.out.println();
	}
	
}


public class LinkedListExp {
	public static void main(String[] args) {
		LinkedList1 ll = new LinkedList1();
		ll.addNode(1);
		ll.addNode(3);
		ll.printList();
		ll.deleteNode(1);
		ll.printList();
		ll.deleteNode(4);
		ll.printList();
		ll.deleteNode(3);
		ll.printList();
		ll.addNode(5);
		ll.addNode(6);
		ll.addNode(7);
		ll.addNode(8);
		ll.addNode(9);
		ll.printList();
	}
}




