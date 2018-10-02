package com.geeksclasses.class16;


/**
 * 
 * Start 10:15 AM
 * 
 * DP Problems :
 * Q1. Egg Dropping Problem
 * Q2. Rod Cutting Problem
 * 
 * 
 * ----- 10:37 AM
 * 
 * 					TRIE
 * For creating dictionarires especially usefulwhen alphabet size is small.
 * 
 * Time complexities : O(L) for search insert and delete where L is input string length.
 * 
 * For Self Balancing BST :
 * Time complexity O(Logn) where n is total no of words.
 * 
 * Comparision with Self Balacing BST and Hashing :
 * Hashing also provides time complexity of O(L) but may take much more time in worst case (if there are
 * many collections)
 * 
 * Disadvantage :
 * - Takes a lot of space
 * 
 * Advantages Over Hashing :
 * - Printing in alphabetical order (print dictionary in sorted order)
 * - Prefix search.
 * 
 * Tell interviewer both Hashing and Trie solution
 * 
 * Q1. Trie Implementation
 * 
 * -------- 10:59 AM
 * 
 * 
 * Q2. Search in Trie
 * 
 * 
 * Practical Implementation :
 * - Implemented by routers to find Longest Matching Prefix in Routers  IP Addresses.
 * 
 * ---- 11:13 AM
 * 
 * Q3. Given Binary matrix count distinct rows in it.
 * 
 * IP : mat[][]  = {{1, 1, 0, 0},
 * 					{0, 1, 0, 1},
 * 					{1, 1, 0, 0},
 * 					{0, 1, 0, 1}}
 * 
 * 
 * ------------------------- Done 11:43 AM
 * 
 *  								SEGMENT TREE
 *  
 *  If a array size is fixed and there are 2 operations :
 *  1. Getting a value for a range.
 *  2. Updating values at an index.
 *
 * 	Given an array we need to perform the following operations multiple times. How to implement
 *  these operations :
 *  1. Sum of a given range [l,p]
 *  2. Update value at a given index to a new value x;
 *  
 *  arr[] = {10,5,2,3,15,18,19,25};
 *  
 *  
 *  2 Possible approach :
 *  1. Using array : Sum - o(n) update - O(1)
 *  2. Using prefix sum stored : Sum - O(1) update O(n)
 *  
 *  3. Segment Tree : Sum - O(logn) Update O(logn)
 *  
 *  
 *  Construction of Segment Tree :
 *  1. All elements of given arreay are leaf nodes
 *  2. Internal nodes are sum of a given range.
 *  
 *  Then we create array represenatino of this tree.
 *  
 *  
 *  Both operations go across the height and work in Log(n)
 *  
 *  Range Sum :
 *  - We recursively go down untill exact range match
 *  
 *  Update Operation :
 * 
 * 
 * --------- 12:24 PM
 * 
 *  Q1. For given array 10^3 element, first 10^6 update operations will be performed and then 10^6 range sum
 *  operations will be performed. Which data structures to be used.
 *  
 *  Ans : Don't use segment tree because it will have update in O(1) but it will have range sum in O(Logn)
 *        If we use prefix sum, we will have update in O(1) and range sum in O(1).
 * 
 * 
 *  Q2. If update and range query are interleaved, we need to update in range like i to j add a value and then
 *      fetch . Which data structre will you use.
 *  Ans. Using array - Range Update : O(n)  Fetch O(1)
 *       We use Segment Tree because Using segment Tree - Range Update O(logn) Fetch O(logn) 
 * 
 *  
 * 	
 * Q3. Job Scheduling with start end times and profit given. Which jobs to be done to maximize profit.
 * 
 * Q4. Given 2 arrays, we can have pair of sums of both arrays, we need to return max n such sums.
 * arr1 - 1 ,2 ,3 ,4 ,5 ,6
 * arr2 - 1, 3, 5, 7, 9, 10
 * 
 * 
 * */

public class L16Notes {

	public static void main(String args[]){
		int arr1[] = { 1 ,2 ,3 ,4 ,5 ,6};
		int arr2[] = {1, 3, 5, 7, 9, 10};
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				System.out.print(arr1[i]+arr2[j]+" ");
			}
			System.out.println("");
		}
	}
	
}
