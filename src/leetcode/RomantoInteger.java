package leetcode;

public class RomantoInteger {
    public int romanToInt(String s) {
       char[] input = s.toCharArray();
       int ans = 0;
       for(int i = 0; i < input.length-1 ; i++) {
    	   int num = check(input[i]);
    	   int aft = check(input[i+1]);
    	   if(aft > num) {
    		   ans -= num;
    	   }
    	   else {
    		   ans += num;
    	   }
       }
       return ans += check(input[input.length-1]);
    }
    
    public int check(char c) {
    	if(c == 'I') {
    		return 1;
    	}
    	if(c == 'V') {
    		return 5;
    	}
    	if(c == 'X') {
    		return 10;
    	}
    	if(c == 'L') {
    		return 50;
    	}
    	if(c == 'C') {
    		return 100;
    	}
    	if(c == 'D') {
    		return 500;
    	}
    	return 1000;

    }
    
    public static void main(String[] args) {
    	RomantoInteger cd = new RomantoInteger();
    	int ans = cd.romanToInt("LVIII");
    	System.out.print(ans);
    }
}
