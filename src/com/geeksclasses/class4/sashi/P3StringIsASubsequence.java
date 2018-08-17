package com.geeksclasses.class4.sashi;


/**
 * 
 * */
public class P3StringIsASubsequence {

	public static void main(String args[]){
		String s1 = "AXY";
		String s2 = "YADXCP";
		
		int counter = 0;
		int s2len = s2.length();
		for(int i=0;i<s2len;i++){
			if(s2.charAt(i)==s1.charAt(counter))
				counter++;
		}
		
		if(counter==s1.length())
			System.out.println("yes");
		else
			System.out.println("no");
	}
	 
}