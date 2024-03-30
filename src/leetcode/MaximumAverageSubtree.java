package leetcode;



	public class MaximumAverageSubtree {
		public static class TreeNode {
			public int key;
			public TreeNode left;
			public TreeNode right;

			public TreeNode(int key) {
				this.key = key;
			}
		}
		public static TreeNode findSubtree2(TreeNode root) {

			  TreeNode[] result = new TreeNode[1];
				double[] max = new double[] { Double.MIN_VALUE };
				int[] sum = new int[] { Integer.MAX_VALUE };
				int[] count = new int[] { Integer.MAX_VALUE };
				helper(root, max, sum, count, result);
				return result[0];
			}

			public static void helper(TreeNode root, double[] max, int[] sum, int[] count, TreeNode[] result) {

				if (root == null) {
					count[0] = 0;
					sum[0] = 0;
	                return;
				}
				helper(root.left, max, sum, count, result);
				int leftsum = sum[0];
				int leftcount = count[0];
				helper(root.right, max, sum, count, result);
				int rightsum = sum[0];
				int rightcount = count[0];
				int curmax = leftsum +  rightsum  + root.key;
				System.out.println(leftsum + "   "+leftcount + "   "+rightsum + "   "+rightcount + "   ");
				double ave = (double)curmax/(leftcount + rightcount +1);
				if(ave  >max[0]) {
					max[0] = ave;
					result[0] = root;
				}
				count[0] = (leftcount + rightcount +1);
				sum[0] = curmax;
			}
	
	public static void main(String[] args) {
		TreeNode one = new TreeNode(1);
		TreeNode five = new TreeNode(-5);
		TreeNode ele = new TreeNode(11);
		TreeNode secone = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode four = new TreeNode(4);
		TreeNode negtwo = new TreeNode(-2);
		one.left = five;
		one.right = ele;
		five.left = secone;
		five.right = two;
		ele.left = four;
		ele.right = negtwo;
		MaximumAverageSubtree cd = new MaximumAverageSubtree();
		cd.findSubtree2(one);
	}
}
