package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluateDivision {
	

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    	HashMap<String, HashMap<String,Double>> map = new HashMap<String, HashMap<String,Double>>();
    	for(int i = 0; i < equations.size(); i++ ) {
    		String first = equations.get(i).get(0);
    		String sec = equations.get(i).get(1);
    		Map<String,Double> val = map.get(first);
    		if(map.get(first) == null) {
    			map.put(first,new HashMap<String,Double>() );
    		}
    		if(map.get(sec) == null) {
    			map.put(sec,new HashMap<String,Double>() );
    		}
    		map.get(first).put(sec,values[i]);
    		map.get(sec).put(first,values[i]);
    	}
    	
    	for(List<String> cur : queries) {
    		HashSet<String> set = new HashSet<String>();
    		helper(cur.get(0)  , cur.get(1), set,1,map);
    	}
    	
  
    	
    	
    }
    
  	public double helper(String start,String end,HashSet<String> set, int mul,HashMap<String, HashMap<String,Double>> map ){
		if(!set.add(start)) {
			return -1;
		}
		HashMap<String,Double> curnode = map.get(start);
		if(curnode.containsKey(end)) {
			return mul * curnode.get(end);
		}
		for(Map.Entry<String,Double> neighber : curnode.entrySet()) {
			
			if(!set.contains(neighber.getKey())) {
				mul*=neighber.getValue();
				helper(neighber.getKey()  , end, set,mul,map);
			}
		}
		
		
		
	}
}
