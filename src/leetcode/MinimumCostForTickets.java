package leetcode;

public class MinimumCostForTickets {
	   public int mincostTickets(int[] days, int[] costs) {
	        int seven = 0;
	        int thrity = 0;
	        int[] payment = new int[days.length+1];
	        for(int i = 0; i < days.length;i++) {
	        	while(days[i] - days[seven] > 6) {
	        		seven++;
	        	}
	        	while(days[i] - days[thrity] > 29) {
	        		thrity++;
	        	}
	        	payment[i+1] = Math.min(payment[i] + costs[0], payment[seven] + costs[1]);
	        	payment[i+1] = Math.min(payment[i+1], payment[thrity ] + costs[2]);
	        }
	        return payment[payment.length-1];
	    }
}
