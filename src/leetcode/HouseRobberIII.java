package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import RecursionIII.BinaryTreePathSumToTargetIII.TreeNode;

public class HouseRobberIII {

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
	 
	 public int help(TreeNode root, int[] max) {
		  if(root == null) {
	        	return 0;
	        }
	        int left = 0;
	        int right = 0;
	        int leftval = 0;
	        int rightval = 0;
	        if(root.left != null)
	        {
	        	leftval = root.left.val;
	        	left = help(root.left,max) ;
	        }
	        if(root.right != null)
	        {
	        	rightval = root.right.val;
	            right = help(root.right,max)  ;
	        }
	        System.out.println(" root val = " + root.val + "      " + left + "      " +leftval + "      " + right + "      " + rightval + "      "   + "return val "+ (left + right +rightval + leftval) + "      " );
	        max[0] = Math.max(left + right + root.val, rightval + leftval);
	        if(left + right + root.val> rightval + leftval) {
	        	return left + right +rightval + leftval; 
	        }
	        else
	        {
	        	 return left + right ;
	        }
	        
	 }
	 public int rob(TreeNode root) {
			int max[] = new int[1]; 
			help(root, max);
			return max[0];
	    }
	 
	 TreeNode buildTree(Integer[] nodes) {
	        TreeNode root = new TreeNode(nodes[0]);
	        int count = 0;
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        TreeNode cur = null;
	        for (int i = 1; i < nodes.length; i++) {
	            TreeNode node = nodes[i] != null ? new TreeNode(nodes[i]) : null;
	            if (count == 0) {
	                cur = queue.poll();
	            }
	            if (count == 0) {
	                count++;
	                cur.left = node;
	            } else {
	                count = 0;
	                cur.right = node;
	            }
	            if (nodes[i] != null) {
	                queue.offer(node);
	            }
	        }
	        return root;
	    }

	    public static void main(String[] args) {
	    	HouseRobberIII lzr = new HouseRobberIII();
	        Integer[] nodes = { 4,1,null,2,null,3};
	        TreeNode tree = lzr.buildTree(nodes);
	        int res = lzr.rob(tree);
	        System.out.print(res);
	    }
}
