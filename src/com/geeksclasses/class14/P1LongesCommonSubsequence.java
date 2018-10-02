package com.geeksclasses.class14;

public class P1LongesCommonSubsequence {

	public static void main(String[] args) {
		
		String s1 = "ADBEC";
		String s2 = "DEF";
		
//		System.out.println(lcs(s1, s2, s1.length(), s2.length()));
		System.out.println(lcsTabular(s1, s2, s1.length(), s2.length()));

	}

	private static int lcs(String s1, String s2, int m, int n) {

		if(m==0 || n==0)
			return 0;
		
		if(s1.charAt(m-1) == s2.charAt(n-1))
			return lcs(s1, s2, m-1, n-1) + 1;
		
		return Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
	}
	
	private static int lcsTabular(String s1, String s2, int m, int n){
		int lcs[][] = new int[m][n];
		
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				
				if(s1.charAt(i-1)==s2.charAt(j-1))
					return lcs[i-1][j-1] + 1;
				else 
					return Math.max(lcs[i-1][j], lcs[i][j-1]);
				
			}
		}
		
		return lcs[m][n];
	}


}
