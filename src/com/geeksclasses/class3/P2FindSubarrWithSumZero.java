package com.geeksclasses.class3;

import java.util.HashMap;

/**
 * Given an array, finnd if there is a subarray with 0 sum
 * ip arr[] = {5,-3,-1,4,8}
 * op yes
 * 
 * There is a subarray {-3,-1,4}
 * 
 * ip arr[] = {5,8,0,3,12}
 * op yes
 * 
 * There is a subarray {0}
 * 
 * 
 * Prefix Sum - Keeping a sum so far by iterating array.
 * 
 * Approach : Hashing + Prefix Sum
 * 
 * Iterate the array insert prefix sum so far into a hashmap,
 * if prefix sum at current index exists already within hashmap,
 * then a subarray with sum 0 exists, previous index where sum was same + 1 
 * till current index is the subarray.
 * */

public class P2FindSubarrWithSumZero {

	public static void main(String args[]){
		
		int arr[] = {5,-3,-1,4,8};
		Solver solver = new Solver();
		solver.findSubArrWithSumZero(arr);
		
	}
	
	public static class Solver{

		public void findSubArrWithSumZero(int[] arr) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int prefixSum = 0;
			for(int i=0;i<arr.length;i++){
				prefixSum += arr[i];
				
				if(!map.containsKey(prefixSum))
					map.put(prefixSum, i);
				else{
					System.out.println("Starting index " + (map.get(prefixSum)+1));
					System.out.println("Ending index " + i);
				}
			}
		}
		
	}
	
}
