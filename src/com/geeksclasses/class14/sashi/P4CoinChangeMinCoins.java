package com.geeksclasses.class14.sashi;

public class P4CoinChangeMinCoins {

	public static void main(String args[]){
		int coins[] = {1,2,3};
		int sum = 4;
		System.out.println(makeCoin(coins, sum, coins.length-1));
	}
	
	public static int makeCoin(int coins[], int sum, int n){
		
		if(sum==0)
			return 1;
		if(n==0 || sum < 0)
			return 0;
		
		if(coins[n] < sum)
			return Math.min(makeCoin(coins, sum-coins[n], n), makeCoin(coins, sum, n-1));
		else
			return makeCoin(coins, sum, n-1);
		
	}
	
}