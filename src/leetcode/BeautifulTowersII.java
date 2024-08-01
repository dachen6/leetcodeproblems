package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BeautifulTowersII {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int len = maxHeights.size();
        int maxindex = 0;
        int max;
        int sum;
        for(int i = 0; i < len; i++)
        {
        	if(maxHeights.get(i) > maxHeights.get(maxindex)) {
        		maxindex = i;
        	}
        }
        max=  maxHeights.get(maxindex);
        sum = max;
        for(int i = maxindex -1; i >= 0; i--)
        {
        	max = Math.min(max,maxHeights.get(i));
        	sum += max;
        	
        }
        max=  maxHeights.get(maxindex);
        for(int i = maxindex +1; i< len-1; i++)
        {
        	max = Math.min(max,maxHeights.get(i));
        	sum += max;
        	
        }
        return sum;
    }
    
    public static void main(String[] args) {
    	BeautifulTowersII cd = new BeautifulTowersII();
    	List<Integer> maxHeights = new ArrayList<Integer>();
    	maxHeights.add(6);
    	maxHeights.add(5);
    	maxHeights.add(3);
    	maxHeights.add(9);
    	maxHeights.add(2);
    	maxHeights.add(7);
    	long asn = cd.maximumSumOfHeights(maxHeights );
    	System.out.print(asn);
    }
}
