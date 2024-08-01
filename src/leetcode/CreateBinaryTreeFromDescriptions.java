package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CreateBinaryTreeFromDescriptions {
    public TreeNode createBinaryTree(int[][] descriptions) {
    	Map<Integer, TreeNode> map = new HashMap<>();
    	Set<TreeNode> used = new HashSet<TreeNode>();

    	for(int[] array: descriptions) {
    		TreeNode parent  = map .get(array[0]);
			if (parent == null) {
				parent = new TreeNode(array[0]);
				map.put(array[0], parent);
				used.add(parent);
			} 
			TreeNode childen  = map .get(array[1]);
			if (childen == null) {
				map.put(array[1], childen);
				childen = new TreeNode(array[1]);
			} 
				used.remove(childen);
			
			if(array[2] == 1) {
				parent.left = childen;
			}
			else {
				parent.right = childen;
			}

    	}
		TreeNode domy = new TreeNode(0);
		for(TreeNode ans :used) {
			return ans;
		}
		return null;
    }
    
    public static void main(String[] args) {
    	CreateBinaryTreeFromDescriptions cd = new CreateBinaryTreeFromDescriptions();
		  cd.createBinaryTree(new int[][] {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}}
				  );
	  }
}
