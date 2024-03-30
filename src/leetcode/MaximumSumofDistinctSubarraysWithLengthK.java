package leetcode;

import java.util.HashMap;

public class MaximumSumofDistinctSubarraysWithLengthK {
	  public long maximumSubarraySum(int[] nums, int k) {
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        int count = k;
	        long res = 0;
	        long curres = 0;
	        for(int i = 0 ;i < k; i ++) {
	        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	        	if(map.get(nums[i]) == 1) {
	        		count --; 
	        	}
	        	if(map.get(nums[i]) == 2) {
	        		count ++; 
	        	}
	        	curres += nums[i];
	        }
	    	if(count == 0) {
        		res = Math.max(res, curres);
        		curres = res;
        	}
	        for(int i = k ; i < nums.length; i++) {
	        	curres -= nums[i - k];
	        	curres += nums[i];
	        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	        	if(map.get(nums[i]) == 1) {
	        		count --; 
	        	}
	        	if(map.get(nums[i]) == 2) {
	        		count ++; 
	        	}
	        	map.put(nums[i - k], map.get(nums[i - k] ) -1);
	        	
	        	if(map.get(nums[i - k]) == 1) {
	        		count --; 
	        	}
	         	if(map.get(nums[i - k]) == 0) {
	        		count ++; 
	        	}
	        	if(count == 0) {
	        		res = Math.max(res, curres);
	        	}
	        		
	        }
	        return res;
	    }
	  
	  public static void main(String[] args) {
		  MaximumSumofDistinctSubarraysWithLengthK cd  =new MaximumSumofDistinctSubarraysWithLengthK();
		  long ans =  cd.maximumSubarraySum(new int[] {1,1,1,7,8,9},3);
		  System.out.print(ans);
	  }
}
