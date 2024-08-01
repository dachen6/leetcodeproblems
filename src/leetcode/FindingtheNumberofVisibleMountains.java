package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class FindingtheNumberofVisibleMountains {
    public int visibleMountains(int[][] peaks) {
    	for(int i = 0; i < peaks.length;i++) {
    		peaks[i][0] = peaks[i][0] - peaks[i][1];
    		peaks[i][1] = peaks[i][0] + 2 * peaks[i][1];
    	}
    	int ans = peaks.length;
    	Arrays.sort(peaks, (a,b)->{return a[0]==b[0] ? b[1]-a[1] : a[0]-b[0];});
    	Stack<int[]> s = new Stack<int[]>();
    	s.add(peaks[0]);

    	for(int i = 1; i < peaks.length;i++) {
    		if(s.peek()[0] <=peaks[i][0] && s.peek()[1] >=peaks[i][1]) {
                while( i < peaks.length  && s.peek()[0] ==peaks[i][0] && s.peek()[1] ==peaks[i][1]  ) {
                    ans--;
                    i++;
                }
    			 ans--;
    		}
    		else {
    			s.pop();
    			s.add(peaks[i]);
    		}
    	}
    	return ans;
    }
	  
	  public static void main(String[] args) {
		  FindingtheNumberofVisibleMountains cd = new FindingtheNumberofVisibleMountains();
		  cd.visibleMountains(new int[][] {{2,2},{2,2},{3,1}});
	  }
    
    
}
