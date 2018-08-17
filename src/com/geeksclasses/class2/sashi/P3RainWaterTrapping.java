package com.geeksclasses.class2.sashi;

/**
 * https://www.geeksforgeeks.org/trapping-rain-water/
 * */

public class P3RainWaterTrapping {
	
	public static void main(String args[]){
		
		int bars[] = {3,0,0,2,0,4};
		int ans=0;
		for(int i=0;i<bars.length;i++){
			ans = ans + Math.min(maxL[i], maxR[i]) - bars[i];
		}
	}
	
}