package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
	  static class TreeNode {
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
    public boolean isEvenOddTree(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	int even = Integer.MAX_VALUE;
    	int odd = -1;
    	queue.add(root);
    	int level = 0;
    	
    	while(!queue.isEmpty()) {
    		int size=  queue.size();
    		if(level % 2 == 0) {
    			 odd = -1;
    		}
    		else {
    			even = Integer.MAX_VALUE;
    		}
    		for(int i = 0; i < size; i++) {
    			TreeNode cur = queue.poll();
    			if(level % 2 == 0) {
    				if(cur.val % 2 == 0 ||cur.val <= odd ) {
    					return false;
    				}
    				else {
    					odd = cur.val;
    				}
    			}else {
    				if(cur.val % 2 == 1 ||cur.val >= even ) {
    					return false;
    				}
    				else {
    					even = cur.val;
    				}
    			}
    			if(cur.left != null) {
    				queue.add(cur.left);
    			}
    			if(cur.right != null) {
    				queue.add(cur.right);
    			}
    		
    		}
    		level++;
    	}
    	System.out.print(true);
    	return true;
    }
    
    
    public static void main(String[] args) {
    	
    	
    	EvenOddTree cd = new EvenOddTree();
    	TreeNode one = new TreeNode(1);
    	TreeNode ten = new TreeNode(10);
    	TreeNode four = new TreeNode(4);
    	TreeNode three = new TreeNode(3);
    	TreeNode seven = new TreeNode(7);
    	TreeNode nine = new TreeNode(9);
    	TreeNode twelve = new TreeNode(12);
    	TreeNode eight = new TreeNode(8);
    	TreeNode six= new TreeNode(6);
    	TreeNode two= new TreeNode(2);
    	one.left = ten;
    	one.right = four;
    	ten.left = three;
    	four.left = seven;
    	four.right = nine;
    	three.left = twelve;
    	three.right = eight;
    	seven.left = six;
    	nine.right = two;
    	cd.isEvenOddTree(one);
    	
    }
}
