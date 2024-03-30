package leetcode;

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
    	int diff = nums[1] - nums[0];
    	int ans = 0;
    	int temp = 0;
    	int help =0;
        for(int i = 2; i < nums.length; i++) {
        	if(nums[i] - nums[i-1] == diff) {
        		help ++;
        		temp+= help;
        	}
        	else {
        		ans += temp;
        		temp = 0;
        		 help = 0;
        		 diff = nums[i] - nums[i-1];
        	}
        	
        }
    	ans += temp;
		temp = 0;
		 help = 0;
        return ans;
    }
    
    public static void main(String[] args) {
    	ArithmeticSlices cd  = new ArithmeticSlices();
    	int ans = cd.numberOfArithmeticSlices(new int[] {1,2,3,4});
    	System.out.print(ans);
    }
}
