package com.geeksclasses.class6;

/**
 * Given a linked with even and odd values, rearrange the list such 
 * that are even values
 * 
 * Appraoch 1 : 
 * O(n) + extra space
 * Take 2 extra lists and insert even in one and odd in another and then combine
 * 
 * O(n) but 2 traversal
 *  
 * */

public class P2EvenAndOddRearrangeList {

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
	
	Node segregateEvenAndOdd(){
	    Node evenHead = null;
	    Node evenTail = null;
	    Node oddTail = null;
	    Node oddHead = null;
	    Node curr = head;
	    while(curr!=null){
	        if(curr.data/2 == 0){
	            if(evenTail==null){
	                evenTail = curr;
	                evenHead = curr;
	            }else{
	                evenTail.next = curr;
	                evenTail = curr;
	            }
	        }else{
	            if(oddTail==null){
	                oddTail = curr;
	                oddHead = curr;
	            }else{
	                oddTail.next = curr;
	                oddTail = curr;
	            }
	        }
	        curr = curr.next;
	    }
	    
	    oddTail.next = null;
	    evenTail.next = oddHead;
	    return evenHead;
	}
	
	public static void main (String[] args) {
		P2EvenAndOddRearrangeList list = new P2EvenAndOddRearrangeList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        Node newList = list.segregateEvenAndOdd();
        list.printList(newList);
	}
	
}
