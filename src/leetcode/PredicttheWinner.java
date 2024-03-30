package leetcode;

import java.util.Arrays;

public class PredicttheWinner {
	 public boolean PredictTheWinner(int[] nums) {
		   int n = nums.length;
		    int[][] dp = new int[n][n];
		    for (int i = 0; i < n; i++) { dp[i][i] = nums[i]; }
		    for (int len = 1; len < n; len++) {
		        for (int i = 0; i < n - len; i++) {
		            int j = i + len;
		            dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
		            for(int a = 0;a < n; a++) {
						System.out.println(	Arrays.toString(dp[a]));
					}
					System.out.println();
		        }
		    }
		    return dp[0][n - 1] >= 0;
			 
	 }
	 
	 public static void main(String[] args) {
		 PredicttheWinner cd = new PredicttheWinner();
			boolean x = cd.PredictTheWinner(new int[] {1,5,233,7});
			System.out.print(x);
		}
	 
}
