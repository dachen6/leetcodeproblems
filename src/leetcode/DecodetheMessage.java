package leetcode;

import java.util.*;

public class DecodetheMessage {
	  public String decodeMessage(String key, String message) {
		  char[] code = new char[26];
		  Set<Character> used = new HashSet<Character>();
		  for(int i = 0; i < key.length(); i++) {
			  int cur= key.charAt(i)  -'a';
			  if(cur >= 0 && cur <= 25) {
				  if(used.add(key.charAt(i))) {
					  code[cur] = (char)(used.size() -1 + 'a');
				  }
			  }
		  }
		  StringBuilder sb  =new StringBuilder();
		  for(int i = 0; i < message.length(); i++) {
			if(message.charAt(i) == ' ') {
				sb.append(' ');
				
			}
			else {
				 int cur= message.charAt(i)  -'a';
				sb.append(code[cur]);
			}
		  }
		  return sb.toString();
	    }
}
