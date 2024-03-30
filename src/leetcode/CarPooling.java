package leetcode;

import java.util.Arrays;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
		 int len = trips.length;
		 	int[][] start = new int[len][2];
		 	int[][] end = new int[len][2];
		 	for(int i = 0; i < len; i++) {
		 		start[i][0] = trips[i][1];
		 		start[i][1] = trips[i][0];
		 		end[i][0] = trips[i][2];
		 		end[i][1] = -trips[i][0];
		 	}
		 	Arrays.sort(start,(a,b)->{
		           return a[0]-b[0];
		       });
			Arrays.sort(end,(a,b)->{
		           return a[0]-b[0];
		       });
			int max = 0;
			int cur = 0;
			int i = 0; int j = 0;
			while(i + j < 2 * len) {
				if(i >= len || j < len && end[j][0] <= start[i][0]) {
					cur+=end[j][1];
                    j++;
				}
				else {
					cur+=start[i][1];
					max = Math.max(max, cur);
                    i++;
				}
			}
			return capacity >= max;
	    }
    
    public static void main(String[] args) {
    	CarPooling cd = new CarPooling();
    	cd.carPooling(new int[][] {{2,1,5},{3,3,7}}
    			, 4);
    }
}
