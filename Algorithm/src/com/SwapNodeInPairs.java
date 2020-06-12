package com;

/*
2.Swap Nodes in Pairs (hard one)
Given a linked list, swap every two adjacent nodes and return its head.
You may not modify the values in the list's nodes, only nodes itself may be changed.
Example:
Given 1->2->3->4, you should return the list as 2->1->4->3.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }

class Solution {
    public ListNode swapPairs(ListNode head) {

    }
}
 */

/*class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; } 
}*/


class Node1{
	int data;
	Node1 next;
	public Node1(int data) {
		this.data = data;
		this.next = null;
	}
	public void addNode(int data) {
		Node1 newNode = new Node1(data);
		Node1 end = this;
		while(end.next != null) {
			end = end.next;
		}
		end.next = newNode;
	}
	public Node1 deleteNode(Node1 head, int data) {
		Node1 current = head;

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

	/*	public Node1 swap(Node1 head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node1 h = new Node1(0);
		h.next = head;
		Node1 p = h;  //p is the node in front of 2 swap nodes
		while(p.next != null && p.next.next != null) {
			Node1 t1 = p;
			p = p.next;
			t1.next = p.next;

			Node1 t2 = p.next.next;
			p.next.next = p;
			p.next = t2;
		}
		return h.next;
	}*/
	
	//https://leetcode.com/problems/swap-nodes-in-pairs/
	public static Node1 swap(Node1 head) {
		if(head==null || head.next==null) return head;
		Node1 dummy = new Node1(0);
		dummy.next = head;
		Node1 p = dummy;
		while(p.next!=null && p.next.next!=null) {
			Node1 t1 = p;
			p = p.next;
			t1.next = p.next;
			Node1 t2 = p.next.next;
			p.next.next = p;
			p.next = t2;
		}
		return dummy.next;
	}
}

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodeInPairs {
	public static void main(String[] args) {
		Node1 head = new Node1(1);
		head.addNode(2);
		head.addNode(3);
		head.addNode(4);
		head.addNode(5);
		head.addNode(6);

		Node1 i = head;
		while(i != null) {
			System.out.print(i.data + " ");
			i = i.next;
		}
		head = head.swap(head);
		System.out.println();
		i = head;
		while(i != null) {
			System.out.print(i.data + " ");
			i = i.next;
		}
		System.out.println();
		System.out.println();
		
		Node1 head2 = new Node1(1);
		head2.addNode(2);
		head2.addNode(3);
		head2.addNode(4);
		head2.addNode(5);

		Node1 j = head2;
		while(j != null) {
			System.out.print(j.data + " ");
			j = j.next;
		}
		head2 = head2.swap(head2);
		System.out.println();
		j = head2;
		while(j != null) {
			System.out.print(j.data + " ");
			j = j.next;
		}
		


	}
}
