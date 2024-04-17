package leetcode;

public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] ans = new int[1];
        help(ans, 0, root);
        return ans[0];
    }
    public void help(int[] ans, int check,TreeNode root) {
        if(root == null){
            return;
        }
        if(check == 1 && root.left == null &root.right == null ){
            ans[0] += root.val;
        }
        help(ans, 1, root.left);
        help(ans, 0, root.right);
    }
}
