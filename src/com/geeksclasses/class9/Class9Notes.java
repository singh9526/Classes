package com.geeksclasses.class9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Start 1:04 PM
 * Q1. Level Order Traversal.
 * 
 * ip :    
 * 					   (10)
 * 				  (20)     (30)
 * 			  (40)    (50)   (60)
 * 	
 * op : 10 20 30 40 50 60
 * 
 * Code :
 * 
	 * void levelorder(Node *root)
		{...}
		
		int main(){
			Node *root = new Node(10);
			root.left = new NOde(20);
			root.right = new Node(30);
			root.left.left = new Node(40);
			root.left.right = new Node(50);
			root.right.left = new Node(60);
			return 0;
		}
		
		struct Node{
			int key;
			Node *left, *right;
			Node(int x){
				key = x;
				left = right = null
			}
		}
 * 
 * Approach :
 * On geeks.
 * 
 * End 1:19 PM
 * -----------------------------  : PM (1 Question done. Implemented.)
 * Start 1:19 PM
 * Q2. Print level order traversal line by line.
 * 
 * ip  Same tree as above.
 * op :
 * 
 * 10
 * 20 30
 * 40 50 60 
 * 
 * Approach :
 * On geeks.
 * 
 * End 01:29 PM
 * -----------------------------  : PM (2 Questions done. Implemented)
 * Start 1:29 PM
 * @@@@@@@HW (****Specially written on board : one of the most popular interview question on tree) 
 * Q3. Print level order traversal in zig zag manner.
 * 
 *  ip :  
 *  				  (10)
 * 				  (20)     (30)
 * 			  (40)    (50)   (60)
 * 
 *  op : 
 *  
 *  10 20 30 60 50 40.
 *  i.e. we go each level, once left to right then right to left.
 *  
 * 
 * Approach :
 * 
 * 
 * End 1:49 PM
 * -----------------------------  : PM (Completed 3 Questions. Implemented 2, implemented some other from geeks 
 * 										practice)
 * Start 1:49 PM
 * Q4. Given a Binary tree, check if it is a BST or not.
 * (******Specially written on board : one of the most asked interview question)
 * 
 * ip :
 *                     (10)
 * 				   (5)     (15)
 * 			   (4)    (11)   
 * 
 * op : No
 * 
 * 
 * ip : 
 * 					   (10)
 * 				   (5)     (30)
 * 			   (4)    (8)   
 * 
 * op : yes
 * 
 * Approach :
 * O(n^2) compare max and min of left sub tree || right sub tree
 * O(n) : pass current min and max as state in recursion and check.
 * 
 * https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
 * 
 * 
 * End 2:25 PM
 * -----------------------------  : PM (Not implemented BST and HomeWork questions)
 * Start 2:35 PM
 * 
 * BFS (level order)
 * DFS (in order, pre, post)
 * Which to choose?
 * 
 * 
 *                                           HEAP Data Structure
 * 
 * Array Implementation is preffered.
 * @@@@@@HW Implement Heap Operations and their time complexities :
 * Binary Heap Question in Practice :
 * 1. getMin()
 * 2. extractMin()
 * 3. decreaseKey()
 * 4. remove()   
 * 5. BuildHeadp()
 * 
 * Competitor of heap is Self Balancing BST.
 * extractMin(), decreaseKey() and Remove() is logn, but buildHeap is O(n logn)
 * 
 * Applications :
 * 1. Priority Queue - Dijkstra's Algorithm, Prim's Algorithm, Huffman Coding.
 * 2. Heap Sort
 *
 *
 * Q5. Given an almost sorted array (Every element is at most k distanct away from it's sorted position
 * 	   for a given k), sort the array. 
 * 
 * ip : arr[] = {10,2,5,8,7,14,13}
 *      k=3
 * op : arr[] = {2,5,7,8,10,13,14} 
 * 
 * Approach :
 * 
 * 
 * End 3:18 PM
 * -----------------------------  : PM (Implementing the Almost Sorted Array Question)
 * Start 3:18 PM
 * 
 * Q6. Given an unsorted array, print k largest elements.
 * arr[] = {10,5,3,15,20}
 * k = 3
 * op : 10 15 20
 * 
 * (Output can be in any order)
 * 
 * Approach :
 * 
 * 
 * End 3:33 PM
 * -----------------------------  : PM (Done)
 * Start 3:33 PM
 * 
 * Q7. Given an unsorted array, print k largest elements. 
 * arr[] = {10,5,3,15,20}
 * k = 3
 * op = 10 14 20
 * (output can be in any order)
 * 
 * Approach :  
 * 1. simply sort O(n logn)
 * 2. Make a max heap of all elements O(n)
 *    then do extract max k times O(k logn)
 *    so O(n + k*logn)
 * 
 * End 4:02 PM
 * -----------------------------  : PM (Implemented but not with the most effective approach discussed last)
 * 
 * Start 4:02 PM
 * 
 * Q8. Given k sorted arrays, merge them into a single sorted array.
 * 
 * Approach :
 * Use a priority queue of pairs(index in array and value)
 * find min, and increase the index of the corresponding array from which min was found.
 * 
 * 
 * @@@@@@@@HW ******Important (Asked in top tier companies for Heap) 
 * Q9. Given a stream of numbers find median at every point.
 * ip : arr[] = {2,18,15,3,1,16}
 * op : 2, 10, 
 * 
 * for odd numbers is it middle number
 * for even it is (sum of middle 2 number)/2.
 * 
 * Variation - Find kth largest. ex if k=2, find 2nd largest number.
 * 
 * median is sum of numbers / 2.
 * 
 * 
 * Notes :
 * How to go about thinking a problem which you don't know a solution of?
 * What steps can you take?
 * 
 * Q10. Merge K Sorted Arrays.
 * mat[][k] = {{2,5,10}
 * 			   {2,5,10}
 * 			   {1,40,100}
 * 			  }
 * 
 * */

