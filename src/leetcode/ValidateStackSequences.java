package leetcode;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
    	int r = pushed.length-1;
    	int l = 0;
        while(pushed[l]  == popped[r]) {
        	l++;
        	r--;
        }
        for(int i = 0; i < r;i++) {
        	if(popped[i] !=pushed[l] ) {
        		return false;
        	}
        	l++;
        }
        return true;
    }
    public static void main(String[] args) {
    	ValidateStackSequences cd = new ValidateStackSequences();
		 boolean ans = cd.validateStackSequences(new int[] {1,2,3,4,5},new int[] {4,5,3,2,1});
		 System.out.print(ans);
	  }
}
