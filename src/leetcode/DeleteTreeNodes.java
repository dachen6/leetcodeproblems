package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DeleteTreeNodes {
    public int deleteTreeNodes(int nodes, int[] parent, int[] value) {
        int[] dp = new int[] {nodes};
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        int root = 0;
        for(int i = 0 ; i < nodes; i++) {
        	List<Integer> cur = map.get(parent[i]);
        	if(cur == null) {
        		cur = new LinkedList<Integer>();
        	}
        	cur.add(i);
    		map.put(parent[i],cur );
        }
        List<Integer> cur = map.get(0);
        help(map, 0, )
    }
}
