package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinimumNumberofKeypresses {
	 public int minimumKeypresses(String s) {
	        int[] sorted = new int[26];
	        int res = 0;
	        for (char c : s.toCharArray()) {
	            sorted[c - 'a'] += 1;
	        }
	        Arrays.sort(sorted);
	        for (int i = 25; i >= 0; i -= 1) {
	            if (i > 16) {
	                res += sorted[i];
	            } else if (i > 7) {
	                res += (sorted[i] * 2);
	            } else {
	                res += (sorted[i] * 3);
	            }
	        }
	        return res;
	    }
}
