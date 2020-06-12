package com;

/*public class DoublyLinkedList<E>{

	Node head;
	Node tail;
	int size;

	DoublyLinkedList(){
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	class Node{
		E element;
		Node next;
		Node prev;

		public Node(E element, Node next, Node prev) {
			this.element = element;
			this.next = next;
			this.prev = prev;

		}
	}

	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void addFirst(E element){
		Node temp = new Node(element, head, null);
		if(head != null) {
			head.prev = temp;
		}
		head = temp;
		if(tail == null) {
			tail = temp;
		}
		size++;
	}

	// Given a node as prevNode, insert a new node after the given node
	public  void addAfter(Node prevNode, E element) {
		Node newNode = new Node(element, null, null);
		if(prevNode != null && prevNode.next != null) {
			newNode.prev = prevNode;
			newNode.next = prevNode.next;
			prevNode.next = newNode;
			newNode.next.prev = newNode;
			size++;
		}
		if(prevNode != null && prevNode.next == null) {
			newNode.prev = prevNode;
			newNode.next = null; //do we need this? newNode.next is already null when newNode is created
			prevNode.next = newNode;
			tail = newNode;
			size++;
		}
	}

	//add a node at the end of the list
	public void append(E element) {
		Node newNode = new Node(element, null, tail);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		if(head != null) {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	//delete Node
	public void deleteNode(E element) {
		if(head.element == element && head == tail) {
			head = null;
			tail = null;
			size--;
			return;
		}
		if(head.element == element) {
			head = head.next;
			head.prev = null;
			size--;
			return;
		}
		if(tail.element == element) {
			tail = tail.prev;
			tail.next = null;
			size--;
			return;
		}
		Node i = head;
		while(i.next != null) {
			if(i.element == element) {
				i.prev.next = i.next;
				i.next.prev = i.prev;
				size--;
			}
			i = i.next;
		}
	}

	public void printForward() {
		Node i = head;
		while(i != null) {
			System.out.print(i.element + " ");
			i = i.next;
		}
	}
	public void printBackward() {
		Node i = tail;
		while(i != null) {
			System.out.print(i.element + " ");
			i = i.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.addFirst(9);
		list.addFirst(7);
		list.addFirst(5);
		list.addFirst(3);
		list.addFirst(1);

		list.addAfter(list.tail.prev, 88);
		list.append(00);

		list.deleteNode(7);

		list.printForward();
		System.out.println();
		list.printBackward();
	}
}*/

public class DoublyLinkedList<E>{
	int size;
	Node head;
	Node tail;
	
	class Node{
		E element;
		Node next;
		Node pre;
		Node(E element, Node next, Node pre){
			this.element = element;
			this.next = next;
			this.pre = pre;
		}
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	public void addFirst(E element) {
		Node newNode = new Node(element, null, tail);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		if(head != null) {
			head = newNode;
		}
		size++;
	}
	public  void addAfter(Node prevNode, E element) {
		Node newNode = new Node(element, null, null);
		if(prevNode != null && prevNode.next != null) {
			newNode.pre = prevNode;
			newNode.next = prevNode.next;
			prevNode.next = newNode;
			newNode.next.pre = newNode;
			size++;
		}
		if(prevNode != null && prevNode.next == null) {
			newNode.pre = prevNode;
			newNode.next = null; //do we need this? newNode.next is already null when newNode is created
			prevNode.next = newNode;
			tail = newNode;
			size++;
		}
	}

	//add a node at the end of the list
	public void append(E element) {
		Node newNode = new Node(element, null, tail);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		if(head != null) {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	//delete Node
	public void deleteNode(E element) {
		if(head.element == element && head == tail) {
			head = null;
			tail = null;
			size--;
			return;
		}
		if(head.element == element) {
			head = head.next;
			head.pre = null;
			size--;
			return;
		}
		if(tail.element == element) {
			tail = tail.pre;
			tail.next = null;
			size--;
			return;
		}
		Node i = head;
		while(i.next != null) {
			if(i.element == element) {
				i.pre.next = i.next;
				i.next.pre = i.pre;
				size--;
			}
			i = i.next;
		}
	}

	public void printForward() {
		Node i = head;
		while(i != null) {
			System.out.print(i.element + " ");
			i = i.next;
		}
	}
	public void printBackward() {
		Node i = tail;
		while(i != null) {
			System.out.print(i.element + " ");
			i = i.pre;
		}
	}

	
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.addFirst(9);
		list.addFirst(7);
		list.addFirst(5);
		list.addFirst(3);
		list.addFirst(1);

		list.addAfter(list.tail.pre, 88);
		list.append(00);
		list.printForward();
		list.printBackward();
		System.out.println(list.size + "@@@@@@@@@@@@@@@@@@");
		
		list.deleteNode(7);
		list.printForward();
		list.printBackward();
		System.out.println(list.size + "@@@@@@@@@@@@@@@@@@");
		
		list.deleteNode(0);
		list.printForward();
		list.printBackward();
		System.out.println(list.size + "@@@@@@@@@@@@@@@@@@");
		
		list.deleteNode(1);
		list.printForward();
		list.printBackward();
		System.out.println(list.size + "@@@@@@@@@@@@@@@@@@");
		
		
	}
	
}











