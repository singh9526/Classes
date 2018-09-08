package com.geeksclasses.class6;

/**
 * Detect and Remove Loop in Linked List
 * 
 * Given a linked list which may contain a loop, our task is to remove the loop if it is present.
 * 
 * ip : 1 2 3 4 5 (back to 3)
 * 
 * op : 1 2 3  4 5 null
 * 
 * 
 * Approach 1 : Use hashset to store elements, once we get a repeating element, set next to null.
 * 
 * Approach 2 : (Tricky)
 * 1. Store the meeting point of slow and fast pointer.
 * 2. Fix fast at this meeting point and slow at the beggining.
 * 3. Now move slow and fast at the same speed, the point where they meet is 
 *    the starting point of the loop.
 * 
 * */

public class P1DetectAndRemoveLoopInLL {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
	}

	void add(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	void print(){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	void removeLoop(){
		Node slow = head;
		Node fast = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Slow - "+slow.data+" fast - "+fast.data);
		
		slow = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		System.out.println("Starting point of loop : "+slow.data);
	}
	
	public static void main(String args[]){
		
		P1DetectAndRemoveLoopInLL list = new P1DetectAndRemoveLoopInLL();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
        // Creating a loop for testing 
        list.head.next.next.next.next.next = list.head.next.next;
        System.out.println("Linked List after removing loop : ");
        list.removeLoop();
	}
	
}