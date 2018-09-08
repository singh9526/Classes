package com.geeksclasses.class7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * on geeks
 * 
 * ip price[] = {10,3,5,8,15,7,6,9,13}
 * op spans[] = {1,1,2,3,5,1,1,3,4}
 * 
 * Approach :
 * Maintain a stack and iterate the array.
 * In stack store the indexes of previous greater element.
 * Then inside the second loop pop the elements if they are smaller and calculate span as 
 *  ans - current index - stack top
 * 
 * if stack is empty
 *  ans - current index + 1;
 * 
 * */

public class P3StockSpan {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int gn(BufferedReader br) throws IOException, NumberFormatException{
        return Integer.parseInt(br.readLine());
    }
    
    static int[] getarr(BufferedReader br) throws IOException, NumberFormatException{
		String strArr[] = br.readLine().split(" ");
		int arr[] = new int[strArr.length];
		for(int i=0;i<strArr.length;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		return arr;
	}
    
	public static void main (String[] args) throws IOException{
		
        int t = gn(br);
        for(int j=0;j<t;j++){
        	int size = gn(br);
            int arr[] = getarr(br);
            int span = 1;
            Stack<Integer> stack = new Stack<>();
            
            for(int i=0;i<arr.length;i++){
                while(!stack.isEmpty()){
                    
                    if(arr[stack.peek()] < arr[i]){
                        stack.pop();
                    }else{ break; }

                }
                
                if(!stack.isEmpty()){
                    span = i - stack.peek();
                    stack.push(i);
                    System.out.print(span+" ");
                }else{
                    span = i+1;
                    System.out.print(span+" ");
                    stack.push(i);
                }
            }
                
                System.out.println("");
        }
        
		
	}
	
}