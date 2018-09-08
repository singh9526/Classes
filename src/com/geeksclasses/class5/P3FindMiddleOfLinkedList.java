package com.geeksclasses.class5;

/**
 * Find middle of a singly linked list using one traversal.
 * ip : 1 2 3 4 5
 * op : 3
 * 
 * ip : 1 2 3 4 5 6
 * op : 4
 *
 * Approach :
 * Use 2 pointers, first will increament once and second will increament twice.
 * When the second pointer reaches end, first point will be in the middle.
 * 
 * */

public class P3FindMiddleOfLinkedList {

	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		llist.insertAtBegin(10);
		llist.insertAtBegin(20);
		llist.insertAtBegin(30);
		llist.insertAtBegin(40);
		llist.insertAtBegin(80);
		llist.insertAtBegin(100);
		llist.insertAtBegin(120);
		
		llist.findMiddle();
	}
	
}