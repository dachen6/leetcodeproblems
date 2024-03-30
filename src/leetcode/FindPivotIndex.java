package leetcode;

public class FindPivotIndex {
	 public int pivotIndex(int[] nums) {
	        int[] check = new int[nums.length+1];
	        int sum = 0;
	        for(int i = nums.length-1; i >= 0;i--)
	        {
	            check[i] = nums[i] + check[i+1];
	        }
	          for(int i = 0; i < check.length;i++)
	        {
	        	  sum += nums[i];  
	           if(check[i] == sum) {
	        	   return i;
	           }
	         
	        }
	          return -1;
	    }
	 
	 public static void main(String[] args) {
		 FindPivotIndex cd = new FindPivotIndex();
		 cd.pivotIndex(new int[] {1,7,3,6,5,6});
	 }
}
