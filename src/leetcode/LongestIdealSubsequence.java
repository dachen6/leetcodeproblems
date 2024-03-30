package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestIdealSubsequence {
    public int longestIdealString(String s, int k) {
    	int[] check = new int[26];

    	int res = 1;
        for(int i = 0 ; i < s.length();i++) {
        	int cur = s.charAt(i) - 'a';
        	int curmax = 1;
        	for(int j = 0-k ; j <= k; j ++ ) {
        		if(j + cur >= 0 && j + cur < 26 ) {
        			curmax = Math.max(curmax, check[j + cur]+ 1);
        		}
        	}
        	check[cur] = curmax;
        	res = Math.max(res, curmax);
        
        }
        System.out.print(res);
           return res;
    }
    
    public static void main(String[] args) {
    	LongestIdealSubsequence cd  =new LongestIdealSubsequence();
    	cd.longestIdealString("acfgbd",2);
    	
    }
}
