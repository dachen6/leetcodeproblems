package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathInZigzagLabelledBinaryTree {
	 public List<Integer> pathInZigZagTree(int label) {
		 List<Integer> result = new ArrayList<Integer>();
		 	int level = 0;
		 	int twos = 2;
		 	while(label > twos-1) {
		 		twos *=2;
		 		level += 1;
		 	}
		 
		 	int index = 0;
		 	if(level % 2 == 0) {
		 		index = label - twos/2;
		 	}
		 	else {
		 		index =  twos - label -1;
		 	}
		 	while(level>=0) {
		 		if(level % 2 == 0) {
		 			result.add(twos/2 + index) ;
		 		
			 	}
			 	else {
			 		result.add(twos -1- index) ;
			 	}
		 		index/= 2;
		 		twos/=2;
		 		level--;
		 	}
		 	  Collections.reverse(result);
		 	  System.out.print(result.toString());
		 	return result;
	    }
	 
	 public static void main(String[] args) {
		 PathInZigzagLabelledBinaryTree cd = new PathInZigzagLabelledBinaryTree();
		 cd.pathInZigZagTree(12);
	 }
}
