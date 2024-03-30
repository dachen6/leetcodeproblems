package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BaseballGame {
	 public int calPoints(String[] ops) {
	        Stack<Integer> stack = new Stack<Integer>();
	        int sum = 0;
	        for(int i = 0; i < ops.length;i++) {
	        	if(ops[i].equals("C")) {
	        		sum -= stack.pop();
	        	}
	        	else if(ops[i].equals("D")) {
	        		stack.push(stack.peek() *2);
	        		sum +=stack.peek() *2;
	        	}
	        	else if(ops[i].equals("+")) {
	        		int first =stack.pop(); 
	        		int second = stack.peek(); 
	        		stack.push(first);
	        		stack.push(first + second);
	        		sum +=first + second;
	        	}
	        	else {
	        		int score = Integer.parseInt(ops[i]);
	        		stack.push(score);
	        		sum += score;
	        	}
	        }
	        return sum;
	    }
}
