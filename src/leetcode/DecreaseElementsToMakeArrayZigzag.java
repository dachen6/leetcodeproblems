package leetcode;

public class DecreaseElementsToMakeArrayZigzag {
    public int movesToMakeZigzag(int[] nums) {
    	if(nums.length <=1) {
    		return 0;
    	}
    	int res = 0;
        for(int i = 0; i < nums.length;i+=2) {
        	if(i == 0) {
        		res += Math.max(0, nums[i] - nums[i + 1]  +1);
        	}
        	else if(i == nums.length-1) {
        		res += Math.max(0, nums[i] - nums[i - 1]  +1);
        	}
        	else {
        		int cur = Math.max(nums[i] - nums[i - 1]  +1, nums[i] - nums[i + 1]  +1);
        		res += Math.max(0, cur);
        	}
        }
        
        int res2 = 0;
        for(int i = 1; i < nums.length;i+=2) {

        	if(i == nums.length-1) {
        		res2 += Math.max(0, nums[i] - nums[i - 1]  +1);
        	}
        	else {
        		int cur = Math.max( nums[i] -nums[i-1]  +1, nums[i] - nums[i+1]  +1);
        		res2 += Math.max(0, cur);
        	}
        }
        System.out.print(res);
        System.out.print(res2);
        return Math.min(res, res2);
        
        
    }
    
    public static void main(String[] args) {
    	DecreaseElementsToMakeArrayZigzag cd = new DecreaseElementsToMakeArrayZigzag();
    	cd.movesToMakeZigzag(new int[] {2,1,2});
    }
}
