package com;

/*class QQNode 
{ 
	int key; 
	QQNode next; 

	public QQNode(int key) { 
		this.key = key; 
		this.next = null; 
	} 
} 


class Queue 
{ 
	QQNode front, rear; 

	public Queue() { 
		this.front = this.rear = null; 
	} 

	void enqueue(int key) 
	{ 
		QQNode temp = new QQNode(key); 
		if (this.rear == null) 
		{ 
			this.front = this.rear = temp; 
			return; 
		} 
		this.rear.next = temp; 
		this.rear = temp; 
	} 

	public QQNode dequeue() 
	{ 
		if (this.front == null) 
			return null; 
		QQNode temp = this.front; 
		this.front = this.front.next; 
		if (this.front == null) 
			this.rear = null; 
		return temp; 
	} 
} */
class QNode{
	int data;
	QNode next;
	QNode(int data){
		this.data = data;
		this.next = null;
	}
}
class Queue1{
	QNode front;
	QNode rear;
	int size;
	public void enqueue(int data) {
		QNode newNode = new QNode(data);
		if(front==null) {
			front = newNode;
			rear = newNode;
			size++;
			return;
		}
		size++;
		rear.next = newNode;
		rear = newNode;
	}
	public QNode dequeue() {
		if(front==null) return null;
		QNode temp = front;
		front = front.next;
		if(front==null) rear = null;
		size--;
		return temp;
	}
	public int size() {
		return size;
	}
}

public class ImplementQueueLinkedList 
{ 
	public static void main(String[] args)  
	{ 
		Queue1 q=new Queue1(); 
		q.enqueue(22); 
		q.enqueue(55); 
		System.out.println("Dequeued item is "+ q.dequeue().data);  
		System.out.println("Dequeued item is "+ q.dequeue().data); 
		q.enqueue(11); 
		q.enqueue(88); 
		q.enqueue(77); 

		System.out.println("Dequeued item is "+ q.dequeue().data); 
		System.out.println("Dequeued item is "+ q.dequeue().data); 
		System.out.println(q.size());
		System.out.println("Dequeued item is "+ q.dequeue().data); 
		System.out.println("Dequeued item is "+ q.dequeue()); 
	} 
} 