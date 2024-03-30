package leetcode;

public class BuyTwoChocolates {
	  public int buyChoco(int[] prices, int money) {
	        int min = Math.min(prices[0], prices[1]);
	        int secondmin = Math.max(prices[0], prices[1]);
	        for(int i = 2 ;i < prices.length; i++)
	        {
	        	if(prices[i] < secondmin) {
	        		if(prices[i] < min) {
	        			secondmin = min;
		        		min = prices[i];
		        		
		        	}
	        		else {
	        			secondmin = prices[i];
	        		}
	        	}
	        }
	        int ans = money - min - secondmin;
	        return ans >= 0? ans : money;
	    }
}
