package leetcode;

public class MinimumAdjacentSwapstoMakeaValidArray {

    public int minimumSwaps(int[] nums) {
    	if(nums.length == 1) {
    		return 0;
    	}
    	int small = Integer.MAX_VALUE;
    	int large = -1;
    	int largeindex = 0;
    	int smallindex = 0;
    	int l = nums.length;
    	for(int i = 0; i < nums.length;i++) {
        	if(nums[i] >= large) {
        		largeindex = i;
        		large = nums[i];
        	}
          	if(nums[l-i-1] <= small) {
          		smallindex = l-i-1;
          		small = nums[l-i-1] ;
        	}
          	System.out.println("l   " + large +  "  li   " + largeindex + "  s   " + small + "  si   " + smallindex);
        }
        int ans = l-1-largeindex + smallindex;
        if(smallindex >  largeindex) {
        	ans--;
        }
        return ans;
    }
    
    public static void main(String[] args)
    {
    	MinimumAdjacentSwapstoMakeaValidArray cd  = new MinimumAdjacentSwapstoMakeaValidArray();
    	cd.minimumSwaps(new int[] {3,4,5,5,3,1});
    }
}
