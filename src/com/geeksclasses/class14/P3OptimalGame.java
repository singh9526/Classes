package com.geeksclasses.class14;

public class P3OptimalGame {

	public static void main(String[] args) {
		
		int values[] = {10, 5, 3, 6};
		System.out.println(maxVal(values, 0, values.length-1));

	}
	
	public static int maxVal(int values[], int l, int r){
		
		if(r-l == 1)
			return Math.max(values[l], values[r]);
		
		else 
			return Math.max(values[l]+ Math.min(maxVal(values, l+2, r), maxVal(values, l+1, r-1)), 
					        values[r] + Math.min(maxVal(values, l+1, r-1), maxVal(values, l, r-2)));
		
		
		// for tabulation :
		Fil diagonally upwards, then diagonlly downwards.
		
		
		//return Math.max(values[l]+ maxVal(minVal(values, l ,r), l+1, r), values[r] + maxVal(minVal(values, l , r), l ,r-1)));
		//return Math.max(values[l]+ maxVal(values, l+1, r), values[r] + maxVal(values, l, r-1));
		
	}

	private static int minVal(int[] values, int l, int r) {

		if(r-l == 1)
			return Math.min(values[l], values[r]);
		
		
		
		return null;
	}

}
