package leetcode;

public class SmallestStringStartingFromLeaf {
	
	
    public String smallestFromLeaf(TreeNode root) {
    	StringBuilder ans = help(root );
    	System.out.println(ans.toString() + "    " );
    	return ans.toString();
    }
    
    public StringBuilder help(TreeNode root) {
    	if(root == null) {
    		StringBuilder sb = new StringBuilder();
    		return sb ;
    	}
    	StringBuilder left = help( root.left);
    	StringBuilder right = help( root.right);
    	int len = 0;
    	char rootval = (char)(root.val+ 'a');
    	int leftlen = left.length();
    	int rightlen = right.length();
    	System.out.println(left.toString() + "    " + right.toString());
    	if(leftlen == 0) {
    		return  right.append(rootval);
    	}
    	if(rightlen == 0) {
    		return left.append(rootval);
    	}
    	
    	while(len < leftlen &&len < rightlen ) {
    		char leftchar = left.charAt(len);
    		char rightchar = right.charAt(len);
    		if(leftchar <rightchar ) {
    			return left.append(rootval);
    		}
    		else if(leftchar >rightchar ) {
    			return right.append(rootval);
    		}
            len++;
    	}
    	if(leftlen > rightlen) {
    		return right.append(rootval);
    	}
    	else {
    		return left.append(rootval);
    	}
    }
    public TreeNode arrayToTree(Integer array[]) {
        return arrayToTree(array, 0);
    }

    static TreeNode arrayToTree(Integer array[], int index) {
        if (index >= array.length)
            return null;
        if (array[index] == null)
            return null;
        return new TreeNode(array[index], arrayToTree(array, index * 2 + 1), arrayToTree(array, index * 2 + 2));
    }
    public static void main(String[] args) {
    	SmallestStringStartingFromLeaf cd = new SmallestStringStartingFromLeaf();
    	TreeNode input = cd.arrayToTree(new Integer[] {4,0,1,1});
    	cd.smallestFromLeaf(input);
    }
    
}
