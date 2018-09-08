package com.geeksclasses.class5;

public class LinkedList {

	public Node head;
	
	public void print(){
		Node currentNode = head;
		while(currentNode!=null){
			System.out.print(currentNode.key+" ");
			currentNode = currentNode.next;
		}
	}
	
	public void insertAtBegin(int key){
		Node node = new Node(key);
		node.next = head;
		head = node;
	}
	
	
	public void findMiddle(){
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.key);
	}
	
	public Node findNthFromEnd(int n){
		Node fast = head;
		Node slow = head;
		for(int i=0;i<n;i++){
			if(fast==null)
				return null;
			
			fast = fast.next;
		}
		
		while(fast!=null){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}
	
	
	public void reverse(){
		
	}
	
//	public Boolean isLoop(){
//		Node slow = head;
//		if(slow==null || slow.next==null)
//			return false;
//		
//		Node fast = head.next;
//		
//	}
	
	
	
}