package leetcode;

import java.util.Stack;

public class RemovingStarsFromaString {
	  public String removeStars(String s) {
	        char[] input = s.toCharArray();
	        int end = 0;
	        for(int i = 0; i < input.length; i ++) {
	        	if(input[i] == '*') {
	        		end--;
	        	}
	        	else {
	        		input[end] = input[i];
	        	}
	        }
	        return new String(input, 0, end);
	    }
}
