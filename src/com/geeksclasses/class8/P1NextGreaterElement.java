package com.geeksclasses.class8;

import java.nio.channels.FileLockInterruptionException;
import java.util.Stack;

public class P1NextGreaterElement {

	public static void main(String args[]){
		int arr[] = {5,3,8,12,9,15,7}; 
		findNextGreater(arr);
		
	}
	
	public static void findNextGreater(int arr[]){
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<arr.length;i++){
			
			if(stack.isEmpty()||stack.peek() > arr[i]){
				stack.push(arr[i]);
			}else{
				while(!stack.isEmpty() || stack.peek() < arr[i]){
					System.out.println(stack.peek()+" -> "+arr[i]);
					stack.pop();
				}
				stack.push(arr[i]);
			}
			
			while(!stack.isEmpty()){
				System.out.println(stack.peek()+" -> -1");
				stack.pop();
			}
		}
	}
	
}
