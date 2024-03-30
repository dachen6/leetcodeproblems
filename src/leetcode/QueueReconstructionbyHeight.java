package leetcode;

import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueReconstructionbyHeight {
	  public int[][] reconstructQueue(int[][] people) {
	       Arrays.sort(people,(a,b)->{
	           return a[0]==b[0]?a[1]-b[1]:b[0]-a[0];
	       });
	       List<int[]>list=new ArrayList<>();
	       for(int[] i:people){
	           list.add(i[1],i);
	       };
	       return list.toArray(new int[list.size()][]);
	    } 
	 
	 
	 public static void main(String[] args)
	 {
		 QueueReconstructionbyHeight cd = new QueueReconstructionbyHeight();
		 int[][] input = {{0,0},{6,0},{1,1},{5,1},{5,2},{4,3},{7,0},{6,2},{5,5},{6,3}};
		 cd.reconstructQueue(input);
	 }
}
