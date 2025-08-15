package leetcode;

import java.util.List;
 class TreeNode {
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
public class CousinsinBinaryTree {
	
	
	
	public boolean isCousins(TreeNode root, int x, int y) {
       
		return helper(root, x,y) == -1;
    }
	public int helper(TreeNode root, int x, int y) {
		if(root == null) {
			return 0;
		}
		if(root.val == x || root.val == y  ) {
			return 1;
		}
		
		int left = helper(root.left, x,y);
		int right = helper(root.right, x,y);

		 if(left == -1 || right == -1 ||(left == right && left >1)) {
			return -1;
		}
		else if(left == 0 &&right == 0 ) {
			return 0;
		}
		else if(left == 0 ) {
			return right + 1;
		}
		return left+1;
	}
	
	public static void main(String[] args) {
		CousinsinBinaryTree cd = new CousinsinBinaryTree();
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		one .left = two;
		
		one.right = four;
		two.left = three;
		two.right = eight;
		three.right = seven;
		boolean res =cd . isCousins(one, 2,3);
        System.out.print(res);
    }
}
