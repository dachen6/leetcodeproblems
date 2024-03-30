package leetcode;

public class DecodeWays {
	  public int numDecodings(String s) {
	        char[] input = s.toCharArray();
	        int [] result = new int[input.length+1];
	        result[0] = 1;
	        if(input[0] == '0') {
	        	return 0;
	        }
	        else {
	        	result[1] = 1;
	        }
	        for(int i = 1; i < input.length; i++) {
	        	if(input[i] == '0' && (input[i-1] == '1' || input[i-1] == '2') ) {
	        		result[i+1] += result[i-1];
	        		result[i+1]-= result[i];
	        	}
	        	else if(input[i] == '0') {
	        		return 0;
	        	}
	        	else if(input[i] - '0' <7 &&(input[i-1] == '1' || input[i-1] == '2') ) {
	        		result[i+1] += result[i-1];
	        	}
	        	else if(input[i] - '0' >=7 &&  input[i-1] == '1' ) {
	        		result[i+1] += result[i-1];
	        	}
	        	result[i+1]+= result[i];
	        }
	        return result[input.length];
	    }
	  
	  public static void main(String[] arg) {
		  DecodeWays cd  = new DecodeWays();
		  cd.numDecodings("226");
	  }
}
