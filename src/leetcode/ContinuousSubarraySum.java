package leetcode;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class ContinuousSubarraySum {
	public boolean checkSubarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);
		if (nums[0] % k != 0) {
			map.put(nums[0] % k, 0);
		}
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i];
			int index = nums[i] % k;

			Integer freq = map.get(index);
			if (freq == null) {
				map.put(index, i);
			} else if (freq < i - 1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ContinuousSubarraySum cd = new ContinuousSubarraySum();
		cd.checkSubarraySum(new int[] { 5,0,0,0 }, 3);
	}
}
