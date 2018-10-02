package com.geeksclasses.class14;

public class P2RodCutting {

	public static void main(String[] args) {

		int n = 5;
		int values[] = {5,3,10,12,8};
		int cuts = 0;
		System.out.println(cutRod(values, n, 0));
	}
	
	public static int cutRod(int values[], int n, int cuts){
		if(n==0)
			return cuts;
		
		return maxOf(cutRod(values, ))
	}

}
