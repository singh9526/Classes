package com.geeksclasses.class1.sashi;

/**
 * Implement a function to find square root of that number n.
 * */

public class P1Sqroot {

	public static void main(String args[]){
		Solver solver = new Solver();
		int num = 197;
		int squareRoot = solver.squareRoot(num);
		System.out.println(squareRoot);
	}
	
	public static class Solver{
		
		public int squareRoot(int no){
			if(no==0 || no==1)
				return 1;
			else
				return squareRoot(1, no, no);
		}
		
		public int squareRoot(int start, int end, int no){
			int mid = (start+end)/2;
			
			if((mid*mid)==no || ((mid*mid)<no && ((mid+1)*(mid+1)>no)))
				return mid;
			else if((mid*mid) > no)
				return squareRoot(start,mid-1,no);
			else if((mid*mid) < no)
				return squareRoot(mid+1,end, no);
			
			return -1;
		}
		
	}
	
}