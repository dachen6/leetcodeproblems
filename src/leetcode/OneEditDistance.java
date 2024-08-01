package leetcode;

public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
    	if(s.length() > t.length()) {
        	String temp = s;
        	s = t;
        	t = temp;
        }
        int sl = s.length();
        int tl = t.length();
        if(Math.abs(tl - sl) >1) {
        	return false;
        }
        if(tl == sl) {
        	int count = 0;
         	for(int i = 0; i < sl; i++) {
        		if(s.charAt(i) != t.charAt(i) ) {
        			count++;
        		}
        		if(count>1) {
        			return false;
        		}
        	}
         	return count != 0;
        }
        int count = 0;
        int j = 0;
    	for(int i = 0; i < sl; i++, j++) {
    		if(s.charAt(i) != t.charAt(j) ) {
    			i--;
    		}
    		if(j - i >1) {
    			return false;
    		}
    	}
    	return true;
    }
    public static void main(String[] args) {
    	OneEditDistance cd = new OneEditDistance();
		 boolean ans = cd.isOneEditDistance("ab","acd");
		 System.out.print(ans);
	  }
}
