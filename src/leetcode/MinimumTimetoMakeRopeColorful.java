package leetcode;

public class MinimumTimetoMakeRopeColorful {
	   public int minCost(String colors, int[] neededTime) {
		   int res = 0;
		   int curmax = neededTime[0];
	        for(int i = 0; i <neededTime.length-1;i++ ) {
	        	if(colors.charAt(i) ==colors.charAt(i + 1) ) {
	        		if(neededTime[i + 1] < curmax ) {
	        			res += neededTime[i + 1];
	        			
	        		}
	        		else {
	        			res += curmax;
	        			curmax = neededTime[i + 1];
	        		}
	        		
	        	}
	        	else {
	        		curmax = neededTime[i+1];
	        	}
	        }
	        return res;
	    }
	   
	   public static void main(String[] args) {
		   MinimumTimetoMakeRopeColorful cd  =new MinimumTimetoMakeRopeColorful();
		   int ans = cd.minCost("aaabbbabbbb", new int[] {3,5,10,7,5,3,5,5,4,8,1});
		   System.out.print(ans);
	   }
}
