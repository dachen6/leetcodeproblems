package leetcode;

public class MaximumAlternatingSubsequenceSum {
	 public long maxAlternatingSum(int[] nums) {
	        int len = nums.length;
	        int[][] dp = new int[len+1][len+1];
	        long res = 0;
	        for(int i = 1 ; i < len+1; i++) {
	        	for(int j = i ; j < len+1;j++) {
	        		if(i % 2 == 1) {
	        			dp[i][j] = Math.max( nums[j-1] +  dp[i-1][j-1], dp[i][j-1]);
	        			res = Math.max(res, dp[i][j]);
	        		}
	        		else {
	        			dp[i][j] = Math.max( dp[i-1][j-1] - nums[j-1], dp[i][j-1]);
	        			
	        		}
	        	}
	        }
	        return res;
	    }
	 
	 public static void main(String[] args) {
		 MaximumAlternatingSubsequenceSum cd = new MaximumAlternatingSubsequenceSum();
		 long res = cd.maxAlternatingSum(new int[] {4,2,5,3});
		 System.out.print(res);
	 }
}
