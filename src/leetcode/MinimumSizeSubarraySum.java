package leetcode;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
    public static void main(String[] args) {
    	MinimumSizeSubarraySum cd= new MinimumSizeSubarraySum();
    	int ans = cd.minSubArrayLen(7,new int[] {2,4,3});
    	System.out.print(ans);
    }
}
