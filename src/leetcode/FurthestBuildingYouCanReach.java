package leetcode;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
    	int usedbrick = 0;
    	PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
        for(int i = 1; i < heights.length;i++) {
        	int diff = heights[i] - heights[i-1];
        	if(diff > 0) {
        		if(pq.size() < ladders ) {
        			pq.add(diff);
        		}
        		else if(ladders == 0 ||pq.peek() > diff) {
        			usedbrick+= diff;
        		}else {
        			usedbrick += pq.poll();
        			pq.add(diff);
        		}
        		if(usedbrick > bricks) {
        			return i-1;
        		}
        	}
        }
        return  heights.length-1;
    }
    
    public static void main(String[ ]args) {
    	FurthestBuildingYouCanReach cd =new FurthestBuildingYouCanReach();
    	int ans = cd.furthestBuilding(new int[] {14,3,19,3},  17, 0);
    	System.out.print(ans);
    }
}
