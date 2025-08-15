package leetcode;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int right = 1;
        int left = 1;
        int cur = nums[0];
    while(right < nums.length){
        if(nums[right] > cur){
        	cur = nums[right];
        	nums[left] =  cur;
        	left++;
        	right++;
        	
        }
        else{
           right++;
        }
    }
    return left;
    }
    
    public static void main(String[] args) {
    	RemoveDuplicatesfromSortedArray cd = new RemoveDuplicatesfromSortedArray();
    	cd.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
    	
    }
}
