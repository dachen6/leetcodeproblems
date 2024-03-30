package leetcode;

public class KbiggestBST {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int[] count = new int[1];
	int[] result = new int[1];

	public int kthLargest(TreeNode root, int k) {
		if (root == null) {
			return result[0];
		}
	
		kthLargest(root.right, k);
		count[0]++;
		if (k == count[0]) {
			result[0] = root.val;
			return result[0];
		}
		kthLargest(root.left, k);
	
		return result[0];
	}

	public static void main(String[] args) {
		TreeNode three = new TreeNode(3);
		
		TreeNode one = new TreeNode(1);
		
		TreeNode four = new TreeNode(4);
		
		TreeNode two = new TreeNode(2);
		three.left = one;
		three.right = four;
		one.right = two;
		
		KbiggestBST cd  =new KbiggestBST();
		
	
		System.out.print(cd.kthLargest(three, 1));
	}
}
