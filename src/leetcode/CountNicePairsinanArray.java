package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountNicePairsinanArray {
    public int countNicePairs(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int ans = 0;
        for(int i = 0; i < nums.length;i++) {
        	int cur =rev( nums[i]);
        	Integer freq = map.get(cur);
			if (freq == null) {
				map.put(cur, 1);
			} else {
				map.put(cur, freq + 1);
        }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
        	int fre = pair.getValue();
        	ans += (fre * (fre -1) / 2)% (10^7 +7);
            ans%= (10^7 +7);
        }
        return ans;
    }
    
    public int rev(int cur) {
    	int curnum = cur;
    	int revnum = 0;
    	int dig = 1;
    	int tens = 1;
    	while(dig*10 <= cur) {
    		dig*= 10;
    	}
    	while(cur != 0) {
    		revnum += cur/dig *tens;
    		cur%=dig;
    		dig/=10;
    		tens *= 10;
    	}
    	return revnum - curnum;
    	
    }
    
    
    public static void main(String[] args) {
    	CountNicePairsinanArray cd =new CountNicePairsinanArray();
    	cd.countNicePairs(new int[] {13,10,35,24,76});
    }
}
