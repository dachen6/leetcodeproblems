package leetcode;

public class AddOneRowtoTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
        	TreeNode cur = new TreeNode(val);
        	cur.left = root;
        	return cur;
        }

    	return help (root,  val, depth-1);
    	
    }
    TreeNode  help(TreeNode root, int val, int depth) {
    	if(root == null) {
    		
 
    		
        	return root;
    	}
    	if(depth == 0) {
    		return root;
    	}
        if(depth == 1) {
        	TreeNode cur = new TreeNode(val);
        	cur.left =help (root.left,  val, depth-1);
        	cur.right =  help (root.right,  val, depth-1);
        	root.left = cur;
        	root.right = cur;
        	return root;
        }
        root.left = help (root.left,  val, depth-1);
        root.right = help (root.right,  val, depth-1);
        return root;
    	
    }
    public static void main(String[] args) {
    	AddOneRowtoTree cd = new AddOneRowtoTree();
    	TreeNode four = new TreeNode(4);
    	TreeNode two = new TreeNode(2);
    	TreeNode three = new TreeNode(3);
    	TreeNode one = new TreeNode(1);
    	TreeNode six = new TreeNode(6);
    	TreeNode five = new TreeNode(5);
    	
    	four.left = two;
    	two.left = three;
    	two.right = one;
    	six.left = five;
    	cd.addOneRow(four, 1, 3);
    }
}
