package leetcode;

public class ValidPalindromeII {
	 public boolean validPalindrome(String s) {
	        char[] input = s.toCharArray();
	        int i = 0;
	        int j = input.length-1;
	        boolean check = false;
	        while(i <= j) {
	        	if(input[i] == input[j]) {
	        		 i++;
	                  j--;
	        		continue;
	        	}
	        	if(check) {
	        		return false;
	        	}
	        	else {
	        		check = true;
	        		if(input[i] == input[j-1] && input[i+1] == input[j]) {
		        		j-=2;
		        		i+=2;
		        	}
	        		else if(input[i] == input[j-1]) {
		        		j--;
		        	}
	        		else if(input[i+1] == input[j]) {
		        		i++;
		        	}
	        		else {
	        			return false;
	        		}
	        	}
	        }
	        return true;
	    }
	 
	 public static void main(String args[])
	 {
		 ValidPalindromeII cd= new ValidPalindromeII();
		 System.out.print( cd.validPalindrome("ececabbacec"));
		  cecabbacec
		 ececabbacec
		 ececabbace
		
	 }
}
