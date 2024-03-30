package leetcode;

import java.util.Arrays;

public class FindtheClosestPalindrome {
	 public String nearestPalindromic(String n) {
		 	char[] input = n.toCharArray();
		 	int[] cur = new int[n.length()];
		 	int[] target = new int[n.length()];
		 	int[] up = new int[n.length()+1];
			int[] down = new int[n.length()];
			boolean check = true;
		 	for(int i = 0;i < input.length;i++) {
		 		cur[i] = input[i] - '0';
		 		up[i+1] = input[i] - '0';
		 		down[i] = input[i] - '0';
		 		target[i] = input[i] - '0';
		 	}
		 	int i = (input.length/2);
		 	while(check){	
		 		up[i+1] = up[i+1]+1;
		 		if(up[i+1] == 10) {
		 			up[i+1] = 0;
		 			i--;
		 			continue;
		 		}
		 		check = false;
		 	}
		 	 i = (input.length/2);
		 	check = true;
		 	while(check){	
		 		down[i] = down[i]-1;
		 		if(down[i] == -1) {
		 			down[i] = 9;
		 			i--;
		 			continue;
		 		}
		 		check = false;
		 	}
			int targetint = toInt(target);
			int[] curval =vaild(cur);
		 	int[] upval =  vaild(up);
		 	int[] downval = vaild(down);
		 	int curnum =Math.abs(targetint- toInt(curval));
		 	int upnum = Math.abs(targetint- toInt(upval));
		 	int downnum = Math.abs(targetint- toInt(downval));
		 	if(downnum > upnum) {
		 		downval = upval;
		 		downnum = upnum;
		 	}
		 	if(curnum!= 0 && curnum < downnum) {
		 		downval = curval;
		 		downnum = curnum;
		 	}
		 	System.out.print(Arrays.toString(downval));
		 	return Integer.toString(toInt(downval));
		 			
		 	
	    }
	 
	 public int[] vaild(int[] array) {
		 int start = array[0] == 0? 1: 0;
		 int end = array.length-1;
		 while(start< end) {
			 array[end--] = array[start++]; 
		 }
		 return array;
		
	 }
	 
	 public int toInt(int[] array)
	 {
		 int result = 0;

		 for(int i = 0; i < array.length;i++) {
				result*=10;
				 result+=array[i];
			 }
			 return result;
	 }
	 
	 public static void main(String[] args) {
		 FindtheClosestPalindrome cd =new FindtheClosestPalindrome();
		 cd.nearestPalindromic("1");
	 }
}
