package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> cur = new ArrayList<Integer>();
		helper(candidates, target, result, cur, 0);
		return result;
	}

	public void helper(int[] candidates, int target, List<List<Integer>> result, List<Integer> cur, int index) {
		if (index == candidates.length - 1) {
			if (target % candidates[candidates.length - 1] == 0) {
				int num = target / candidates[index];
				for (int i = 0; i < num; i++) {
					cur.add(candidates[index]);
				}

				result.add(new ArrayList<Integer>(cur));
				for (int i = 0; i < num; i++) {
					cur.remove(cur.size() - 1);
				}
			}
			return;
		}
		
		int max = target / candidates[index];
		for (int i = 0; i <=max; i++) {
			if (i != 0) {
				cur.add(candidates[index]);
			}
			helper(candidates, target - i * candidates[index], result, cur, index + 1);
		}
		
		for (int i = 0; i <=max; i++) {
			if (i != 0) {
				cur.remove(cur.size() - 1);
			}

		}
	}
	
	
	
	public static void main(String[] args) {
		CombinationSum cd = new CombinationSum();
		cd.combinationSum(new int[] {2,3,7} ,7);
	}
}
