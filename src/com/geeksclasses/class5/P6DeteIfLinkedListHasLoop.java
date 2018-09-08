package com.geeksclasses.class5;

/**
 * Given a linked list, detect if there is a loop.
 * 
 * ip : 1 2 3 4
 * op : yes
 * 
 * ip : null
 * op : No
 * 
 * Approach 1 : modify the node to maitain boolean isVisited
 * Approach 2 : use a HashMap to store the visited Node's address
 * Approach 3 (Floyd's Cycle Detection Algorithm) 
 * 
 *  : user fast and slow Node pointers.
 *  
 *  Justification :
 *  Fast enters into the cycle first
 *  When slow enters, fast is at some distance k
 *  In every iteration this dist ances increases by 1 under the modulo of cycle length.
 * 
 * */

public class P6DeteIfLinkedListHasLoop {

	public static void main(String args[]){
		
	}
	
}
