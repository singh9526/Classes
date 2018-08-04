package com.geeksclasses.class1;

/**
 * 
 * Test Case :
 * Input int arr[] = {10,20,20,20,30,40}
 * Output : 4
 * 
 * */

public class P2CountOccurenceInSortedArr {

	public static void main(String args[]){
		
		int arr[] = {20};
		int noToSearch = 20;
		
		Solver solver = new Solver();
		
		System.out.println(solver.findLastOccurence(arr, noToSearch));
		System.out.println(solver.findFirstOccurence(arr, noToSearch));
		System.out.println((solver.findLastOccurence(arr, noToSearch)-solver.findFirstOccurence(arr, noToSearch))+1);
	}
	
	
	public static class Solver{
		
		public int binarySearch(int arr[], int noToSearch){
			
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
	
		public int findFirstOccurence(int arr[], int noToSearch){
			
			int start = 0;
			int end = arr.length-1;
			int mid = arr.length/2;
			boolean numberFound;
			
			while(start != end || start > end || end < start){
				
				mid = (start+end)/2;
				if(arr[mid] == noToSearch){
					if(arr[mid-1] == noToSearch){
						end = mid-1;
						continue;
					}
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
		
		public int findLastOccurence(int arr[], int noToSearch){
			
			int start = 0;
			int end = arr.length-1;
			int mid = arr.length/2;
			boolean numberFound;
			
			while(start != end || start > end || end < start){
				
				mid = (start+end)/2;
				if(arr[mid] == noToSearch){
					if(arr[mid+1] == noToSearch){
						start = mid+1;
						continue;
					}
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