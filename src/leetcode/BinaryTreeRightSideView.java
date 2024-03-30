package leetcode;

import java.util.ArrayList;
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
public class BinaryTreeRightSideView {
	  public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> res= new   ArrayList<Integer>();
	        int[] maxlv = new int[1];
	        help(maxlv, res, root,1);
	        return res;
	    }
	  
	  public static void help(int[] maxlv, List<Integer> res, TreeNode root,int cur) {
		  if(root == null) {
			  return;
		  }
		  if(cur > maxlv[0]) {
			  res.add(root.val);
			  maxlv[0] = cur;
		  }
		  help(maxlv, res, root.right,cur +1);
		  help(maxlv, res, root.left,cur +1);
	  }
}
