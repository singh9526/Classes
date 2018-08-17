package com.geeksclasses.class2;

import java.util.HashSet;

/**
 * Given an unsorted array and a number x, find if there is a pair in array with sum
 * equals to x.
 * 
 * 	arr[] = {1,3,2,5,20,10}
 * 
 * 	x = 8
 * 
 * O/P : Yes // There is a pair(3,5) with sum equals 8
 * 
 * @Approach 1 : Subtract current element with the sum (8) and then check that element (1-8 = 7 ex) exists in Map or not.
 * If it exists then pair exists, otherwise check for other elements
 * 
 * Complexity - O(n)
 * 
 * @Aprroach 2 : If array is sorted then we can use 2 pointers, 1 from left and 1 from right
 * 				 if(sum > sumToFind) right-- 
 * 				 else 
 * 					left++;
 * 
 * */

public class P4FindPaitWithSumInArrIMP {

	public static void main(String args[]){
		
		int arr[] = {1,3,2,5,20,10};
		int sum = 23;
		Solver solver = new Solver();
		
		solver.getSumPair(arr,sum);
	}
	
	public static class Solver{

		public void getSumPair(int[] arr, int sum) {
			
			HashSet<Integer> set = new HashSet();
			for(int i=0;i<arr.length;i++)
				set.add(arr[i]);
			
			for(int i=0;i<arr.length;i++){
				if(set.contains(sum-arr[i])){
					System.out.println(arr[i]+","+(sum-arr[i]));
					break;
				}
			}
				
		}
	}
	
}