package leetcode;

import java.util.Arrays;

public class MatchstickstoSquare {
	public boolean makesquare(int[] matchsticks) {
		Arrays.sort(matchsticks);
		int target = 0;
		int[] cur = new int[4];
		for(int i = 0; i < matchsticks.length;i++) {
			target += matchsticks[i];
		}
		if(target % 4 != 0) {
			return false;
		}
		return helper(matchsticks,target/4, matchsticks.length-1, cur);
		
	}
	public boolean helper(int[] matchsticks, int target, int index, int[] cur) {
		if(index == -1) {
			return (cur[0] == target && cur[1] == target && cur[2] == target && cur[3] == target);
		}
		for(int i = 0; i < 4;i++) {
			if(cur[i] + matchsticks[index] <= target) {
				cur[i] += matchsticks[index];
				if(helper(matchsticks,target, index-1, cur)) {
					return true;
				}
				cur[i] -= matchsticks[index];
			}
		}
		return false;
	}
	public static void main(String[] args) {
		MatchstickstoSquare cd = new  MatchstickstoSquare();
		cd.makesquare(new int[] {1,1,2,2,2});
	}
}
