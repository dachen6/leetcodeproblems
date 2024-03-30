package leetcode;

public class DiameterofBinaryTree {
	
	public int diameterOfBinaryTree(TreeNode root) {
		int[] max = new int[1];
		helper(root, max);
		return max[0];
    }
	
	public int helper(TreeNode root,int[] max ) {
		if(root == null)
		{
			return 0;
		}
		int left = helper(root.left, max);
		int right = helper(root.right, max);
		max[0] = Math.max(left + right, max[0]);
		return Math.max(left, right) + 1;
	}
	
	
}
