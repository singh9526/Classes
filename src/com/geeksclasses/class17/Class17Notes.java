package com.geeksclasses.class17;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * 
 * Start = 10:30 AM;
 * 
 * 							SEGMENT TREE IMPLEMENTATION
 * 
 * params : 
 * int arr[] = the array from which to build segment tree
 * int seg_tree[] = array in which resultant segment tree will be stored
 * int s_index = index at which sum will be stored
 * int l = the left index
 * int r = the right index 
 * int build(int arr[], int seg_tree[], int s_index, int l, int r){
 * 	
 * 	// We have reached the destination now store the sum :
 * 	if(l == r){
 * 		return seg_tree[s_index] = arr[l];
 * 	}
 * 
 * 	 // Calculate Mid :
 * 	 int mid = (l+r)/2;
 * 
 * 	 // Left Child and Right Child :
 *   int l_index = 2*index;
 *   int r_index = 2*index + 1;
 *   
 *   // Call Recursively for left sub half and right sub half :
 *   seg_tree[s_index] = build(arr, seg_tree, l_index, l, mid); + build(arr, seg_tree, r_index, mid+1,  r);
 * 
 * 	 // Return Value calculated :
 * 	 return seg_tree[s_index];
 * }
 * 
 * 
 * Code Forces segment tree build for exact 2n space
 * 
 * 
 * Q2. Inversion Count in an Array :
 * 	   Check at every element, the no of elements smaller than that element. The sum of all such elements 
 * 	   is Inversion Count of array.
 * 
 * Approach 1 : GEEKS FOR GEEKS (counting-inversions)  using Merge Sort O(log n)  
 * Approach 2 : Using Balanced Tree, by augumenting the nodes and keeping count of left + right + 1 nodes.
 *              O(n logn). So while inserting at a postion, we can check how many elements are there at the
 *              right side for that node.
 *              Note : This approach is difficult when duplicate elements exist
 * Approach 3 : Using Segment Trees :
 *              Create an array of count of elements from 0 to maximimum value .
 *              Create segment tree.
 *              Not good if number of elements is too large
 *              Complexity O(n logk)
 *              
 * Q3. Longest Palindromic Substring.
 * Using DP 
 * Complexity - O(n^2)
 * Space - O(n^2)
 * 
 * Keep a boolean table DP[n][n] telling you is string from i,j is a palindrome or note.
 * 
 * -- Mark All Single Characters as Palindrome :
 * for(int i=0;i<n;i++){
 * 	DP[i][i] = true;
 * }
 * 
 * 
 * -- Check if 2 length strings are palindrome ex : aa is palindrome
 * for(int i=0;i<n-1;i++){
 * { 
 * 		if(s[i] == s[i+1]){
 * 			s[i][i+1] = true;
 * 			max_len = 2;
 * 			DP[i][i+1] = true;
 * 		}
 * }
 * 
 * -- For lengths 3 and onwards check if first and last character are equal 
 * 		and remaining string in middle is palindrome, then string is palindrome :
 * for(int len = 3; len<=n; len++){
 * 	for(int i=0;i<n-1en+1;i++){
 * 		if(s[i] == s[i+len-1] && DP[i+1][i+len-2] == true){
 * 			max_len = len;
 * 			DP[i][i+len-1] = true;
 * 		}
 * 	}
 * }
 * 
 * Approach 2 : Using sinly linked list : While traversing keep on reversing the node.
 * 
 * 
 * -------------------------------------- Session 2
 * 
 * Start = 12:30 PM
 * 
 * Q1. Design Hit Counter that saves hits uptil last 5 minutes.
 * 	   leetcode design hit counter.
 * 
 * Q2. Desin Twitter
 * 
 * Q3. Design a URL Shortening Service.
 * 
 * */




public class Class17Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<E>
		set.

	}

}
