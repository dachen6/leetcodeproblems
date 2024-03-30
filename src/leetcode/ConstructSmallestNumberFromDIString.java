package leetcode;

import java.util.Arrays;

public class ConstructSmallestNumberFromDIString {
	   public String smallestNumber(String pattern) {
	        char[] input = pattern.toCharArray();
	        int[] res = new int[input.length + 1];
	        int cur = 1;
	        for(int i = 0 ;i < res.length; i ++) {
	        	if( i == res.length|| input[i] == 'I' && (i == 0 ||input[i -1 ] == 'D') ) {
	        		res[i] = cur;
	        		cur ++;
	        		int j = i;
	        		while(j >= 0 &&res[j] == 0) {
	        			res[j] = cur;
	        			cur++;
	        			j--;
	        		}
	        	}
	        }
	        return Arrays.toString(res);
	    }
}
