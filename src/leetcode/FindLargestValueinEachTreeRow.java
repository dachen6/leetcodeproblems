package leetcode;

import java.util.*;

public class FindLargestValueinEachTreeRow {
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
	  public List<Integer> largestValues(TreeNode root) {
		  if(root == null) {
			  return null;
		  }
		  Deque<TreeNode> queue = new LinkedList<TreeNode>();
		  List<Integer> res = new ArrayList<Integer>();
		  queue.addFirst(root);
		  while(!queue.isEmpty()) {
			  int size = queue.size();
			  int max = Integer.MIN_VALUE;
			  for(int i = 0; i <size; i++) { 
				  TreeNode cur = queue.pollLast();
				  max = Math.max(max, cur.val);
				  if(cur.left != null) {
					  queue.addFirst(cur.left);  
				  }
				  if(cur.right != null) {
					  queue.addFirst(cur.right);
				  }
				  
			  }
			  res.add(max);
		  }
		 
		  return res;
	    }
}
