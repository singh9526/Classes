package com.geeksclasses.class2.sashi;

import java.util.Arrays;

/**
 * Chocolate Ditribution Problem 
 * 
 * Input : chocolate packets [] = {7,3,2,4,9,12,56}
 * 			no_of-students = 3
 * Outpu : Minimum Difference is 2
 * 
 * I/P : chockolate_packets[] = {3,4,1,9,56,7,9,12}
 * 		  no_of_stu = 5
 * 
 * O/P : Min Diff = 6
 * */

public class P2ChocolateDistributionMinExtremeDist {

	public static void main(String args[]){
		int cp[] = {3,4,1,9,56,7,9,12};
		int noOfStudents = 5;
		int minDistance = 0;
		int currentDistance = 0;
		Arrays.sort(cp);
		
		for(int i=0;i<cp.length-noOfStudents;i++){
			
			currentDistance = cp[i+(noOfStudents-1)]-cp[i];
			
			if(minDistance==0)
				minDistance=currentDistance;
			
			if(currentDistance<minDistance)
				minDistance = currentDistance;
		}
		
		System.out.println(minDistance);
		
	}
	
}