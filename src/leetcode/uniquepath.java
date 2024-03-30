package leetcode;

import java.util.Arrays;

public class uniquepath {
	public int uniquePathsWithObstacles(int[][] input) {
		int m = input.length;
		int n = input[0].length;
		int[] dp = new int[n + 1];
		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (input[i][j - 1] == 1) {
					dp[j] = 0;
				} else if (i == 0 && j == 1) {
					dp[j] = 1;
				} else {
					dp[j] = dp[j] + dp[j - 1];
				}
			}
			System.out.println(Arrays.toString(dp));
		}
		return dp[n];
	}

	public static void main(String[] args) {
		uniquepath cd = new uniquepath();
		cd.uniquePathsWithObstacles(new int[][] { { 1, 0 } });
	}
}
