package leetcode;

import java.util.Arrays;

public class Candy {
	public int candy(int[] ratings) {
		int len = ratings.length;
		int[] dp = new int[len];
		dp[0] = 1;
		int result = 0;
		for(int i = 1; i < len; i++) {
			dp[i] = ratings[i-1] < ratings[i]? dp[i-1]+1:1;
		}
		System.out.println(Arrays.toString(dp));
		result +=dp[len-1];
		for(int i = len - 2; i >=0; i--) {
			int cur = ratings[i] > ratings[i+1]? dp[i+1]+1:1;
			dp[i] = Math.max(dp[i], cur);
			result +=dp[i];
		}
		System.out.println(Arrays.toString(dp));
		System.out.print(result);
		return result; 
    }
	public static void main(String[] args)
	{
		Candy cd =new Candy();
		cd.candy(new int[] {1,0,2});
	}
}
