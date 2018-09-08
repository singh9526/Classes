package com.geeksclasses.class8;

import com.geeksclasses.class8.P3TreeTraversal.Node;

public class P4FindHeightOfTrere {
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	
	static int findHeightRec(Node root, int height){
		
		if(root==null || (root.left==null && root.right==null))
			return height+1;
		
		if(root==null)
			return 0;
		
		return Math.max(findHeightRec(root.left,height+1), findHeightRec(root.right,height+1));
		
	}
	
	public static void main(String args[]){
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(12);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.left.right = new Node(3);
		root.left.right.right = new Node(3);
		
		System.out.println("Height - "+findHeightRec(root,0));
	}
	
}

