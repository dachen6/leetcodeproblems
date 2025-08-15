package leetcode;

public class KthSymbolinGrammar {
    public int kthGrammar(int n, int k) {
    	int start=  0;
        for(int i = 0; i < n;i++) {
        	if(k %2 == 0 && start == 0 || k %2 == 1 && start == 1)
        	{
        		start = 1;
        	}
        	else {
        		start = 0;
        	}
        	k = (k+1) /2;
        }
        
        return start == 0?0:1;
    }
}
