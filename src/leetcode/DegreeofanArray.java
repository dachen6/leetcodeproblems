package leetcode;

import java.util.HashMap;

public class DegreeofanArray {
	 public int findShortestSubArray(int[] nums) {
		 HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
		 HashMap<Integer,Integer> firstindex = new HashMap<Integer,Integer>();
		 int max = nums[0];
		 int maxnum = 1;
		 int maxcount = 1;
		 for(int i = 0; i < nums.length;i++) {
	        	if(hp.containsKey(nums[i])) {
	        		int count = hp.get(nums[i]);
	        		hp.put(nums[i], count+1);
	        		if(count+1 > maxnum) {
	        			maxnum = count+1;
	        			max = nums[i];
	        			count =1;
	        		}
	        		if(count+1 == maxnum) {
	        			maxnum = count+1;
	        			max = nums[i];
	        			maxcount ++;
	        		}
	        	}
	        	else {
	        		hp.put(nums[i], 1);
	        	}
	        }
		 
		 int i = 0;
		 int j = nums.length-1;
		 while(maxcount != 0) {
			 if(nums[i] != max) {
				 i++;
			 }
			 else {
				 j--;
			 }
		 }
		 return j-i+1;
	    }
}
