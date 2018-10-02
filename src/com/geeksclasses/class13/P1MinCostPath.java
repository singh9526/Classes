package com.geeksclasses.class13;

import java.util.concurrent.SynchronousQueue;

public class P1MinCostPath {

	public static void main(String args[]){
		int m = 3;
		int n = 3;
//		int arr[][] = new int[m][n];
		int arr[][] = {{1,1,99},
					   {2,99,99},
					   {1,1,3}};
//		System.out.println(findMin(arr, 0, 0, m ,n, 0));
//		System.out.println(findMin(arr, m ,n));
		findMinArr(arr, m, n);
	}
	
	public static void findMinArr(int arr[][], int m, int n){
		
		int temp[][] = new int[m][m];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				
				if(i==0 && j==0)
					temp[i][j] = arr[i][j];
				else if(i==0)
					temp[i][j] = arr[i][j] + temp[i][j-1];
				else if(j==0)
					temp[i][j] = arr[i][j] + temp[i-1][j];
				else 
					temp[i][j] = arr[i][j] + minOf(temp[i-1][j], temp[i][j-1], temp[i-1][j-1]);
				
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(temp[m-1][n-1]);
	}
	
	public static int findMin(int arr[][], int m , int n){
		if(m < 0 || n < 0)
			return Integer.MAX_VALUE;
		else if(m==0 && n ==0)
			return arr[m][n];
		else
			return arr[m][n] + 
					Math.min(Math.min(findMin(arr, m-1, n-1),
						 findMin(arr, m-1, n)),
						 findMin(arr, m, n-1));
	}
	
	public static int findMin(int arr[][], int row, int column, int m, int n, int pathSum){
		if(row==m && column==n)
			return arr[row][column];
		
		else if(row > m-1 || column > n-1)
			return Integer.MAX_VALUE;
		
		else  return arr[row][column] + minOf(
				findMin(arr, row+1, column, m, n, pathSum),
				findMin(arr, row, column+1, m, n, pathSum),
				findMin(arr, row+1, column+1, m, n, pathSum)
				);
	
	}
	
	public static int minOf(int right, int bottomRight, int bottom){
		return Math.min(Math.min(right, bottomRight), bottom);
	}
	
}