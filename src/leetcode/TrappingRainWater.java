package leetcode;

public class TrappingRainWater {
	 public int trap(int[] height) {
		  int left = 0;
	        int right = height.length-1;
	        int lmax = height[0];
	        int rmax = height[right];
	        int res = 0;
	        
	        while(left < right) {
	        	
	        	if(height[left] < height[right]) {
	        		lmax = Math.max(lmax, height[left] );
	        		res += lmax - height[left];
	        		left++;
	        	}
	        	else {
	        		rmax = Math.max(rmax, height[right] );
	        		res += rmax - height[right];
	        		right++;
	        	}
	        }
	        return res;
	    }
}
