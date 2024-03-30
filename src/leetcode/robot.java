package leetcode;

public class robot {
	public int movingCount(int m, int n, int k) {
		int[][] dp = new int[m][n];
		int i = 0;
		int j = n;
		int limit = 0;
		int result = 1;

		for (j = 1; j < n; j++) {
			dp[i][j] = dp[i][j - 1] + 1;
			if (j % 10 == 0) {
				dp[i][j] = dp[i][j - 1] - 9;
			}
			result++;
			if (dp[i][j] > k) {
				limit = j;
				result--;
				break;
			}
		}

		for (i = 1; i < m; i++) {
			for (j = 0; j < n; j++) {
				
				dp[i][j] = dp[i - 1][j] + 1;
				if (i % 10 == 0) {
					dp[i][j] = dp[i - 1][j] - 9;
				}
				result++;
				if (dp[i][j] > k) {
					limit = j;
					result--;
					break;
				}

			}
			if(dp[i][0] >k) { 
				break;
			}

		}

		return result;

	}

	public static void main(String[] args) {
		robot cd = new robot();
		cd.movingCount(16, 8, 4);
	}
}
