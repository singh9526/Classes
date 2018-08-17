package com.geeksclasses.class2;

/**
 * 	   c b a |
 * 0 | 0 0 0 | "" 
 * 1 | 0 0 1 | "a" 
 * 2 | 0 1 0 | "b"
 * 3 | 0 1 1 | "ab"
 * 4 | 1 0 0 | "c"
 * 5 | 1 0 1 | "ac"
 * 6 | 1 1 0 | "bc"
 * 7 | 1 1 1 | "abc"
 * 
 * $ Bitwise and
 * << Shifts bites to left
 * 
 * 2^n = 1<<n
 * 
 * To check if a jth bit is set in a number x :
 * 
 *  if (x $ (1 << j)) != 0
 *  
 *  Ex for checking 0th bit in 000101
 *  (000101 $ (1 << 0)) this returns 1
 * 
 * */

public class P7PowerSetOfString {

}