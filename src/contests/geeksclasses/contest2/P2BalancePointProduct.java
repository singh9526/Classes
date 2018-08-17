package contests.geeksclasses.contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2BalancePointProduct {

	public static void main(String args[]) throws NumberFormatException, IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int testCases = Integer.parseInt(br.readLine().trim());
		
//		for(int i=0;i<testCases;i++){
//			int len = Integer.parseInt(br.readLine().trim());
//			String arrStr[] = br.readLine().trim().split(" ");
//			int arr[] = new int[len];
//			for(int j=0;j<len;j++){
//				arr[j] = Integer.parseInt(arrStr[j]);
//			}
//			
//			findBalancePoint(arr);
//		}
		
		int arr[] = {2,2};
		findBalancePoint(arr);
		
	}

	private static void findBalancePoint(int[] arr) {
		long totalProduct = 1;
		for(int i=0;i<arr.length;i++)
			totalProduct = totalProduct * arr[i];
		
		boolean productExits = false;
		
		long currentProduct = 1;
		for(int i=0;i<arr.length;i++){
			currentProduct = currentProduct * arr[i];
			
			if(currentProduct==0 && totalProduct==0){
				productExits = true;
				System.out.println((i+1)+"."+(i+2));
				break;
			}
			
			if(totalProduct / currentProduct == currentProduct){
				productExits = true;
				System.out.println((i+1)+"."+(i+2));
				break;
			}
		}
		
		if(!productExits)
			System.out.println("-1");
	}
	
}
