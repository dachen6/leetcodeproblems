package leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

public class XofaKindinaDeckofCards {
	  public boolean hasGroupsSizeX(int[] deck) {
	        HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
	        
	        for(int i = 0; i < deck.length;i++) {
	        	if(hp.containsKey(deck[i])) {
	        		int count = hp.get(deck[i]);
	        		hp.put(deck[i], count+1);
	        	}
	        	else {
	        		hp.put(deck[i], 1);
	        	}
	        }
	        Object[] num =  hp.values().toArray();
	        if(num.length == 1 || num.length == 0) {
	        	return true;
	        }
	        int gys = 0;
	        for(int i = 2; i <= (int)num[0];i++) {
	        	if(i %(int)num[0] == 0 &&i %(int)num[1] == 0 ) {
	        		gys = i;
	        		break;
	        	}
	        }
	        if(gys == 0) {
	        	return false;
	        }
	        for(int i = 2; i < num.length;i++) {
	        	if(gys % (int)num[i] != 0) {
	        		return false;
	        	}
	        }
	        
	        return true;

	    }
	  
	  public static void main(String[] args) {
		  XofaKindinaDeckofCards cd  =new XofaKindinaDeckofCards();
		  cd.hasGroupsSizeX(new int[] {1,2,3,4,4,3,2,1});
	  }
}
