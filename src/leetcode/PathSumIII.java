package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.PathSumII.TreeNode;

public class PathSumIII {
	
	class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
	public int pathSum(TreeNode root, int targetSum) {
	
		HashMap<Integer,Integer> prev = new HashMap<Integer,Integer> ();
		prev.put(0, 1);
		int[] result =  new int[1]; 
		helper(root, targetSum, prev, result,0);
		return result[0];
    }
	
	public void helper(TreeNode root, int targetSum, HashMap<Integer,Integer> prev ,int[] result,int cur ) {
		if(root == null)
		{
			return;
		}
		cur += root.val;
		int num = 1;
		if(prev.containsKey(cur)) {
		     num = prev.get(cur)+1;
			prev.put(cur, num);
		}
		else {
			prev.put(cur, 1);
		}
		if(prev.containsKey(cur -targetSum)) {			
			result[0] += prev.get(cur -targetSum);		
		}	
		
		helper(root.left, targetSum, prev, result,cur);
		helper(root.right, targetSum, prev, result,cur);
		
		prev.put(cur, num-1);
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
        PathSumIII lzr = new PathSumIII();
        Integer[] nodes = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
        TreeNode tree = lzr.buildTree(nodes);
        int targetSum = 22;
        int res = lzr.pathSum(tree, targetSum);
        System.out.print(res);
    }
	
}
