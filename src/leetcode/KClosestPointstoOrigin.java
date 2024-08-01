package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
    public int[][] kClosest(int[][] points, int k) {

		PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>(k, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// do not use "==" here !!
				int diso1 = o1[0] *o1[0] + o1[1] *o1[1];
				int diso2 = o2[0] *o2[0] + o2[1] *o2[1];
				if (diso1 ==diso2  ) {
					return 0;
				}
				return diso1 > diso2 ? -1 : 1;
			}
		});
		
		
		for (int i = 0; i < points.length;i++) {
			if(maxHeap.size() < k) {
				maxHeap.add(points[i]);
			}
			else {
				int[] o1 = maxHeap.peek();
				int[] o2 = points[i];
				int diso1 = o1[0] *o1[0] + o1[1] *o1[1];
				int diso2 = o2[0] *o2[0] + o2[1] *o2[1];
				if (diso1 >diso2  ) {
					maxHeap.poll();
					maxHeap.add(o2);
				}
			}
		}
		int[][] ans = new int[k][2];
		int i = 0;
		for (int[] e : maxHeap) {
			ans[i] = e;
			i++;
		}
		return ans;
    }
}
