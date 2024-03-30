package leetcode;

import java.util.Hashtable;

public class SubarrayswihtKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
     int slow = 0;
     int fast = 0;
     int count = 0;
     int res = 0;
     Hashtable<Integer, Integer> dict= new Hashtable<Integer, Integer>();
    	for(int i = 0 ; i < nums.length;i++) {   
    		Integer fre = dict.get(nums[i]);
    		if(fre == null) {
    			count++;
    		}
    		if(count < k)
    		{
    			continue;
    		}
    		else if(count == k) {
    			res++;
    		}
    	}
    }
}
