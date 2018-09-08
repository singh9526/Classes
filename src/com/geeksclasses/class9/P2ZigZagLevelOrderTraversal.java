package com.geeksclasses.class9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P2ZigZagLevelOrderTraversal {

	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}
	
	/** 
	 *                          (10)
     * 				     (20)         (30)
     * 			    (40)      (50)         (60)
     *           (10)  (20) (30) (40)    (50) (60)
     * 
	 * */

	
	
	public static void main(String args[]){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(60);
		root.left.left.left = new Node(10);
		root.left.left.right = new Node(20);
		root.left.right.left = new Node(30);
		root.left.right.right = new Node(40);
		root.right.right.left = new Node(50);
		root.right.right.right = new Node(60);
		
		printZigZag(root);
		
	}
	
	static void printZigZag(Node n){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        
        s1.push(n);
        
        while(!s1.isEmpty() || !s2.isEmpty()){
            
            while(!s1.isEmpty()){
                Node node = s1.pop();
                System.out.print(node.data+" ");
                
                if(node.right!=null)
                  s2.push(node.right);
                if(node.left!=null)
                  s2.push(node.left);
            }
            
            while(!s2.isEmpty()){
                Node node = s2.pop();
                System.out.print(node.data+" ");
                
                if(node.left!=null)
                  s1.push(node.left);
                if(node.right!=null)
                  s1.push(node.right);
            }
            
        }
    }
	
}
