package leetcode;

import java.util.Arrays;

public class MinimizetheMaximumDifferenceofPairs {
	   public int minimizeMax(int[] nums, int p) {
		   if(p == 0) {
			   return 0;
		   }
		   Arrays.sort(nums);
		   int len = nums.length;
	        int[] fp = new int[len];
	        fp[0] = Integer.MAX_VALUE;
	        for(int i = 1 ;i < len; i ++) {
	        	fp[i] = Math.min(nums[i] - nums[i-1],fp[i-1] );
	        	
	        }
	        for(int i = 1 ;i < p; i ++) {
		        for(int j = i*2 +1 ;j < len; j ++) {
		        System.out.print(nums[j] - nums[j-1] + "   " + fp[j-2]+ "    "+fp[j-1] + "+" +(j ==i*2 +1? Integer.MAX_VALUE:fp[j-1]) + "\n" );
		        	fp[j] = Math.min(Math.max(nums[j] - nums[j-1] ,fp[j-2] ),j ==i*2 +1? Integer.MAX_VALUE:fp[j-1]  );
		        }
	        }
	        return fp[len-1];
	    }
	   
	   public static void main(String[] args)
	   {
		   MinimizetheMaximumDifferenceofPairs cd = new MinimizetheMaximumDifferenceofPairs();
		   int ans = cd.minimizeMax(new int [] {7,7,16,7,7,2,6,5,5,0}, 3);
		   System.out.print(ans);
	   }
}
