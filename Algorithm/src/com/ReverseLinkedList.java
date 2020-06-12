package com;

/*class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
	void addNode(int data) {
		Node newNode = new Node(data);
		Node iterator = this;
		while(iterator.next != null) {
			iterator = iterator.next;
		}
		iterator.next = newNode;
	}
	Node deleteNode(Node head, int data) {
		Node currentNode = head;
		if(currentNode.data == data) {
			return currentNode.next;
		}
		while(currentNode.next != null) {
			if(currentNode.next.data == data) {
				currentNode.next = currentNode.next.next;
				return head;
			}
			currentNode = currentNode.next;
		}
		return head;
	}
	void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	Node reverseIterative(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	Node reverseRecursively(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node second = head.next;
		head.next = null;
		Node rest = reverseRecursively(second);
		second.next = head;
		return rest;
	}

	// Function to print reverse of linked list 
    void printReverse(Node head) 
    { 
        if (head == null) return; 

        // print list of head node 
        printReverse(head.next); 

        // After everything else is printed 
        System.out.print(head.data+" "); 
    } 

}

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.addNode(5);
		head.addNode(3);
		head.addNode(9);
		head.addNode(7);
		head.printList(head);
		System.out.println();
		head = head.deleteNode(head, 1);
		head = head.reverseRecursively(head);
		head.printList(head);
		System.out.println();
		head = head.reverseIterator(head);
		head.printList(head);
	}
}*/

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
	public void addNode(int data) {
		Node newNode = new Node(data);
		Node iterator = this;
		while(iterator.next != null) {
			iterator = iterator.next;
		}
		iterator.next = newNode;
	}
	public Node deleteNode(Node head, int data) {
		if(head.data == data) {
			return head.next;
		}
		Node iterator = head;
		while(iterator.next != null) {
			if(iterator.next.data == data) {
				iterator.next = iterator.next.next;
				return head;
			}
			iterator = iterator.next;
		}
		return head;
	}
	public void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
/*	public static void printReverse(Node head) {
		if(head == null) return;
		printReverse(head.next);
		System.out.print(head.data + " ");
	}*/
	public static void printReverse(Node head) {
		if(head==null) return;
		printReverse(head.next);
		System.out.print( head.data + " ");
	}
	
	//reverseIterator
	public static Node reverseIterator(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node pre = null;
		Node cur = head;
		Node next = null;
		while(cur!=null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	//reverseRecursively
	public static Node reverseRecursively(Node head) {
		if(head==null || head.next==null) return head;
		Node second = head.next;
		head.next = null;
		Node rest = reverseRecursively(second);
		second.next = head;
		return rest;
	}
	
	//middleOfLinkedList
	public static Node middleOfLinkedList(Node head) {
		Node slow = head, fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.addNode(2);
		head.addNode(3);
		head.addNode(4);
		head.addNode(5);
		System.out.println("Input list");
		head.printList(head);
		System.out.println();
		System.out.println("Middle of linkedlist " + head.middleOfLinkedList(head).data);
		//head = head.deleteNode(head, 1);
		//head = head.deleteNode(head, 9);
		
		System.out.println();
		System.out.println("reverseRecursively");
		head = head.reverseRecursively(head);
		head.printList(head);
		
		System.out.println();
		System.out.println("reverseIterator");
		head = head.reverseIterator(head);
		head.printList(head);
		System.out.println();
		System.out.println("printReverse");
		head.printReverse(head);
	}
}












