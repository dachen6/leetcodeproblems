package leetcode;

import java.util.HashSet;

public class LowestCommonAncestorofaBinaryTreeIV {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        HashSet<Integer> set = new HashSet();
        for(TreeNode t: nodes) {
        	set.add(t.val);
        }
        TreeNode ans = null;
        help(root, set,ans);
        return ans;
    }
    
    public int help(TreeNode root, HashSet<Integer> set,TreeNode ans) {
    	if(root == null && ans != null) {
    		return 0;
    	}
    	  int left = help(root.left, set,ans);
    	  int right= help(root.right, set,ans);
    	  int cur = 0;
    	  if (set.contains(root.val)) {
    		  cur = 1;
    	  }
    	  cur= cur + left+right;
    	  if(cur ==set.size() && ans == null) {
    		  ans = root;
    	  }
    	  return cur;
    }
}
