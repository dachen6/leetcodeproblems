package leetcode;

public class FirstMissNumber {
	public int firstMissingPositive(int[] nums) {
        int i = 0;
		while(i < nums.length) {
			int cur = nums[i];
			if(cur == i+1 || cur < 1 || cur >= nums.length || nums[cur-1] == cur) {
				i++;
			}
			else {
				nums[i] = nums[cur -1];
				nums[cur -1] = cur;
				
			}
        }
		
		
		for(i = 0; i < nums.length; i++) {
			if(nums[i] != i+1) {
				return i;
			}
		}
		return nums.length;
		
    }
	
	
}
