package com.geeksclasses.class12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class P1Given2DigitsMakeNumber {

	public static void main(String args[]){

		String arr[] = {"5","6"};
		
		Queue<String> queue = new LinkedList<>();
		queue.add(arr[0]);
		queue.add(arr[1]);
		int k=2;
		
		while(k<=20){
			String s = queue.remove();
			System.out.print(s+" ");
			queue.add(s+"5");
			queue.add(s+"6");
			k++;
		}
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
	}
	
}
