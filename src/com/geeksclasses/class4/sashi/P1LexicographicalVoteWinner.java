package com.geeksclasses.class4.sashi;

import java.util.HashMap;

/***
 * str[] = {"aman","amar","aman","amar"};
 * 
 * Approach - Find frequency using map, then iterate map and update max_index and winner_person
 * compare previous winner_person and current winner
 */
public class P1LexicographicalVoteWinner {
	public static void main(String args[]){
		String s[] = {"aman","amar","aman","amar"};
		
		findLexicographicalVoteWinner(s);
	}

	private static void findLexicographicalVoteWinner(String[] s) {
		HashMap<String, Integer> map = new HashMap<>();
		
		String currentWinner = "";
		int maxVotes = 1;
		for(int i=0;i<s.length;i++){
			if(map.containsKey(s[i])){
				int freq = map.get(s[i]);
				map.replace(s[i],freq+1);
				if(freq>maxVotes){
					maxVotes = freq;
					currentWinner = s[i];
				}
			}
			else
				map.put(s[i], 1);
		}
		
		System.out.println(currentWinner);
	}
}

/*
LinikedList
Stack Queues
Trees
Graphs
DP Greedy
*/