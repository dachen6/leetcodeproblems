package leetcode;

import java.util.Arrays;

public class PowerofHeroes {
    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int[] help = new int[nums.length];
        help[0] = nums[0];
        help[1] = nums[0] +nums[1];
        for(int i = 2; i < nums.length;i++) {
        	help[i] = nums[i]+help[i-1] + help[i-2];
        }
        for(int i = nums.length-1; i >0;i--) {
        	ans+=nums[i] *nums[i]*help[i];
        }
        ans += nums[0] * nums[0] *nums[0];
        return ans;
    }
    
    public static void main(String[] args) {
    	PowerofHeroes cd= new PowerofHeroes();
    	cd.sumOfPower(new int[] {2,1,4});
    }
}
