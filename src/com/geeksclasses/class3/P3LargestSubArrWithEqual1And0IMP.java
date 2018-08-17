package com.geeksclasses.class3;

import java.util.HashMap;

/**
 * Given a binary array, find the largest subarray with
 * equal number of 0s and 1s.
 * 
 * arr[] = {0,0,0,1,1,0}
 * op 4
 * 
 * arr[] = {1,1,1,0,0,0,1}
 * op 6
 * */

public class P3LargestSubArrWithEqual1And0IMP {
	public static void main(String args[]){
		int arr[] = {1,1,1,0,0,0,1};
		Solver solver = new Solver();
		solver.findMaxSubArrWithEqual1And0(arr);
	}
	
	public static class Solver{
		public void findMaxSubArrWithEqual1And0(int[] arr) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int prefixSum = 0;
			int maxLength = 0;
			int subArrCount = 0;
			for(int i=0;i<arr.length;i++){
				
				prefixSum = prefixSum + (arr[i] == 0 ? -1 : 1);
				
				if(!map.containsKey(prefixSum)){
					map.put(prefixSum, i);
				}else{
					subArrCount++;
					maxLength = i - (map.get(prefixSum));
				}
			}
			
			System.out.println(subArrCount);
		}
	}
}
