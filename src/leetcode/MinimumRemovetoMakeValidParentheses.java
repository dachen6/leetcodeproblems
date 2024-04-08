package leetcode;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MinimumRemovetoMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
    	char[] input = s.toCharArray();
        Set<Integer> set = new  HashSet<Integer>();
        Deque<Integer> stack = new LinkedList<Integer>();
        for(int i = 0; i < s.length(); i++) {
        	if(input[i] == ')' && stack.isEmpty()) {
        		set.add(i);
        		
        	}
        	else if(input[i] == ')') {
        		stack.poll();
        	}
        	else if(input[i] == '(') {
        		stack.add(i);
        	}
        }
        for(int i : stack) {
        	set.add(i);
        }
        int slow = 0;
        int fast = 0;
        while(fast <s.length() ) {
        	if(set.contains(fast)) {
        		fast++;
        	}
        	else {
        		input[slow] = input[fast];
        		slow++;
        		fast++;
        	}
        }
        String ans = new String(input, 0, slow);
        return ans ;
        
    }
    
    
    public static void main(String[] args) {
    	MinimumRemovetoMakeValidParentheses cd  =new MinimumRemovetoMakeValidParentheses();
    	System.out.print(	cd.minRemoveToMakeValid("lee(t(c)o)de)"));  
    
    }
}
