package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {
	 public String simplifyPath(String path) {
		 String[] input = path.split("/");
		 Deque<String> deuqe = new LinkedList<String>();
		 for(int i = 0; i <input.length;i++ ) {
			 if(input[i].equals("..")) {
				 deuqe.pollLast();
			 }
			 else if(!input[i].equals(".") &&!input[i].equals("") ) {
				 deuqe.addLast(input[i]);
			 }
		 }
		 StringBuilder cur = new StringBuilder();
		 while(!deuqe.isEmpty()) {
			 cur.append("/" +deuqe.pollFirst());
		 }
		 if(cur.length() == 0) {
			 return "/";
		 }
         System.out.print(cur.toString());
		 return cur.toString();
	    }
	 
	 public static void main(String[] args) {
		 SimplifyPath cd = new SimplifyPath();
		 cd.simplifyPath("/../");
	 }
}
