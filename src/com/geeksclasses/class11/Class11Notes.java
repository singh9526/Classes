package com.geeksclasses.class11;

import java.util.LinkedList;
import java.util.Queue;

/* Q. print adjacency list */
/* Q. print BFS */
/* Q. print BFS for disconnected graph */
/* Q. Detect cycle in Undirected Graph
 *   Keep a track of parent through which a node was visited, 
 *   if parent is not same there is cycle.
 *  */
/**
 * Done - 2:25 PM
 * 
 * Q. Detect cycle in Directed Graph
 * 
 * Q. Find shortest path from a given source in an unweighted and undirected graph.
 * Practicing DS + Implementing some problems while looking at the solution.
 * 
 * Find distance to each node from source node.
 * 
 *  Approach : Simply perform BFS, for adjacent to root, distanct is (0+1) = 1, now when visited not 
 *  visited next level nodes, keep increasing current distance + 1.
 * 
 *                          (0)
 *                         / | \
 *                       (1) | (2)
 *                       /  \|  
 *                      (3) (4)
 * 
 * Q. Given 2 digits, print n numbers formed by combination of these digits in increasing order.
 * 
 * ip : digits[] = [5,6]
 * op : [5,6,55,56,65,66,555,556]
 * 
 * 
 * ======================================= Part 2 ================================================
 * 
 * Questions from GFG :
 * Q1. Find shortest distance between 2 nodes in undirected graph.
 * Q2. Find shortest path in a Binary Maze.
 * Q3. Minimum steps to reach target by knight problem. 
 * Q4. Minimum of operations required to convert number x to y (Geeks) (BFS)
 * 
 * Done - 3:40 PM
 * 
 * Q5. Snake and Ladder Problem on Geeks (BFS). 
 * Q6. Word ladder length of shortest chain to reach a word. Geeks.
 * 
 * ---- 4:07 PM
 * Q7. Find number of islands 
 * HW  Q8. Rat in a maze Geeks problem. 
 * Q9. For a given matrix of 0,1 tell if there is a path between 2 points.
 * Call DFS from BFS.
 * */

public class Class11Notes {
	
	class Node{
		int num;
		boolean visited;
		int distanct;
		
		Node(){
			
		}
	}
	
	public static void main(String args[]){
		int x = 4;
		int y = 7;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add();
	
		int distance = 0;
		int curr = -1;
		queue.add(curr*2);
		queue.add(curr-1);
		while(curr!=y){
			curr = queue.remove();
			queue.add(curr*2);
			queue.add(curr-1);
			distance++;
		}
				
		System.out.println("Distanct - "+distance);
	}
	
}
