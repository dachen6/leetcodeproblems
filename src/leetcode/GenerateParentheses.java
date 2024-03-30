package leetcode;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
    	List<String> res = new LinkedList<String>();
    	StringBuilder sb = new StringBuilder();
    	help(res, n, sb ,0,0);
    	return res;
    }
    
    void help(List<String> res , int n ,StringBuilder sb, int l, int r){
    	if( r == n) {
    		res.add(sb.toString());
    		return;
    	}
    	if(l < n) {
        	sb.append('(');
        	help(res, n, sb ,l+1,r);
        	sb.deleteCharAt(sb.length() - 1);
    	}
    	if(l > r) {
        	sb.append(')');
        	help(res, n, sb ,l,r+1);
        	sb.deleteCharAt(sb.length() - 1);
    	}

    	
    }
    
    public static void main(String args[]) {
    	GenerateParentheses cd = new GenerateParentheses();
    	List<String> res = cd.generateParenthesis(3);
    	for(String s : res) {
    		System.out.println(s);
    	}
    }
}
