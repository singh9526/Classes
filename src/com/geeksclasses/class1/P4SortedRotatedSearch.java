package com.geeksclasses.class1;

/**
 * Given a sorted and rotated array of distinct elements. Find an element x in the array.
 * 
 * Input arr[] = [40,50,70,10,20];
 * 
 * */

public class P4SortedRotatedSearch {

	public static void main(String args[]){
		
		int positions[] = {1,3,4,8,9};
		int cows = 3;
		Solver solver = new Solver();
		int range = positions[positions.length]-positions[0];
		solver.getMinDistance(range, positions, cows);
		
	}
	
	
	public static class Solver{
		
		public int getMinDistance(int range, int positions[], int cows){
			for(int i=1;i<=range;i++){
				if(isPossible(positions,positions.length,cows)){
					continue;
				}else
					return i;
			}
		}
		
		public int isPossible(int positions[], int arrSize, int cows){
			
		}
		
	}
}