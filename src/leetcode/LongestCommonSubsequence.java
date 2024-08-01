package leetcode;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int ans = 0;
        int[][] dp = new int[len1+1][len2+1];
        for(int i = 1; i <len1+1;i++) {
            for(int j = 1; j <len2+1;j++) {
            	if(text1.charAt(i-1) == text2.charAt(j-1)) {
            		dp[i][j] = Math.max(dp[i-1][j-1]+1,dp[i-1][j] );
            		dp[i][j] = Math.max(dp[i][j],dp[i][j-1] );
            		ans = Math.max(ans, dp[i][j]);
            	}
            }
        }
        return ans;
    }
}
