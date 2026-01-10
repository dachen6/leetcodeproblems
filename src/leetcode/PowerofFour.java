package leetcode;

public class PowerofFour {
    public boolean isPowerOfFour(int n) {
        int left = 0;
        int right = n /2;
        while(right > left) {
        	int mid = left + (right - left)/2;
        	int cur = mid * mid *mid *mid;
        	if(cur == n) {
        		return true;
        	}
        	else if (cur > n){
        		right = mid-1;
        	}
        	else {
        		left = mid+1;
        	}
        }
        return false;
    }
}
