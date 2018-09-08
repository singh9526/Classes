package com.geeksclasses.class8;

import com.geeksclasses.class8.P3TreeTraversal.Node;

public class P5ChildrenSumProperty {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int x){
			data = x;
			left = right = null;
		}
	}
	
	public static boolean followsRootSum(Node root){
		
		if(root==null)
			return false;
		
		if(root.left==null && root.right==null || ((followsRootSum(root.left) && followsRootSum(root.right))))
			return true;
		
		int rootSum = 0; 
		
		if(root.left!=null)
			rootSum += root.left.data;
		if(root.right!=null)
			rootSum += root.right.data;
		
		if(!(root.data == rootSum))
			return false;
		
		return true;
	}
	
	public static void main(String args[]){
		
		Node root = new Node(18);
		root.left = new Node(13);
		root.right = new Node(5);
		root.left.left = new Node(6);
		root.left.right = new Node(7);
		root.right.left = new Node(7);
		
		if(followsRootSum(root))
			System.out.println("yes");
		else
			System.out.println("No");
		
	}
	
}