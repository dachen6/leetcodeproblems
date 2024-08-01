package leetcode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
    	int ans = Integer.MIN_VALUE;
    	int curmax = -1;
        for(int i = 0; i < nums.length;i++) {
        	if(curmax <= 0)
        	{
        		curmax = nums[i];
        	}
        	else {
        		curmax += nums[i];
        	}
        	ans = Math.max(curmax, ans);
        }
        return ans;
    }
}
