package leetcode;

import java.util.PriorityQueue;

public class MinimumOperationstoExceedThresholdValueII {
	   public int minOperations(int[] nums, int k) {
	    	
	    	
	    	PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(a, b));
	    	for(int i = 0; i < nums.length;i++) {
	    		pq.offer((long) nums[i]);
	    	}
	    	int count = 0;
	    	while(pq.peek() < k) {
	    		if(pq.size() <= 1) {
	    			break;
	    		}
	    		count++;
	    		long first = pq.poll();
	    		long second = pq.poll();
	    		pq.offer(first * 2 + second);
	    	}
	    	return count;
	    }
    
    
    public static void main(String[] args) {
    	MinimumOperationstoExceedThresholdValueII cd = new MinimumOperationstoExceedThresholdValueII();
		  cd.minOperations(new int[] {97,73,5,78}, 98);
	  }
}
    

