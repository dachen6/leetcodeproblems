package leetcode;

public class AllUnique {
	  public boolean allUnique(String word) {
		    char[] input = word.toCharArray();
		    int[] dp = new int[26];
		    for(int i = 0;i< input.length;i++) {
		    	if(dp[input[i] - 'a'] == 1) {
		    	return false;
		    	}
		    	dp[input[i] - 'a'] = 1;
		    }
		    return true;
		  }
}
