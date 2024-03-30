package leetcode;

import java.util.*;

public class CourseScheduleIV {
	 public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
	 
	        Map<Integer, List<Integer>> preReq = new HashMap<>();
	        for (int i = 0; i < numCourses; i++) {
	            preReq.put(i, new ArrayList<>());
	        }
	        for (int[] pre : prerequisites) {
	            preReq.get(pre[1]).add(pre[0]);
	        }
	        Set<Integer> visited = new HashSet<>();
	        for (int i = 0; i < numCourses; i++) {
	            dfs(preReq, visited, i);
	        }
	        List<Boolean> res = new ArrayList<>();
	        for (int[] qry : queries) {
	            res.add(preReq.get(qry[1]).contains(qry[0]));
	        }
	        return res;
	    }

	    int dfs(Map<Integer, List<Integer>> preReq, Set<Integer> visited, int crs) {
	        if (visited.contains(crs) || preReq.get(crs).isEmpty()) {
	            return crs;
	        }
	       
	        for (int pre : preReq.get(crs)) {
	            int cur = dfs(preReq, visited, pre);
	            if (!preReq.get(crs).contains(cur)) {
	                preReq.get(crs).add(cur);
	            }
	        }
	        visited.add(crs);
	        return crs;
	    
	    }
	    
	    public static void main(String[] args) {
	        CourseScheduleIV lzr = new CourseScheduleIV();
	        int numCourses = 3;
	        int[][] prerequisites = { { 1, 0 }, { 2, 1 } };
	        int[][] queries = { { 1, 0 }, { 1, 2 } };
	        List<Boolean> res = lzr.checkIfPrerequisite(numCourses, prerequisites, queries);
	        System.out.print(res);
	    }
}
