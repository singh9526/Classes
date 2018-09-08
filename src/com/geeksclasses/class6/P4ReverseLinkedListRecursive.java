package com.geeksclasses.class6;

import java.util.concurrent.RecursiveAction;

public class P4ReverseLinkedListRecursive {

	Node head;
	
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

	void reverseList(){
		if(head==null)
			return;
		
		reverseRec(null, head);
	}
	
	void reverseRec(Node prev, Node cur){
	
		Node next = cur.next;
		cur.next = prev;
		
		if(next==null){
			head = cur;
			return;
		}
		
		reverseRec(cur, next);
	}
	
	public static void main(String args[]){
		P4ReverseLinkedListRecursive list = new P4ReverseLinkedListRecursive();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.reverseList();
		list.print();
	}
	
}