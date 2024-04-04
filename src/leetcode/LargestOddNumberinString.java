package leetcode;

public class LargestOddNumberinString {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i >=0; i--){
        	System.out.println((num.charAt(i)-'0') %2);
            if((num.charAt(i)-'0') %2 == 1  ) {
            	System.out.println(num.substring(0, i+1));
            	
            	return num.substring(0, i);
            }
        }
        return "";
    }
    
    
    public static void main(String[] args) {
    	LargestOddNumberinString cd = new LargestOddNumberinString();
    	cd.largestOddNumber("52");
    	
    }
}
