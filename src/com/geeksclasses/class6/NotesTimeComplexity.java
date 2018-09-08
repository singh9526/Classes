package com.geeksclasses.class6;

/**
 *                								 Recursive
 *                
 * T(n) = T(n/2) + O(n)     Ans - O(nLogn)               
 * T(n) = T(n/2) + c        Ans - O(Logn)
 * T(n) = T(n-1) + c        Ans - O(n)
 * T(n) = T(n-1) + O(n)     Ans - O(n^2)
 * 
 *                                 Common Iterative Approach Calculations :
 * 
 * for(int i=0; i<n ;i=i++){
 * 	O(1) workk
 * }
 * Ans - O(n)
 * 
 * 
 * for(int i=0; i<n ;i = i *c){
 * 	O(1)
 * }
 * Ans - O(log base c  of n)
 * 
 * 
 * for(int i=0; i<n ;i = pow(c)){
 * 	O(1) work
 * }
 * Ans - O(log log n)
 * 
 * for(int i=0; i<n ;i=i++){
 * 	for(int i=0; i<n ;i=i++){	
 * 		O(1) workk
 * 	}
 * }
 * Ans - O(n^2)
 * 
 * 
 * for(int i=0; i<n ;i=i++){
 * 	for(int i=0; i<n ;i=i++){	
 * 		fun(n)--->  O(n) workk
 * 	}
 * }
 * Ans - O(n^3)
 * 
 * 
 * 
 * for(int i=0; i<n ;i=i++){
 * 	for(int i=0; i<n ;i=i++){	
 * 		fun(n)--->  O(n) workk
 * 	}
 * }
 * for(int i=0; i<n ;i=i++){
 * 	fun(n) ---> O(n) work
 * }
 * Ans - O(n^3) not O(n^3 + n^2)  because we ignore the lower order and constant terms
 * 
 * 
 * 
 * 
 * for(int i=0; i<n ;i=i++){
 * 	for(int i=0; i<n ;i=i++){	
 * 		fun(n)--->  O(n) workk
 * 	}
 * }
 * for(int i=0; i<x ;i=i++){
 * 	fun(n) ---> O(n) work
 * }
 * Ans -  O(n^3) not O(n^3 + nx)  because we have 2 different inputs x and n
 * 
 * 
 * 
 * 							Space Complexity
 * 
 * Space Complexity doesn't matter, auxiliary space matters. ie. in an array program the 
 * space complexity is obviosuly O(n) but we don't ocunt that.
 * 
 * For recursive functions :
 *  we count the stack space
 * 
 * Compiler Optimizes Tail Recursive Calls
 * 
 * Ex :
 * 
 * print(n){
 * 	.
 *  .
 *  .
 *  .
 * 	print(n-1)
 * }
 * because here the work has already been done and the compiler doesn't need to remember it.
 * 
 * print(n){
 * 	.
 *  .
 *  .
 *  .
 * 	print(n-1)
 *  x = 10;
 * }
 * here compiler needs to remember the extra steps.
 * So compiler can't optimize this.
 * Hence we prefer tail recursive.
 * 
 * 
 * 
 * 					Amortized Analysis
 * 
 * Where most operations take O(1) time but some operation takes O(n) time, we say that
 * the amorized time complexity of this is O(1).
 * Ex in arraylist insertion is O(1) but when arraylist size in increased, we copy
 * existing elements into a new array. But we say it is O(1).
 * 
 * 
 * */


public class NotesTimeComplexity {

}
