package leetcode;

public class ValidAnagram {
	 public boolean isAnagram(String s, String t) {
	        int[] check = new int[26];
			char[] schar = s.toCharArray();
			char[] tchar = t.toCharArray();
			for(int i = 0; i < schar.length;i++) {
				check[schar[i] - '0']++;
			}
			for(int i = 0; i < tchar.length;i++) {
				check[tchar[i] - '0']--;
			}
			for(int i = 0; i < 26;i++) {
				if(check[i] != 0) {
					return false;
				}
			}
			return true;
	    }
}
