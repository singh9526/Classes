package com.geeksclasses.class14;


/**
 * ------------------------- Start  10:05 AM
 * 
 * Q1.Longest Common Subsequence.
 * Given 2 strings s1 and s2, find length of the longest common subsequence.
 * 
 * IP :  s1 = "ABCDABCD"
 * OP :  s2 = "DAEBCFD"
 * OP : 5 (DABCD) 
 * 
 * A subsequence of a string is obtained by removing 0 or more characters from it and keeping order 
 * of remaining characters.
 * 
 * IP : s1 = "ABC"
 *      s2 = "DEF"
 * OP : 0
 * 
 * IP : s1 = "geeks"
 *      s2 = "geeks"
 * OP : 5
 * 
 * -------------------------- 
 * Q2. Rod Cutting.
 * Given a rod of length n. We need to cut the rod into different pieces such that we get maximum value.
 * Values of different length pieces of the rod are different.
 * IP : n=5
 * values = {5,3,10,12,8}
 * O/P : 25
 * We break the rod into five pieces each of length one.
 *
 * Notes : 
 * - Need to read up on tabulation and memoization videos. How to think about it. 
 * 
 * ---------------- Done 11:03 PM (Solved LCS but without DP)
 * 
 * Q3. Optimal Stratergy for game.
 * You have even number of coins arranges in a row. You are playing with an opponent (who also plays optimally)
 * your task is to collect maximum sum. You and your opponent pick a coin alternatively from one of the two ends. 
 * You make the first move.
 * 
 * IP : values[] = {1,3,8,5}
 * OP : 9
 * 
 * You choose 1 then 8.
 * 
 * IP :  values[] = {10, 5, 3, 6}
 * OP : 15
 * 
 *  IP : values[] = {10, 5, 3, 6, 29, 18}
 *  OP : 33
 *  
 *  
 *  
 *  
 *  Start 11:23 PM Q4.   					EGG DROPPING
 *  Given k eggs and n floors, the task is to find minimum number of trails (in worst case) for finding the threshold
 *  floor. A floor is called threshhold floor if egg breaks dropping from it and all floors above it.
 *  
 *  Following are some important facts :
 *  1. If an egg does not break after dropping from i-th floor, it will also not break when dropping from
 *  (i-1)th floor, (i-2)th floor.... etc
 *  
 *  2. If an egg breaks from i-th floor, it will also break from i+1 th floor, i+2 th floor etc...
 *  
 *  IP n=10, k=2
 *  OP 4
 *  
 *  Tries, segment tree, dp
 *  
 *  
 *  ---------- Done 11:50 PM                2nd LECTURE
 *  
 *  Q1. COIN Change Problem :
 *  coins[] = {1,2,3}
 *  make 4.
 *  
 *  Q2 Minimum COINs required Change Variation :
 *  given a set of coins[] = {1,2,3} tell the minimum number of coins needed to make a coin.
 *  Ex for 4 min coins required are 2 , (2+2 = 4)
 *  
 *  https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/
 *  
 *  ------ Done 12:30 PM
 *  
 *  Q3. 				CUTTING ROD
 *  Codding Bat
 *  
 *  
 *  
 *  IMP : Practice - https://codingbat.com/java
 *  
 *  
 *  
 *  ----- Done 12:40 PM           GREEDY
 *  ******IMP Q4. Connect n ropes with minimum cost.
 *  Approach : Use a priority queue take out 2 minimum and push it back to the queue, so on till only 
 *  1 element is left.
 *  
 *  Complexity O(logn).
 *  
 *  
 *  Q5. HUFFMAN CODING
 *  Data Compression 
 *  
 * ------------ Done 12:57 PM
 * 
 * Q6. Fractinal Knapsack Problem.
 *
 * 
 * ------ Done 1:04 PM
 * 
 *                                        BACKTRACKING
 * 
 * Q7.  N QUEENS PROBLEM
 * 
 * Q8. No of unique BSTs that can be formed using 1....n       
 * 
 *          i            (taking ith element as the root)
 *  f(i-1)  *  f(n-i)     
 *  
 * 
 * 
 * */

public class Lecture14Notes {

	public static void main(String[] args) {

	}

}
