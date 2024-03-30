package leetcode;

public class SuccessorLCCI {
	 public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
	   
	        TreeNode[] res = new TreeNode[1];
	        TreeNode[] pre = new TreeNode[1];
	      helper(root, p, res, pre);
	       return res[0];
	    }

	 public void helper(TreeNode root, TreeNode p,TreeNode[] res, TreeNode[] pre) {
	     if(root == null){
	            return ;
	        }
	          helper(root.left, p, res,pre);
	        if(pre[0] == p){
	            res[0] = root;
	            return;
	        }
	        pre[0] = root;
	      
	        
	       helper(root.right, p, res,pre);
	        
	       
	    }
	 
	 public static void main(String[] args) {
		 SuccessorLCCI cd  =new SuccessorLCCI();
		 TreeNode one = new TreeNode(1);
		 TreeNode two = new TreeNode(2);
		 TreeNode three = new TreeNode(3);
		 two.left = one;
		 two.right = three;
		 cd.inorderSuccessor(two, three);
	 }
}
