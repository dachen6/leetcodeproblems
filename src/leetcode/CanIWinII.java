package leetcode;

import java.util.Arrays;

public class CanIWinII {
	public int pizzaSize(int[] input) {
		int len = input.length;
		int[][] dp = new int[len][len];
		for(int i = 0;i < len; i++) {
			for(int j = 0;j < len-i; j++) {
				int x = j;
				int y = j + i;
				if(x == y) {
					dp[x][y] = input[x];
				}
				else if(y - x == 1) {
					dp[x][y] = Math.max(input[x], input[y]);
				}
				else {
					int pickFirse = input[x] +(input[x +1] > input[y] ?   dp[x +2][y]: dp[x +1][y-1]);
					int pickLast= input[y] +(input[x] > input[y-1] ? dp[x +1][y-1]:  dp[x][y-2]);
					dp[x][y] = Math.max(pickFirse , pickLast);
				}
				for(int a = 0;a < len; a++) {
					
					System.out.println(	Arrays.toString(dp[a]));
						
					
				}
				System.out.println();
			}
			
		}
		return dp[0][len-1];
	}
	
	public static void main(String[] args) {
		CanIWinII cd = new CanIWinII();
		int x = cd.pizzaSize(new int[] {2,1,100,3});
		x = 1;
		System.out.print(x-- > 0);
	}
}
