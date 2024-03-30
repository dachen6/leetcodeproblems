package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = nums2.length-1; i >=0 ; i --) {
        	while(!stack.empty()) {
        		if(nums2[i] >stack.peek() ) {
        			stack.pop();
        		}
        		else {
        			map.put(nums2[i], stack.peek());
        			break;
        		}
        	}
        	if(stack.empty()) {
        		map.put(nums2[i], -1);
        	}
        	stack.push(nums2[i]);
        }
        for(int i =0; i< nums1.length ; i++) {
        	nums1[i] = map.get(nums1[i]);
        	
        }
        return nums1;
    }
}
