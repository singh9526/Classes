package com.geeksclasses.class1;

/**
 * Problem :
 * Given a sorted array of unknown size, find index of a given element. We may assume that test cases are
 * designed in a way that index never goes out of bound.
 * 
 * arr[] = {10,20,40,50,.....}   // size is not known
 * 
 * Input x = 45
 * Output = -1
 * 
 * Input x = 20
 * Output = 1
 * */

public class P3UnboundedBinarySearch {

	public static void main(String args[]){
		int arr[] = {10,20,40,50,60,70,80,90,120,340};
		int noTosearch = 70;
		Solver solver = new Solver();
		
		System.out.println(solver.unboundedBinarySearch(arr, noTosearch));
	}
	
	public static class Solver{
		
		public int unboundedBinarySearch(int arr[], int noToSearch){
			
			int cursor = 0;
			int lowerBound = 0;
			
			if(arr[cursor] == noToSearch)
				return 0;
			
			cursor = 1;
			
			while(arr[cursor] < noToSearch){
				
				if(arr[cursor] == noToSearch)
					return cursor;
				
				lowerBound = cursor;
				cursor *= 2;
			}
			
			int start = lowerBound;
			int end = cursor;
			int mid;
			
			while(start!=end || start < end){
				mid = (start+end)/2;
				
				if(arr[mid] == noToSearch)
					return mid;
				else if(arr[mid] > noToSearch)
					end = mid-1;
				else if(arr[mid] < noToSearch)
					start = mid+1;
				
			}
			
			if(start == end && arr[start] == noToSearch)
				return start;
			
			return -1;
		}
		
	}
	
}