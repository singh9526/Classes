package com.geeksclasses.class3.sashi;

import java.util.ArrayList;

/**
 * Available on Geeks
 * 
 * Approach 1 : Use an ArrayList with pair (time, arrival/departure),
 * add all the array elements in the list and sort it.
 * Then for each arrival increase count, for each departure decrease count
 * print what maximum sum was so far.
 * 
 * o(n)
 * 
 * Approach 2 : Merge both arrays while comparing increament count for arrivals,
 * if smaller of both is arrival, else decrease. Print max sum at any instsant. 
 * */

public class P1MinNumOfPlatformForTrains {

	public static void main(String args[]){
		ArrayList<Pair> list = new ArrayList<>();
		String arr1[] = {};
		int arr2[] = {};
		
		for(int i=0;i<arr1.length;i++){
//			list.add(new Pair(arr1[i],true));
//			list.add(new Pair(arr2[i],false));
		}
	}
	
}