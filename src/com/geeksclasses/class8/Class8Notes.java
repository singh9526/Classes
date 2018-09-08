package com.geeksclasses.class8;

/**
 * Start - 12:01
 * 
 * P1 Next Greater Element (The first element on right side which is greater) :
 * 
 * ip : arr[] = {5,3,8,12,9,15,7}
 *  op :
 *   
 *   5 -> 8
 *   3 -> 8
 *   8 -> 12
 *   12 -> 15
 *   9 -> 15
 *   15 -> -1
 *   7 -> -1
 *   
 *   Approach 1 :
 *   Push elements to the stack untill decreasing order,
 *   when greater element found, pop all elements untill they are smaller 
 *   and mark there next greater as this current element.
 *   Then push this element to stack.
 *   And continue for next element.
 *   
 * 
 * 	HW : Previous Greater Element
 *  HW : Next Smaller Element
 * 
 * ----------------------------- 12 : 24 PM ( 24 mins  done, 
 *                                            Miss - 1 problem complete with wrong implementation)
 * 
 * 
 * 
 * 							          Tree Data Structure 
 * 
 *  struct Node{
		int key;
		Node *left,*right;
		
		Node(int x){
			key = x;
			left = right = null;
		}
	};
	
	int main(){
		Node *root = new Node(10);
		root->left = new Node(2);
		root->right = new Node(12);
		root->left->left = new Node(2);
		root->left->right = new Node(5);
	} 
	
	void inorder(Node *root){...}
	void preorder(Node *root){...}
	void postorder(Node *root){...}
 * 
 * 
 *                         (10)
 *                       (2)   (12)
 *                     (1)  (5)  
 *                    
 * Inorder Traversal  (Left Root Right)
 * 	1 2 5 10 12
 * 
 * PreOrder Traversal (Root Left Rigt)                         
 * 10 2 1 5 12
 * 
 * PostOrder Traversal (Left Rigt Root )
 * 1 5 2 12 10
 * 
 * 
 * Applications :
 * 1. Maintaining Hierarchical Data.
 * 2. Self Balancing BSTs allow search, insert and delete in O(log n) time. Also maintain sorting order.
 *    Operations like floor, ciel are also O(log n) : 
 *    For normal BST these operations are O(h) where h is height of tree, but 
 *    self balancing BST make sure h is log n and thereforer the above operations are in O(log n).
 *    
 *    Examples of Self Balancing BSTs :
 *    Red Black Tree
 *    AVL Tree  (for insert or delete more number of rotations due to strictness so it less preffered)
 *     Splay Tree.  (Cache Friendly, inserted deleted is brought (rotated) to root)
 *    
 *    Hashing perform search, sort, insert in O(1) but for ciel, sortingg order traversal,  Self Balancing BST beat hashing.
 *    
 * 3. Other Variations :
 * 	  - Heap
 * 	  - Trie
 *    - Segment Tree
 *    
 *    
 *    Implementations in Java (Implementations of Self Balancing BSTs) :
 *    - TreeMap
 *    - TreeSet
 *    
 *    Hash and Set dont have these functions :
 *    greaterKey lowerKey floorKey ceilKey
 *    so if these functions are required never choose HashMap or Set.
 *     
 * ------------------------ 12:38 + 7 min (12:45) (Tree Intro, Applications, Library Impelementations)     
 * 
 * Recursion Problem :
 * P2 Print Power set using recursion
 * ip  str - "abc"
 * op  "", "a", "b", "c", "ab", "ac", "bc", "abc"
 * 
 * Approach :
 * 
 *                         "",  index = 0
 *             ""                     "a",  index = 1                    
 *       ""         "b"        "a"         "ab"     index = 3       
 *      ""  "c"  "b"  "bc"  "a"  "ac"  "ab"  "abc"
 * 
 * 
 * ^^^^Recursion Thinking :
 * 1. Always have a base case
 * 2. Parameter calls should be approaching the base case. if  base case has index = 0, then in paramters
 *    index should be decreasing.
 *     
 *     
 *  Recursive Solution :
 *  
 *  void p(String str, int index = 0, String curr=""){
		if(index = str.length()){
			System.out.println(curr);
			return;
		}
		
		p(str, index+1, curr);
		p(str, index+1, curr+str[index]);
	}
	
	
	int main(){
		String str = "abc";
		p(str);
		return 0;
	}
	
 * 
 * P3 Implement all Tree Traversals
 * 
 * ------------------------- 1:10 PM (Explained a recusion problem, asked to solve Inorder, Perorder, Post Order Traversal
 *                                     Miss - Implemented Power Set using recursing, wrong implementation, incorrect understading
 *                                            spent too much time thinking on it an didn't practice tree
 *                                          - Asked to solve Inorder, Perorder, Post Order Traversal but not enough time given)
 * 
 * P4 Find Height of Binary Tree
 * 
 * ip : root = NULL
 * op : 0
 * 
 * ip : root is single node
 * op : 1
 * 
 * ip : Root of below tree
 * 
 *               (10)
 *           (5)      (20)
 *                  (30)  (40)    
 * 
 * OP : 3
 * 
 * 
 * 
 * P5 Given a Binary Tree, check if it follows children sum property (
 * every node's key is sum of keys of left and right children)
 * 
 * ip : 
 * 						   (18)
 *                   (13)       (5)
 *                (6)   (7)  (5)  
 * 
 * op : yes
 * 
 * ip : root = null
 * op : yes
 * 
 * ------------------------1:32 PM  ( Miss - new problem given but not noted, because trying to understand the recursion power
 * 										set
 * 								           - in about 30 min 3 problems to be solved of trees and missed all due to focusing
 * 											 on understanding and discussing recursion solution.)
 * 
 * 
 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@HW  :
 * Extension of ChildrenSum Question (Asked in Amazon)
 * 
 * Given an arbitrary binary tree, convert it into a Binary Tree that follows children sum property.
 * The only allowed opreation is increament a node's key.
 * 
 * 
 * 
 * 
 * 											CLASS 2 SASHI
 * 
 * -------------------------------------------- 2:10 ()
 * 
 * 
 * P1 Implement Queue using stack.
 * 
 * Approach : Use 2 stacks, S1 and S2 and keep pushing in S1 - O(1), is S2 is not empty pop from there
 * 			  else push all elements from S1 to S2 and then pop from S2 worst O(n).
 * 
 * 
 * -------------- 2:17 (7 mins)
 * 
 * P2 Implement  stacks using Queues.
 *  
 *  Apporach : Use 2 queues, q1 and q2 and keep enqueuing in q1 - O(1), is q2 is not empty dequeue from there
 * 			  else push all elements from q1 to q2 and then dequeue from q2 worst O(n).
 * 
 * 
 * -------------- 2:21 (5 min)
 * 
 * P3 Design a stack that supports getMin() also
 * 
 * Approach : Keep an extra stack that maintains the minimum so far.
 *  
 *  This is O(n) space approach
 *  
 *       second array
 *   |5|    
 *   |3|    
 *   |1|    |1|
 *   |2|    |2|
 * 
 * 
 *  For O(1) approach
 *  
 *  y = 2*x - minElement
 * 
 *  if new element is smaller than the current minElement then don't push this new element push y on stack,
 *  where x is the new element  
 * 
 * 
 * --------------------- 2:45 pm 
 * 
 * P3 Sliding Max Window
 * 
 *  Tell maximum for each sliding window of size k, in an n size array.
 * 
 * ip : 1 2 3 1 4 5 2 3 6
 *    
 *      3 3 4 5 5 5 6
 * 
 * Approach : 
 * Use a queue and push in the front the maximum till now
 * 
 * 
 * ------------------3:03
 * 
 * Syllabus Left - 10 lectures to go
 * 
 * Most exptected questions in interviews is a set of 150 - 180
 * 
 * Covering in class - about 100 120
 * 
 * To know this basics should be known they are about 100-150 questions
 * 
 * 
 * Aim for - Classroom Questions + Practice + Basics on Geeks
 * 
 * If there are 40 important ques in Linked List
 * write code for the 20 new and you can simply look at the other 20 which have similar code.
 * 
 * Total to be covered is aout 300-400 questions.
 * approx 6 months.
 * 
 * 
 * MCQ : DBMS, OS, Networking
 * 
 * 4 F2Fs   2 Colleagues, 1 Manager, 1 Director
 * F2F coding rounds 2 questions to solve per question in 20-30 min
 * 
 * Previous work done
 * System Design (oo Design)
 * 
 * Easy Product :
 * OYO, OLA, PAYTM, HIKE, PayU, Zomato
 * 
 * Naurki, LinkedIn (nice profile)
 * 
 * 
 * 
 * Trees 
 * Dp
 * Graphs
 * Greedy
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */


public class Class8Notes {

	
}