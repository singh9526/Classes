package com.geeksclasses.class9;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class P3MedianFromStream {

	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		
		Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i:arr){
			queue.add(i);
		}
		
		if(queue.size()/2 == 0){
			int a = queue.remove();
			int b = queue.remove();
			
			System.out.println((a+b)/2);
		}else{
			System.out.println(queue.remove()/2);
		}
	}
	
}
