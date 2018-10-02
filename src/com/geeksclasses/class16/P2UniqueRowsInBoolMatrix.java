package com.geeksclasses.class16;

import java.util.HashMap;

public class P2UniqueRowsInBoolMatrix {

	public static void main(String[] args) {
		int a[][] = {{0,1,1,1}};
		printMat(a, 1, 1);
	}
	
	class TrieNode{
		
		HashMap<Integer, TrieNode> children;
		
		boolean isWord;
		boolean isVisited;
		
		public TrieNode(){
			children = new HashMap<>();
			children.put(0, null);
			children.put(1, null);
		}
		
		public void insert(TrieNode root, int arr[]){
			TrieNode node = root;
			
			int i;
			for(i=0;i<arr.length;i++){
				if(node.children.get(arr[i]) == null)
					node.children.put(arr[i], new TrieNode());
				
				node = node.children.get(arr[i]);
			}
			
			node.isWord = true;
			
//			i = i-1;
			
//			node.children.get(arr[i]).isWord = true;
		}
		
	}
	
	class Trie{
		
		TrieNode root;
		
		public Trie(int arr[][]){
			root = new TrieNode();
			
			for(int i=0;i<arr.length;i++){
				root.insert(root, arr[i]);
			}
		}
		
		public void printUniqueRows(int a[][], int r, int c){
			
			for(int i=0;i<a.length;i++){
				if(isRowUnique(a[i])){
					printRow(a[i]);
				}
			}
			
		}
		
		private boolean isRowUnique(int[] a) {

			TrieNode node = root;
			int i;
			for(i=0;i<a.length;i++){
				
				int num = a[i];
				if(node.children.get(a[i]) == null)
					return false;
			
				if(i==a.length-1){
					
					if(node.children.get(a[i]).isWord == true && node.children.get(a[i]).isVisited == false){
						node.children.get(a[i]).isVisited = true;
						return true;
					}
					
				}
				
				node = node.children.get(a[i]);
			}
			
			return false;
		}

		public void printRow(int a[]){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			System.out.print("$");
		}
	}
	
	public static void printMat(int a[][],int r, int c)
    {
		P2UniqueRowsInBoolMatrix obj = new P2UniqueRowsInBoolMatrix();
		Trie trie = obj.new Trie(a);
		
		trie.printUniqueRows(a,r,c);
    }

}
