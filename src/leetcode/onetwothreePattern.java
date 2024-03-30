package leetcode;

public class onetwothreePattern {
	public boolean find132pattern(int[] nums) {
	        int first = Integer.MAX_VALUE;
	        int second = Integer.MIN_VALUE;	
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;	
	       
	        for(int i = 0; i < nums.length;i++) {
	        	
	        	if(nums[i] < max && nums[i] > min) {
	        		return true;
	        	}
	        	if(nums[i] < first)
	        	{
	        		first = nums[i];
	        	}
	        	if(nums[i] > second)
	        	{
	        		second = nums[i];
	        		if(first <= min && second >= max) {
	        			min= first;
	        			max = second;
	        		}
	        	}
	        
	        }
	        System.out.print(false);
	        return false;
	    }
	
	public static void main(String[] args) {
		onetwothreePattern cd = new onetwothreePattern();
		cd.find132pattern(new int[] {1,4,0,-1,-2,-3,-1,-2});
	}
}
