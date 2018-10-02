package com.geeksclasses.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given an array, find index 'i' where left and rigt sum are equal. 
 * */

public class P1BalancePointInArr {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			int n = Integer.parseInt(br.readLine().trim());
			String strArr[] = new String[n];
			try {
				strArr = br.readLine().split(" ");
			} catch (IOException e) {e.printStackTrace();}
			
			if(strArr.length == 1)
				System.out.println(1);
			else{
					
				int totalSum = 0;
				int arr[] = new int[n];
				for(int i=0;i<n;i++){
					arr[i] = Integer.parseInt(strArr[i]);
					totalSum +=  arr[i];
				}
				
				int currentSum = 0;
				boolean found = false;
				for(int i=1;i<arr.length;i++){
					currentSum += arr[i-1];
					if(totalSum - currentSum - arr[i] == currentSum){
							System.out.println(i);
							found = true;
					}
				}
				
				if(!found)
					System.out.println(-1+"");
			}
		}
	}
	
	
	public static void main(String args[]){
		int arr[] = {1,2,3,3,3};
		int totalSum = 0;
		for(int i=0;i<arr.length;i++){
			totalSum += arr[i];
		}	
		
		int currentSum = 0;
		for(int i=0;i<arr.length;i++){
			currentSum += arr[i];
			if(totalSum - currentSum == currentSum){
				if(i == arr.length-1)
					System.out.println("-1");
				else
					System.out.println(i);
			}
		}
	}
	
}