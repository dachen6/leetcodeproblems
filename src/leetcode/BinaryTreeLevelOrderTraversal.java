package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
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

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null) {
			return ans;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();

		q.add(root);
		int size = q.size();
		while (!q.isEmpty()) {
			List<Integer> help = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode cur = q.poll();
				help.add(cur.val);
				if (cur.left != null) {
					q.add(cur.left);
				}
				if (cur.right != null) {
					q.add(cur.right);
				}
			}
			size = q.size();
			ans.add(help);
		}
		return ans;
	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(9);
		TreeNode c = new TreeNode(20);
		TreeNode d = new TreeNode(15);
		TreeNode e = new TreeNode(7);
		a.left = b;
		a.right = c;
		c.left = d;
		c.right = e;
		BinaryTreeLevelOrderTraversal cd = new BinaryTreeLevelOrderTraversal();
		List<List<Integer>> ans = cd.levelOrder(a);
	}
}
