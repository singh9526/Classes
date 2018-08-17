package com.geeksclasses.class3.sashi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P2SortStudentsOnMarks {

	public static void main(String args[]){
		int roll[] = {2,3,17,121};
		int marks[] = {50,40,42,70};
		
		ArrayList<StudentMarks> list = new ArrayList<>();
		for(int i=0;i<roll.length;i++){
			list.add(new StudentMarks(roll[i], marks[i]));
		}
		
		Collections.sort(list, new StudentSorter());
		
		for(StudentMarks obj : list){
			System.out.println(obj.rollNo+"-"+obj.marks);
		}
	}
	
	public static class StudentSorter implements Comparator<StudentMarks>{

		@Override
		public int compare(StudentMarks o1, StudentMarks o2) {
			return (o1.marks < o2.marks ? -1 : 1);
		}
		
	}
	
}
