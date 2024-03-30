package leetcode;

import java.util.*;

public class NumberofPeopeAwareofaSecret {
	   public int peopleAwareOfSecret(int n, int delay, int forget) {
	    	List<Long> list = new ArrayList<Long>();
	    	list.add((long)1);
	    	long res = 1;
	    	long share = 0;
	    	for(int i = 1; i < forget; i++) {
	    		list.add((long)0);
	    	}
	    	
		   for(int i = 1; i < n ;i++) {
			   share-=list.get(forget-1);
			   share += list.get(delay-1);
			   res -= list.get(forget-1);
			   list.add(0, share);
			   res +=share;
			   res %= 1000000007;
			 //  System.out.println(share + "      share    " + res + "     res     ");
		   }
		   return (int)res % 1000000007;
	    }
	   
	   
	   public static void main(String[] args) {
		   NumberofPeopeAwareofaSecret cd = new NumberofPeopeAwareofaSecret();
		   int res = cd.peopleAwareOfSecret(684, 18, 496);
		   System.out.print(res);
	   }
			   
}
