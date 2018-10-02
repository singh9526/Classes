package com.geeksclasses.class13;

public class P2RopeCut {

	public static void main(String[] args) {
		int ropeLength = 4;
		int cutsArr[] = {1,2,3};
		System.out.println(maxRopeCut(ropeLength, cutsArr, 0));
	}

	private static int maxRopeCut(int ropeLength, int cutsArr[], int cuts) {
		
		if(ropeLength==0)
			return cuts;
		if(ropeLength<0)
			return Integer.MIN_VALUE;
		else
			return maxOf(maxRopeCut(ropeLength-cutsArr[0], cutsArr, cuts+1),
					        maxRopeCut(ropeLength-cutsArr[1], cutsArr, cuts+1),
					        maxRopeCut(ropeLength-cutsArr[2], cutsArr, cuts+1));
	}

	private static int maxOf(int maxRopeCut, int maxRopeCut2, int maxRopeCut3) {
		return Math.max(Math.max(maxRopeCut, maxRopeCut2), maxRopeCut3);
	}

}
