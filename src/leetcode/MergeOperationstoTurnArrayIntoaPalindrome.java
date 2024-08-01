package leetcode;

public class MergeOperationstoTurnArrayIntoaPalindrome {
    public int minimumOperations(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int count =0;
        while(start <= end) {
        	if(nums[start] == nums[end]) {
        		start++;
        		end--;
        	}
        	else if(nums[start] > nums[end]){
        		end--;
        		nums[end] += nums[end+1];
        		count++;
        	}
        	else {
        		start++;
        		nums[start] += nums[start-1];
        		count++;
        	}
        }
        return count;
    }
    
    public static void main(String[] args) {
    	MergeOperationstoTurnArrayIntoaPalindrome cd = new MergeOperationstoTurnArrayIntoaPalindrome();
    	cd.minimumOperations(new int[] {4,3,2,1,2,3,1});
    }
}
