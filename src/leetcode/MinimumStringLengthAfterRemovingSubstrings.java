package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
	   public int minLength(String s) {
	        char[] input = s.toCharArray();
	        Deque<Character> stack = new LinkedList<Character>();
	        for(char c : input) {
	        	if(stack.isEmpty()) {
	        		stack.addLast(c);
	        	}
	        	else if(c == 'B' && stack.peekLast() =='A') {
	        		stack.pollLast();
	        	}
	        	else if(c == 'D' && stack.peekLast() =='C') {
	        		stack.pollLast();
	        	}
	        	else {
	        		stack.addLast(c);
	        	}
	        	
	        }
	        return stack.size();
	    }
}
