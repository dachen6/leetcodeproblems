package leetcode;

import java.util.*;

public class CourseScheduleIII {
public int scheduleCourse(int[][] courses) {
	Arrays.sort(courses, (a, b) -> a[1] - b[1]);
	PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
	int curtime = 0;
	int count = 0;
		for(int[] a : courses) {
			if(curtime + a[0] <= a[1]) {
				pq.add(a);
				curtime += a[0];
				count++;
			}
			else {
				if(a[0] <pq.peek()[0] ) {
					curtime -= pq.peek()[0] ;
					curtime+= a[0];
					pq.poll();
					pq.add(a);
				}
			}
		}
		return count;
    }
}
