package com.geeksclasses.contest4;

import java.io.IOException;
import java.util.LinkedList;

import com.geeksclasses.contest4.P1.Node;

public class P1test {
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String args[]) throws NumberFormatException, IOException{
		
		Node node = null;
				node = modify(node);
		System.out.println(node.data);
	}
	
	public static Node modify(Node node){
		Node root = new Node( 3);
		node = root;
		return node;
	}
	
}
