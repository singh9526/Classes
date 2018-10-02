package com.geeksclasses.class14.sashi;

public class P1CoinChange {

	public static void main(String args[]){
		
		int coins[] = {1,2,3};
		int sum = 4;
		System.out.println(makeCoins(coins, sum, coins.length));
		
	}

	private static char[] makeCoins(int[] coins, int sum, int n) {

		if(sum == 0)
			return 1;
		if(n==0)
			return 0;
		
		if(coins[n-1] <= sum)
			
		
		
	}
	
}