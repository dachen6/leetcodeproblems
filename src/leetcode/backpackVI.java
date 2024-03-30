package leetcode;

public class backpackVI {
	int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j <nums.length; j++) {
            	if(nums[j] > i) {
            		break;
            	}
                dp[i] += dp[i - nums[j]];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
    	backpackVI lzr = new backpackVI();
        int[] nums = { 1, 2, 4 };
        int target = 4;
        int res = lzr.combinationSum4(nums, target);
        System.out.print(res);
    }
}
