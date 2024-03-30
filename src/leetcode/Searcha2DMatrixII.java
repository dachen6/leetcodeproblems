package leetcode;

public class Searcha2DMatrixII {
	 public int backPackV(int[] nums, int target) {
	        int index = 0;
	        int[] result = new int[1];
	        helper(nums, target, index,result);
	        return result[0];
	    }

	    public void helper(int[] nums, int target, int index ,int[] result ){
	        if(target < 0 ){
	        	return;
	        }
	        if( index == nums.length){
	        	if(target == 0) {
	        		result[0] += 1;
	        	}
	        	
	        	return;
	        }
	      
	      
	        	helper(nums, target - nums[index], index+1, result);
	        	helper(nums, target, index+1, result);
	        
	    }
	    
	    public static void main(String arg[]) { 
	    	Searcha2DMatrixII cd = new Searcha2DMatrixII();
	    	cd.backPackV(new int[] {1,2, 3,3,7}, 7);
	    }
}
