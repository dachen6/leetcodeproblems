package leetcode;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length/3;
        int[][] ans = new int[n][3];
        for(int i = 0; i <n;i++ )
        {
        	 for(int j = 0; j <3;j++ )
             {
             	ans[i][j] = nums[i*3+j];
             	if(j != 0 && nums[i*3+j]-nums[i*3+j-1] > k ) {
             		return new int[0][0];
             	}
             }
        }
        return ans;
    }
}
