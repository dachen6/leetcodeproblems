package leetcode;

public class validPartition {
	 public boolean validPartition(int[] nums) {
	        boolean[] check = new boolean[nums.length+1];
	        check[0] = true;
	        if(nums[0] == nums[1]) {
	        	check[2] = true; 
	        }
	        for(int i = 2; i < nums.length;i++) {
	        	if(nums[i] == nums[i - 1] && nums[i - 2] == nums[i - 1] || 
	        		nums[i] == nums[i - 1] + 1 && nums[i - 2] == nums[i - 1] -1 ) {
	        		check[i+1] |= check[i-2];
	        	}
	        	if(nums[i] == nums[i - 1] ) {
	        		check[i+1] |= check[i-1];
	        	}
	        }
	        return check[check.length -1];
	    }
}
