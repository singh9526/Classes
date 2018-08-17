package com.geeksclasses.class3;

/**
 * Given an array, find index 'i' where left and rigt sum are equal. 
 * */

public class P1BalancePointInArr {

	public static void main(String args[]){
		int arr[] = {1,2,3,3,3};
		int totalSum = 0;
		for(int i=0;i<arr.length;i++){
			totalSum += arr[i];
		}	
		
		int currentSum = 0;
		for(int i=0;i<arr.length;i++){
			currentSum += arr[i];
			if(totalSum - currentSum == currentSum){
				if(i == arr.length-1)
					System.out.println("-1");
				else
					System.out.println(i);
			}
		}
	}
	
}