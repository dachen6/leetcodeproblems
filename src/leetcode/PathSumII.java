package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if(root == null) {
			return null;
		}
		List<Integer> cur = new ArrayList<Integer>();
		List<List<Integer>> result =  new ArrayList<List<Integer>>(); 
		helper(root, targetSum, cur, result);
		return result;
    }
	
	public void helper(TreeNode root, int targetSum, List<Integer> cur ,List<List<Integer>> result ) {
		targetSum-=root.val;
		cur.add(root.val);
		if(root.left == null && root.right == null ) {
			if(targetSum == 0)
			{
				result.add(new  ArrayList<Integer>(cur));	
			}
			cur.remove(cur.size()-1);
			return;
		}
		if(root.left != null) {
			helper(root.left, targetSum, cur, result);
		}
		if(root.right != null) {
			helper(root.right, targetSum, cur, result);
		}
		cur.remove(cur.size()-1);
	}
}
