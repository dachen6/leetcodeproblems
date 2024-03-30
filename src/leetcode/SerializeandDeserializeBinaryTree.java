package leetcode;

public class SerializeandDeserializeBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	StringBuilder sb = new StringBuilder();
	int index = 0;

	public String serialize(TreeNode root) {
		if (root == null) {
			sb.append('n');
			sb.append(',');
			return sb.toString();
		}
		int cur = root.val;
		sb.append(cur);
		sb.append(',');
		serialize(root.left);
		serialize(root.right);
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String[] parts = data.split(",");
		return helper(parts);
	}
	public TreeNode helper(String[] parts) {
		if (parts[index].equals("n")) {
			index++;
			return null;
		}
		
		TreeNode root = new TreeNode(Integer.parseInt(parts[index]));
		
		index++;
		root.left = helper(parts);
		root.right = helper(parts);
		return root;
	}

	public static void main(String[] args) {
		SerializeandDeserializeBinaryTree cd = new SerializeandDeserializeBinaryTree();
		TreeNode res = cd.deserialize("1,2000,n,n,3,4,n,n,5,n,n,");
		System.out.print(cd.serialize(res));
	}

}
