package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
	 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 
		 List<Boolean> res = new ArrayList<>(); 
	     
		 int max = candies[0];
	        
	        for(int i = 0 ; i < candies.length; i++){
	          
	             max = Math.max(candies[i], max);
	        }
	         for(int i = 0 ; i < candies.length; i++){
	          
	        	 res.add(max -candies[i] <= extraCandies );
	        }
	        return res;
	    }
}
