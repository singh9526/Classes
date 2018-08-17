package com.geeksclasses.class3;

import java.util.HashMap;

/**
 * Given an array, and a number k, find the maximum sum of a subarray
 * of size k
 * 
 * arr[] = {3,2,10,15,3,18}
 * k = 3
 * op 36
 * 
 * */
public class P5SlidingWindow {

	public static void main(String args[]){
		
		int arr[] = {3,2,10,15,3,18};
		int k=3;
		findMaxSumSubArr(arr, k);
	}

	private static void findMaxSumSubArr(int[] arr, int k) {
		int maxSum=0;
		for(int i=0;i<k;i++){
			maxSum+=arr[i];
		}
		
		int currentSum=maxSum;
		for(int i=k;i<arr.length;i++){
			currentSum = (currentSum+arr[i])-(arr[i-k]);
			if(currentSum>maxSum)
				maxSum = currentSum;
		}
		
		System.out.println(maxSum);
	}
	
}