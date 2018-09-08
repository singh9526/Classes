package com.geeksclasses.class6;

import com.geeksclasses.class6.P4ReverseLinkedListRecursive.Node;

/**
 * Write a recursive function to print reverse of a linked list.
 * */

public class P6ReversePrintLLRecursive {

	static Node head;
	
	class Node{
	    int data;
	    Node next;
	}
	
	void add(int data){
	    Node node = new Node();
	    node.data = data;
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
	
	void printList(Node list){
	    Node curr = list;
	    while(curr!=null){
	        System.out.print(curr.data+" ");
	        curr = curr.next;
	    }
	}

	void printRecursive(Node head){
		if(head==null)
			return;
		
		System.out.print(head.data+" ");
		printRecursive(head.next);
	}
	
	public static void main(String args[]){
		P6ReversePrintLLRecursive list = new P6ReversePrintLLRecursive();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Node newHead = head;
		list.printRecursive(newHead);
	}
	
}
