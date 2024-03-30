package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		 HashMap<Character, String> map = new HashMap<Character, String>();
		 HashMap<Character, String> map2 = new HashMap<Character, String>();
		 HashSet<String> contain = new HashSet<String>();
		 char[] patterns = pattern.toCharArray();
		 char[] target = s.toCharArray();
		 int start = 0, end = 0;
		 for(int i = 0; i < patterns.length;i++) {
			 if(start >= target.length) {
				 System.out.print("1");
				 return false;
			 }
			 while(end+1< target.length  &&  target[end+1] != ' ' ) {
				 end++;
			 }
			 String curmatch = map.get(patterns[i]);
			 String curtarget =new String(target, start, end-start+1);
			
			 if(curmatch == null) {
				 if(!contain.add(curtarget)) {
					 System.out.print("5");
					 return false;
				 }
				 map.put(patterns[i], curtarget);
			 }
			 else if(!curtarget.equals(curmatch))
			 {
				 System.out.print("2");
				 return false;
			 }
			 start = end = end +=2;
		 }
		 if(start != s.length()+1) {
			 System.out.print("3");
			 return false;
		 }
		 System.out.print("4");
		 return true;
		
		 
    }
	
	
	public static void main(String[] args) {
		WordPattern cd =new WordPattern();
		cd.wordPattern("abba","dog dog dog dog");
	}
}
