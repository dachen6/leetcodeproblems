package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class DestroySequentialTargets {
    public int destroyTargets(int[] nums, int space) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        int ans = 0;
        int count = 0;
        for(int i = len-1 ; i >= 0; i--) {
        	int cur = nums[i] % space;
        	map.put(cur, map.getOrDefault(cur, 0) + 1);
        	if(map.get(cur) >= count) {
        		ans = nums[i];
        		count = map.get(cur);
        	}
        }
        return ans;
    }
    
    public static void main(String[] args) {
    	DestroySequentialTargets cd = new DestroySequentialTargets();
    	int ans = cd.destroyTargets(new int[] {625879766,235326233,250224393,501422042,683823101,948619719,680305710,733191937,182186779,353350082}, 4);
    	System.out.print(ans);
    }
}
