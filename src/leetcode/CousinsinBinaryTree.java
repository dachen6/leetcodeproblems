package leetcode;

public class CousinsinBinaryTree {
	
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
	
	public boolean isCousins(TreeNode root, int x, int y) {
       
		return helper(root, x,y) == 1;
    }
	public int helper(TreeNode root, int x, int y) {
		if(root == null) {
			return 0;
		}
		if(root.val == x || root.val == y ) {
			return 2;
		}
		
		int left = helper(root.left, x,y);
		int right = helper(root.right, x,y);
		if(left == 2 && right == 2 ) {
			return 0;
		}
		else if(left == 1 || right ==1 || left == right) {
			return 1;
		}
		else if(left == 0) {
			return right;
		}
		return left;
	}
}
