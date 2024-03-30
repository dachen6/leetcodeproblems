package leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int res = 0;
        
        while(left < right) {
        	
        	res = Math.max(res, (right - left) * Math.min(height[right], height[left]));
        	if(height[right]> height[left]) {
        		left++;
        	}
        	else {
        		right --;
        	}
        }
        return res;
    }
}
