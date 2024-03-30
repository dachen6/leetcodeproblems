package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int ans = -1;
        int[] check = new int[nums.length];
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] == 0) {
            	zero++;
            }
            else {
            	zero--;
            }
        	check[i] = zero;
        }
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        set.put(0, -1);
        for(int i = 1 ; i < nums.length;i++){
            if(set.get(check[i]) == null ){
               set.put(check[i], i);
            }
            else{
            	ans = Math.min(ans, i - set.get(check[i])); 
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
    	ContiguousArray cd= new ContiguousArray();
    	cd.findMaxLength(new int[] {0,0,1});
    }
}
