package leetcode;

public class MinimumSwapstoGroupAll1sTogether {
    public int minSwaps(int[] data) {
    	int count = 0;
        for(int i = 0;i < data.length;i++) {
        	if(data[i] == 1) {
        		count++;
        	}
        	
        }
        int max1 = 0;
        int cur1 = 0;
        for(int i = 0;i < count;i++) {
        	if(data[i] == 1) {
        	  	max1++;
            	cur1++;
        	}
      
        }
        for(int i = count;i < data.length;i++) {
        	if(data[i] == 1) {
        		cur1++;
        	}
        	if(data[i - count] == 1) {
        		cur1--;
        	}
        	max1 = Math.max(max1, cur1);
        	
        }
        return max1;
    }
}
