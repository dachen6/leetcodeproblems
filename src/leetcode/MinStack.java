package leetcode;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack;
	Stack<Integer> minstack;
	 public MinStack() {
		 stack= new Stack<Integer>();
	      minstack = new Stack<Integer>();
	    }
	    
	    public void push(int val) {
	    	stack.push(val);
	    	if(minstack.size() == 0 ||minstack.peek() >val ) {
	    		minstack.push(val);
	    	}
	    	else {
	    		minstack.push(minstack.peek());
	    	}
	    }
	    
	    public void pop() {
	    	stack.pop();
	    	minstack.pop();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	    	return minstack.peek();
	    }
	    
	    public static void main(String args[]) {
	    	MinStack cd = new MinStack();
	    	//"MinStack","push","push","push","getMin","pop","top","getMin
	    	cd.push(-2);
	    	cd.push(0);
	    	cd.push(-3);
	    	cd.getMin();
	    	cd.pop();
	    	cd.top();
	    	cd.getMin();
	    }
}
