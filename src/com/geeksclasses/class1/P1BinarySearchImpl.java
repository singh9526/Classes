package com.geeksclasses.class1;

// Array Advantage - Direct Access


/*
 * 
 * Test cases 
 * Input arr[] = [10,20,40,50,80,100]
 * x = 80
 * output = 4;
 * 
 * Input arr[] = [10,20,40,50,80,100]
 * x = 100
 * Output = 5
 * 
 * Input arr[] = [10,10,40,80,100]
 * x = 120
 * Output = -1
 * 
 * Added recursive solution
 * 
 * */

public class P1BinarySearchImpl {

	public static void main(String args[]){
		
//		int arr[] = {10,20,40,50,80,100};
		int arr[] = {10,20,40,50,80,100};
		int noToSearch = 52;
		
		Solver solver = new Solver();
		System.out.println(solver.binarySearch(arr, 0, arr.length-1, noToSearch));
//		System.out.println(solver.binarySearchNonRecursive(arr, noToSearch));
		
	}
	
	public static class Solver{
		
		public int binarySearch(int arr[], int start, int end, int noToSearch){
			
			if(start <= end){
				
				int mid = (start+end)/2;
				
				if(arr[mid]==noToSearch)
					return mid;
				else if(arr[mid] > noToSearch)
					return binarySearch(arr, start, mid-1, noToSearch);
				else if(arr[mid] < noToSearch)
					return binarySearch(arr, mid+1, end, noToSearch);
				
			}
			
			return -1;
		}
		
		public int binarySearchNonRecursive(int arr[], int noToSearch){
			
			int start = 0;
			int end = arr.length-1;
			int mid = arr.length/2;
			boolean numberFound;
			
			while(start != end || start > end || end < start){
				
				mid = (start+end)/2;
				if(arr[mid] == noToSearch){
					return mid;
				}else if(arr[mid] > noToSearch){
					end = mid-1;
				}else if(arr[mid] < noToSearch){
					start = mid+1;
				}
				
			}
			
			if(arr[start] == noToSearch){
				return start;
			}
			
			return -1;
		}
		
	}
	
}
