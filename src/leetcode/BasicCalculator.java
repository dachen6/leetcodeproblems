package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BasicCalculator {
	public int calculate(String s) {
		int count = 0;
		char[] input = s.toCharArray();
		Stack<Integer> number = new Stack<Integer>();
		number.push(0);

		Stack<Character> sign = new Stack<Character>();
		sign.push('+');
		boolean digit = false;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == ')') {
				int cur = number.pop();
				int prev = number.pop();
				char prevSign = sign.pop();
			
				if (prevSign == '+') {
					number.push(cur + prev);
				} else {
					number.push(prev - cur);
				}
				sign.pop();
				digit = false;
			} else if (input[i] == ' ') {
				digit = false;
			} 
			else if (input[i] == '(') {
				sign.push('(');
				digit = false;
				
			}
			else if (input[i] == '+' || input[i] == '-'){
				if(number.size()!= 1) {
					
					
					char prevSign = sign.pop();
 					if (prevSign == '+') {
 						int cur = number.pop();
 						int prev = number.pop();
						number.push(cur + prev);
					} else if(prevSign == '+'){
						int cur = number.pop();
						int prev = number.pop();
						number.push(prev - cur);
					}
					else {
						sign.push('(');
					}
					sign.push(input[i]);
				}	
				digit = false;
				
			}
			
			
			else {
				int cur = input[i] - '0';
				if (digit == true) {

					number.push(number.pop() * 10 + cur);

				}

				else {
					number.push( cur);
				}
				digit = true;
			}
			System.out.println(number.toString());
			System.out.println(sign.toString());
		}
		int cur = number.pop();
		int prev = number.pop();
		
		char prevSign = sign.pop();
		if (prevSign == '+') {
			number.push(cur + prev);
		} else {
			number.push(prev - cur);
		}
			System.out.println(number.toString());
			System.out.println(sign.toString());
		return number.pop();
	}

	public static void main(String[] args) {
		BasicCalculator cd = new BasicCalculator();
		int res = cd.calculate("(1)");
		System.out.print(res);
	}
}
