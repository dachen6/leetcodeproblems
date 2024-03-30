package leetcode;

import java.util.Stack;

public class DecodeString {
	public String decodeString(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] input = s.toCharArray();
		int index = 0;
		while (index < s.length()) {
			if (input[index] == ']') {
				StringBuilder sb = new StringBuilder();
				while (stack.peek() != '[') {
					sb.append((char) stack.pop());
				}
				stack.pop();
				int count = 0;
				int tens = 1;
				while (!stack.empty() && stack.peek() >='0' && stack.peek() <= '9') {
					count += tens * (stack.pop() - '0');
					tens *= 10;
				}
				s.repeat(3);
				for (int i = 0; i < count; i++) {
					for (int j = sb.length() - 1; j >= 0; j--) {
						stack.push(sb.charAt(j));
					}
				}
			} else {
				stack.add(input[index]);
			}
			index++;
		}

		StringBuilder sb = new StringBuilder();
		System.out.print( sb.reverse().toString());
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		DecodeString cd = new DecodeString();
		cd.decodeString("10[abc]");
	}
}
