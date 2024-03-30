package leetcode;

public class ReverseVowelsofaString {
	  public String reverseVowels(String s) {
	        char[] input = s.toCharArray();
	        int i = 0;
	        int j = input.length-1;
	        while(i < j) {
	        	while(i < input.length && !check(i, input) ) {
	        		i++;
	        	}
	        	while(j >=0 && !check(j, input) ) {
	        		j--;
	        	}
	        	if(i < j) {
	        		swap(i,j,input);
	        		i++;
	        		j--;
	        	}
	        
	        }
	        
	        return  new String(input);
	    }
	  
	  boolean check(int i,char[] input ) {
		  return input[i] =='a' ||input[i] =='e' ||input[i] =='i' ||input[i] =='o' ||input[i] =='u';
	  }
	  
	  void swap(int i, int j,char[] input ) {
		  char temp = input[i];
		  input[i] = input[j];
		  input[j] = temp;
	  }
}
