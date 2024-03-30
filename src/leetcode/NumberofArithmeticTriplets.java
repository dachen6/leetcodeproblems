package leetcode;

import java.util.*;
import java.util.Map;

public class NumberofArithmeticTriplets {
	public int reachableNodes(int n, int[][] edges, int[] restricted) {
		Map<Integer, List> map = new HashMap<Integer, List>();
		List<Integer> list;
		Set<Integer> set = new HashSet<>();
		int res = 1;
		for(int a : restricted) {
			set.add(a);
		}
		for (int[] a : edges) {
			list = map.get(a[0]);
			if (list == null) {
				list = new ArrayList<Integer>();
				list.add(a[1]);
				map.put(a[0], list);
			} else {
				list.add(a[1]);
				map.put(a[0], list);
			}

			list = map.get(a[1]);

			if (list == null) {
				list = new ArrayList<Integer>();
				list.add(a[0]);
				map.put(a[1], list);
			} else {
				list.add(a[0]);
				map.put(a[1], list);
			}
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		set.add(0);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				int cur = queue.poll();
				list = map.get(cur);
				for(int a : list) {
					if(set.contains(a)) {
						continue;
					}
					else {
						res++;
						set.add(a);
						queue.add(a);
					}
				}
			}
		}
		return res;

	}
}
