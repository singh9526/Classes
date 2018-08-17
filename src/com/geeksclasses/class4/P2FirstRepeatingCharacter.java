package com.geeksclasses.class4;

import java.util.Arrays;

/**
 * Given a string, find first repeating character (Character whose first occurence comes first)
 * ip str = "geeksforgeeks"
 * op 'g'
 * */
public class P2FirstRepeatingCharacter {

	public static void main(String args[]){
		String str1 = "geeksforgeeks";
		
		findFirstRepeating(str1);
	}

	private static void findFirstRepeating(String str1) {

		int arr[] = new int[256];
		int result = Integer.MAX_VALUE;
		Arrays.fill(arr, -1);
		
		for(int i=0;i<str1.length();i++){
			if(arr[str1.charAt(i)] == -1)
				arr[str1.charAt(i)] = i;
			else{
				result = Math.min(result, arr[str1.charAt(i)]);
			}
		}	
		
		System.out.println(str1.charAt(result));
	}
	
};