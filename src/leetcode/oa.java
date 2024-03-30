package leetcode;

import java.util.Arrays;
import java.util.List;

public class oa {
	 boolean solution(String s) {
	      char a ='\\';
	      String b = "\\";
	      return a == b.charAt(0);
	    }

	    public static void main(String[] args) {
	        oa lzr = new oa();
	        String s = "sample";
	        boolean res = lzr.solution(s);
	        System.out.print(res);
	    }
}
