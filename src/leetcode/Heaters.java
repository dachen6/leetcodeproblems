package leetcode;

import java.util.Arrays;

public class Heaters {
	public int findRadius(int[] houses, int[] heaters) {
		int left = 0, right = 1;
		int result = 0;
		Arrays.sort(heaters);
		Arrays.sort(houses);
		for (int i = 0; i < houses.length; i++) {

			
			if (houses[i] <= heaters[0]) {
				result = heaters[0] - houses[0];
			} else if (houses[i] >= heaters[heaters.length - 1]) {
				result = Math.max(result, houses[houses.length - 1] - heaters[heaters.length - 1]);
			} else if (houses[i] > heaters[left] && houses[i] < heaters[right]) {
				int min = Math.min(houses[i] - heaters[left], heaters[right] - houses[i]  );
				result = Math.max(result, min);
			} else if (houses[i] > heaters[right]) {
				left = right;
				right++;
				i--;
			}
		}
		System.out.print(result);
		return result;
	}
	public static void main(String[] args) {
		Heaters cd  =new Heaters();
		cd.findRadius(new int[] {25921153,510616708},new int[] {44788124, 357571490, 771515668, 927702196, 952509530});
	}

}
