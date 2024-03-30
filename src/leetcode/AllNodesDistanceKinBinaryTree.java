package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllNodesDistanceKinBinaryTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		List<Integer> result = new ArrayList<Integer>();
		int[] count = new int[] { k };
		helper(root, target, k, result, count);
		return result;
	}

	public boolean helper(TreeNode root, TreeNode target, int k, List<Integer> result, int[] count) {
		count[0] -= 1;
		if (root == target) {
			findresult(k, root, result);
			
			return true;
		}
		if (root == null || count[0] < -1) {
			return false;
		}
		if (count[0] == 0) {
			result.add(root.val);
		
		}
		
		if (helper(root.left, target, k, result, count)) {

			findresult(count[0] , root.right, result);

		
			return true;
		} else if (helper(root.right, target, k, result, count)) {
			findresult(count[0] , root.left, result);
			
			return true;
		}
		return false;

	}

	public void findresult(int k, TreeNode root, List<Integer> result) {
		if (root == null || k < 0) {
			return;
		}
		if (k == 0) {
			result.add(root.val);
			return;
		}
		findresult(k - 1, root.left, result);
		findresult(k - 1, root.right, result);
	}

	public static void main(String[] args) {
		TreeNode one = new TreeNode(1);
		TreeNode zero = new TreeNode(0);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		zero.right = one;
		one.right = two;
		two.right = three;
		AllNodesDistanceKinBinaryTree cd = new AllNodesDistanceKinBinaryTree();
		cd.distanceK(zero, one, 2);
	}
}
