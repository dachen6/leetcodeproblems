package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        for(int i = 0; i< prerequisites.length;i++) {
        	if(map.get(prerequisites[i][0]) == null) {
        		map.put(prerequisites[i][0],new ArrayList());
        	}
        	map.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        HashSet<Integer>  set = new HashSet<Integer>();
        for(int i = 0;i< numCourses;i++) {

        	if( map.get(i) != null) {
        		if(help(i,set,map) == false) {
        			return false;
        		}
        	}
        	
        }
        return true;
        
    }
    
    
    public boolean help(int cur,HashSet<Integer>  set, HashMap<Integer,List<Integer>> map ) {
    	if(!set.add(cur) ) {
    		return false;
    	}
    	List<Integer> pre = map.get(cur);
    	if(pre == null) {
    		return true;
    	}
    	for(int i : pre) {
       		if(help(i,set,map) == false) {
       		  	set.remove(cur);
    			return false;
    		}
    	}
    	set.remove(cur);
    	return true;
    }
    
    public static void main(String[] args)
    {
    	CourseSchedule cd = new CourseSchedule();
    	boolean ans = cd.canFinish(5, new int[][] {{1,4},{2,4},{3,1},{3,2}});
    	System.out.print(ans);
    }
}
