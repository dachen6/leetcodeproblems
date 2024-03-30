package leetcode;

import java.util.Stack;

public class partical {
	public int[] Pareical(int[] p) {
		Stack<Integer> stack = new Stack<Integer>();
		int cur = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] > 0) {
				stack.add(p[i]);
			} else {
				while (!stack.isEmpty() && stack.peek() + p[i] < 0) {
					cur = stack.pop();
				}
				if (stack.isEmpty() || stack.peek() < 0) {
					stack.add(p[i]);
				} else if (stack.peek() + p[i] == 0) {
					cur = stack.pop();
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		partical cd = new partical();
		cd.Pareical(new int[] { 5, 5, -10 });
	}
}
