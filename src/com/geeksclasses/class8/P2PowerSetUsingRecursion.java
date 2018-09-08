package com.geeksclasses.class8;

public class P2PowerSetUsingRecursion {

	public static void main(String args[]){
		String str = "abc";
		prinPowerSet(str,0,"");
	}
	
	public static void prinPowerSet(String str, int index, String temp){
		
		if(str.length() == index){
			System.out.println(temp);
			return;
		}
		
		prinPowerSet(str,index+1, );
		prinPowerSet(str, index+1, );
	}
	
}
