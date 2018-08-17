package com.geeksclasses.class4.sashi;

/**
 * Given a nxn matrx, make all the number in the m row and n column
 * where arr[m,n] is 1
 * 
 * HW - Try solving using only 1 nxn matrix.
 * */

public class P4MakeBooleanMatricRowColumn1 {

	public static void main(String args[]){
		int m = 3;
		int n = 4;
		int a[][] = new int[m][n];
		a[0][0] = 1;
		int b[][] = new int[m][n];
		
		int rows[] = new int[m];
		int columns[] = new int[n];
		
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				if(a[i][j] == 1){
					rows[i] = 1;
					columns[j] = 1;	
				}
			}
		}
		
//		for(int i=0;i<m;i++)
//			System.out.print(rows[i]+" ");
//		System.out.println("");
//		for(int i=0;i<n;i++)
//			System.out.print(columns[i]+" ");
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(rows[i] == 1 || columns[j] == 1){
					b[i][j] = 1;
				}
			}
		}
		
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
}