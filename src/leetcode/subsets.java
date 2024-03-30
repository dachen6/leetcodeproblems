package leetcode;

import java.util.ArrayList;
import java.util.List;

public class subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> cur = new ArrayList<Integer>();
			helper(0, nums, result, cur);
			return result;
	}
	
	public void helper(int index,int[] nums,List<List<Integer>> result,List<Integer> cur ) {
		if(index == nums.length ) {
			List<Integer> now = new ArrayList<Integer>(cur);
			result.add(now);
			return;
		}
		cur.add(nums[index]);
		helper(index +1, nums,result, cur);
		cur.remove(cur.size()-1);
		helper(index +1, nums,result, cur);
	}
}
