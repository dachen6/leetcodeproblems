package leetcode;

public class MinimumSwapstoGroupAll1sTogetherII {
	public int minSwaps(int[] nums) {
        int totalzero = 0;
        int l = nums.length;
        int maxzero = 0;
        int curzero = 0;
        int count = 0;
        for(int i = 0;i < l;i++) {
        	if(nums[i] == 1) {
        		count++;
        	}
        	
        }
        if(count == l || count == 0){
            return 0;
           }
        int startone = 0;
        while( startone < l && nums[startone] == 0 ) {
        	startone++;
        } 
        
           if(startone == l){
            return 0;
           }
           if(startone == 0) {
        	   int j = l-1;
        	   while(nums[j] == 1) {
        		   startone = j;
        		   j--;
        	   }
           }


        if(startone == l){
            return 0;
           }
     
        int max1 = 0;
        int cur1 = 0;
        for(int i = startone;i < count +startone;i++) {
        	if(nums[i%l] == 1) {
        	  	max1++;
            	cur1++;
        	}
      
        }
        for(int i = startone + count;i < l + startone ;i++) {
        	if(nums[i%l] == 1) {
        		cur1++;
        	}
        	if(nums[(i - count)%l] == 1) {
        		cur1--;
        	}
        	max1 = Math.max(max1, cur1);
        	
        }
        return count - max1;
    }
    
    public static void main(String[] args) {
    	MinimumSwapstoGroupAll1sTogetherII cd = new MinimumSwapstoGroupAll1sTogetherII();
		  int ans = cd.minSwaps(new int[]{0,1,0,1,1,0,0});
		  System.out.print(ans);
	  }
}
