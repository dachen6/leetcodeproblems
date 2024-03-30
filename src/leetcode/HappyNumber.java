package leetcode;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n != 1) {
        	if(!set.add(n)) {
        		return false;
        	}
        	int nextsum = 0;
        	while(n > 0 ) {
        		int last = n%10;
        		nextsum += last * last;
        		n /= 10;
        	}
        	n = nextsum;
        }
        return true;
    }
    
    public static void main(String[] args) {
    	HappyNumber cd = new HappyNumber();
    	boolean ans =cd.isHappy(19);
    	System.out.print(ans);
    }

}
