package leetcode;

import java.util.Arrays;

public class MaximizeHappinessofSelectedChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int ans = 0;
        for(int i = 0; i < happiness.length ; i++) {
        	int cur = happiness[happiness.length-i-1]-i;
        	if (cur == 0)
        	{
        		return ans;
        	}
        	ans+= cur;
        	
        }
        return ans;
    }
}
