package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DivideIntervalsIntoMinimumNumberofGroups {
    public int minGroups(int[][] intervals) {
    	Arrays.sort(intervals, new java.util.Comparator<int[]>() {
    	    public int compare(int[] a, int[] b) {
    	        return Double.compare(a[0], b[0]);
    	    }
    	});
		PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(3, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// do not use "==" here !!
				if (o1[1] ==o2[1]) {
					return 0;
				}
				return o1[1] < o2[1] ? -1 : 1;
			}
		});
		int ans = 1;
		minHeap.offer(intervals[0]);
		for(int i = 1; i <intervals.length;i++ ) {
			int[] cur = minHeap.peek();
			if(cur[1] < intervals[i][0] ) {
				minHeap.poll();
				
			}
			else {
				ans++;
			}
			minHeap.offer(intervals[i]);
		}
		System.out.print(ans + "????");
		return ans;

    }
    public static void main(String[] args) {
    	DivideIntervalsIntoMinimumNumberofGroups cd=  new DivideIntervalsIntoMinimumNumberofGroups();
    	cd.minGroups(new int[][] {{441459,446342},{801308,840640},{871890,963447},{228525,336985},{807945,946787},{479815,507766},{693292,944029},{751962,821744}});
    }
}
