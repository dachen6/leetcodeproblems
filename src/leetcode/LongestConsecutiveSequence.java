package leetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		int result = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			int cur = 1;
			int plus = 1;
			int miner = 1;
			if (set.contains(nums[i])) {
				set.remove(nums[i] );
				while (set.contains(nums[i] + plus) || set.contains(nums[i] - miner)) {
					if (set.contains(nums[i] + plus)) {
					
						set.remove(nums[i] + plus);
						plus++;
						cur++;
					}
					if (set.contains(nums[i] - miner)) {
						
						set.remove(nums[i]-miner);
						miner++;
						cur++;
					}
				}
				result = Math.max(result, cur);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		LongestConsecutiveSequence cd  =new LongestConsecutiveSequence();
		cd.longestConsecutive(new int[] {100,4,200,1,3,2});
	}
}
