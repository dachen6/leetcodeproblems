package leetcode;

public class ShortestSubarraywithSumatLeastK {
	  public int shortestSubarray(int[] nums, int k) {
	     int[] dp = new int[nums.length+1];
	     int start = 0;
	     int end = 0;
	     int result = Integer.MAX_VALUE;
	     boolean check = false;
	     for(int i = 0; i < nums.length;i++) {
	    	
	    	 dp[i+1] = Math.max(0,dp[i] + nums[i]);
	    	
	     }
	     int i = 1;
	     int j = 1;
	     int pos = Integer.MAX_VALUE;
	     while(j < nums.length+1) {
	    	
	    	  if(dp[j] >= k) {
	    		 check = true;
	    		 while(dp[j] - dp[i] >=k || pos>=dp[i]) {
	    			 result = Math.min(result, j -i);
	    			 
	    			 if(nums[i-1] >0) {
	    				 pos = dp[i];
	    			 }
	    			 i++;
	    			 System.out.println(pos);
	    		 }
	    		
	    		     		 
	    	 }
	    	  if(dp[j] == 0)
		    	 {
		    		 i = j; 		
		    	 }
	    	
	    		 j++;
	    	 
	     }
	     if(!check) {
	    	 return -1;
	     }
	     return result;
	    }
	  public static void main(String[] args) {
		  ShortestSubarraywithSumatLeastK cd  =new ShortestSubarraywithSumatLeastK();
			 
			 cd.shortestSubarray(new int[] {84,-37,32,40,95},167);
		 }
}
