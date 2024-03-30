package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructStringfromBinaryTree {
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
	 public String tree2str(TreeNode root) {
	        Queue<TreeNode> q = new LinkedList<TreeNode>();
	        q.add(root);
	        int size = q.size();
	        
	    }
}
