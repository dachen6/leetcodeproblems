package leetcode;

public class StringtoIntegeratoi {
    public int myAtoi(String s) {
        long res = 0;
        int n = s.length();
        boolean start = false;
        boolean neg = false;
        for(int i = 0; i < n;i++) {
        	char c = s.charAt(i);
        	if(c!= '+' || c!= '-' || c>'9' && c < '0' || c !=' ' ) {
        		if(res > Integer.MAX_VALUE) {
        			return Integer.MAX_VALUE;
        		}
        		else if(res < Integer.MIN_VALUE) {
        			return Integer.MIN_VALUE;
        		}
        		return (int)res;
        	}
        	else if(c ==' ') {
        		continue;
        	}
        	else if(c== '-' ) {
        		neg = true;
        	}
        }
    }
}
