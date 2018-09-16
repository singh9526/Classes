package com.geeksclasses.contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


public class P1 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int gn(BufferedReader br) throws IOException, NumberFormatException{
        return Integer.parseInt(br.readLine());
    }
	
	static int[] getarr(BufferedReader br) throws IOException, NumberFormatException{
		String strArr[] = br.readLine().split(" ");
		int arr[] = new int[strArr.length];
		for(int i=0;i<strArr.length;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		return arr;
	}
	
	static class Node{
		long data;
		Node left, right;
		Node(long data){
			this.data = data;
		}
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		int t = gn(br);
		Scanner input = new Scanner(System.in);
		Node root = null;
		Node head = null;
		while(t-->0){

			int len = gn(br);
			long[] arr = new long[len];
			
			if(arr.length==1)
				System.out.println(arr[0]);
			else if(arr.length==0)
				continue;
			
			for(int i=0;i<len;i++){
				arr[i] = input.nextLong();
				root = addToTree(head,arr[i]);
				if(i==0){
					head = root;
				}
			}
			
			postorder(head);
		}
	}
	
	public static void postorder(Node root){
		
		if(root==null)
			return;
		
		if(root.left!=null)
			postorder(root.left);
		
		if(root.right!=null)
			postorder(root.right);
		
		System.out.print(root.data+" ");
	}

	private static Node addToTree(Node root, long elem) {
		Node node = new Node(elem);
		
		if(root==null){
			root = node;
		}else{
			root = recuriveAdd(root, elem, node, root);
		}
		
		return root;
	}

	private static Node recuriveAdd(Node root, long elem, Node node, Node head) {
		
		if(elem < root.data){
			if(root.left!=null)
				recuriveAdd(root.left, elem, node, head);
			else{
				root.left = node;
				return head;
			}
		}else{
			if(root.right!=null)
				recuriveAdd(root.right, elem, node, head);
			else{
				root.right = node;
				return head;
			}
		}
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		set1.removeAll(set2);
		
		return root;
	}
	
}
