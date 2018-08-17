package com.geeksclasses.class2;

/**
 * Given an array where element appears even number of 
 * times except one element, find the odd occuring element
 * 
 * arr[] = {2,4,4,3,3,15,2}
 *  
 *  op - 15
 *  
 *  Properties :
 *  X^0 = X
 *  X^X = 0
 *  (X^Y)^Z = X^(Y^Z)
 *  
 *  @Approach 1 : Hashing, find frequency of all elements return element with odd frequency
 *  
 *  @Approach 2 : XOR all the elements and even will cancel out, only odd element will remain 
 *  
 *  
 *  @Modification 1 : If there are 2 odd occuring elements
 *  
 * */

public class P6FindOddOccuringElementBitWise {

	public static void main(String args[]){
		int arr[] = {2,4,4,3,3,15,2};
		int xorVal = 0;
		for(int i=0;i<arr.length;i++){
			xorVal = arr[i] ^ xorVal;
		}
		
		System.out.println(xorVal);
	}
	
}