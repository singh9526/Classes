package com.geeksclasses.class13;

/**
 * 
 * Start 1:06 PM
 * 
 * 								DYNAMIC PROGRAMMING 
 * 
 * 1. Recursive Solution
 * 	  - Need to think recursively
 *    - Reducing Probles to smaller subproblems so that we can reach base case (s)
 * 2. Optimize the recursive solution if there are overlapping sub problems.
 * 
 * Two ways to optimize :
 * 1. Memoization.
 * 2. Tabulation.
 * 
 * 
 * int fib(int n)
 * {
 * 		if(n==0 || n==1)
 * 			return n;
 * 		else
 * 			return fib(n-1) + fib(n-2);
 * }
 * 
 * 
 * int fib(int n, int loopup[])
 * {
 * 		if(lookup[n] == NIL)
 * 		{
 * 			c
 * 		}
 * 		
 * 				
 * }
 * 
 * Best time complexity for fibboncacci - log n using matrix exponentiation. 
 * 
 * ---------------------- Done 1:23 PM (Explained DP Introduction)
 * 
 * Start 1:24 PM
 * 
 * Q1. Find cost of min Cost Path from (0,0) to (m-1, n-1) in a mxn cost matrix. Cost of a path is defined as the sum
 * of all values of all cells on the path. From a cell (i,j), we can move to either one of the following three :
 * (i+1, j+1)
 * (i+1, j)
 * (i, j+1)
 * 
 * 
 * ---- Done 1:33 PM (P1 Done, Implemented but incorrect)
 * 
 * Q2. 			ROPE CUTTING
 * Stmt : Given a Rope of length n and three sizes a, b and c. We need to cut the rope into pieces
 * of sizes in {a,b,c}. The task is to find count of maximum such pieces. 
 * Input : n=4, a=1, b=2, c=3
 * Output : 4
 * Explaination - We can make maximum four pieces each of length one.
 * 
 * Input : n=7, a=2, b=3, c=4
 * Output : 3
 * (2+2+3) = 7.
 * 
 * --------Done 2:30 PM (Min Cost Path done missed)
 * 
 * Q3. Elit Distance
 * Stmt : Given two strings s1 and s2, find count of min operations to convert s1 and s2. The allowed
 * operations are 
 * 1. Insert a character.
 * 2. Delete a character.
 * 3. Replace a character with some other character.
 * 
 * Ex : 
 * I/P : s1 ="cat" s2 = "cur"
 * O/P : 1
 * Replace 'a' with 'u;
 * 
 * I/P : s1 = "sartuday", s2="sunday"
 * O/P : 3
 * 
 * I/P : s1 = "saturday", s2="sunday"
 * O/P : 3
 * Delete a and t and then replace r with n.
 * 
 * I/P : s1 = "geek", s2="geeks"	
 * O/P : 1
 * 
 * 
 * 	**** This algorithm is used in Lucene - Open Source for suggesting Did you mean?
 * 
 * Expected - Greedy Problems to be solved.
 * Happened - DP Problems were discussed, I spent time studying the standard questions, but none was discussed.
 * Basic DP based problems were discussed and I hadn't practiced them beforehand. Becuase I was busy
 * covering the preqreuisite problems.
 * 
 * ------ Done (2:50 PM)
 * 
 * 
 * ------------------------------------------ 2nd Lecture ----------------------------------
 * 
 *  Start 3:00 PM
 *  
 *  Q1. Number of jumps required to reach end of a stair.
 *  You can just take 1 step or 2 step.
 *              _ n =4
 *             _|
 *           _|
 * person  _| 
 * 
 * int f(int n){
 * 
 * 	if(n<=2) return n;
 * 
 * 	return f(n-1) + f(n-2);
 * }
 * 
 * Q2. Num of paths from top left to bottom right corner Geeks.
 * 
 * ----- Done 3:30 PM
 * 
 * Q3. spoj/problems/COINS  (https://www.spoj.com/problems/COINS/)
 * 
 * Approach :
 * 
 * if(n <= noToFind) 
 * 		return n;
 * else
 * 		f(n) = max(n, f(n/2) + f(n/3) + f(n/4));
 * 
 * Q4. https://leetcode.com/problems/house-robber/
 * Robber can't rob in adjacent houses, amount available for robbery is given in arr.
 * Find maximum sum robber can rob.
 * 
 * Approach - Rob a house or skip it and return sum.
 * 
 * if(n==0) return 0;
 * if(n==1) return arr[0];
 * if(n==2) return max(arr[0],arr[1]);
 * 
 * return max (f(n-2) + arr[n-1], f(n-1));
 * 
 * ***IMP - Total Number of DP Problems are about 20 which are mostly asked.
 * 
 * 
 * -------- Done 3:54 PM
 * 
 * Q5. 0-1 Knapsack Problem (Geeks)
 * 
 * *****HW - Q6. Subset Sum Problem (Geeks) DP 25
 * 
 * ------- Done 4:18 PM
 * 
 * Q6. Partition Problem (2 halves of array having same sum)
 * 
 * */

public class Lecture13Notes {

}
