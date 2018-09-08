package com.geeksclasses.class5.sashi;


/**
 * LRU - Least Recently Used element is removed from the cache.
 * 
 * Approach 1 (Brute Force) : 
 *  Keep an array, where we keep Node elements, where Node has key, value, timestamp.
 *  Then iterate the array to find min timestamp element and remove it.
 *  
 * Approach 2 :
 * Along with array we will keep track of the min element and it's location, so we can get the 
 * minimum element in O(1), but setting will be in O(n) because we will have to remove the most non-recent 
 * element
 * 
 * Approach 3 :
 * Keep a linked list in sorted linked list and keep track of the elements
 * and also keep a hasmap to check if the element is in cache or it needs to be removed. 
 * 
 * */

public class P3LRUCache {

	
	
}