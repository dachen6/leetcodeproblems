package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sharedInterested {


	class GraphNode {
		int key;
		ArrayList<Integer> neighbors;
		Map<Integer, ArrayList<Integer>> neighbor;

		GraphNode(int key) {
			this.key = key;
			neighbor = new HashMap<>();
		}
	}

	public int intere(int node, int edge, int[] from, int[] to, int[] weight) {
		int[][] numspath = new int[node + 1][node + 1];

		GraphNode[] graph = new GraphNode[node + 1];
		for (int i = 1; i <= node; i++) {
			graph[i] = new GraphNode(i);
		}

		for (int i = 0; i < edge; i++) {
			int curweight = weight[i];
			int curfrom = from[i];
			int curto = to[i];
			ArrayList<Integer> neighbor = graph[curfrom].map.get(curweight);
			if (neighbor== null) {
				graph[curfrom].neighbor.put(curweight, new ArrayList<Integer>(curto));
			}
			else {
				neighbor.add(curto);
				graph[curfrom].neighbor.put(curweight, neighbor );
			}
			neighbor = graph[curto].map.get(curweight) ;
			
			if (neighbor == null) {
				graph[curto].map.put(curweight, new ArrayList<Integer>(curfrom));
			}
			else {
				neighbor.add(curfrom);
				graph[curto].map.put(curweight, neighbor);
			}
		}
		
		
		
		
	}
}