public class Class9Notes {
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	
	static Queue<Node> stack = new LinkedList<>();
    
    static void zigZag(Node node) 
    {
    	boolean zigZag = true;
        if(node==null){
            System.out.println("$");
            return;
        }
        
        // Goto root and push is to stack and push null;
        if(stack.isEmpty()){
            stack.add(node);
            stack.add(null);
        }
            
        while(!stack.isEmpty()){
            Node cur = stack.remove();
        
            if(cur==null){
                if(stack.peek()!=null)
                    stack.add(null);
                
                zigZag = !zigZag;
            }else{
                System.out.print(cur.data+" ");
                
                if(zigZag){
                	if(cur.right!=null)
                        stack.add(cur.right);
                        
                    if(cur.left!=null)
                        stack.add(cur.left);
                }else{
                	if(cur.left!=null)
                        stack.add(cur.left);
                	
                	if(cur.right!=null)
                        stack.add(cur.right);
                }
            }    
        }
        
        
        
        // Pop stack and push it's left and right to queue and
        // process the element.
        // If element popped is -1, push -1 to queue and print $
    }
    
    static boolean isBST(Node node, Node prev){
    	if(node==null)
    		return true;
    	
    	if(isBST(node.left, prev) == false){
    		return false;
    	}
    	
    	if(prev!=null){
    		if(prev.data >= node.data){
    			return false;
    		}
    	}
    	
    	prev = node;
    	
    	return isBST(node.right, prev);
    	
    }
    
    static Queue<Integer> queue = new PriorityQueue<Integer>();
	
	public static void main(String args[]){
		
//		Node root = new Node(10);
//		root.left = new Node(20);
//		root.right = new Node(30);
//		root.left.left = new Node(40);
//		root.left.right = new Node(50);
//		root.right.left = new Node(60);
		
//		System.out.println(isBST(root,null));
		
		// Nearly Sorted Array :
		
//		int arr[] = {10,2,5,8,7,14,13};
//		int k =3;
//		int i;
//		for(i=0;i<=k;i++){
//			queue.add(arr[i]);
//		}
//		
//		while(i<arr.length || !queue.isEmpty()){
//			System.out.print(queue.remove()+" ");
//			queue.add(arr[i]);
//			if(i+1<arr.length)
//				i++;
//			else
//				break;
//		}
//		
//		while(!queue.isEmpty()){
//			System.out.print(queue.remove()+" ");
//		}
		
		// Print K Largest
/*		int arr[] = {10,5,3,15,20};
		int k =3;
		int i;
		queue = new PriorityQueue<>(Collections.reverseOrder());
		for(int j: arr){
			queue.add(j);
		}
		
		for(int j=0;j<k;j++){
			System.out.print(queue.remove()+" ");
		}*/
		
		//Min Heap Approach :
		int arr[] = {10,5,3,15,20};
		int k =3;
		int i;
		Queue<Integer> queue = new PriorityQueue<>();
		for(i=0;i<k;i++){
			queue.add(arr[i]);
		}
		
		int min;
		for(i=k;i<arr.length;i++){
			min = queue.remove();
			if(min < arr[i]){
				queue.add(arr[i]);
			}
		}
		
		while(!queue.isEmpty()){
			System.out.print(queue.remove()+" ");
		}
		
	}
	
}
