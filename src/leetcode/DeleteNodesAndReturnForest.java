package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DeleteNodesAndReturnForest {
	
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
	
	  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		  Set<Integer> used = new HashSet<Integer>();
		  for(int a :to_delete ) {
			  used.add(a);
		  }
		  TreeNode dummy = new TreeNode(-1);
		  dummy.left = root;
		  List<TreeNode> list = new ArrayList<TreeNode>();
		  dummy.left =helper ( dummy.left, used, list);
		  dummy.right =  helper( dummy.right, used, list);
		  if(dummy.left != null)
		  {
			  list.add(0, dummy.left);
		  }
	
		  return list;
	    }
	  
	  public TreeNode helper(TreeNode root,  Set<Integer> used , List<TreeNode> list ) {
		  if(root == null) {
			  return null;
		  }
		  if(used.contains(root.val)) {
			  if(root.left != null) {
				  if(!used.contains(root.left.val)) {
					  list.add(root.left);
				  }
				  helper( root.left, used, list);
			  }
			  if(root.right != null) {
				  if(!used.contains(root.right.val)) {
					  list.add(root.right);
				  }
				  helper( root.right, used, list);
			  }
			  return null;
		  }
		  else {
			  root.left = helper( root.left, used, list);
			  root.right = helper( root.right, used, list);
			  return root;
		  }
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
	  void printTree(TreeNode root) {
	        if (root == null) {
	            return;
	        }
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        while (!queue.isEmpty()) {
	            List<String> curLayer = new ArrayList<>();
	            int size = queue.size();
	            for (int i = 0; i < size; i++) {
	                TreeNode cur = queue.poll();
	                if (cur != null) {
	                    curLayer.add(Integer.toString(cur.val));
	                } else {
	                    curLayer.add("#");
	                    continue;
	                }
	                if (cur.left != null) {
	                    queue.offer(cur.left);
	                } else {
	                    queue.offer(null);
	                }
	                if (cur.right != null) {
	                    queue.offer(cur.right);
	                } else {
	                    queue.offer(null);
	                }
	            }
	            for (String node : curLayer) {
	                System.out.print(node + " ");
	            }
	            System.out.print("\n");
	        }
	    }
	  public static void main(String[] args) {
	        DeleteNodesAndReturnForest lzr = new DeleteNodesAndReturnForest();
	        Integer[] nodes = {1,2,3,4,5,6,7};
	        TreeNode root = lzr.buildTree(nodes);
	       
	        int[] to_delete = {1,3,5};
	        List<TreeNode> res = lzr.delNodes(root, to_delete);
        for (TreeNode node : res) {
        	lzr.printTree(node);
	        }
	        
	        
	    }
	  
	  
}
