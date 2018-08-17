package com.geeksclasses.class4;

/**
 *
 * String, StringBuffer, StringBuilder :
 * 1. contains(x) [x can be a character or string],
 * 	Returns true if x is present else false
 *  
 * 2. indexOf(x) [x can be a character or string],
 * 	Returns first index of x if it is present else returns -1
 * 
 * 3. substring(a,b)  
 * 	Return substring between (a and b-1)
 * 
 * */

/**
 * Given 2 strings, check if they are anagrams or not.
 * 
 * Hint : 2 Strings are anagrams if they have 
 *        Same character set (with same frequency) with different order allowed.
 *        
 * ip str1 = "gfg"
 *    str2 = "ggf"
 * 
 * op : yes
 * 
 * ip str1 = "abcd"
 *    str2 = "abcda"
 *    
 * op : no
 * */
public class P1CheckStringAnagram {
	
	public static void main(String args[]){
		
		String str1 = "gfg";
		String str2 = "ggf";
		
//		checkIsAnagramWith2Arrays(str1, str2);
		checkIsAnagramWith1Array(str1, str2);
		
	}
	
	private static void checkIsAnagramWith1Array(String str1, String str2) {
		int arr[] = new int[256];
		
		for(int i=0;i<str1.length();i++)
			arr[str1.charAt(i)]++;
		
		for(int i=0;i<str2.length();i++)
			arr[str2.charAt(i)]--;
		
		boolean isAnagram = true;
		for(int i=0;i<256;i++){
			if(!(arr[i] == 0))
				isAnagram = false;
		}	
		
		if(isAnagram)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static void checkIsAnagramWith2Arrays(String str1, String str2){
		int arr1[] = new int[256];
		int arr2[] = new int[256];
		
		for(int i=0;i<str1.length();i++)
			arr1[str1.charAt(i)]++;
		
		for(int i=0;i<str2.length();i++)
			arr2[str2.charAt(i)]++;
		
		boolean isAnagram = true;
		for(int i=0;i<256;i++){
			if(!(arr1[i] == arr2[i]))
				isAnagram = false;
		}
		
		if(isAnagram)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}