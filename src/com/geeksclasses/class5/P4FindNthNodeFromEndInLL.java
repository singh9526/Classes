package com.geeksclasses.class5;

/**
 * Find n-th node from end of linked list
 * ip : 1 2 3 4 5
 * n = 2
 * op : 4
 *
 * */

public class P4FindNthNodeFromEndInLL {

	public static void main(String args[]){
		LinkedList llist = new LinkedList();
//		llist.insertAtBegin(10);
//		llist.insertAtBegin(20);
//		llist.insertAtBegin(30);
//		llist.insertAtBegin(40);
		llist.insertAtBegin(80);
		llist.insertAtBegin(100);
		llist.insertAtBegin(120);
		
		System.out.println(llist.findNthFromEnd(2).key);
	}
	
}