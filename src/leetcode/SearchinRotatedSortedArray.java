package leetcode;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
		int left = 0;
	 	int right = nums.length-1;
	 	
	 	while(left <= right) {
	 		int mid = left + (right - left)/2;
	 		System.out.print( "current number"+nums[mid]);
	 		if(nums[mid] == target) {
	 			return mid;
	 		}
	
	 		else if( nums[left] < nums[mid] && nums[left] <= target && target < nums[mid] || nums[left] > nums[mid]  && nums[left] <= target ) {
	 			right = mid-1;

	 		}
	 		else {
	 			left = mid+1;
	 		}
	 		
	 	}
	 	return -1;
    }
    
    public static void main(String[] args) {
    	SearchinRotatedSortedArray cd  = new SearchinRotatedSortedArray();
    	cd.search(new int[] {5,1,2,3,4}, 1);
    }
}
