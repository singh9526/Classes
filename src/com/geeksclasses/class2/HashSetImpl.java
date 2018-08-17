package com.geeksclasses.class2;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetImpl {

	public static void main(String args[]){
		
		int arr[] = {1,4,3,3,2,2,2,2};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else{
				map.replace(arr[i], map.get(arr[i])+1);
			}	
		}
		
		System.out.println(map);
	}
	
}
