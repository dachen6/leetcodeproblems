package leetcode;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class FindEventualSafeStates {
	public List<Integer> eventualSafeNodes(int[][] graph) {
		int[] check = new int[graph.length];
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < graph.length; i++) {
			helper(graph, check, i);
		}
		for (int i = 0; i < graph.length; i++) {
			if(check[i] == 0) {
				result.add(i);
			}
		}
		return result;
	}

	boolean helper(int[][] graph, int[] check, int index) {
		if (check[index] != 0||check[index] == 1 ) {
			return false;
		}
		if (graph[index].length == 0) {
			return true;
		}
		check[index] = 1;
		for (int i = 0; i < graph[index].length; i++) {
			int next = graph[index][i];
			if (check[next] != 0) {
				check[index] = 2;
				return false;
			}
			if (!helper(graph, check, graph[index][i])) {
				check[index] = 2;
				return false;
			}

		}
		check[index] = 0;
		return true;
	}
}
