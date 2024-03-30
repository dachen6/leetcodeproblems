package leetcode;

public class ValidateBinarySearchTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean isValidBST(TreeNode root) {
		return help(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean help(TreeNode root, int left, int right) {
		if (root == null) {
			return true;
		}
		if (root.val <= left || root.val >= right) {
			return false;
		}
		return help(root.left, left, root.val-1) && help(root.right, root.val + 1, right);

	}

}
