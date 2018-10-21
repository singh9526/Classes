package com.geeksclasses.class18;

public class P1LISinArray {

	public static void main(String[] args) {

		int arr[] = {5,1,3,25,15,8};
//		printLIS(arr, arr.length, "", 0, 0);
		printLIS(arr);
		
	}
	
	private static void printLIS(int arr[]){
		int n = arr.length;
		String str = new String("");
		int previous = 0;
		for(int i=0;i<n;i++){
			str = arr[i]+" ";
			previous = arr[i];
			for(int j=i+1;j<n;j++){
				if(arr[j] > arr[i] && arr[j] > previous){
					str = str+" "+arr[j] +" ";
					previous = arr[j];
				}
			}
			System.out.println(str);
			str = "";
		}
	}

	
	
	
	/*private static void printLIS(int[] arr, int len, String str, int currLen, int i) {
		
		if(i==arr.length)
			return;
		
		if(!str.isEmpty())
			System.out.println(str);
		
		printLIS(arr, len, str+arr[i]+" ", currLen+1, i+1);
		printLIS(arr, len, str, currLen, i+1);
	}*/

}
