package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class SlidingWindowMaximum {
	 public int[] maxSlidingWindow(int[] nums, int k) {
		 Deque<Integer> number = new ArrayDeque<>();
		 int i;
		 
		 int[] ans = new int[nums.length - k +1];
		 for(i=0;i < nums.length;i++) {
			 
			 while(number.size() != 0 && nums[number.peekLast()] < nums[i]   ) {
				 number.pollLast();
			 }
			 if( number.size() != 0 && i -number.peekFirst()> k-1 ) {
				 number.pollFirst();
			 }
			 number.addLast(i);
			
			 if(i> k-2) {
				 ans[i - k+1] = nums[number.peekFirst()];
			 }
			
		 }
		 System.out.print(Arrays.toString(ans));
		 return ans;
	    }
	 public static void main(String[] arg) {
		 SlidingWindowMaximum cd  = new SlidingWindowMaximum();
		  int[] input = new int[]{1,3,1,2,0,5};
		  cd.maxSlidingWindow(input,3);
	  }
}
