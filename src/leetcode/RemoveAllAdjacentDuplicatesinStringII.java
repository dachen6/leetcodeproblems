package leetcode;

public class RemoveAllAdjacentDuplicatesinStringII {
	   public String removeDuplicates(String s, int k) {
		   char[] input = s.toCharArray();
		   int[] count = new int[s.length()+1];
		   count[0] = 1;
		   int i = 0;
		   for(int j = 0; j < s.length();j++) {
			   input[i] = input[j];
			   
			   if(i== 0 || input[i] != input[i-1] ) {
				   count[i] = 1; 
			   }
			   else {
				   count[i] = count[i-1]+1; 
			   }
			   if(count[i] == k) {
				  i-=k;
			   }
			 
			   i++;
		   }
		   return new String(input, 0, i);
	    }
	   
	   public static void main(String[] args) { 
		   RemoveAllAdjacentDuplicatesinStringII cd  =new RemoveAllAdjacentDuplicatesinStringII();
		   String res =  cd.removeDuplicates("abce", 3);
		   System.out.print(res);
	   }
}
