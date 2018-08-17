package com.geeksclasses.class2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Print elements and their frequencies in same order as they appear in array
 * */

public class P2ElementsFrequencyInOrder {
	
	public static void main(String args[]){
		
		int arr[] = {2,2,2,1,3,3,4,5,5};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		Solver solver = new Solver();
		
		solver.createFrequencyMap(map, arr);
		
		solver.printMap(map);
		
	}
	
	public static class Solver{

		public void createFrequencyMap(LinkedHashMap<Integer, Integer> map, int arr[]) {
			for(int i=0;i<arr.length;i++){
				if(!map.containsKey(arr[i])){
					int freq = findFequency(arr,arr[i]);
					map.put(arr[i], freq);
				}
			}
		}

		private int findFequency(int[] arr, int element) {
			int count=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]==element)
					count++;
			}
			return count;
		}
		
		public void printMap(LinkedHashMap<Integer, Integer> map){
			for(Entry<Integer, Integer> e : map.entrySet()){
				System.out.println(e.getKey()+" - "+e.getValue());
			}
		}
	}
}
