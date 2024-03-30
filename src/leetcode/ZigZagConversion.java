package leetcode;

import java.util.Arrays;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		int len = s.length();
		if (numRows <= 1 || numRows > len) {
			return s;
		}

		char[] input = s.toCharArray();
		char[] result = new char[len];
		int i = 0;
		int[] top = new int[(len-1) / ((numRows-1) *2) +1];
		for (int j = 0; j < top.length; j++) {
			top[j] = 0 + j * (numRows - 1) * 2;
			result[i++] = input[top[j]];
		}
		int count = 0;
		while (i < len) {
			count++;
			int count2 = (numRows - 1) * 2 - count;

			for (int j = 0; j < top.length; j++) {
				if (top[j] + count < len) {
					result[i++] = input[top[j] + count];
				}
				if (count == count2) {

					continue;
				}
				if (top[j] + count2 < len) {
					result[i++] = input[top[j] + count2];

				}
			}

		}
		return new String(result);
	}

	public static void main(String[] args) {
		ZigZagConversion cd = new ZigZagConversion();
		cd.convert("abcd", 2);
	}
}
