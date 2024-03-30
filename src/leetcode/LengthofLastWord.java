package leetcode;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		char[] input = s.toCharArray();
		int ans = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i] != ' ') {
				for (int j = i; j >= 0; j--) {
					if (input[j] != ' ') {
						ans++;
					} else {
						return ans;
					}
				}
				return ans;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		LengthofLastWord cd = new LengthofLastWord();
		cd.lengthOfLastWord("day");
	}
}
