package leetcode;

import java.util.HashSet;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if(nums.length <= 1){
    		return false;
    	}
    	HashSet<Integer> set=  new HashSet();
    	int i;
        for( i= 0 ; i <= k && i < nums.length; i ++) {
        	if(!set.add(nums[i])) {
        		return true;
        	}
        }
        for(; i < nums.length; i ++) {
        	set.remove(nums[i-k-1]);
        	if(!set.add(nums[i])) {
        		return true;
        	}
        	
        }
        return false;
        
    }
    
    public static void main(String[] args) {
    	ContainsDuplicateII cd = new ContainsDuplicateII();
    	cd.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2 );
    	
    }
}
