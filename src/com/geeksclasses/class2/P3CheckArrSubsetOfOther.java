package com.geeksclasses.class2;

import java.util.HashSet;

/**
 * Given two arrays of distinct elements, check if one array is subset of another
 * 
 * @Approach 1 : Put main array in a set, then iterate the subarray to check and use hashing to
 * 				 check if each element exists in main set.
 * */

public class P3CheckArrSubsetOfOther {

	public static void main(String args[]){
		int arr[] = {3,4,2,1,5,6,7};
		int arrToCheck[] = {1,2,7,3};
		
		Solver solver = new Solver();
		System.out.println(solver.isSubSet(arr,arrToCheck));
	}
	
	public static class Solver{

		public int isSubSet(int[] arr, int[] arrToCheck) {
			
			HashSet<Integer> set = new HashSet<>();
			for(int i=0;i<arr.length;i++)
				set.add(arr[i]);
			
			for(int i=0;i<arrToCheck.length;i++){
				if(!set.contains(arrToCheck[i])){
					return 0; 
				}
			}
			
			return 1;
		}
		
		
	}
	
}