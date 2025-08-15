package leetcode;

public class DeleteCharacterstoMakeFancyString {
    public String makeFancyString(String s) {
    	if(s.length()<3) {
    		return s;
    	}
        char[] input = s.toCharArray();
        int fast = 1;
        int slow = 1;
        
        while(fast < s.length()) {
        	if(input[slow] != input[slow-1]) {
        		slow++;
        		fast++;
        	}
        	else {
        		while(input[fast] == input[slow]) {
        			fast++;
        		}
        		input[slow] = input[fast];
        	}
        }
        return  new String(input, 0, slow);
    }
}
