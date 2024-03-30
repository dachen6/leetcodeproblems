package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        char[] input = num.toCharArray();
        List<String> res=  new  ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        helper(res, input, 0,input[0] - '0',sb , target);
    }
    
    void helper(List<String> res, char[] input, int cur, int cursum, StringBuilder sb,int target ) {
    	if(cur == input.length) {
    		if(cursum == target) {
    			res.add(sb.toString());
    		}
    		return;
    	}
    	if()
    	helper(res, input, 0,input[0] - '0',sb , target);
    }
}
