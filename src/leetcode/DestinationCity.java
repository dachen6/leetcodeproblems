package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
	   public String destCity(List<List<String>> paths) {
		   Map<String, String> m  = new HashMap<String, String>(); 
		   for(int i = 0; i < paths.size();i++ ) {
			   List<String> cur = paths.get(i);
			   m.put(cur.get(0), cur.get(1));
		   }
		   String node = paths.get(0).get(1);
		   while(m.get(node) != null) {
			   node =  m.get(node);
		   }
		   return node;
	    }
}
