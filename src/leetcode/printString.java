package leetcode;

import java.util.ArrayList;
import java.util.List;

public class printString {
	List<String> list = new ArrayList<String>();
	
	 public void trap(String[] input) {
		 StringBuilder sb = new StringBuilder();
		  helper(0, input,  sb);
	    }
	 
	 public void helper(int index , String[] input,StringBuilder sb) {
		  if(index == input.length) {
			  list.add(sb.toString());
			  return;
		  }
		  char[] cur = input[index].toCharArray();  
		  for(int i = 0; i < cur.length;i++) {
			  sb.append(cur[i]);	 
			  helper(index + 1, input, sb);
			  sb.deleteCharAt(index);
		  }
		
		 
	    }
	 
	 public static void main(String[] args) {
		 printString cd  = new printString();
		 String[] input = new String[4];
		 input[0] = "abcd";	 
		 input[1] = "qwer";
		 input[2] = "zxcv";
		 input[3] = "hjklp";
		 
		 cd.trap(input);
		 
	 }
}
