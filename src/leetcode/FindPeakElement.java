 package leetcode;

public class FindPeakElement {
	 public int findPeakElement(int[] nums) {
			int left = 0;
		 	int right = nums.length-1;
		 	
		 	while(left < right-1) {
		 		int mid = left + (right - left)/2;
		 		if( nums[mid-1] < nums[mid] && nums[mid +1] < nums[mid] ) {
		 			return mid;
		 		}
		 		if(nums[mid-1] < nums[mid]) {
		 			left = mid+1;
		 		}
		 		else {
		 			right = mid-1;
		 		}
		 		
		 	}
		 	return nums[left] > nums[right]? left:right;
	    }
}
