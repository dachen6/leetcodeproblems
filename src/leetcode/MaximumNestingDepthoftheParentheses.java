package leetcode;

public class MaximumNestingDepthoftheParentheses {
    public int maxDepth(String s) {
        int cur = 0;
        int ans = 0;
        for(int i = 0 ; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		cur++;
        		ans = Math.max(ans, cur);
        	}
        	if(s.charAt(i) == ')') {
        		cur--;
        	}
        }
        return ans;
        
    }
}
