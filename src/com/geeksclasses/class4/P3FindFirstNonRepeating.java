package com.geeksclasses.class4;

import com.geeksclasses.class3.sashi.Pair;

/**
 * 
 * */
public class P3FindFirstNonRepeating {

	public static void main(String args[]){
		
		String str = "geeksforgeeks";
		findFirstNonRepeatingElement(str);
		
	}

	private static void findFirstNonRepeatingElement(String str) {
		Pair arr[] = new Pair[256];
		
		for(int i=0;i<256;i++)
			arr[i] = new Pair();
		
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)].index == -1){
				arr[str.charAt(i)].index = i;
				arr[str.charAt(i)].freq = 1;
			}else{
				arr[str.charAt(i)].freq++;
			}
		}
		
		Pair minPair;
		int minIndex = Integer.MAX_VALUE;
		for(int i=0;i<256;i++){
			if(arr[i].freq == 1){
				if(arr[i].index < minIndex){
					minIndex = arr[i].index;
				}
			}
		}
		
		System.out.println(str.charAt(minIndex));
		System.out.println();
	}
	
}