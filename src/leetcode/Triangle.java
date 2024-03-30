package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
    	int[] arr = new int[triangle.size()];
    	int max = Integer.MAX_VALUE;
    	arr[0] = triangle.get(0).get(0);
        for(int i = 1; i < triangle.size();i++) {
        	max = Integer.MAX_VALUE;
        	for(int j = i; j>=0;j--) {
                if(j == i) {
        			arr[j] =  arr[j-1] +  triangle.get(i).get(j);
        		}
                else if(j == 0){
                    arr[j] =  arr[j] +  triangle.get(i).get(j);
                } 
                
                
               else {
        		arr[j] = Math.min(arr[j], arr[j-1]) +  triangle.get(i).get(j);
                }
        		max = Math.min(max, arr[j]);
            }
        }
        return max;
        
    }
	public static void main(String[] args) { 
		Triangle cd = new Triangle();
		List<List<Integer>> test =new ArrayList<List<Integer>>();
		test.add(Arrays.asList(2));
		test.add(Arrays.asList(3,4));
		test.add(Arrays.asList(6,5,7));
		test.add(Arrays.asList(4,1,8,3));
		cd.minimumTotal(test);
	}
}
