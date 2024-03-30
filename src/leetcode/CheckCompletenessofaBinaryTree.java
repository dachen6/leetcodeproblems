package leetcode;

import java.util.*;


public class CheckCompletenessofaBinaryTree {
	
	public static class TreeNode {
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
	 public boolean isCompleteTree(TreeNode root) {
	        boolean voild = true;
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	       
	        while(!queue.isEmpty()) {
	         int size = queue.size();
	         for(int i = 0; i < size;i ++) {
	        	 TreeNode cur = queue.poll();
	        	 if(cur.left == null) {
	        		 voild = false;
	        	 }
	        	 else if(voild == false) {
	        		 return false;
	        	 }
	        	 else {
	        		 queue.add(cur.left);
	        	 }
	        	 
	        	 if(cur.right == null) {
	        		 voild = false;
	        	 }
	        	 else if(voild == false) {
	        		 return false;
	        	 }
	        	 else {
	        		 queue.add(cur.right);
	        	 }
	         }
	        }
	        return true;
	    }
	 
	 public static void main(String[] args) { 
		 TreeNode a = new TreeNode(1);
		 CheckCompletenessofaBinaryTree cd = new CheckCompletenessofaBinaryTree();
		 
		 System.out.print(cd.isCompleteTree(a));
		 
	 }
}
