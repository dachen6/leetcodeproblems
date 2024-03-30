package leetcode;

import java.util.Arrays;

public class FindPolygonWiththLargestPerimeter {
    public long largestPerimeter(int[] nums) {
    	Arrays.sort(nums);
    	long cur = nums[0] + nums[1];
    	int max = -1;
    	long ans = 0;
    	for(int i = 2 ; i < nums.length;i++) {
    		if(nums[i] < cur) {
    			max = i;
    			ans = cur + nums[i];
    		}
    		cur += nums[i];
    	}
    	if(max == -1) {
    		return -1;
    	}
    	return ans;
    }
}
