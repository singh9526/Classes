package com.geeksclasses.class8;

public class P3TreeTraversal {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int x){
			data = x;
			left = right = null;
		}
	}
	
	public static void inorder(Node root){
		
		if(root.left!=null)
			inorder(root.left);
		
			System.out.print(root.data+" ");
		
		if(root.right!=null)
			inorder(root.right);
	}
	
	public static void postorder(Node root){
		if(root.left!=null)
			postorder(root.left);
		
		if(root.right!=null)
			postorder(root.right);
		
		System.out.print(root.data+" ");
	}
	
	public static void preorder(Node root){
		
		System.out.print(root.data+" ");
		
		if(root.left!=null)
			preorder(root.left);
		
		if(root.right!=null)
			preorder(root.right);
	}
	
	public static void main(String args[]){
		
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(12);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		
//		inorder(root);
//		System.out.println("");
		preorder(root);
	}
	
}
