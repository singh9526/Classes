package com.geeksclasses.classs10.sashi;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Start 2 : 00 PM
 * Q1. Print level along with nodes.
 * Q2. Print nodes of a given level.
 * Q3. Print nodes at a given distance from root.
 * Q4. Find width of tree.
 * Q5. Print number of nodes in a given level.
 * Q5. Print first node in a level.
 * ***IMP Q5. Print Left view/right view of a tree
 * ***IMP Q5. Print horizontal distance for each node. : Approach = Keep a queue of pair <Node, int hdDistanct> increament for right, decrease for left.
 * Q5. Print Top view of a tree.
 * ***IMP Q5. Print Bottom view of a tree.
 *  
 *  
 *  Approach : Keep a map of <int,int>. Store first occurence of a given HD in map.
 *  
 *  Left View :
 *  All first nodes of a level.
 *  
 *  Horizontal Distnce :
 *  hd :    -2   -1    0    1    2
 *                    (10)
 *               (9)        (10)
 *           (22)    (10)       (34)
 *           
 *           
 * Q5. Check if 2 Nodes are siblings.
 *  Approach : Just traverse and check if the given 2 nodes are the child of any node.
 * 
 * 
 * Q5. Check 2 trees are identical, given root of two trees.
 * Q5. Check if one tree is a subtree of another.
 * Q5. Print path from root to a given node. (on geeks)
 * 
 * End 3:15 PM
 * -----------------------------  : PM ()
 * Start 3:30 PM
 * Q2. 
 * 
 * - getRank() of element is supported by Balanced BST only
 * - Augmented DS
 * - Balanced BST 
 * - TreeSet
 * - TreeMap
 * - AVL Trees
 * - Red Back Trees
 * - Tree Balancing
 * 
 * **** VERY IMP Q1. Find the diameter of a tree. (diameter is the length of path from one node to the other node)
 * Approach : For every node, check (height of left tree + height of right tree + 1) when it is maximum,
 * that is the answer.
 * 
 * Q. Find Lowest Common Ancestor in a BST.
 * Variations :
 * - Function problem
 * - It it is not a BST
 * 
 * Q. Check if a Tree is balanced or not?
 * 
 * End 4:25 PM
 * -----------------------------  : PM (Not much practice with Questions. Lack of knowledge of various types)
 * Start : PM
 * 
 * Q3. Given Inorder, Preporder, PostOrder  traversal construct tree. 
 * 
 * Q4  Given a BST and only Preorder of PostOrder traversal consruct tree.
 *     Approach: Sort the tree to get Inorder traversal and then question reducees to above question. 
 * 
 * Q5. Maximum sum path problem. Print sum of the path from root to leave which from all possible
 *     root to leave path which has maximum sum.
 *     
 * 
 * End : PM
 * -----------------------------  : PM ()
 * Start : PM
 * Q4. 
 * 
 * End : PM
 * -----------------------------  : PM ()
 * Start : PM
 * Q5. 
 * 
 * End : PM
 * -----------------------------  : PM ()
 * Start : PM
 * Q6. 
 * 
 * End : PM
 * -----------------------------  : PM ()
 * Start : PM
 * Q7. 
 * 
 * End : PM
 * -----------------------------  : PM ()
 * Start : PM
 * Q8. 
 * 
 * End : PM
 * -----------------------------  : PM ()
 * Start : PM
 * Q9. 
 * 
 * End : PM
 * -----------------------------  : PM ()
 * Start : PM
 * Q10. 
 * 
 * End : PM
 * -----------------------------  : PM ()
 * */

public class Class10Notes {

	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void mainIdentical(String args[]){
		Queue<Node> queue = new LinkedList<>();
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(90);
		
		Node root2 = new Node(10);
		root2.left = new Node(20);
		root2.right = new Node(30);
		root2.left.left = new Node(40);
		root2.left.right = new Node(50);
		root2.right.left = new Node(60);
		root2.right.right = new Node(90);
		
		isIdentical(root, root2);
	}
	
	
	public static boolean isIdentical(Node nodeA, Node nodeB){
		if(nodeA==null && nodeB==null)
			return true;
		
		if((nodeA.left==null&&nodeB.left!=null) || (nodeA.left!=null&&nodeB.left==null))
			return false;
		
		if(nodeA.left!=null && nodeB.left!=null){
			isIdentical(nodeA.left, nodeB.left);
		}
		
		if(!(nodeA.left.data == nodeB.data))
			return false;
		
		if((nodeA.right==null&&nodeB.right!=null) || (nodeA.right!=null&&nodeB.right==null))
		
		return isIdentical(nodeA.right, nodeB.right);
		
		
		return true;
	}
	
	public static void main(String args[]){
		Queue<Node> queue = new LinkedList<>();
		
		/**
		 *             (10)
 * 				  (20)     (30)
 * 			  (40)    (50)   (60)
		 * */
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(90);
		
		queue.add(root);
		queue.add(null);
		int level = 1;
		int levelNodeCount = 0;
		while(queue.size() > 1){
			Node node = queue.remove();
			
			if(node!=null){
				levelNodeCount++;
				
				//if(level==3)
				System.out.println(node.data+" ");
				
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);
			}else{
				queue.add(null);
				System.out.println("Level = "+level+" Node Count = "+levelNodeCount);
				levelNodeCount=0;
				level++;
			}
		}
		System.out.println("Level = "+level+" Node Count = "+levelNodeCount);
		
		
		queue.add(root);
		queue.add(null);
		while()
	}
	
}
