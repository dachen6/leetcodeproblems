package leetcode;

public class NumberofWaystoSelectBuildings {
    public long numberOfWays(String s) {
    	int n = s.length();
    	int TotalZero = 0;
    	int TotalOne = 0;
    	int[] zero = new int[n];
    	long ans = 0;
        for(int i = 0 ; i < n;i++) {
        	if(s.charAt(i) == '0') {
        		TotalZero++;
        		
        	}
        	zero[i] = TotalZero;
        }
        TotalOne = n- TotalZero;
        for(int i = 0 ; i < n;i++) {
        	if(s.charAt(i) == '1') {
        		ans += zero[i] * (TotalZero-zero[i]);
        	}
        	else {
        		ans += (i+1-zero[i]) * (TotalOne-(i-zero[i]+1));
        	}
        }
        return ans;
    }
    public static void main(String[] args) {
    	NumberofWaystoSelectBuildings cd = new NumberofWaystoSelectBuildings();
		  cd.numberOfWays("111000");
	  }
}
