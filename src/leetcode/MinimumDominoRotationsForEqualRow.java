package leetcode;

public class MinimumDominoRotationsForEqualRow {
	public int minDominoRotations(int[] tops, int[] bottoms) {
		int poss1 = tops[0];
		int poss2 = bottoms[0];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		for (int i = 0; i < tops.length; i++) {
			if (poss1 == tops[i]) {
				count1++;
			}
			if (poss2 == tops[i]) {
				count2++;
			}
			if (poss1 == bottoms[i]) {
				count3++;
			}
			if (poss2 == bottoms[i]) {
				count4++;

			}
		}
		if(count1 + count3 >=tops.length ) {
    		return tops.length - Math.max(count1, count3);
    	}
    	if(count2 + count4 >= tops.length ) {
    		return tops.length - Math.max(count2, count4);
    	}

		return -1;

	}

	public static void main(String[] args) {

		MinimumDominoRotationsForEqualRow cd = new MinimumDominoRotationsForEqualRow();
		int res = cd.minDominoRotations(new int[] { 2, 1, 2, 4, 2, 2 }, new int[] { 5, 2, 6, 2, 3, 2 });
		System.out.print(res);
	}
}
