package leetcode;

import leetcode.DiameterofBinaryTree.TreeNode;

public class shudezijiegou {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSubStructure(TreeNode A, TreeNode B) {
		if (A == null) {
			return false;
		}
		boolean cur = false;
		if (A.val == B.val) {

			cur = check(A, B);
		}
		return isSubStructure(A.left, B) || isSubStructure(A.right, B) || cur;

	}

	public boolean check(TreeNode A, TreeNode B) {
		if ( B == null) {
			return true;
		} else if (A == null ) {
			return false;
		} else if (A.val != B.val) {
			return false;
		}

		return check(A.left, B.left) && check(A.right, B.right);
	}
}
