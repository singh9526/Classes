package com.geeksclasses.class12;

/**
 * Start 10:08 PM 
 * 
 * Q1. Detect cycle in a directed graph.
 * Approach : Keep another boolean array isInStack[] set true for current num when enterin
 * recursion, set false when recursive call is ending. 
 * 
 * Q2. Find median of a stream.
 * Appraoch 1 - Keep a self balancing BST, augument it to keep rank of elements, so then we can find
 * kth largest (rank = k) of an element in log(n) time. 
 * 
 * HW : Approach 2 - Use Heap, it is better because it keeps elements in array which is cache friendly.
 * 
 *                                     Topological Sorting.
 *                                     
 * To find order for a set of events that are dependant on each other.
 * Realworld Ex : Makefile keeps a topological order.
 *                                     
 * *** IMP - BFS, DFS, Cycle more popular in interviews compared to implementing Kruskal or Prim's
 *                                     
 * Q3. Given a directed acyclic graph, find the topological sorting. 
 * Approach 1. Using stack, push a node to stack, once all it' child have been processed. The pop stack, that's
 * the topological order. 
 * 
 * HW Approach 2. Kahn's Algorithm
 * 
 * -------- Done 10:38 AM
 * 
 * Yesterday's Question :
 * Q4. Given 2 digits, print n numbers formed by combination of these digits in increasing order.
 * 
 * ip : digits[] = [5,6]
 * op : [5,6,55,56,65,66,555,556]
 * 
 * ---- Given time to solve startin 10:40
 * iterate over the digits in array,
 * push the 2 element into a queue.
 * for first element append it to start of both the number
 * 
 * ---- 11:20 PM
 * 
 * Q5. Construct a Binary Tree from a given preOrder and inOrder traversal. try O(n^2) approach then O(n).
 * inorder[] = {2,5,8,10,15}
 * preorder[] = {10,5,2,8,15}
 * o/p : root of th below tree.
 * 
 * 		  (10)
 *    (5)     (15
 * (2)   (8)
 * 
 * 
 * Q6. Convert a binary tree to a doubly linked list (in-place). The left pointer should point to prev, and right
 * pointer to next.
 * 
 * i/p : 
 * 
 * 		  (10)
 *    (5)     (20)
 * (1)   (8)
 * 
 * o/p   1 -> 5 -> 8 -> 10 -> 20
 * 
 * Q7. 2 nodes are swapped in a BST. fix the BST.
 * 
 * Andrew NG - Coursera Theoryy (Maths)
 * Deep Learning Specialization - Coursera
 * Udemy - Machine Learning A to Z
 * Book
 * IT Bodhi Noida - 20,000 Competitive Progr
 * 
 * 
 * ---------- Done 12:02 PM
 * 
 * Q1. Rat in a maze. using backtracking. geeks
 * Q2. Knight Tour. Backtracking problem.
 * Q3. Topological Sorting for selecting which courses to take. https://leetcode.com/problems/course-schedule-ii/
 * Topological sorting using start[] and finish[] time arrays.
 * 
 * ***IMP Real world questions :How do build tools like Maven resolve dependencies - Ans Topological Sorting
 * 
 * Q4. Given a Binary Tree tell if 2 nodes are in same path.
 * 
 * 
 * Implement : 
 * 1. Topological Sorting
 * 2. Backtracking - Rat in a maze.
 * 3. BST from inorder postorder
 * 
 * 
 * ***IMP for Graph most questions are BFS, DFS or topological sorting, 
 *     Dijktra's (maybe), Kruskal, Prim's not so much.
 *     
 * ---- 12:57 PM
 * 
 * Q4. Given sorted dictionary find character precedence (geeks)  (Graph question)
 * Q5. Design a DS  (Balanced BST Question)
 * 1. findMAx findmin
 * 2. get next (go to right of tree and keep going left i.e. inorder successor or predecessor)
 * 3. get prev (https://www.cdn.geeksforgeeks.org/inorder-predecessor-successor-given-key-bst/)
 * 4. find rank (rank = size of left subtree + 1)
 * 5. getElementOfGivenRank()
 * 
 * Ans. Balance BST.
 * 
 * Code is made to be written for BST only not for balanced tree like AVL because code is too long.
 * 
 * 
 * 
 * */

public class Classs12Notes {

}
