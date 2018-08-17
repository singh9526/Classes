package contests.geeksclasses.contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1StringAverage {

	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine().trim());
		
		for(int i=0;i<testCases;i++){
			String str = br.readLine().trim();
			findStringAverage("abcd");
		}
		findStringAverage("abcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmmabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabcdmlkkmlkmlkmlkmlabmm");
	}

	private static void findStringAverage(String str) {
		long sum = 0;
		long average = 0;
		int strLen = str.length();
		for(int i=0;i<strLen;i++){
			sum = sum + str.charAt(i);
		}
		
		average = (long) Math.floor(sum/strLen);
		System.out.println(average);
	}
	
}