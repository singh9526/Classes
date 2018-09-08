package com.geeksclasses.class7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * ip : str = "{()}"
 * 
 * ip : str = "{(})"
 * 
 * ip : str = "(({})"
 * */
public class P1BalancingParenthesis {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int gn(BufferedReader br) throws IOException, NumberFormatException{
        return Integer.parseInt(br.readLine());
    }
	
	public static void main(String[] args) throws IOException {

		boolean isBalanced = true;
		Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    
	    for(int i=0;i<t;i++)
	    {
	    	isBalanced = true;
	        String s=scan.next();
		    int len = s.length();
		    Stack<Character> stack = new Stack<>();
		    for(int j=0;j<len;j++){
		        char c = s.charAt(j);
		        
		        if(isOpening(c)){
		        	stack.push(c);
		        }else{
		        	if(!stack.isEmpty()){
		        		char stackChar = stack.peek();
			        	if(isAClosingMatch(stackChar, c)){
			        	    	stack.pop();
			        	}else{
			        			isBalanced = false;
			        			break;
			        	}
		        	}else{
		        		isBalanced = false;
		        	}
		        }
		    }
		    
		    if(isBalanced && stack.isEmpty())
				System.out.println("balanced");
		    else
		    	System.out.println("not balanced");
		}
		
		
	}

	private static boolean isAClosingMatch(char stackChar, char c) {
		
		if(stackChar == '(' && c == ')')
			return true;
		
		if(stackChar == '{' && c == '}')
			return true;
		
		if(stackChar == '[' && c == ']')
			return true;
		
		return false;
	}

	private static boolean isOpening(char c) {
		return c=='(' || c=='{' || c == '[';
	}

}