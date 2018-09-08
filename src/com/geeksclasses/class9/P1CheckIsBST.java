package com.geeksclasses.class9;

import com.geeksclasses.class9.P2ZigZagLevelOrderTraversal.Node;

public class P1CheckIsBST {
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	
	/** 
	 *                    (40)
     * 				 (20)     (50)
     * 			  (10)    (30)   (60)
	 * */
	
	public static void main(String args[]){
		Node root = new Node(40);
		root.left = new Node(20);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(50);
		
//		inorder(root);
		
		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)+" ");
	}
	
	public static void inorder(Node node){
		if(node.left!=null)
			inorder(node.left);
		
		System.out.print(node.data+" ");
		
		if(node.right!=null)
			inorder(node.right);
	}
	
	static boolean isBST(Node root, int lowerBound, int upperBound){
		
		if(root==null)
			return true;
		
		if(!isBST(root.left, lowerBound, root.data)){
			return false;
		}
		
		if(root.data > upperBound || root.data < lowerBound)
			return false;
	
		
		return isBST(root.right, root.data, upperBound);
	}

}
