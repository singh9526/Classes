package com.geeksclasses.class18;

import java.util.HashMap;
import java.util.Scanner;

import org.w3c.dom.Node;

/**
 * 
 * Start : 10:20 AM
 * 
 * Q1. Implementation of BST Functions : Insert, Delete, Search
 * 
 * Q2. DP : Longest Increasing Subsequence.
 * Approach 1 : DP - O(n^2)
 * Approach 2 : Binary Search O(n logn)
 * 
 * Given an array find the largest increasing subsequence in it.
 * Input arr[] = [5, 10, 7, 8, 20]
 * Output : 4
 * 
 * Variations :
 * 1. Find how many elements need to be changed in array to make array sorted : it is Total Length - LIS elements.
 * 2. Bitonic Subsequence - First increasing and then decreasing
 * 3. Maximum Sum Increasing Subsequence
 * 
 * On Geeks Tag LIS (20-30 Problems base on it)
 * 
 * LIS is 5, 7, 8, 20
 * 
 * Input arr [] = [1,2,3,4]
 * Output : 4
 * 
 * Input arr[] = [4,3,2,1]			
 * Output : 1
 * 
 * ------------------------------ 12:15 PM
 * 
 * Q1. Given an array find duplicate elements without extra space.
 * Q2. Find longest susequence which is a palindrome.
 * Q3. Can we form Palindrome by deleting at most k elements.
 * Q4. Given 3 arrays find minimum range, such that 1 element is from each array.
 * 
 * 
 * Need to practice :
 * 1. Print all subsequences
 * 2. Longest Increasing Subsequence
 * 3. 0 1 Knapsack implementation
 * */


public class Lecture18Notes {

	class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	class BST{
		Node root;
		
		BST(){
			root = null;
		}
		
		/*public Node insert(Node root, int data){
			if(root==null)
				return new Node(data);
			if(data < root.data)
				root.left = insert(root.left, data);
			else 
				root.right = insert(root.right, data);
			
			return root;
		}*/
		
		public Node insert(Node root, int data){
			if(root==null)
				root = new Node(data);
			if(data < root.data)
				insert(root.left, data);
			else 
				insert(root.right, data);return root;
		}
		
		public void search(int data){
			
		}

		public void printInOrder(Node root) {
			if(root == null)
				return;
			
			printInOrder(root.left);
			System.out.print(root.data+" ");
			printInOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,1,3,10,15,8};
		Lecture18Notes obj = new Lecture18Notes();
		BST tree = obj.new BST();
		for(int i=0;i<arr.length;i++){
			tree.root = tree.insert(tree.root, arr[i]);
		}
		
		tree.printInOrder(tree.root);
	}
	
	

}
