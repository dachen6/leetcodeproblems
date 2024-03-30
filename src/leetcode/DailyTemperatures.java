package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		 Deque<Integer> stack = new LinkedList<Integer>();
		int len =  temperatures.length;
		 int[] result = new int[len]; 
		 for(int i = len-1; i>= 0; i-- ) {
			 
			 while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peekLast()] ) {
				 stack.pollLast();
			 }
			 result[i] = stack.isEmpty()? 0: stack.peekLast()-i;
			 stack.addLast(i);
		 }
		 return result;
	    }
	
	
	public static void main(String[] args) {
		DailyTemperatures cd = new DailyTemperatures();
		cd.dailyTemperatures(new int[] {73,74,75,71,69,72,76,73});
		
	}
}
