package leetcode;

import java.util.*;

public class InsertInterval {
	  public int[][] insert(int[][] intervals, int[] newInterval) {
	        boolean check = true;
			   List<int[]> list = new ArrayList<int[]>();
		        for(int i = 0;i < intervals.length;i++){      	
		           if(intervals[i][0] >newInterval[1] || intervals[i][1] <newInterval[0] ) {
		        	   list.add(intervals[i]);
		           }
	               
		           else {
	                   if(list.size() == 0){
	                         list.add( newInterval);
	                       continue;
	                   }
		        	     list.remove(list.size() -1);
		        	   newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
		        	   newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
		        	   list.add( newInterval);
		           }
		        }
		    
		        int[][] res = new int[list.size()][2];
		        for(int i = 0;i < res.length;i++){  
		        	res[i] = list.get(i);
		        }
		     return res;
		    }
	  
	  public static void main(String[] args) {
		  InsertInterval cd = new InsertInterval();
		  cd.insert(new int[][] {{1,3},{6,9}}, new int[] {2,5});
	  }
}
