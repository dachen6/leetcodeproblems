package leetcode;

public class FirstUniqueCharacterinaString {
	 public int firstUniqChar(String s) {
	        char[] input = s.toCharArray();
	        int[] check = new int[26];
	        for(int i = 0; i < input.length; i++){
	            int index = input[i] - 'a';
	            if(check[index] != 0 ){
	                check[index] = -1;
	            } 
	            else{
	              check[index] = i+1;
	            }
	       
	             
	        }
	        int res = input.length + 2;
	        for(int i = 0; i < 26; i++){
	            
	            if(check[i] != 0 && check[i] != -1 ){
	                res = Math.min(res,check[i]  );
	            }          
	        }
	        return res -1;

	    }
	 
	 public static void main(String[] args) {
		 FirstUniqueCharacterinaString cd = new FirstUniqueCharacterinaString();
		 int res = cd.firstUniqChar("leetcode");
		 System.out.print(res);
	 }
}
