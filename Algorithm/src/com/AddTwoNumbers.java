package com;

class ListNode1{
	int data;
	ListNode1 next;
	ListNode1(int data){
		this.data = data;
		next = null;
	}
	public void addNode(int data) {
		ListNode1 newNode = new ListNode1(data);
		ListNode1 iterator = this;
		while(iterator.next != null) {
			iterator = iterator.next;
		}
		iterator.next = newNode;
	}
	public ListNode1 deleteNode(ListNode1 head, int data) {
		if(head.data == data) {
			return head.next;
		}
		ListNode1 iterator = head;
		while(iterator.next != null) {
			if(iterator.next.data == data) {
				iterator.next = iterator.next.next;
				return head;
			}
			iterator = iterator.next;
		}
		return head;
	}
	public void printList(ListNode1 head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
}

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
/*	public static ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
	    ListNode1 dummyHead = new ListNode1(0);
	    ListNode1 p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.data : 0;
	        int y = (q != null) ? q.data : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode1(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode1(carry);
	    }
	    return dummyHead.next;
	}*/
	
	public static ListNode1 add(ListNode1 l1, ListNode1 l2) {
		ListNode1 dummy = new ListNode1(0);
		ListNode1 h=dummy, p=l1, q=l2;
		int x=0,y=0,sum=0, carry=0;
		while(p!=null || q!=null) {
			x = p!=null ? p.data : 0;
			y = q!=null ? q.data : 0;
			sum = x + y + carry;
			h.next = new ListNode1(sum%10);
			h = h.next;
			carry = sum/10;
			if(p!=null) p = p.next;
			if(q!=null) q = q.next;
		}
		if(carry > 0) {
			h.next = new ListNode1(carry);
		}
		return dummy.next;
	}
	
	
	public static void main(String[] args) {
		ListNode1 head1 = new ListNode1(2); //246
		head1.addNode(4);
		head1.addNode(6);
		
		ListNode1 head2 = new ListNode1(5); //564
		head2.addNode(6);
		head2.addNode(4);
		
		ListNode1 result = AddTwoNumbers.add(head1, head2);
		result.printList(result);// 7011
	}
}
